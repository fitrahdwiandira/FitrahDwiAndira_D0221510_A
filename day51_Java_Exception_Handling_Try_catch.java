

import java.util.InputMismatchException;
import java.util.Scanner;

public class day51_Java_Exception_Handling_Try_catch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
try {
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.out.println(x/y);
    
}
catch (InputMismatchException e) {
    System.out.println(e.getClass().getName());
}
catch(ArithmeticException e){
    System.out.println(e.getClass().getName()+": / by zero");
}
    }
}
