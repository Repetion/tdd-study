package ch7;

public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount;
    }
}
