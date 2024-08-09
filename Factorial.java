import java.util.Scanner;

public class Factorial{
// Write Your Code Here
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int temp=1;
        int a = scan.nextInt();
        for(int i=1; i<=a; i++){
            temp= temp*i;
        }
        System.out.println("Fectoial is : "+temp);
    }
}
