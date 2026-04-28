import java.util.Scanner;
public class Factor11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= n ; i ++){
            if( n % i == 0){
             
                System.out.println( "Factor " + i);
               count++;
            }

             
        }
        System.out.println( " total factors " + count);
  
    System.out.println("Enter 0 program closed , Enter any other number to program continue ");

    int choice = sc.nextInt();
    if(choice == 0){
        break;
          }
    }
    }
}