package DZ3;

import java.util.Scanner;
import java.util.Random;
public class Task3
{
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess = random.nextInt(5);
        int input=-1;
        System.out.print("enter");

        while (input!=guess) {
            input = sc.nextInt();
            System.out.println((input==guess)? "krasava" : ((input>guess)? "hot" :"cold"));
        }
    }
}
