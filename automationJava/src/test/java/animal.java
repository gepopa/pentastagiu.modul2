public class animal {
    private String color;
    public static String culoare;

    public animal(String color){
        this.color = color;
    }

    public animal(animal animal){

        color = animal.color;
    }

    public animal(){

    }




    public void setTheColor (String color){

        this.color = color;

    }

    public String  getTheColor (){

        return color;
    }
    public void method(){

    }
}
