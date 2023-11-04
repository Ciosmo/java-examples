package com.ignavarro;

public class StringTest{
 private static void appendTest1(){
    long start = System.currentTimeMillis();
    String s = "Hola mundo";
    for (int i=0; i<100000; i++){
  	s =s + 1; 
    }
    long end = System.currentTimeMillis();
    System.out.println("Tiempo transcurrido: " + (end - start) + "ms." );
 }
 public static void main(String[] args){
   appendTest1();
 }
}
