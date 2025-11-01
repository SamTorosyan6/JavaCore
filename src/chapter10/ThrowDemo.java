package chapter10;

public class ThrowDemo {

    static void demoProc() {

        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле " + "метода demoproc () . ");
            throw e;
        }

    }

    static void main() {

        try{
            demoProc();
        }catch(NullPointerException e){
            System.out.println("Пoвтopный перехват: " + e);
        }

    }

}
