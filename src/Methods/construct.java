package Methods;
class car{
    String colour;
    String model;
    String carType;
    car(String c,String m, String ct){
        colour=c;
        model=m;
        carType=ct;
    }
}
public class construct {
    public static void main(String [] args){
        car sports=new car("red","mustang","Sports");
        System.out.println(sports.colour);
        System.out.println(sports.carType);
        System.out.println(sports.model);

    }
}
