package hw1;

public class Task_1_1 {
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

    public static void main(String[] args) {
        int result = 0;

        result = time_s("12:50");
        System.out.println(result);
    }
}
