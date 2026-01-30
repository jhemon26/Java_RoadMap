
// Always remember to close every statement in java with ";"
// We use "//" for comment 
// Lastly remember that java is case sensetive "system and System" is not same

public class BasicSyntax {
    public static void main(String[] args){

        // let's see some printing method in java 
        System.out.println("This will print statement in one line "); 
        int age = 20;
        System.out.printf("This will print with formatting like, I am %d years old%n", age);

        // let's see the error handling printing method
        int num1 = 10;  // ** Try changing the value to 30/40 and see what happens.
        double num2 = 20; // declearing our second veriable num2 for future use

        if (num1 < num2)
            {
                System.err.println("Division to a smaller number with greater number is not allowed");
            } 
            else 
            {
                System.out.println( num2 / num1);
            }
 
    }  
}

