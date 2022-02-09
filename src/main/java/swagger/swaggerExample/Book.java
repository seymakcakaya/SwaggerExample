package swagger.swaggerExample;

public class Book {
    private int id;
    private String bookName;
    private String publisher;
    private String writer;
    private String type;

    public Book(int id, String bookName, String publisher, String writer, String type) {
        this.id = id;
        this.bookName = bookName;
        this.publisher = publisher;
        this.writer = writer;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", writer='" + writer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
