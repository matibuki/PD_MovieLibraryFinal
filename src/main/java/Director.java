public class Director extends Actor {
    public Director(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
