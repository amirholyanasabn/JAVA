package com.managmentSeller;

public class Sellers {
    private String name;
    private int invoiceCount;


    public Sellers() {
    }

    public Sellers(String name, int invoiceCount, long[] invoicePrices) {
        this.name = name;
        this.invoiceCount = invoiceCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInvoiceCount() {
        return invoiceCount;
    }

    public void setInvoiceCount(int invoiceCount) {
        this.invoiceCount = invoiceCount;
    }



}
