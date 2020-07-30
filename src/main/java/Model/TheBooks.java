package Model;

public class TheBooks {
    private String bookName;
    private String bookLanguage;
    private String genre;
    private Clients customer = null;

    public TheBooks(String bookName, String bookLanguage, String genre) {
        this.bookName = bookName;
        this.bookLanguage = bookLanguage;
        this.genre = genre;
    }



    public String getBookName() {
        return bookName;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public String getGenre(){
        return genre;
    }

    public Clients getCustomer() {
        return customer;
    }

    public void rent(Clients customer){
        this.customer = customer;
    }

    public void release(){
        this.customer = null;
    }
}

