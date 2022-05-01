public class Book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
        public String toString(){
        return "Book [title] = "+title + ", author = " + author + ", year =  "+year;
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (year == getYear() && author.equals(getAuthor()));
    }
}
