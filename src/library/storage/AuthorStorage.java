package library.storage;

import library.model.Author;

import java.util.LinkedList;
import java.util.List;

public class AuthorStorage {

    private List<Author> authors = new LinkedList<>();

    public void add(Author author) {
        authors.add(author);
    }


    public Author getAuthorByPhoneNumber(String phoneNumber) {
        for (Author author : authors) {
            if (phoneNumber.equals(author.getPhoneNumber())) {
                return author;
            }
        }
        return null;
    }

    public void print() {
        for (Author author : authors) {
            System.out.println(author.toString());
        }
    }
}
