package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public class Zebra extends Herbivore implements Runnable, Voiceable {
    String name;
    Size size;

    public Zebra() {
        this.name = "Зебра";
        this.size = Size.MEDIUM;
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
        return "*Звук зебры*";
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
