package homework_6;

public class Task4_biggestElemem {
    public static void main(String[] args) {
        int[] arr = {7, 9, 15, 47, 3, 800};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
