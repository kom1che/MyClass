package example;

import java.util.Scanner;

/**
 * Created by komche on 09.03.16.
 */
public class Homework_2_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int z;
        float q,a,b,c,d;
        System.out.println("Input value for z");
        z=sc.nextInt();
        System.out.println("Input value for q");
        q=sc.nextFloat();
        a=z*q;
        b=a*z;
        c=b*q;
        d=a+b+c;
        System.out.print(a+" "+b+" "+c+" "+d);
    }
}
