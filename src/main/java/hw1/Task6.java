package hw1;

public class Task6 {
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
        System.out.println(isPalindromeDescendant("1221"));
    }
}
