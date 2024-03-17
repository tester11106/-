package hw1;

public class Task2 {

    public static int number_of_digits(String digits){
        int result = 0;
        result = digits.length();
        for(int i = 0; i < digits.length(); i++){
            if(digits.charAt(i) == '-')
                result--;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(number_of_digits("-56-3"));
    }

}
