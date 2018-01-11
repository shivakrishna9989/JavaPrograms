
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class Xmlparse {
    
public static void main(String k[]) throws Exception{
    
 
BufferedReader br = null;
File file = new File("src\\output.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

		try {

			String CurrentLine;
                        int currentLineNumber=1;
			br = new BufferedReader(new FileReader("src\\InputFile.txt"));
                        
                        
                        ArrayList<String> finalArray = new ArrayList<String>();
                       
			while ((CurrentLine = br.readLine()) != null) {
                            
                       
                            if(currentLineNumber==1){
                       
                               String PersonWord=printFirstTagWord(CurrentLine.trim()); 
                               if(finalArray.isEmpty()){
                               System.out.println(PersonWord+"-->");
                               bw.write(PersonWord+"-->");
                               bw.newLine();
                               finalArray.add(PersonWord);
                               }else if(!finalArray.contains(PersonWord)){
                        bw.write(PersonWord+"-->");
                        bw.newLine();
                               System.out.println(PersonWord+"-->");
                               finalArray.add(PersonWord); 
                               }
                            }else{
                       
                                
                               if(CurrentLine.contains("/")){ 
                               stringTokens(CurrentLine,bw);
                                                             
                               
                               }else{
                                  String AnotherWord=printFirstTagWord(CurrentLine.trim()); 
                               if(!finalArray.contains(AnotherWord)) 
                                   
                                   bw.write(AnotherWord+"-->");
                               bw.newLine();
                               System.out.println(AnotherWord+"-->"); 
                               
                               
                               }
                                
                               currentLineNumber++; 
                            }
                            
                            
                            currentLineNumber++; 
                            
                            	
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
                            bw.close();
				if (br != null)br.close();
                                
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

}

    private static String printFirstTagWord(String CurrentLine) throws Exception {
       String result=null;
        
      result=CurrentLine.substring(1,CurrentLine.length()-1);
       
       
        return result;
    }
 private static void stringTokens(String CurrentLine,BufferedWriter bw) throws IOException {
   ArrayList<String> outputArray=new ArrayList<String>();    
  // System.out.println("CurrentLine is "+CurrentLine );
   StringTokenizer st = new StringTokenizer(CurrentLine,"<");
	
	while (st.hasMoreElements()) {
                    String someString=st.nextElement().toString();
		//System.out.println("someString    " + someString);
                if(!someString.trim().isEmpty())
                {
                    if(someString.trim().startsWith("/")){
                    }
                   else{
                //    System.out.println("someString in else   " + someString);
                         for (String retval: someString.split(">")){
                               //System.out.println(retval);
                               outputArray.add(retval);
                              // System.out.println();
                               
                                   }
                         
                      System.out.println(outputArray.get(0)+"-->"+outputArray.get(1));
               bw.write(outputArray.get(0)+"-->"+outputArray.get(1));
                bw.newLine();
                        
                    }
                
                }
        }
    

        
       
    }

    

}
