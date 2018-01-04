package IteratorsAndComparators.p06StrategyPattern.Comparators;


import IteratorsAndComparators.p06StrategyPattern.Person;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {

        if(o1.getAge() == o2.getAge()){
            return 0;
        }else if(o1.getAge() > o2.getAge()){
            return 1;
        } else {
            return -1;
        }

    }
}
