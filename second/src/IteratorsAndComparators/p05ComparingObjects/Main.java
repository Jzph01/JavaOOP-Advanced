package IteratorsAndComparators.p05ComparingObjects;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new LinkedList<>();

        String line = reader.readLine();

        while (!line.equals("END")){

            String[] tokens = line.split("\\s+");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            people.add(person);

            line = reader.readLine();

        }

        int equalPeople = 0;
        int notEqualPeople = 0;
        int totalPeople = 0;

        Person comparedPerson = people.get(Integer.parseInt(reader.readLine()) - 1);

        for (Person person: people) {
            if(comparedPerson.compareTo(person) == 0){
                equalPeople++;
            }else{
                notEqualPeople++;
            }
        }

        if(equalPeople > 1){
            System.out.println(equalPeople + " " + notEqualPeople + " " + people.size());
        }else {
                System.out.println("No matches");
        }


    }

}
