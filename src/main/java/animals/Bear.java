package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public class Bear extends Carnivorous implements Runnable, Voiceable {
    String name;
    Size size;

    public Bear(
    ) {
        this.name = "Медведь";
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
        System.out.println("*Бежит*");
    }

    @Override
    public String voice() {
        return "*Звук медведя*";
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
