package animals;

import food.Food;
import food.Meat;

public class Bear extends Carnivorous implements Runnable, Voiceable{
    String name;
    public Bear(){
        this.name = "Медведь";
    }
    @Override
    public void run() {
        System.out.println("*Бежит*");
    }

    @Override
    public String voice() {
        return "*Звук медведя*";
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
