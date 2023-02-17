package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Person father;
    private Person mother;
    private Person son;
    private Person daughter;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public List<Person> getTreeParents() {
        List<Person> parents = new ArrayList<>();

//        boolean fl = true;

        if (father != null) {
            parents.add(father);
        }

        if (mother != null) {
            parents.add(mother);
        }

        if (son != null) {
            parents.add(son);
        }

        if (daughter != null) {
            parents.add(daughter);
        }

        for (int i = 0; i < parents.size(); i++) {
            Person current = parents.get(i);
            Person parentFather = current.getFather();
            Person parentMother = current.getMother();
            Person parentSon = current.getSon();
            Person parentDaughter = current.getDaughter();

            if (parentFather != null) {
                parents.add(parentFather);
            }
            if (parentMother != null) {
                parents.add(parentMother);
            }
            if (parentSon != null) {
                parents.add(parentSon);
            }
            if (parentDaughter != null) {
                parents.add(parentDaughter);
            }
        }
        return parents;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getSon() {
        return son;
    }

    public Person getDaughter() {
        return daughter;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setSon(Person son) {
        this.son = son;
    }

    public void setDaughter(Person daughter) {
        this.daughter = daughter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
