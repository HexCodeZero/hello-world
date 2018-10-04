import java.util.Scanner;

public class cashRegister {
    public static int fact(int x){
        if(x > 0)
        {
            return x * fact(x-1);
        }
        else
        {
            return 1;
        }
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items are you checking out");
        
        int amount = scan.nextInt();
        int totalPrice = 0;
        
        for(int i=1;i<amount+1;i++)
        {
            System.out.println("Enter price of item " + i);
            totalPrice += scan.nextInt();
        }
        
        System.out.println("Amount due: " + totalPrice);
    }
}
