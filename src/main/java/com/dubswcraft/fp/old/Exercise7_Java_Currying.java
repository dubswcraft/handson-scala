package java.com.dubswcraft.fp.old;

import java.util.ArrayList;

// Exercise 7: The following violates the Open Closed principle, see how you can write this using higher order functions
// https://dzone.com/articles/understanding-currying-scala

public class Exercise7_Java_Currying {

    public static void main(String[] args) {
        ArrayList<Trade> trades = new ArrayList<Trade>();
        trades.add(new Trade("UBS", 1000));
        trades.add(new Trade("JP", 300));
        trades.add(new Trade("CITI", 1001));

        new Exercise7_Java_Currying().processTrades(trades);
    }
}

class Message {
    public final String bankName;
    public final Integer amount;

    public Trade(String name, Integer amount) {
        this.bankName = name;
        this.amount = amount;
    }
}

class Endpoint {
    public final String bankName;
    public final Integer amount;

    public Trade(String name, Integer amount) {
        this.bankName = name;
        this.amount = amount;
    }
}
