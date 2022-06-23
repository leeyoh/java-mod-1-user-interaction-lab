import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
     * Ask the user to enter their age and 
     * display a greeting to them based on 
     * whether they are younger or older than 18. 
     * Take care to handle the case where they are exactly 18.
     * Display an extra special message to them if they are younger than 10.
     */
    public static void main(String[] args) {
        double age = 0;
        System.out.println("type a non number to quit");
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                System.out.print("Input Age: ");
                try{
                    age = scanner.nextDouble();
                    if(age > 18){
                        System.out.println("Older than 18");
                    }else if(age == 18){
                        System.out.println("Equal to 18");
                    }else if(age < 18 && age >= 10){
                        System.out.println("Younger than 18");
                    }else if(age < 10){
                        System.out.println("Younger than 10");
                    }
                } catch(InputMismatchException e){
                    System.out.println("Invalid Input " + e);
                    break;
                } 
            }
        }catch(Exception e){
            System.out.println("Issue with Scanner " + e);
        }finally{
            System.out.println("Exiting");
            System.exit(0);
        }
    }
}
