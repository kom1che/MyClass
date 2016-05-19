package example;

/**
 * Created by komche on 09.03.16.
 */
public class Homework_3_1 {
    public static void main(String[] args) {
        int i=1,m=2;
        while (i<21) {
            if (i==1){
                System.out.print(m + " ");
            }
            else {
                m*=2;
                System.out.print(m + " ");
            }
            i++;
        }
    }
}
