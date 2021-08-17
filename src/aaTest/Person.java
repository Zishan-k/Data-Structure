package aaTest;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    private int id;
    private String name;

    Person() {
    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person- " + " Name: " + this.name + " ID: " + this.id;
    }


    public static void main(String[] args) {
        Person p1 = new Person(1, "zzzzz");
        Person p2 = new Person(1, "aaaa");
        Person p3 = new Person(1, "bbbb");

        ArrayList<Person> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);

        System.out.println(al + "\n");
        Collections.sort(al);
        System.out.println(al);
    }
}
