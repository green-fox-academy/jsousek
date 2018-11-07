package BankAcc;

import java.util.ArrayList;
import java.util.List;

public class AccountsList {

    public static List<BankAccount> animals = new ArrayList<>();

    public AccountsList(){
        animals.add(new BankAccount("BooJack", 0, "horse"));
        animals.add(new BankAccount("Tony", 200, "racoon"));
        animals.add(new BankAccount("Miro", 5, "Chimpanzee"));
        animals.get(0).setKing(true);

    }

    public List<BankAccount> getList(){
        return animals;
    }


    public void addAnimal (BankAccount account){
        animals.add(account);
    }





}



