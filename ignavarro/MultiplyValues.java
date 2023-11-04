package com.ignavarro;


public class MultiplyValues{
 public static void main(String[] args){
   int[] arr = {1, 2, 3, 4};
   int res = multiplyArray(arr);
   System.out.println("Result: " + res);
 }
 
 public static int multiplyArray(int[] arr ){
   int res = 1;
   for(int value : arr){
    res *= value;
   }
   return res;
 }    
}
