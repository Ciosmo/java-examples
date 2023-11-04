package com.ignavarro.dateCalendar;

import java.util.Calendar;

public class Date2 {
  public static void main(String[]args){
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    cal.add(Calendar.DATE, 1);
    cal.add(Calendar.HOUR, 1);
    System.out.println(cal.getTime());

   //Para leer los componentes de una fecha, tambien se puede usar un calendario
     
     int year = cal.get(Calendar.YEAR);
     int month = cal.get(Calendar.MONTH);
     int date = cal.get(Calendar.DATE);

     System.out.println("Year: " + year);
     System.out.println("Month: " + month);
     System.out.println("Day: " + date);   
  }
}