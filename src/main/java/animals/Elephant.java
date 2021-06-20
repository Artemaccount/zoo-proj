package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Elephant extends Herbivore implements Runnable, Voiceable{
    String name;
    @Override
    public void run() {
        System.out.println(this.name + " *бежит*");
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }

    @Override
    public String voice() {
        return "*Звук слона*";
    }
}
