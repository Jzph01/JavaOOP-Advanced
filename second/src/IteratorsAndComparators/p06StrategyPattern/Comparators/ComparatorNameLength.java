package IteratorsAndComparators.p06StrategyPattern.Comparators;


import IteratorsAndComparators.p06StrategyPattern.Person;

import java.util.Comparator;

public class ComparatorNameLength implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        if(o1.getName().length() == o2.getName().length()){

            if(o1.getName().substring(0, 1).toLowerCase().compareTo(o2.getName().substring(0, 1).toLowerCase()) == 0){
                return 0;
            }else if(o1.getName().substring(0, 1).toLowerCase().compareTo(o2.getName().substring(0, 1).toLowerCase()) > 0){
                return 1;
            }else {
                return -1;
            }

        }else if(o1.getName().length() > o2.getName().length()){
            return 1;
        }else{
            return -1;
        }

    }

}
