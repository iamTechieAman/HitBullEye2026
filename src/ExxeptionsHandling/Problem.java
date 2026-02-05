package ExxeptionsHandling;

public class Problem {
    public static void main(String[]args){
        try{
            //int[]arr={1,2,3};
            //System.out.println();
            int result=10/0;
        }catch (ArithmeticException e){
            System.out.println("Error Detection by zero");
        }catch(Exception e){
            System.out.println("Outer catch: General exception");
    }
    }
}

