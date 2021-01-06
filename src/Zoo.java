import animal.Animal;

import java.util.List;

public class Zoo{
    private final List<Animal> animals;

    public Zoo(List<Animal> animals){
        this.animals = animals;
    }

    public void oneDayInZoo(String food){
        for (Animal animal : animals){
            animal.feed(food);
            System.out.println(animal);
        }
    }
}
