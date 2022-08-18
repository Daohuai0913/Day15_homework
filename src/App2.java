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
