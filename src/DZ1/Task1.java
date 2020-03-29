package DZ1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите цену и кол-во литров");
        float price=in.nextFloat();
        float lit=in.nextFloat();
        float sum=lit*price;
        System.out.println(sum+" руб");

        System.out.println("Введите зарплату");
        float sal = in.nextFloat();
        float tp = 13;
        float tax = sal * tp / 100;
        float net = sal - tax;
        System.out.println(net + " руб");

        System.out.println("Введите кол-во секунд");
        float hr=in.nextFloat()/3600;
        System.out.println(hr+" ч");

    }
}