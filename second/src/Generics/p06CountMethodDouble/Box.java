package Generics.p06CountMethodDouble;


public class Box<T extends Comparable<T>> implements Comparable<T>{

    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    @Override
    public int compareTo(T o) {
        return this.value.compareTo(o);
    }
}
