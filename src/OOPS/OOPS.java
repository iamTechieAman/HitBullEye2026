package OOPS;

class SUPPLY{
    int code;
    String FoodName;
    String Sticker;
    String Foodtype;
    void getType(String sticker){
        if(sticker == "Green"){
            Foodtype = "Vegetarian";
        }
        else if(sticker == "Yellow"){
            Foodtype = "Contains Eggs";
        }
        else if(sticker == "Red"){
            Foodtype = "Non-Vegetarian";
        }
    }
    void FoodIn(int code,String FoodName,String Sticker){
        this.code = code;
        this.FoodName = FoodName;
        this.Sticker = Sticker;
        getType(Sticker);
    }
    void FoodOut(){
        System.out.println(code);
        System.out.println(FoodName);
        System.out.println(Sticker);
        System.out.println(Foodtype);
    }
}
public class OOPS {
    public static void main(String[] args) {
        SUPPLY s1 = new SUPPLY();
        s1.FoodIn(1,"Paratha","Green");
        s1.FoodOut();
    }
}