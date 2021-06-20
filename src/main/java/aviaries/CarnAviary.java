package aviaries;

import java.util.HashMap;
import java.util.Map;

public class CarnAviary<Carnivorous> {
    private static Size aviarySize;
    private Map<String, animals.Carnivorous> carnAviary = new HashMap<>();

    public CarnAviary(Size size){
        aviarySize = size;
    }

    public void addAnimal(animals.Carnivorous carnivorous){
        if(carnivorous.getSize().equals(aviarySize)){
            carnAviary.put(carnivorous.getName(), carnivorous);
            System.out.println(carnivorous.getName() + " помещен в вальер");
        } else {
            System.out.println("Размер вальера не подходит для " + carnivorous.getName());
        }

    }

    public void delAnimal(animals.Carnivorous carnivorous){
        carnAviary.remove(carnivorous.getName());
        System.out.println(carnivorous.getName() + " удален из вальера");
    }

    public animals.Carnivorous getLink(String name){
        return carnAviary.get(name);
    }

    public void print(){
        for (Map.Entry entry: carnAviary.entrySet()) {
            System.out.println("В вальере плотоядных сейчас:");
            System.out.println(entry.getKey());
        }

    }
}
