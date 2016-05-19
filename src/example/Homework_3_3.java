package example;

import java.util.Scanner;

/**
 * Created by komche on 09.03.16.
 */
public class Homework_3_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int z,a,b,c;
        System.out.println("Input value for z");
        z=sc.nextInt();
        a=z/100;
        b=(z%100)/10;
        c=(z%100)%10;
        System.out.println(a+b+c);

    }
}
