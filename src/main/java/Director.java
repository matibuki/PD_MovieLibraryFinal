public class Director {
    private String directorName;
    private String directorSurname;

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public void setDirectorSurname(String directorSurname) {
        this.directorSurname = directorSurname;
    }


    public Director(String directorName, String directorSurname) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;
    }


}
