import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* long balance = 10_000_000l;
        int salary =(int) balance;
        double myData = 17.89;
        char a ='A';
        myData = a;
        a= (char) myData;
        System.out.println(myData);
        System.out.println(a);
        Integer n = new Integer(12);
        Integer n1 = Integer.valueOf(90);
        n = Integer.valueOf(20);
        System.out.println(n);
        System.out.println(n1);
        */
        int data2 = 15;
        Integer data =Integer.valueOf(5);
        data =Integer.valueOf(13);
        data =data2; //Autoboxing -- Boxing
        int x = data; // Autoboxing
        x+=10;  //Unboxing
        System.out.println(data);
        System.out.println(x);
    }
}
