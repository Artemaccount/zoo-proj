package animals;

import food.Food;
import food.Meat;

public class Shark extends Carnivorous implements Swimmable {
    String name;

    public Shark() {
        this.name = "Акула";
    }

    @Override
    public void swim() {
        System.out.println(this.name +  " *плывёт*");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
