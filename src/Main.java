import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {




    public static void main(String[] args) {

        String str = new String("aa");
        Address address = new Address("11as");
        Student student2 = null;

        Student student1 = new Student("aa",100,address);
        try {
             student2 = (Student)student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student1 == student2);
        System.out.println(student1.address == student2.address);

    }


}
