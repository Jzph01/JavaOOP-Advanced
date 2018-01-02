package Interfaces.p03Ferrari;


public class Ferrari implements Car {


    private String driversName;

    public Ferrari(String driversName){
        this.driversName = driversName;
    }


    public String getDriversName(){
        return this.driversName;
    }

    @Override
    public String Breaks() {
        return "Breaks!";
    }

    @Override
    public String GassPedal() {
        return "Zadu6avam sA!";
    }
}
