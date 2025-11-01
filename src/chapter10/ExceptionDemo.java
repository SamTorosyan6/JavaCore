package chapter10;

public class ExceptionDemo {

    static void main() {

        try{
            compute(1);
            compute(2);
        }catch (MyException e){
            System.out.println("Пepexвaчeнo исключение: " + e);
        }

    }

    static void compute(int a) throws MyException {

        System.out.println("Bызвaн метод compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальное завершение");

    }

}
