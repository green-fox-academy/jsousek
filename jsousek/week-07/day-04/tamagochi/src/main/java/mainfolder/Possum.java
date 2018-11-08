package mainfolder;

import java.util.ArrayList;
import java.util.List;

public class Possum {

    List<String> knownTricks = new ArrayList<>();
    String name;
    String food;
    String drink;

    public Possum(String name, String food, String drink){
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.knownTricks = knownTricks;
    }

    //default constructor
    public Possum(){}

    public void setName(String name) {
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
    }

    public void addTrick (String input){
        knownTricks.add(input);
    }


}
