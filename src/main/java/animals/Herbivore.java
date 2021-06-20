package animals;

import aviaries.Size;
import food.Food;
import food.Grass;

import java.util.Objects;

public abstract class Herbivore extends Animal {
    private Size size;
    String name;

    public Herbivore() {
    }

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carnivorous that = (Carnivorous) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
