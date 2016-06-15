package java.com.dubswcraft.fp.old;

import java.util.ArrayList;
import java.util.List;

// Exercise 6: The following violates the Open Closed principle, see how you can write this using higher order functions

public class Exercise6_Java_HigherOrderFunctions {

    void processUbsCommission(Trade trade) {
        // side effecting - just for exercise purposes
        System.out.println("Commission UBS " + trade.amount * 0.25);
    }

    void processCitiCommission(Trade trade) {
        // side effecting - just for exercise purposes
        System.out.println("Commission Citi " + trade.amount * 0.15);
    }

    void processJPMorganCommission(Trade trade) {
        System.out.println("Commission JP Morgan " + trade.amount * 0.10);
    }

    void processTrades(ArrayList<Trade> trades) {
        for (Trade trade : trades) {
            if (trade.bankName == "UBS") processUbsCommission(trade);
            else if (trade.bankName == "CITI")  processCitiCommission(trade);
            else processJPMorganCommission(trade);
        }
    }

    public static void main(String[] args) {
        ArrayList<Trade> trades = new ArrayList<Trade>();
        trades.add(new Trade("UBS", 1000));
        trades.add(new Trade("JP", 300));
        trades.add(new Trade("CITI", 1001));

        new Exercise6_Java_HigherOrderFunctions().processTrades(trades);
    }
}

class Trade {
    public final String bankName;
    public final Integer amount;

    public Trade(String name, Integer amount) {
        this.bankName = name;
        this.amount = amount;
    }
}