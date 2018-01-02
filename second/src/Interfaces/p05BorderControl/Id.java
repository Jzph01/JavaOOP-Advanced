package Interfaces.p05BorderControl;


public abstract class Id {

   private String id;

    void setId(String id){
        this.id = id;
    }

    void checkId(String lastDigits){
        if(this.id.endsWith(lastDigits)){
            System.out.println(id);
        }
    }

}
