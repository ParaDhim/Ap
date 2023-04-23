//// Java program to convert String to Date
//// Using DateTimeFormatter Class
//
//// Importing required classes
//import java.util.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//
//// Main class
//class GFG {
//
//    // Method 1
//    // To convert String to Date
////    public static LocalDate
////    getDateFromString(String string,
////                      DateTimeFormatter format)
////    {
////        // Converting the string to date
////        // in the specified format
////        LocalDate date = LocalDate.parse(string, format);
////
////        // Returning the converted date
////        return date;
////    }
//
//    // Method 2
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Getting the custom string input
////        Scanner sc = new
//        String string1 = "28th October 2018, 17:05 PM";
//
//        // Getting the format by creating an object of
//        // DateTImeFormatter class
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy, kk:mm a");
//
//        // Try block to check for exceptions
//
//
//            // Getting the Date from String
////            LocalDate date = getDateFromString(string1, df);
////            String myDate = string1.format(df);
//            // Printing the converted date
//            System.out.println(myDate);
//
//
//        // Block 1
//        // Catch block to handle exceptions occurring
//        // if the String pattern is invalid
//
//    }
//}