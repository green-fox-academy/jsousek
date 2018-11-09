package mainfolder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public  class Possum {


    List<String> knownTricks;
    String name;
    String food;
    String drink;

    //public Possum(){}
   /* public Possum(String name, String food, String drink){
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.knownTricks =new ArrayList<>();
    }


    //default constructor needed in lombok


    /*public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<String> getKnownTricks() {
        return knownTricks;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }*/

    public void addTrick (String input){
        knownTricks.add(input);
    }


}
