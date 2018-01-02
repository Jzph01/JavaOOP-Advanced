package Interfaces.p05BorderControl;


public class Citizens extends Id{

    private String name;
    private String age;

    public Citizens(String name, String age, String id){
        this.name = name;
        this.age = age;
        super.setId(id);
    }


}
