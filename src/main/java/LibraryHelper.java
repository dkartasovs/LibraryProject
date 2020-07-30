import Model.TheBooks;

import java.util.ArrayList;
import java.util.List;

public class LibraryHelper {

    public TheBooks getBookByName(String byName, List<TheBooks> byNames) {
        for (TheBooks booksInLibrary : byNames) {
            if (booksInLibrary.getGenre().equals(byName)) {
                return booksInLibrary;
            }
        }
        return null;
    }

    public List<TheBooks> getFreeBooks (List<TheBooks> showFreeBooks){
        List<TheBooks> listOfFreeBooks = new ArrayList<>();
        for (TheBooks byName : showFreeBooks){
            if (byName.getCustomer() == null){
                return listOfFreeBooks;
            }
        }
        return listOfFreeBooks;
    }

}

