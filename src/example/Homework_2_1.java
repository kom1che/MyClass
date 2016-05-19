package example;

import java.util.Scanner;

/**
 * Created by komche on 09.03.16.
 */
public class Homework_2_1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int z,z1,z2,z3,z4,sum;
        System.out.println("Input value for z");
        z=sc.nextInt();
        z1=z+=1;
        z2=z+=1;
        z3=z+=1;
        z4=z+=1;
        sum=z1+z2+z3+z4;
        System.out.print(z1+" "+z2+" "+z3+" "+z4+" "+sum);

    }
}
