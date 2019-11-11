package whileloops;

public class WhileStuff {
    public static void main(String[] args) {

        int sum = 5 , number =1 ;

        while (number < 100){

            sum += number ;

            number += sum ;
            System.out.println("sum"+sum);
            System.out.println("number"+number);

        }

    }

}
