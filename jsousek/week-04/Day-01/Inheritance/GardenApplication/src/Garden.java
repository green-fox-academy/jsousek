import java.util.*;

public class Garden extends Plants{
    List<Plants> flowerList;
    List<Tree> treeList;

    public Garden (){
    }


    public Tree addTree (String treeColor){
        Tree nextTree = new Tree(treeColor);
        return nextTree;
    }
    public Flower addFlower (String flowerColor){
        Flower nextFlower = new Flower (flowerColor);
        return  nextFlower;
    }
    public double waterPlants (double waterAmount){
        waterAmount = waterLevel+waterAmount;
        return waterAmount;
    }
    public void addPlant (Plants anyFlo){
        flowerList.add(anyFlo);


    }








}
