package IteratorsAndComparators.p06StrategyPattern.TreeSets;


import IteratorsAndComparators.p06StrategyPattern.Comparators.ComparatorNameLength;
import IteratorsAndComparators.p06StrategyPattern.Person;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TreeSetName {

    List<Person> people = new LinkedList<>();

    public void addPerson(Person p){
        people.add(p);
        Collections.sort(people,new ComparatorNameLength());
    }


    public void print() {

        people.forEach(e -> System.out.println(e.getName() + " " + e.getAge() ));

    }
}
