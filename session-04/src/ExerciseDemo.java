import java.util.Scanner;

public class ExerciseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int counter = 0;

        while (true){
            int input = scanner.nextInt();
            if (input == 0)
                break;
            array[counter%5]=input;
            counter++;
        }
        int sum = array[0];
        for (int i = 1; i <array.length ; i++) {
             sum += array[i];
        }
        System.out.println((float) sum/5);
    }
}
