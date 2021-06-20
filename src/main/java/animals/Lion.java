package animals;

import food.Food;
import food.Meat;

public class Lion extends Carnivorous implements Runnable, Voiceable{
    String name;

    public Lion(){
        this.name = "Лев";
    }
    @Override
    public void run() {
        System.out.println(this.name +  " *бежит*");
    }

    @Override
    public String voice() {
        return "*Звук льва*";
    }
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
