package Generics.p07CustomList;


import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> customList;

    public CustomList(){
        this.customList = new ArrayList<T>();
    }

    public void add(T element){
        customList.add(element);
    }

    public T remove(int index){
        T item = customList.get(index);
        customList.remove(index);
        return item;
    }

    public boolean contains(T element){
        return customList.contains(element);
    }

    public void swap(int index, int index2){
        T firstElement = customList.get(index);
        T secondElement = customList.get(index2);
        customList.remove(index);
        customList.add(index, secondElement);
        customList.remove(index2);
        customList.add(index2, firstElement);
    }

    public int countsGreaterThan(T element){
        int count = 0;
        for (T elementInList :customList) {
            if(element.compareTo(elementInList) < 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T max = customList.get(0);
        for (T elementInList : customList) {
            if(max.compareTo(elementInList) < 0){
                max = elementInList;
            }
        }
        return max;
    }

    public T getMin(){
        T min = customList.get(0);
        for (T elementInList : customList) {
            if(min.compareTo(elementInList) > 0){
                min = elementInList;
            }
        }
        return min;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        customList.forEach(e -> sb.append(e + "\n"));

        sb.delete(sb.length()-1, sb.length());

        return sb.toString();
    }
}
