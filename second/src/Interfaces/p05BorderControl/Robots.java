package Interfaces.p05BorderControl;


public class Robots extends Id{

    private String model;

    public Robots(String model, String id){
        this.model = model;
        super.setId(id);
    }
}
