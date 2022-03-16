package com.company;

public class CustomPrinter {
    private String formatString;
    //constructor
    public  CustomPrinter(String format){
        //takes the provided formatstring and stores it for later use
        formatString = format;
   }

   public void println(String input)
   {
       String formatted = String.format(formatString, input);
       System.out.println(formatted);
   }
}
