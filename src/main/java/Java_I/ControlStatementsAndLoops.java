package Java_I;
import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        System.out.println("\n\nincrement by 1, 5=>15");
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }
        System.out.println("\n\nincrement by 2, 0=>100");
        int j = 0;
        do{
            System.out.println(j);
            j+=2;
        }while (j <= 100);
        System.out.println("\n\ndecrement by 5, 100=>-10");
        int q = 100;
        do{
            System.out.println(q);
            q-=5;
        }while(q >=-10);

        for(int w=0;w<=100;w+=2){
            System.out.println(w);
        }

        for(int e=100;e>=-10;e-=5){
            System.out.println(e);
        }
        System.out.println("FizzBuzz!!! (for loop)");
        for(int r = 1; r<=100; r++){
            if (r%3==0 && r%5==0){
                System.out.println("Fizzbuzz");
            } else if(r%3==0){
                System.out.println("Fizz");
            } else if (r%5==0){
                System.out.println("Buzz");
            } else{
                System.out.println(r);
            }
        }

    }
}
