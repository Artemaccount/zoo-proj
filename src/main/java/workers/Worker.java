package workers;

import animals.Animal;
import animals.Voiceable;
import food.Food;

public class Worker {
    public void feed(Food food, Animal animal){
        animal.eat(food);
    }

    public void getVoice(Voiceable voiceable){
        System.out.println(voiceable.voice());
    }
}
