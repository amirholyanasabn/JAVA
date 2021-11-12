package com.managmentSeller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        long sum = 0;
        double ave = 0;
        String max;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please enter seller count : ");
            int sellerCount = Integer.parseInt(reader.readLine());
            if (sellerCount == 0) break;
            for (int i = 0; i < sellerCount; i++) {
                Sellers sellers = new Sellers();
                System.out.println("Please enter name : ");
                sellers.setName(reader.readLine());
                System.out.println("Please enter invoice count : ");
                sellers.setInvoiceCount(Integer.parseInt(reader.readLine()));
                for (int j = 0; j < sellers.getInvoiceCount(); j++) {
                    int[] invoicePrices = new int[sellers.getInvoiceCount()];
                    System.out.printf("Please enter {%d} invoice ", j + 1);
                    System.out.println();
                    invoicePrices[i] = Integer.parseInt(reader.readLine());
                    sum += invoicePrices[i];
                }
                max = sellers.getName();
                System.out.println("Sum is " + sum);
                ave = sum / (sellers.getInvoiceCount());
                System.out.println("Average is " + ave);

            }

        }


    }
}
