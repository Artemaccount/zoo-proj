package animals;

import aviaries.Size;

import java.util.Objects;

public abstract class Carnivorous extends Animal {
    private Size size;
    String name;

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
