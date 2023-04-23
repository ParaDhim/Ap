//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class ParsingLocalDate
//{
//    public static void main(String [] args)
//    {
//        String d1 = "23/02/1997";
//        String d2 = "23-Feb-1997";
//        String d3 = "02 23, 1997";
//        String d4 = "Sun, Feb 23 1997";
//        String d5 = "Sun, Feb 23 1997 22:12:21";
//        String d6 = "23-Feb-1997 22:12:21";
//
//        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat f2 = new SimpleDateFormat("dd-MMM-yyyy");
//        SimpleDateFormat f3 = new SimpleDateFormat("MM dd, yyyy");
//        SimpleDateFormat f4 = new SimpleDateFormat("E, MMM dd yyyy");
//        SimpleDateFormat f5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
//        SimpleDateFormat f6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
//
//        Date date1 = f1.parse(d1);
//        Date date2 = f2.parse(d2);
//        Date date3 = f3.parse(d3);
//        Date date4 = f4.parse(d4);
//        Date date5 = f5.parse(d5);
//        Date date6 = f6.parse(d6);
//
//        System.out.println(d1+"\t"+date1);
//        System.out.println(d2+"\t"+date2);
//        System.out.println(d3+"\t"+date3);
//        System.out.println(d4+"\t"+date4);
//        System.out.println(d5+"\t"+date5);
//        System.out.println(d6+"\t"+date6);
//    }
//}