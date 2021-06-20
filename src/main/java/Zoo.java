import animals.*;
import aviaries.CarnAviary;
import aviaries.HerbAviary;
import aviaries.Size;
import exceptions.WrongFoodException;
import food.Steak;
import workers.Worker;

import java.io.IOException;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {

        HerbAviary<Herbivore> herbAviary = new HerbAviary<>(Size.HUGE);
        CarnAviary<Carnivorous> carnAviary = new CarnAviary<>(Size.BIG);

        Worker worker = new Worker();
        Steak steak = new Steak();
        Lion lion = new Lion();
        Giraffe giraffe = new Giraffe();
        Bear bear = new Bear();
        Zebra zebra = new Zebra();

        herbAviary.addAnimal(giraffe);
        herbAviary.addAnimal(zebra);

        carnAviary.addAnimal(lion);
        carnAviary.addAnimal(bear);
        carnAviary.delAnimal(lion);

        carnAviary.print();
        herbAviary.print();

        pressEnterToContinue();
        worker.feed(steak, zebra);
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
