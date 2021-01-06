import animal.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Zoo zoo = new Zoo(generateAnimals());

        for (String food : generateMenu()){
            zoo.oneDayInZoo(food);
        }
    }

    public static List<Animal> generateAnimals(){
        return new ArrayList<>(Arrays.asList(
                new Wolf("Akela", 3),
                new Bear("Balu", 4),
                new Rabbit("Tapsi", 2),
                new Bear("Brumi", 6),
                new Hedgehog("Durum", 4)
        ));
    }
    public static List<String> generateMenu(){
        return new ArrayList<>(Arrays.asList(
                "meat",
                "vegetables",
                "meat",
                "fruit",
                "meat"
        ));
    }
}
