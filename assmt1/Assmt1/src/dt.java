import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
//import java.time.LocalDateTime;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dt {
    public static void main(String[] args) {
//        Date thisDate = new Date();
////        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
//        SimpleDateFormat dateForm = new SimpleDateFormat("dd'th' MMMM yyyy, kk:mm a");
//        System.out.println (dateForm.format(thisDate));

//        try {
////            SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
//            String date = "18th September 2022, 17:05 PM";
        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy, kk:mm a");
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(dateForm.format(localDate));
//            Date prtDate = dateForm.parse(date);
//        } catch (ParseException exception) {
//            exception.printStackTrace();
//        }
//    }
    }
}
