package animal;

public class Bear extends Animal{
    private static final Integer MAXIMUM_WEIGHT = 10;
    private static final Integer WEIGHT_CHANGE_FOR_MEAT = 1;
    private static final Integer WEIGHT_CHANGE_FOR_VEGETABLES = -1;
    private static final Integer WEIGHT_CHANGE_FOR_FRUIT = 1;

    public Bear(String name, Integer weight){
        super(name, weight, MAXIMUM_WEIGHT, WEIGHT_CHANGE_FOR_MEAT, WEIGHT_CHANGE_FOR_VEGETABLES, WEIGHT_CHANGE_FOR_FRUIT);
    }
}
