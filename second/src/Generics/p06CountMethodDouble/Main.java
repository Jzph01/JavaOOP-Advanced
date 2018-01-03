package Generics.p06CountMethodDouble;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        List<Box> boxList = new ArrayList<>();

        for (int i = 0; i < count ; i++) {

            Double num = Double.parseDouble(reader.readLine());
            Box numToBox = new Box(num);
            boxList.add(numToBox);

        }

        double numberForCompare = Double.parseDouble(reader.readLine());

        Box numberForCompareToBox = new Box(numberForCompare);

        int result = 0;

        for (int i = 0; i < boxList.size(); i++) {
            if(  numberForCompareToBox.compareTo(boxList.get(i).getValue()) < 0){
                result++;
            }
        }

        System.out.println(result);

    }

}
