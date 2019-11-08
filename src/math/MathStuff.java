package math;

import java.util.Scanner;

public class MathStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14159;

        // doing the are + circumferance
        System.out.println("Type the area : ");
        double  area , circumference ;
        double radius = sc.nextDouble();

        area = pi * radius * radius ;

        circumference = 2.0 * pi * radius ;

        System.out.println("answer is ");

        System.out.println("area : "+area);

        System.out.println("circumference : "+circumference);
    }
}
