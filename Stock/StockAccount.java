package com.bridgelabz.day11_stock_management;

public class StockAccount {
    String stockName;
    int numberOfShares;
    double sharePrice;
    double totalValueOfEachStock;
    double accountBalance;

    public StockAccount(String stockName, int numberOfShares, double sharePrice, double totalValueOfEachStock, double accountBalance){
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.totalValueOfEachStock = totalValueOfEachStock;
        this.accountBalance = accountBalance;
    }

    public StockAccount(){

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalValueOfEachStock() {
        return totalValueOfEachStock;
    }

    public void setTotalValueOfEachStock(double totalValueOfEachStock) {
        this.totalValueOfEachStock = totalValueOfEachStock;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String toString(){
        System.out.println("Holdings");
        return "Stock_Name: "+stockName+ "\n Number_Of_Shares: "+numberOfShares+ "\n Share_Price: "+sharePrice+ "\n Total_Share_Price: "+totalValueOfEachStock;
    }
}
