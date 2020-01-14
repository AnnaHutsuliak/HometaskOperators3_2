package epam.com.operators;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner vv=new Scanner (System.in);
        int var;
        String s="";
        System.out.print(" Кількість - ");
        var=vv.nextInt();
        for (int i=1, j=var; i<=2*var; i++) {
            if (i<=var){
                s=s+"*";
                System.out.println(s);
            }
        }
        vv.close();
    }

}