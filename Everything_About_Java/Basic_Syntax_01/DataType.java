
// Let's see some data type in java and example of useges

public class DataType {
    public static void main(String[] args) {
        // int num1 = 5;           // int to store whole intiger value in variable
        // float num2 = 10.13f;    // float to store fractional values "add "f" at the last"
        // double num3 = 20.23d;   // double to store big fractional values "end with d"
        // var num4 = 40;          // Lastlly the "var" data type will catch the veriable status automatically


        // // lets perform some basic Arithmetic and see what happens
        // var additon = (num1 + num2);             
        // var subtraction = (num2 - num3);
        // var multiplication = (num3 * num4);
        // var division = (num4 / num1);
        // var modulo = (num3 % num1);


        // // Let's see the result 
        // System.out.println("the additionm of " + num1 + " and " + num2 + " is " + additon); 
        // System.out.println("Subtraction " + subtraction);
        // System.out.println("Multiplication " + multiplication);
        // System.out.println("Division " +  division);
        // System.out.println("Modulo " + modulo );



        // // We have assignment in java and we can perform increment and decrement like below
        // int fruits = 0;
        // var fruitscount = 10;
        // while (fruits < 10) {
        //     fruits += 1;            // This is an example of asigning increment where fruits increases by 1
        //     fruitscount--;          // Here -- means we are decreasing fruitscount by 1
        //     System.out.println("Fruits in now " + fruits); }


        // // In java we have Boolean Data types
        // // Lets see an example of basic boolean data type useges
        // int x = 10;
        // float y = 20f;
        // System.out.println(x > y); // Will print Bool value "false"
        // System.out.println(x < y); // WIll print bool value "Ture"


        // In we can use Logical "and && , or ||, not !"
        // lets see an Example 

        boolean a = true;
        boolean b = false;
        var isTrue = a && b == true;
        var isFalse = a || b == false;
        var answer = a || !b == true;
        
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(answer);


        
 }
    
}
