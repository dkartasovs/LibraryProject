package Model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<TheBooks> libraryBooks = new ArrayList<>();

    public Library(List<TheBooks> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<TheBooks> getLibraryBooks() {
        return libraryBooks;
    }


}
