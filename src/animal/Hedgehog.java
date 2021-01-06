package animal;

public class Hedgehog extends Animal{
    private static final Integer MAXIMUM_WEIGHT = 5;
    private static final Integer WEIGHT_CHANGE_FOR_MEAT = -1;
    private static final Integer WEIGHT_CHANGE_FOR_VEGETABLES = 0;
    private static final Integer WEIGHT_CHANGE_FOR_FRUIT = 2;

    public Hedgehog(String name, Integer weight){
        super(name, weight, MAXIMUM_WEIGHT, WEIGHT_CHANGE_FOR_MEAT, WEIGHT_CHANGE_FOR_VEGETABLES, WEIGHT_CHANGE_FOR_FRUIT);
    }
}
