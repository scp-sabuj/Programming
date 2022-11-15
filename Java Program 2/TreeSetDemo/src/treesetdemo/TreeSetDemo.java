package treesetdemo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("G");
        ts.add("H");
        System.out.println(ts);
    }  
}
