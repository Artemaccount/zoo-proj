import animals.*;
import aviaries.Aviary;
import aviaries.CarnAviary;
import aviaries.HerbAviary;
import aviaries.Size;
import exceptions.WrongFoodException;
import food.Steak;
import workers.Worker;

import java.io.IOException;

public class Zoo {

    public static void main(String[] args) throws WrongFoodException {

        Lion lion = new Lion();
        Zebra zebra = new Zebra();
        Elephant elephant = new Elephant();
        Duck duck = new Duck();
        Bear bear = new Bear();

        Steak steak = new Steak();

        Aviary<Herbivore> herbAviary = new Aviary<>("Травоядные", Size.MEDIUM);
        Aviary<Carnivorous> carnAviary = new Aviary<>("Плотоядные", Size.BIG);

        herbAviary.addAnimal(zebra);
        herbAviary.addAnimal(duck);
        herbAviary.addAnimal(elephant);

        carnAviary.addAnimal(lion);
        carnAviary.addAnimal(bear);
        carnAviary.delAnimal(bear);
        herbAviary.print();
        carnAviary.print();

        pressEnterToContinue();

        zebra.eat(steak);
    }

    public static void pressEnterToContinue() {
        System.out.println("Сейчас будет ошибка WrongFoodException, нажми Enter...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
