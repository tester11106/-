package hw1;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static int time_s(String time){
        int second_result = 0;
        int index_stop;

        String minuts = "", seconds = "";
        index_stop = time.indexOf(":");

        for(int i = 0; i < index_stop; i++) {
            minuts += time.charAt(i);
        }
        for(int i = index_stop + 1; i < time.length(); i++) {
            seconds += time.charAt(i);
        }

        second_result = Integer.parseInt(minuts) * 60;
        second_result += Integer.parseInt(seconds);

        return second_result;
    }
    public static int number_of_digits(String digits){
        int result = 0;
        result = digits.length();
        for(int i = 0; i < digits.length(); i++){
            if(digits.charAt(i) == '-')
                result--;
        }
        return result;
    }
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
    public static Boolean isNestable(int[] arr1, int[] arr2){
        boolean result = false;
        if(arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1])
            result = true;
        return result;
    }
    public static String fixString(String fix){
        String result = "";

        for(int i = 0; i < fix.length(); ){
            if(i + 1 < fix.length())
                result += fix.charAt(i + 1);
            result += fix.charAt(i);
            i += 2;
        }

        return result;
    }
    public static Boolean isPalindromeDescendant(String str){
        Boolean result = false;
        String tmp = "";
        int sum;
        while(result != true && str.length() > 2) {
            result = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                    result = false;
            }
            for (int i = 0; i < str.length() - 1; i++) {
                sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
                tmp += Integer.toString(sum);
                i++;
            }
            str = tmp;
            tmp = "";
        }
        return result;
    }
    public static void main(String[] args) {
        int result = 0;
        boolean result_bool = true;
        int[] arr1 = {3, 8};
        int[] arr2 = {4,5,6};


        result = time_s("12:50");
        System.out.println(result);

        result = number_of_digits("-56-3");
        System.out.println(result);

        //printing_by_value();

        result_bool = isNestable(arr2, arr1);
        System.out.println(result_bool);

        System.out.println(fixString("hTsii  s aimex dpus rtni.g"));

        System.out.println(isPalindromeDescendant("123313"));


    }
}
