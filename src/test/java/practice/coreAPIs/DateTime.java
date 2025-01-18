package practice.coreAPIs;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

public class DateTime {

    @Test
    public void Date() {
        LocalDate dateObj = LocalDate.now();
        System.out.println(dateObj);  //yyyy-mm-dd
        System.out.println(dateObj.getDayOfMonth());//date
        System.out.println(dateObj.isLeapYear());  //returns boolean
        System.out.println(dateObj.getMonth()); //returns Month.of
        System.out.println(dateObj.getMonthValue()); //returns int value of month
        System.out.println(dateObj.plusMonths(2));
        System.out.println(dateObj.getDayOfWeek());   //returns weekday name
        System.out.println(dateObj.lengthOfMonth());  //returns number of days in month
        System.out.println(dateObj.lengthOfYear()); //returns number of days in year

        LocalDate dateObj1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dateObj1);
    }



}
