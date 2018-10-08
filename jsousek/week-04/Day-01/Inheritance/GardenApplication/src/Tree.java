public class Tree extends Plants {


    public Tree (String color ){
        super.color = color;
        super.waterLevel = 0 +(waterLevel*0.40);
        if (waterLevel < 5)
            super.needsWater = true;
    }
}
