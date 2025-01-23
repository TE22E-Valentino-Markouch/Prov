import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Intro();


    }


    public static void Intro() {
        System.out.println("Välj vilken typp av superhjälte du vill vara:");
        System.out.println("1. Mutant");
        System.out.println("2. Alien");
        System.out.println("3. Ronnie Coleman");
        System.out.println("Skriv den siffran som tillhör superhjälten du vill vara.");
        while (true){
            Scanner myObj = new Scanner(System.in);

            int HeroVal = Integer.parseInt(myObj.nextLine());
            if (HeroVal == 1){
            System.out.println("Du valde: Mutant");
            break;
            } else if (HeroVal == 2) {
                System.out.println("Du valde: Alien");
                break;
            } else if (HeroVal == 3) {
                System.out.println("Du valde Ronnie Coleman");
                break;
            }
            else {
                System.out.println("Skriv endast en siffra! Försök igen");
            }
        }
    }

    //  Hero type 1
    public static void RonnieColeman() {

    //  Stats:
    String HeroName = "RonnieColeman";
    int HP = 1000;
    int Power = 300;
    String UnikeAttribute = "Lightweightbby";

    }

    //  Hero type 2
    public static void Mutant() {

        //  Stats:
        String HeroName = "Lizardman";
        int HP = 500;
        int Power = 200;
        String UnikeAttribute = "Poison";

    }


    //  Hero type 3
    public static void Alien() {

        //  Stats:
       String HeroName = "Superman";
        int HP = 700;
        int Power = 400;
        String UnikeAttribute = "Lazer";

    }



}
