package workers;

import animals.Animal;
import animals.Voiceable;
import exceptions.WrongFoodException;
import food.Food;

public class Worker {
    public void feed(Food food, Animal animal) throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Voiceable voiceable){
        System.out.println(voiceable.voice());
    }
}
