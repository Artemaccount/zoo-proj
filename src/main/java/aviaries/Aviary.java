package aviaries;

import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {

    private Size aviarySize;
    private String name;
    private Map<String, T> aviaryMap = new HashMap<>();

    public Aviary(String name, Size size) {
        this.name = name;
        this.aviarySize = size;
    }

    public String getName() {
        return this.name;
    }

    public void addAnimal(T animal) {
        if (animal.getSize().equals(aviarySize)) {
            aviaryMap.put(animal.getName(), animal);
            System.out.println("В вальер *" + getName() + "* добавлен  " + animal.getName());
        } else {
            System.out.println("Размер вальера *" + getName() + "* не подходит для " + animal.getName());
        }
    }

    public void delAnimal(T animal) {
        aviaryMap.remove(animal.getName());
        System.out.println("Из вальера *" + getName() + "* удален " + animal.getName());
    }

    public T getLink(String name) {
        return aviaryMap.get(name);
    }

    public void print() {
        for (Map.Entry entry : aviaryMap.entrySet()) {
            System.out.println("В вальере *" + getName() + "* сейчас:");
            System.out.println(entry.getKey());
        }
    }
}
