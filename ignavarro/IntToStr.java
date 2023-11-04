package com.ignavarro;

public class IntToStr{

 public static void main(String[]args){
   intToStr(-123);

 }

 public static String intToStr(int num){
 
  String intStr = Integer.toString(num);
  System.out.println(intStr);
  return intStr;

 }
}