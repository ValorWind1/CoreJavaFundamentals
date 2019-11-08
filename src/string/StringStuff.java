package string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringStuff {

    public static void main(String[] args) {

        String name = "Jon Java";
        char ch = 'n';

        // indexof
        int indexp = name.indexOf(ch);

        System.out.println(indexp);

        // substring

        System.out.println(name.substring(0,2));

        // length

        System.out.println(name.length());

        // concatenation

        System.out.println(ch + name);

        // Date

        Date today;
        today = new Date();
        System.out.println(today.toString());

        // SimpleDateFormat

        Date ttoday = new Date();
        SimpleDateFormat sdate ;
        sdate = new SimpleDateFormat("MM/dd/yy");
        System.out.println(sdate.format(ttoday));



    }
}
