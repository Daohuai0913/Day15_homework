package src;

import java.util.*;

/**
 * @author huai
 * @date 2022/8/18
 */
public class SetAndList {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("2");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        System.out.println("------------------");
        List list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        ListIterator iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


    }
}
