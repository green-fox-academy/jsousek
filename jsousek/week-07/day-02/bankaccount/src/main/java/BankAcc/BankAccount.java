package BankAcc;

public class BankAccount {
    String name;
    int balance;
    String animalType;
    boolean isKing;
    boolean isGood;

    public BankAccount(){}

    public BankAccount (String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = false;
        this.isGood = true;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
    public String getIfsKing(){
        if(isKing)
        {return "👑";}
        return "tax payer";
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setBallance(int balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public void setKing (boolean b){
        this.isKing = b;
    }
    public void setGood (boolean b){
        this.isGood = b;
    }

    @Override
    public String toString() {
        return getName() + "\\s" + getBalance() + "\\s" + getAnimalType();
    }
}



