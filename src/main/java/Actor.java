public class Actor {
    final String name;
    final String surname;

    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;

    }
}



