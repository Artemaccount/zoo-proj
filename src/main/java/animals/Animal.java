package animals;

import exceptions.WrongFoodException;
import food.Food;

public abstract class Animal {

    public abstract void eat(Food food) throws WrongFoodException;

}
