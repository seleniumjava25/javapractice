package day1;

/*public class Testing {

    public static void main(String[] args) {
        System.out.println("Hello, World!");  // ✅ Added missing closing quote and parenthesis

        int number = 10;  // ✅ Added missing semicolon
        if (number == 10) {  // ✅ Changed '=' to '==' for comparison
            System.out.println("Number is ten");
        } else {
            System.out.println("Number is not ten");  // ✅ Added missing closing parenthesis
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);  // ✅ Added missing closing parenthesis
        }

        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {  // ✅ Added missing closing parenthesis for loop
            System.out.println(name);
        }
    }}*/


public class LargestOfTwoNumbers {
	
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Logical error: Using ">" instead of ">="
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2); 
        }
    }
}

