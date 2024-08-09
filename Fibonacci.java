import java.util.Scanner;

public class Fibonacci{
// Write your code here
public void scan(){
    int a, b, c, d;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
     a = scan.nextInt();
     System.out.println("Enter a suqunce number: ");
     b = scan.nextInt();
     System.out.println("Enter the count: ");
     d = scan.nextInt();
     System.out.println("Number a: "+a);
     System.out.println("Sequnt Number b: "+b);
     for(int i=0; i<d; i++){
        c = a+b;
        System.out.println("c: "+c);
        a=b;
        b=c;
     }
}
public static void main(String[] args) {
    Fibonacci f= new Fibonacci();
    f.scan();
}
}
