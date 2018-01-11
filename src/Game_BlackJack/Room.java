package Game_BlackJack;

class Test {
     public static void main(String[] args) {
     }
      public void printVowels(String str){
          
          for(int i=0;i<str.length();i++){
              if("aeiouAEIOU".indexOf(str.charAt(i))!=-1)
              { System.out.println(str.charAt(i));
              }
              }
      }   
    
public void printConsonants(String str){
          for(int i=0;i<str.length();i++){
              if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(str.charAt(i))!=-1)
              { System.out.println(str.charAt(i));
              }
              }
 }      
         public  void printDigits(String str){
          for(int i=0;i<str.length();i++){
              if("0123456789".indexOf(str.charAt(i))!=-1)
              { System.out.println(str.charAt(i));
              }
              }
      }   
         
         public static int charToInt(char c){
         return "0123456789".indexOf(c);
         }
         public static int strinToInt(String s){
             int place = 1;
             int total = 0;
             for(int j=s.length()-1;j>=0;j--){
                 total+=Test.charToInt(s.charAt(j))*place;
             place*=10;
                         }
         return total;
         }
 public static int doMath(int num1,int num2, char sign){
             //int total=0;
             if(sign=='+'){
                 return num1+num2;
             }else if(sign=='-'){
                 return num1-num2;
             }else if(sign=='*'){
                 return num1*num2;
             }else if(sign=='/'){
                 return num1/num2;
             }else if(sign=='%'){
                 return num1%num2;
             }
             
             
             
             return -1;
  }
         
   public  int processExpression(String str){
          String currentNum="";
          char currOperator='?';
             int total=0;
             for(int i=0;i<str.length();i++){
              if("0123456789".indexOf(str.charAt(i))!=-1)
              {
                  currentNum+=str.charAt(i);
                 
              }else{
                  if(currOperator=='?'){
                 currOperator=str.charAt(i);
                  total+=Test.strinToInt(currentNum);
                  
                  }else{
                      
                      total=Test.doMath(total,Test.strinToInt(currentNum),currOperator);
                      currOperator=str.charAt(i);
                  }
                  
                  currentNum="";
              }
              }
             total=Test.doMath(total,Test.strinToInt(currentNum),currOperator);
             return total;
      }   
         
         
     }
     
