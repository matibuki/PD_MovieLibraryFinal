public class Director extends Actor{
    private boolean isDirector;

    private String name;
    private String surname;

    public boolean isDirector() {
        return isDirector;
    }

    public void setDirector(boolean isDirector) {
        this.isDirector = isDirector;
    }
    public Director (String name, String surname, boolean isDirector) {
        super(name, surname);
        this.isDirector = isDirector;
    }



}
