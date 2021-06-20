package animals;

import aviaries.Size;
import exceptions.WrongFoodException;
import food.Food;

public abstract class Animal {
    private String name;
    private Size size;


    public abstract void eat(Food food) throws WrongFoodException;


    public Size getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
