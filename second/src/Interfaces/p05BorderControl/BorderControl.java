package Interfaces.p05BorderControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BorderControl {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Id> citizensAndRobots = new ArrayList<>();

          String[] tokens = reader.readLine().split(" ");

        while(!tokens[0].equals("End")){

            if(tokens.length == 3){
                Citizens citizens = new Citizens(tokens[0], tokens[1], tokens[2]);
                citizensAndRobots.add(citizens);
            }else{
                Robots robots = new Robots(tokens[0], tokens[1]);
                citizensAndRobots.add(robots);
            }

            tokens = reader.readLine().split(" ");

        }

        String lastDigits = reader.readLine();

        citizensAndRobots.stream().forEach(c -> c.checkId(lastDigits));

    }


}
