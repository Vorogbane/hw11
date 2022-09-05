public class Author {
    private String name;
    private String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return this.toString().equals(other.toString());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.toString());
    }
}
