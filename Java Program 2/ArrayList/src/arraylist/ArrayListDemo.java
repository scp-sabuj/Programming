package arraylist;

import java.util.*;

public class ArrayListDemo {

    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(3);
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());
        System.out.println("Contents of al: " + al);
        al.remove(2);
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}
