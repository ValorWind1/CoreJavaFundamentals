package whileloops;
import java.util.Scanner;

public class WhileStuff1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type either n/y : ");

        while (true){
            System.out.println("y/n");
            String input = sc.next();

            if (input.equals("y")){
                System.out.println("continue");
            }else{
                System.out.println("ur finished!");
                break;

            }

        }

    }
}
