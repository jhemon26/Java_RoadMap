//--------------------------------------------------------------------------------------//
// Let's see some data type in java and example of useges
// Please Comment out the section you are not using while runnig for better visibility
//-------------------------------------------------------------------------------------//



public class DataTypes_Operations_Assignment {
    public static void main(String[] args) {

        // Very important information !!!! 
        // There are two type of "Data Type" in java "Primitive and Non-Primitive" 

        // Primitive data types are data that hold values directly in the memory
        // Starts with lowercase "int/float/double/char/ etc." 
        // Example,
        int primitiveType1 = 10;
        float primitiveType2 = 10.f; // float primitive data type used to define fraction decimal.


        // Non-Primitive data types are data that can be null.
        // Can be used as a method as well.
        // Always start with an Uppercase "String, Arrays, Object, Class, etc."
        // Example,
        String name = "Supper_Mario\n";   // Here String is a non-primitive data type
        String nameUnknown = null;       // Check that, we can store null value

        System.out.println(name);
        System.out.println(nameUnknown);



        //------------------------------//
        // Arithmetic operation Section //
        //------------------------------//



        int num1 = 5;           // int to store whole intiger value in variable
        float num2 = 10.13f;    // float to store fractional values "add "f" at the last"
        double num3 = 20.23d;   // double to store big fractional values "end with d"
        var num4 = 40;          // Lastlly the "var" data type will catch the veriable status automatically


        // lets perform some basic Arithmetic operation and see what happens
        var additon = (num1 + num2);             
        var subtraction = (num2 - num3);
        var multiplication = ((num3 + num4) * num1 );
        var division = (num4 / num1);
        var modulo = (num3 % num1);


        // Let's see the result 
        System.out.println("the additionm of " + num1 + " and " + num2 + " is " + additon); 
        System.out.println("Subtraction " + subtraction);
        System.out.println("Multiplication " + multiplication);
        System.out.println("Division " +  division);
        System.out.println("Modulo " + modulo );






        //------------------------------//
        // Assignment Section //
        //------------------------------//

        // We have assignment in java like, "=, |=, ^=, >>=, &=, etc."
        // Example, we can perform increment and decrement like below
        int fruits = 0;
        var fruitscount = 10;
        while (fruits < 10) {
            fruits += 1;            // This is an example of asigning increment where fruits increases by 1
            fruitscount--;          // Here -- means we are decreasing fruitscount by 1
            System.out.println("Fruits in now " + fruits); }






        //------------------------------//
        // Comparision Section //
        //------------------------------//

        // In java we have Boolean Data types
        // Lets see an example of basic boolean data type useges
        int x = 10;
        float y = 20f;
        System.out.println(x > y); // Will print Bool value "false"
        System.out.println(x < y); // WIll print bool value "Ture"




        //------------------------------//
        // Logical operation Section //
        //------------------------------//

        // In java we can use Logical "and && , or ||, not !"
        // lets see an Example 
        boolean a = true;
        boolean b = false;
        var isTrue = a && b == true;       // as a and b both not true so it will print false
        var isFalse = a || b == false;     // as a or b any of them is false so will print true
        var answer = a || !b == true;      // as a or not b either of them is true so will print true
        var num5 = 5;
        
        
        System.out.println("This statement is " +!(num5 > 6 && num5 < 10)); //returns false as both condition is not true but logical "!" will make it true
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(answer);






        
 }
    
}
