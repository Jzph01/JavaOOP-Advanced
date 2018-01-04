package IteratorsAndComparators.p06StrategyPattern;


import IteratorsAndComparators.p06StrategyPattern.TreeSets.TreeSetAge;
import IteratorsAndComparators.p06StrategyPattern.TreeSets.TreeSetName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countLine = Integer.parseInt(reader.readLine());

        TreeSetAge treeSetAge = new TreeSetAge();
        TreeSetName treeSetName = new TreeSetName();

        for (int i = 0; i < countLine; i++) {

            String[] nameAndAge = reader.readLine().split("\\s+");
            treeSetAge.addPerson(new Person(nameAndAge[0], Integer.parseInt(nameAndAge[1])));
            treeSetName.addPerson(new Person(nameAndAge[0], Integer.parseInt(nameAndAge[1])));
        }

        treeSetName.print();
        treeSetAge.print();

    }

}
