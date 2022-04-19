import java.util.Arrays;

// Reverse array
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("input: " + Arrays.toString(numbers)); //input: [1, 2, 3, 4, 5]

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;

        }
        System.out.println("output: " + Arrays.toString(numbers)); //output: [5, 4, 3, 2, 1]

        //teacher solution
        int[] num = {1, 2, 3, 4, 5};
        int[] invertedArray = new int[num.length];

        for(int i = 0; i < num.length; i++){
            int index = num.length - 1;
            invertedArray[i] = num[index - i];
        }

        for(int number : invertedArray){
            System.out.println(number);
        }
    }
}
