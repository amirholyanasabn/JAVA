import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number[size] : ");
        int size = scanner.nextInt();

        int[] numbers=new int[size];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.printf("Please enter %d number : ",i+1);
            numbers[i]=scanner.nextInt();
        }


        int[] yekan = new int[size];
        int[] dahgan = new int[size];
        int[] sadgan = new int[size];
        int[] hezargan = new int[size];

        for (int i=0;i<numbers.length;i++){

            yekan[i]=numbers[i]%10;
            dahgan[i]=numbers[i]/100;
            sadgan[i]=numbers[i]%100;
            hezargan[i]=numbers[i]/1000;
        }
        int sumYekan =yekan[0];
        int sumDahgan=dahgan[0];
        int sumSadgan=sadgan[0];
        int sumHezargan=hezargan[0];
        for (int i = 1; i <yekan.length ; i++) {

            sumYekan+=yekan[i];
        }
        System.out.printf("Sum of yekan is %s",sumYekan);
        System.out.println();

        for (int i = 1; i <dahgan.length ; i++) {
            sumDahgan+=dahgan[i];
        }
        System.out.printf("Sum of dahgan is %s",sumDahgan);
        System.out.println();

        for (int i = 1; i <sadgan.length ; i++) {
            sumSadgan+=sadgan[i];
        }
        System.out.printf("Sum of sadgan is %s",sumSadgan);
        System.out.println();

        for (int i = 1; i <hezargan.length ; i++) {
            sumHezargan+=hezargan[i];
        }
        System.out.printf("Sum of hezargan is %s",sumHezargan);
    }
}
