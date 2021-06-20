package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;
import food.Meat;

public class Elephant extends Herbivore implements Runnable, Voiceable {
    String name;
    Size size;

    public Elephant() {
        this.name = "Слон";
        this.size = Size.HUGE;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Size getSize() {
        return size;
    }


    @Override
    public void run() {
        System.out.println(this.name + " *бежит*");
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }

    @Override
    public String voice() {
        return "*Звук слона*";
    }
}
