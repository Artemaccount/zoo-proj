package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public class Lion extends Carnivorous implements Runnable, Voiceable {
    String name;
    Size size;

    public Lion() {
        this.name = "Лев";
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
    public void run() {
        System.out.println(this.name + " *бежит*");
    }

    @Override
    public String voice() {
        return "*Звук льва*";
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
