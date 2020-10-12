package im.ucm.co4025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int anumber = -1;
        Scanner scannyboi = new Scanner(System.in);
      /*  do {
            try {
                System.out.print("Please enter a number, 0-100: ");
                anumber = scannyboi.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("I said a number, dipshit");
                scannyboi.next();
            }
            if (anumber > 100) {
                System.out.println("Too high, max number is 100");
                scannyboi.next();
            } else if (anumber < 0) {
                System.out.println("Too low. Min number is 0");
                scannyboi.next();
            }
        } while (anumber < 0 || anumber > 100);
*/

        do {
            try {
                System.out.print("Please enter a number, 0-100: ");
                anumber = scannyboi.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("I said a number, dipshit");
                scannyboi.next();
            }
            if (anumber > 100){
                System.out.println("Too high, max number is 100");
                //scannyboi.next();
                anumber=-1;
            } else if (anumber < 0 && anumber != -1 ) { //&& anumber != -1 ive tried to make it so the catch and the else if dont both run.
                System.out.println("Too low. Min number is 0"); //possbily make default value more specific + make exception?
                //scannyboi.next();
                anumber=-1;
            }
        } while (anumber < 0 || anumber > 100);
    }
}
