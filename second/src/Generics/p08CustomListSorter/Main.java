package Generics.p08CustomListSorter;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> customList = new CustomList<>();

        String[] command = reader.readLine().split("\\s+");

        while(!command[0].equals("END")){

            if(command[0].equals("Add")){

                customList.add(command[1]);

            }else if(command[0].equals("Remove")){

                customList.remove(Integer.parseInt(command[1]));

            }else if(command[0].equals("Contains")){

                System.out.println( customList.contains(command[1]));

            }else if(command[0].equals("Swap")){

                customList.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));

            }else if(command[0].equals("Greater")){

                System.out.println( customList.countsGreaterThan(command[1]));

            }else if(command[0].equals("Max")){

                System.out.println(customList.getMax());

            }else if(command[0].equals("Min")){

                System.out.println(customList.getMin());

            }else if(command[0].equals("Print")){

                System.out.println(customList.toString());

            }else if(command[0].equals("Sort")){

                Sorter.sort(customList);

            }

            command = reader.readLine().split("\\s+");

        }


    }

}
