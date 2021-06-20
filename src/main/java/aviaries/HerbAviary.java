package aviaries;

import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class HerbAviary<Herbivore> {
    private static Size aviarySize;
    private Map<String, animals.Herbivore> herbAviary = new HashMap<>();

    public HerbAviary(Size size) {
        aviarySize = size;
    }

    public void addAnimal(animals.Herbivore herbivore) {
        if (herbivore.getSize().equals(aviarySize)) {
            herbAviary.put(herbivore.getName(), herbivore);
        } else {
            System.out.println("Размер вальера не подходит для " + herbivore.getName());
        }

    }

    public void delAnimal(animals.Carnivorous carnivorous) {
        herbAviary.remove(carnivorous.getName());
        System.out.println(carnivorous.getName() + " удален из вальера");
    }

    public animals.Herbivore getLink(String name) {
        return herbAviary.get(name);
    }

    public void print() {
        for (Map.Entry entry : herbAviary.entrySet()) {
            System.out.println("В вальере травоядных сейчас:");
            System.out.println(entry.getKey());
        }
    }
}
