package com.ignavarro;
  
public class StringToInteger{
  public static boolean isDigit(char ch){
    return (ch >= '0') && (ch <= '9');
  }
  public static int toInteger(String str) {
    int result = 0;
    boolean negative = false;
    for(int n=0; n<str.length(); n++){
        char ch = str.charAt(n);
        if ((n == 0) && (ch == '-')){
            negative = true;
            continue;
         }
         if (!isDigit(ch))
               return 0;
         int digit = ch - '0';
         result = result*10 + digit;
  	} 
  	if(negative)
           return -result;
        return result;
    }
  public static void main(String[] args){
      System.out.println(toInteger("-2020"));
      System.out.println(toInteger("20a"));
  }
}