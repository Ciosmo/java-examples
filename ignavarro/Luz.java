package com.ignavarro;

public class Luz{
  public static void main(String[] args){
   int lightspeed;
   long days;
   long seconds;
   long distancia;

  //velocidad de la luz en km
    lightspeed = 299792;
  
    days = 1000;
  
    seconds = days * 24 * 60 * 60; //convertir a segundos

    distancia = lightspeed * seconds;
   
    System.out.print("In " + days);
    System.out.print(" days light will travel about");
    System.out.println(distancia + "km");
   }
}


 