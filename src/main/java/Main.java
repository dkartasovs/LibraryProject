import Model.Clients;
import Model.TheBooks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<TheBooks> booksInLibrary = new ArrayList<>();

        TheBooks harryPotter = new TheBooks("Philosopher's Stone", "English", "Fantastic");
        TheBooks harryPotter2 = new TheBooks("Chamber of Secrets", "English", "Fantastic");
        TheBooks alchemic = new TheBooks("Alchemic", "Russian", "Adventure");
        TheBooks velzevul = new TheBooks("Velzevul: the begining", "Latin", "Reality");
        TheBooks theWife = new TheBooks("Top 10 ways : How to kill your wife?", "English", "Reality");

        Clients vasja = new Clients("Valerij", "Uotson", "58931587");
        Clients egor = new Clients("Egor", "Potter", "78514235");
        Clients dmitry = new Clients("Dmitry", "Mendeleev", "-");
        Clients satana = new Clients("Satana", "Benediktovich", "666");
        Clients george = new Clients("George", "Smith", "666+1");

        booksInLibrary.add(harryPotter);
        booksInLibrary.add(harryPotter2);
        booksInLibrary.add(alchemic);
        booksInLibrary.add(velzevul);
        booksInLibrary.add(theWife);

        LibraryHelper helper = new LibraryHelper();
        helper.getBookByName("Alchemic", booksInLibrary).rent(vasja);
    }
}
