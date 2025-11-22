package chapter14.map;

import java.util.*;

public class MapExample {

    static void main() {

        Map<String,Student> studentMap = new HashMap<>();

        Student studentPoxos = new Student("Aram","Poxosyan","poxos@mail.ru",33);
        Student studentPetros = new Student("Petros","Poxosyan","petros@mail.ru",44);
        Student studentMartiros = new Student("Zaven","Poxosyan","martiros@mail.ru",22);

//        studentMap.put("poxos@mail.ru",studentPoxos);
//        studentMap.put("petros@mail.ru",studentPetros);
//
//        System.out.println(studentMap.get("poxos@mail.ru"));

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentPoxos);
        studentList.add(studentPetros);
        studentList.add(studentMartiros);

        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList,new StudentNameComporator());

//        studentList.sort(new StudentAgeComporator());

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
