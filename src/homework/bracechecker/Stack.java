package homework.bracechecker;

public class Stack {

    private char[] stck = new char[10];
    private int size;

    public Stack() {

        size = -1;

    }

    public void push(char item) {

        if (size == stck.length) {
            System.out.println("The stack is full!");
        } else {

            stck[++size] = item;
        }
    }

    public char pop() {

        if (size < 0) { //stack is empty!

            return 0;

        } else {
            return stck[size--];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
