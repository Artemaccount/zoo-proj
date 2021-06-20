package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Voiceable, Flyable, Swimmable, Runnable {
    String name;
    Size size;

    public Duck() {
        this.name = "Утка";
        this.size = Size.SMALL;
    }

    @Override
    public Size getSize() {
        return size;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + " *летит*");
    }

    @Override
    public void run() {
        System.out.println(this.name + " *Бежит*");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " *Плывет*");
    }

    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            throw new WrongFoodException("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }

    @Override
    public String voice() {
        return "*звук утки*";
    }
}
