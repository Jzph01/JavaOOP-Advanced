package Interfaces.p04Telephony;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        List<String> numbers = Arrays.asList(reader.readLine().split("\\s+"));
        List<String>  sites = Arrays.asList(reader.readLine().split("\\s+"));

        Call call = new Smartphone();

        Browse browse = new Smartphone();

        for (String number : numbers) {

            call.call(number);

        }

        for (String site : sites) {

            browse.browse(site);

        }


    }

}





