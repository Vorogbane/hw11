public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book (String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public Author getAuthor () {
        return this.author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return bookTitle + " " + this.author.toString();
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return this.toString().equals(other.toString());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.toString());
    }

}