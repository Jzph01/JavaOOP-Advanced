package IteratorsAndComparators.p07EqualityLogic;


public class Person implements Comparable<Person>{

    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * this.age.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }

        Person other = (Person) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
    }

    @Override
    public int compareTo(Person o) {

        int result = this.getName().compareTo(o.getName());
        if(result == 0){
            result = Integer.compare(this.getAge(),o.getAge());
        }

        return result;

    }
}
