package Interfaces.p04Telephony;


import java.util.List;

public class Smartphone implements Browse, Call{

    
    @Override
    public void call(String number) {


        if(!number.matches("[0-9]*")){
            System.out.println("Invalid number!");
        }else {
            System.out.println("Calling..." + number );
        }

    }

    @Override
    public void browse(String url) {

        if(!url.matches("[^0-9]*")){
            System.out.println("Invalid URL!" );
        }else {
            System.out.println("Browsing:  " + url );
        }
    }
}
