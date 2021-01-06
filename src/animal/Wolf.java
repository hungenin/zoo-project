package animal;

public class Wolf extends Animal{
    private static final Integer MAXIMUM_WEIGHT = 6;
    private static final Integer WEIGHT_CHANGE_FOR_MEAT = 3;
    private static final Integer WEIGHT_CHANGE_FOR_VEGETABLES = -1;
    private static final Integer WEIGHT_CHANGE_FOR_FRUIT = -1;

    public Wolf(String name, Integer weight){
        super(name, weight, MAXIMUM_WEIGHT, WEIGHT_CHANGE_FOR_MEAT, WEIGHT_CHANGE_FOR_VEGETABLES, WEIGHT_CHANGE_FOR_FRUIT);
    }
}
