package chapter10;

public class SuperSubClass {

    static void main() {

        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception.");
        }
//        catch(Exception е) {
// ОШИБКА: недостижимый код!
//            System.out.println("Этoт код вообще недостижим.");


        }

}
