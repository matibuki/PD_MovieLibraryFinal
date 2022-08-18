public class Director {
    private final String directorName;
    private final String directorSurname;

    public String getDirectorName() {
        return directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public Director(String directorName, String directorSurname) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;
    }
}
