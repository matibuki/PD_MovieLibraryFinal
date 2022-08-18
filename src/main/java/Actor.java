public class Actor {
    private final String name;
    private final String surname;
    public Actor (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;

    }
}



