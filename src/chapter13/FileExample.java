package chapter13;

import java.io.File;
import java.io.IOException;

public class FileExample {

    static void main() {

        File file = new File("C:\\Users\\Sam\\IdeaProjects\\JavaCore\\src\\chapter13");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (File s : list) {
                System.out.println(s.getName() + "isFile = " + s.isFile());
            }
        }

//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            }catch (IOException e){
//                System.out.println("can't create a file");
//            }
//        }
    }
}
