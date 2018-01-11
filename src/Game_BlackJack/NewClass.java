/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_BlackJack;

/**
 *
 * @author Akhilkondra
 */
public class NewClass {

    
public static void main(String s[]){
String str="cat";
String result="";


    System.out.println(result);
}
    
    
static String rot13(String s){
String resultRot13="";
int limitForSmallLetters=122;//for small letters a to z: 97 to 122
for(char c : s.toCharArray()){ 
    if(((int)c+13)>limitForSmallLetters){ 
     // adding the remaining from the first loop back
        
        
    resultRot13+=(char)(97+(13-(122-(int)c))-1);
    }
    else{
      resultRot13+=(char)((int)c+13) ;
    }

}

    return resultRot13;
}

}

