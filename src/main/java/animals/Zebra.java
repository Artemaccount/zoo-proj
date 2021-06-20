package animals;

import food.Food;
import food.Grass;

public class Zebra extends Herbivore implements Runnable, Voiceable {
    String name;
    public Zebra(){
        this.name = "Зебра";
    }
    @Override
    public void run() {
        System.out.println("*Бежит*");
    }

    @Override
    public String voice() {
        return "*Звук зебры*";
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
