package example;

import java.util.Scanner;

/**
 * Created by komche on 10.03.16.
 */
public class Homework_3_4 {
    public static void main(String[] args){
        int secret=(int)(Math.random()*100),n;
        System.out.println(secret);
        Scanner sc=new Scanner(System.in);
        System.out.println("Try to guess the secret's value");
        for (int i=1;i<8;i++){
            if (i<7){
                n=sc.nextInt();
                if (n==secret){
                    System.out.println("Congratulations! You win!!!");
                    break;
                } else if (n>secret){
                    System.out.println("Higher");
                } else if (n<secret){
                    System.out.println("Lower");
                }
            } else {
                n=sc.nextInt();
                if (n==secret){
                    System.out.println("Congratulations! You win!!!");
                    break;
                } else {
                    System.out.println("You loose!");
                }
            }
        }
    }
}
