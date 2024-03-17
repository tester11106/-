package hw1;

public class Task4 {
    public static Boolean isNestable(int[] arr1, int[] arr2){
        boolean result = false;
        if(arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1])
            result = true;
        return result;
    }
    public static void main(String[] args) {
        boolean result_bool = true;
        int[] arr1 = {3, 8};
        int[] arr2 = {4, 5, 6};

        result_bool = isNestable(arr2, arr1);
        System.out.println(result_bool);
    }
}
