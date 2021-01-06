package animal;

public abstract class Animal{
    private final Integer maxWeight;
    private final Integer weightChangesForMeat;
    private final Integer weightChangesForVegetables;
    private final Integer weightChangesForFruit;
    private Integer weight;
    private String name;

    public Animal(String name, Integer weight, Integer maxWeight, Integer weightChangesForMeat, Integer weightChangesForVegetables, Integer weightChangesForFruit){
        this.maxWeight = maxWeight;
        this.weightChangesForMeat = weightChangesForMeat;
        this.weightChangesForVegetables = weightChangesForVegetables;
        this.weightChangesForFruit = weightChangesForFruit;
        this.name = name;
        this.weight = weight;
    }

    public void feed(String food){
        if (isAlive()){
            if (food == "meat") this.weight += this.weightChangesForMeat;
            else if (food == "vegetables") this.weight += this.weightChangesForVegetables;
            else if (food == "fruit") this.weight += this.weightChangesForFruit;
            else this.weight--;
        }
    }

    @Override
    public String toString(){
        return this.name + (isAlive() ? "'s weight: " + this.weight : " is dead :(");
    }

    private boolean isAlive(){
        return this.weight > 0 && this.weight < this.maxWeight;
    }
}
