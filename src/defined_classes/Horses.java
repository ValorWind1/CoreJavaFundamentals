package defined_classes;

public class Horses {
    public static void main(String[] args) {
        Horse horse1 , horse2 ,horse3 ;
        String bruh1 , bruh2 ,bruh3;

        horse1 = new Horse( );
        horse1.setOwnerName("George");

        horse2 = new Horse();
        horse2.setOwnerName("Adam");

        horse3 = new Horse();
        horse3.setOwnerName("Paul");

        bruh1 = horse1.getOwnerName();
        bruh2 = horse2.getOwnerName();
        bruh3 = horse3.getOwnerName();

        System.out.println(bruh1);
        System.out.println(bruh2);
        System.out.println(bruh3);

    }
}
