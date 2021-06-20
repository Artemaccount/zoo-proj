package animals;

import food.Food;
import food.Grass;

public class Giraffe extends Herbivore implements Runnable, Voiceable{
    String name;
    @Override
    public void run() {
        System.out.println(this.name +  " *бежит*");
    }

    @Override
    public String voice() {
        return "*Звук жирафа*";
    }
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
