package chapter01;
import java.io.*;
  
// Main class
class GFG {
  
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND
        = "\u001B[41m";
  
    // Main driver method
    public static void main(String[] args)
    {
        // Now add the particular background color
        System.out.println(ANSI_RED_BACKGROUND
                           + "The background color is red"
                           + ANSI_RESET);
    }
}