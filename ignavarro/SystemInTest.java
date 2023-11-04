package com.ignavarro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemInTest{
	public static void main(String[] args) throws Exception{
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Cual es tu nombre");
          String n = in.readLine();
	  System.out.println("Hola " + n + "!");
        }	
}