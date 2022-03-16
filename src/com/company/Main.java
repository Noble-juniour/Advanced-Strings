package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //the customprinter will have a constructor that takes input as  string format
        CustomPrinter printer = new CustomPrinter(" > > %s  < < ");

        String S1 = new String("Strings are arrays of characters");
        String S2 = new String("Strings are arrays of characters");


        //System.out.println();== is utilized in the printer class
        printer.println("String1: " + S1.replace("characters","chars"));
        printer.println("String2: " + S2);
       // printer.println(S1.equals(S2));

    }
}
