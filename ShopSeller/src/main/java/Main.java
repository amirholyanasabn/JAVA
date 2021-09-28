import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        while (true){
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter count of seller or press '0' to EXIT : ");
                int sellerCount = Integer.parseInt(reader.readLine());
                if (sellerCount == 0 ){
                    System.out.println("Have good time . . .");
                    break;
                }

                for (int oprIndex = 0; oprIndex < sellerCount ; oprIndex++) {
                    System.out.printf("Please enter operator %d name :",oprIndex+1);
                    System.out.println();
                    String oprName = reader.readLine();
                    System.out.printf("Please enter %s 's invoice count : ",oprName);
                    System.out.println();
                    int invoiceCount = Integer.parseInt(reader.readLine());
                }




            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}
