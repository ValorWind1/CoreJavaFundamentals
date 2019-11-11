package enums;

public class EnumsStuff {
    // enums have to be local
    enum fruits {APPLE, ORGANGE, BANANA}

    public static void main(String[] args) {

        fruits f1, f2, f3;
        f1 = fruits.APPLE;
        f3 = fruits.BANANA;
        f2 = fruits.ORGANGE;

        System.out.println("Favorite Fruits : " + f2);

        fruits favoriteFruit = f3;

        switch (favoriteFruit){
            case APPLE:{
                System.out.println("yay apples");
                break;
            }
            case BANANA:{
                System.out.println("yay nanas");
                break;

            }
            case ORGANGE:{
                System.out.println("yay organes");
                break;
            }
        }

    }
}
