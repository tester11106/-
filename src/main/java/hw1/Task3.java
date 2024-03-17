package hw1;

import java.util.Scanner;

public class Task3 {

    public static void printing_by_value(){
        int first, number;
        String print = "";
        Scanner in = new Scanner(System.in);
        first = in.nextInt();
        print += first;
        for(int i = 0; i < first - 1; i++){
            number = in.nextInt();
            if(first % 2 == 0)
                print += String.valueOf(number);
            else
                print = String.valueOf(number + print);

        }
        System.out.println(print);
    }
    public static void main(String[] args) {
        printing_by_value();
    }
}
