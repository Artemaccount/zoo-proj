package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Voiceable, Flyable, Swimmable, Runnable{
    String name;
    public Duck(){
        this.name = "Утка";
    }
    @Override
    public void fly() {
        System.out.println(this.name + " *летит*");
    }

    @Override
    public void run() {
        System.out.println(this.name +  " *Бежит*");
    }

    @Override
    public void swim() {
        System.out.println(this.name +  " *Плывет*");
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(this.name + " ест: " + food);
        } else {
            System.out.println("Ошибка! Животное [" + this.name + "] не ест [" + food + "]");
        }
    }

    @Override
    public String voice() {
        return "*звук утки*";
    }
}
