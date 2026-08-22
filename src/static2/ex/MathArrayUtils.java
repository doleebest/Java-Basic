package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] array){
        int answer =0;
        for (int i=0; i< array.length; i++){
            answer += array[i];
        }
        return answer;
    }

    public static int average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int answer = array[0];
        for (int i=0; i< array.length; i++){
            if (array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;
    }

    public static int max(int[] array) {
        int answer = array[0];
        for (int i=0; i< array.length; i++){
            if (array[i] > answer) {
                answer = array[i];
            }
        }
        return answer;
    }

}
