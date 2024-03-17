package hw1;

public class Task5 {
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
    public static void main(String[] args) {
        int result = 0;
        boolean result_bool = true;
        int[] arr1 = {3, 8};
        int[] arr2 = {4, 5, 6};

        System.out.println(fixString("2143"));
    }
}
