package scan;

import java.util.Scanner;

public class ScanStuff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How are u ?");

        String input = sc.next();

        System.out.println(":)");
        System.out.println(input);

        System.out.println("How old u ?");

        int input1 = sc.nextInt();

        System.out.println("u are old");
        System.out.println(input1+"years old");


    }
}
