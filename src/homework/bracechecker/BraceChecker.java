package homework.bracechecker;

public class BraceChecker {

    private String text;
    Stack stack = new Stack();

    public BraceChecker(String t) {

        text = t;

    }

    public void check() {

        Boolean endOfFor = false;

        for (int i = 0; i < text.length(); i++) {

            if (!endOfFor) {
                char c = text.charAt(i);

                switch (c) {

                    case '{':
                    case '[':
                    case '(':
                        stack.push(c);
                        break;

                    case '}':
                        char openedAtLast1 = stack.pop();
                        if (openedAtLast1 == 0) {
                            text = TextErr('{', c, i, stack.isEmpty());

                            endOfFor = true;
                            break;
                        } else if (openedAtLast1 != '{' && openedAtLast1 != 0) {

                            text = TextErr(openedAtLast1, '}', i, stack.isEmpty());
                            endOfFor = true;
                            break;
                        }
                        break;

                    case ']':
                        char openedAtLast2 = stack.pop();
                        if (openedAtLast2 == 0) {
                            text = TextErr('[', c, i, stack.isEmpty());
                            endOfFor = true;
                            break;
                        } else if (openedAtLast2 != '[' && openedAtLast2 != 0) {

                            text = TextErr(openedAtLast2, ']', i, stack.isEmpty());
                            endOfFor = true;
                            break;
                        }
                        break;

                    case ')':
                        char openedAtLast3 = stack.pop();
                        if (openedAtLast3 == 0) {
                            text = TextErr('(', c, i, stack.isEmpty());
                            endOfFor = true;
                            break;
                        } else if (openedAtLast3 != '(' && openedAtLast3 != 0) {
                            endOfFor = true;
                            text = TextErr(openedAtLast3, ')', i, stack.isEmpty());
                            break;
                        }
                        break;
                }

            }

        }

        boolean err = false;
        while (stack.pop() != 0) {
            char notClosed = stack.pop();
            err = true;
            System.out.println("Error: opened " + notClosed + " but not closed");
        }
        if (!err) {
            System.out.println(text);
        }

    }

    private String TextErr(char lastOpened, char c, int index, Boolean stackIsEmpty) {

        if (stackIsEmpty) {

            return "closed " + c + " but not opened " + lastOpened + " at " + index;
        } else {
            return "opened " + lastOpened + " but closed " + c + " at " + index;
        }
    }

}

