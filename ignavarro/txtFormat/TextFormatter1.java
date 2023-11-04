package com.ignavarro.txtFormat;

import java.util.StringTokenizer;
public class TextFormatter1{
 
   public static void main(String [] args) {
     String str = "Esta es una linea de texto para probar la funcionalidad de formatear el texto para comprobar que todo funcione correctamente. Usar VIM en conjunto con la extensión de VSCode esta cursed totalmente.";
       
     int lineWidth = 40;
     System.out.println();
     for(int n=0;n<lineWidth; n++){
       if(((n+1) % 10) == 0)
          System.out.print( ((n/10)+1) % 10 );
       else
         System.out.print(" ");  
     }
     System.out.println();
     for(int n=0; n<lineWidth; n++){
       System.out.print((n+1) % 10);
     } 
     System.out.println(); 
     for(int n=0;n<lineWidth; n++)
        System.out.print("-");     
	System.out.println();
     
     int curPos = 0;
     boolean space = false;
     StringTokenizer st = new StringTokenizer(str);
     while(st.hasMoreTokens()){
        String s = st.nextToken();
	if((curPos + s.length()) > lineWidth){
           System.out.println();
           curPos=0;
           space=false;
        }
        if(space)
           System.out.print(" ");
        System.out.print(s);
	curPos += s.length() + 1;
        space=true;
     }

     System.out.println();
  }
}