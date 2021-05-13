import java.util.Scanner;

public class FirstExerciseSecondWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String inputText=scan.nextLine();
        System.out.println("Please enter your search word : ");
        String search = scan.next();

        if (inputText.indexOf(search)<0)
            System.out.println("Not Available");
        else if(inputText.indexOf(search)==inputText.lastIndexOf(search))
            System.out.println("One time");
        else
            System.out.println("More one time");
    }
}
