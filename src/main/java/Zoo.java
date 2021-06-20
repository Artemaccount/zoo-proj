import animals.*;
import food.Apple;
import food.Steak;
import workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Steak steak = new Steak();
        Apple apple = new Apple();

        Bear bear = new Bear();
        Lion lion = new Lion();
        Shark shark = new Shark();
        Zebra zebra = new Zebra();
        Duck duck = new Duck();

        Worker worker = new Worker();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(shark);
        zoo.add(zebra);
        zoo.add(bear);

        List<Swimmable> pond = new ArrayList<>();
        pond.add(shark);
        pond.add(duck);

        pond.forEach(Swimmable::swim);

        zoo.forEach(s -> worker.feed(apple, s));
        zoo.forEach(s -> worker.feed(steak, s));

        worker.getVoice(bear);
        worker.getVoice(zebra);

    }
}
