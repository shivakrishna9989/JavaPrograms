

class TextEncriptionTest {
public static void main(String s[]){
String inputStr="Encryption example mirzaaaa";
String cypherResult=   encryptionMethod(inputStr);
    System.out.println(cypherResult);
}
      
static String encryptionMethod(String s){

String finalResult="";
String[] splited = s.split(" ");
 
for(String word: splited){
String result="";    
    StringBuilder input1 = new StringBuilder();
  input1.append(word);
  input1=input1.reverse(); 
    
for(char charecter : input1.toString().toCharArray()){
    if(((int)charecter+1)>122){
        
    result+=(char)(97+(1-(122-(int)charecter))-1);
    }
    else{
      result+=(char)((int)charecter+1) ;
    }
}
    
finalResult+=result+"$&";
input1=null; 

}
 return finalResult;
}
}


