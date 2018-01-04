package IteratorsAndComparators.p05ComparingObjects;


public class Person implements Comparable<Person>{

    private String name;
    private String town;
    private int age;

    public Person(String name, int age, String town){
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        if(this.town.equals(o.getTown()) && this.age == o.getAge() && this.name.equals(o.getName())){
            return 0;
        }else {
            return -1;
        }

    }
}
