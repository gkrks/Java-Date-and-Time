import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yyyy = in.nextInt();
        in.close();
        LocalDate dt = LocalDate.of(yyyy, mm, dd);
        System.out.print(dt.getDayOfWeek());
        
    }
}
