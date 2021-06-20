package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public class Shark extends Carnivorous implements Swimmable {
    String name;
    Size size;

    public Shark() {
        this.name = "Акула";
        this.size = Size.BIG;
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
    public void swim() {
        System.out.println(this.name + " *плывёт*");
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
