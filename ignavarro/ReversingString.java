package com.ignavarro;

public class ReversingString{

 public static void main(String[]args){
	reverseIt("alo, soy ignacio");
 }

 public static String reverseIt(String word){

  String reversedString = new StringBuilder(word).reverse().toString();
  System.out.println(reversedString);
  return reversedString;
 }
}