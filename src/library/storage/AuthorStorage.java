package library.storage;

import library.model.Author;

public class AuthorStorage {

    private int size = 0;
    private Author[] authors = new Author[10];

    public void add(Author author) {

        boolean authorFound = false;

        if (size == authors.length) {

            extend();
        }

    }

    private void extend() {

        Author[] tmp = new Author[size + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;

    }

    public Author getAuthorByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (phoneNumber.equals(authors[i].getPhoneNumber())) {
                return authors[i];
            }
        }
        return null;
    }

    public void print() {

        for (int i = 0; i < size; i++) {

            System.out.println(authors[i].toString());

        }

    }

}
