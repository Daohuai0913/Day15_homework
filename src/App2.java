package src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author huai
 * @date 2022/8/18
 */
public class App2 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("huai");
        student.setId("18");

        Student student2 = new Student();
        student2.setName("huai");
        student2.setId("18");

        Student student3 = new Student();
        student3.setName("huai");
        student3.setId("19");

        Student student4 = new Student();
        student3.setName("huai");
        student3.setId("20");

        Set<Student> set = new HashSet<>();
        set.add(student);
        set.add(student2);

        Iterator<Student> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==========================");


        while (iterator.hasNext()) {
            if ("18".equals(iterator.next().getId())) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }




//        extracted();
    }

    private static void extracted() {
        Person person1 = new Person();
        person1.setId("1");
        person1.setName("huai");
        Person person2 = new Person();
        person2.setId("1");
        person2.setName("huai");

        Person person3 = new Person("3");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        while (personSet.iterator().hasNext()) {
            System.out.println(personSet.iterator().next());
        }

        System.out.println("==========================");

        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            if ("5".equals(iterator.next().getId())) {
                iterator.remove();
            }
        }
    }


}
