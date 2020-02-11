package february10a;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        System.out.println("Ask a starting number1 ? :  ");
        int start=myscan.nextInt();
        System.out.println( "Ask a ending number2 ? :  ");
       int end=myscan.nextInt();
       if(start<end){

        for (int i =start; i<=end ; i=i+5)
            System.out.println(i);
        }
    else{
        for (int i=start ; i>=end ; i=i-5){
            System.out.println(i);
        }

    }
    }

}
