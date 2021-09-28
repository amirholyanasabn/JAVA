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
                double bestOprSumPrice = 0 ;
                String bestOprName = "";
                double shopSumPrice = 0 ;
                for (int oprIndex = 0; oprIndex < sellerCount ; oprIndex++) {
                    System.out.printf("Please enter operator %d name :",oprIndex+1);
                    System.out.println();
                    String oprName = reader.readLine();
                    System.out.printf("Please enter %s 's invoice count : ",oprName);
                    System.out.println();
                    int invoiceCount = Integer.parseInt(reader.readLine());
                    double sumPrice = 0;
                    for (int inxInvoice = 0; inxInvoice < invoiceCount ; inxInvoice++) {
                        System.out.printf("Please enter %s 's invoice %d price : ",oprName,inxInvoice+1);
                        System.out.println();
                        double invPrice = Double.parseDouble(reader.readLine());
                        sumPrice += invPrice;
                        shopSumPrice += invPrice;
                    }

                    double average = sumPrice / invoiceCount;
                    System.out.printf("The sum price of %s is %2f .",oprName,sumPrice);
                    System.out.println();
                    System.out.printf("The average of %s is %2f ",oprName,average);

                    if (sumPrice <= 5000000){
                        System.out.printf("%s is Low level",oprName);
                        System.out.println();
                    }else if (sumPrice > 5000000 && sumPrice <= 10000000){
                        System.out.printf("%s is Medium level",oprName);
                        System.out.println();
                    }else if (sumPrice > 10000000){
                        System.out.printf("%s is High Level",oprName);
                        System.out.println();
                    }

                    if (sumPrice > bestOprSumPrice){
                        bestOprSumPrice = sumPrice ;
                        bestOprName = oprName ;
                    }

                    System.out.println("Remains operator count is = > "+(sellerCount - oprIndex -1));
                }

                System.out.println("Shop sum price => "+shopSumPrice);
                System.out.println("Best operator is "+bestOprName+" with "+bestOprSumPrice+" .");


            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}
