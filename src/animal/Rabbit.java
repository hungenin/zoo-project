package animal;

public class Rabbit extends Animal{
    private static final Integer MAXIMUM_WEIGHT = 4;
    private static final Integer WEIGHT_CHANGE_FOR_MEAT = -1;
    private static final Integer WEIGHT_CHANGE_FOR_VEGETABLES = 2;
    private static final Integer WEIGHT_CHANGE_FOR_FRUIT = 1;

    public Rabbit(String name, Integer weight){
        super(name, weight, MAXIMUM_WEIGHT, WEIGHT_CHANGE_FOR_MEAT, WEIGHT_CHANGE_FOR_VEGETABLES, WEIGHT_CHANGE_FOR_FRUIT);
    }
}
