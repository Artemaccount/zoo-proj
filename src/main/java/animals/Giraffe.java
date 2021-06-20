package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public class Giraffe extends Herbivore implements Runnable, Voiceable {
    String name;
    Size size;

    public Giraffe() {
        this.name = "Жираф";
        this.size = Size.HUGE;
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
        return "*Звук жирафа*";
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }
}
