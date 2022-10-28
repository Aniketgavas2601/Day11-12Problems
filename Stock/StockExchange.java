package com.bridgelabz.day11_stock_management;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class StockExchange {
        //creating an Arraylist for StockAccountDetails Object
        ArrayList<StockAccount> stockAccountDetails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        StockAccount details = new StockAccount();

        //Method to add Money into Demat Account
        public void addFund() {
            System.out.print("Enter Amount: ");
            double balance = sc.nextDouble();
            details.setAccountBalance(balance + details.getAccountBalance());
            System.out.println(balance + " Rs" + "is Added Into Your Demat Account");
            System.out.println("Account Balance: Rs."+details.getAccountBalance());
            System.out.println();
        }

        //Method To Buying A New Share
        public void buyShare(){
            System.out.println();
            System.out.println("Account Balance: " + details.getAccountBalance() + "Rs");
            System.out.print("Enter Stock Name: ");
            String stockName = sc.next();


            System.out.print("Number Of Shares You want to buy: ");
            int numberOfShares = sc.nextInt();

            System.out.print("Enter Current Price of Stock: ");
            double sharePrice = sc.nextDouble();

            double totalSharePrice =  numberOfShares * sharePrice;
            System.out.println("Total Share Price is " + totalSharePrice + "Rs");
            System.out.println();
            double remainingBalance = details.getAccountBalance() - totalSharePrice;
            if (totalSharePrice <= details.getAccountBalance()) {
                StockAccount stockData = new StockAccount(stockName, numberOfShares, sharePrice, totalSharePrice, remainingBalance);
                stockAccountDetails.add(stockData);
                System.out.println(stockName + " Stock added Successfully in Your Portfolio");
                double acBalance = remainingBalance;
                details.setAccountBalance(acBalance);
                System.out.println("Remaining Account Balance: " + details.accountBalance + "Rs");
            } else {
                System.out.println("Insufficient balance.. \nYou Can Not buy This stock \nPlease select another stock \n Or Reduce the shears Quantity");
            }
            System.out.println();
        }
        //method for view portfolio
        public void showPortfolio() {
            if (stockAccountDetails.size() == 0) {
                System.out.println("Empty Portfolio..");
                System.out.println();
            } else {
                System.out.println();
                System.out.println(stockAccountDetails.size() + " Company Stocks available in Portfolio");
                for (int i = 0; i < stockAccountDetails.size(); i++) {
                    System.out.println(stockAccountDetails.get(i));
                    System.out.println(" ");
                }
            }
            System.out.println("Account Balance: " +details.getAccountBalance());
            System.out.println();
        }

        //method for sell stocks
        public void sellShare() {
            if (stockAccountDetails.size() == 0) {
                System.out.println("Empty Portfolio..");
                System.out.println();
            } else {
                System.out.print("Enter The Stock Name You want to Sell from Your Holdings: ");
                String sname = sc.next();
                for (int i = 0; i < stockAccountDetails.size(); i++) {
                    StockAccount stockdata = stockAccountDetails.get(i);
                    if (!sname.equals(stockdata.stockName)) {
                        System.out.println("Stock does not exist");
                    } else {
                        double acbalance =  details.accountBalance + stockdata.totalValueOfEachStock;
                        details.setAccountBalance(acbalance);

                        //remove stock
                        stockAccountDetails.remove(i);
                        System.out.println();
                        System.out.println("Successfully to sell stock...\namount Successfully added to Your account \nplease check Your Portfolio");
                    }
                }
            }
            System.out.println();
        }

        public void withdrawsMoney(){
            if (details.getAccountBalance() == 0) {
                System.out.println("Insufficient balance \nplease Add Fund");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Account Balance: " +details.getAccountBalance());
                System.out.println("How much Money You want to withdraws?");
                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();
                if (amount <= details.getAccountBalance()) {
                    System.out.println(amount+ "Rs successfully Withdraw");
                    System.out.println("The amount of Rs." +amount+ " has been initiated to your bank account and will reflect in 1 working day");
                    double remaning = details.getAccountBalance() - amount;
                    details.setAccountBalance(remaning);

                    System.out.println();
                    System.out.println("Now Your Demat Account Balance: " +details.getAccountBalance());
                    System.out.println();
                } else {
                    System.out.println("Insufficient balance");
                }
            }
            System.out.println();
        }
    }


