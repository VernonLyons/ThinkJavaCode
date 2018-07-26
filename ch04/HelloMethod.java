public class HelloMethod
{
    public static void main(String[] args)
    {
        String firstName = "Fred";
        String secondName = "Wilma";
        String lastName = "Flintstone";

        printHelloWorld(firstName, lastName);
        printHelloWorld(secondName, lastName);

        int firstNum = 5;
        int secondNum = 10;
        printOhNo(firstName, firstNum, secondNum, false);

        printNumberNoSign(5);
        printNumberNoSign(-5);
    }

    public static void printNumberNoSign (int number)
    {
        int positiveNumber = Math.abs(number);
        System.out.println("The number is " + positiveNumber);
    }

    public static void printHelloWorld(String fName, String lName)
    {
        System.out.println("Hello, World " + fName + " " + lName + ".");
    }

    public static void printOhNo(String cat, int firstNumber, int secondNumber, boolean isAPerson)
    {
        System.out.println("Oh no!");
        System.out.println("First Number is " + firstNumber);
        System.out.println("Second Number is " + secondNumber);
        System.out.println("Total is " + (firstNumber + secondNumber));
    }
}
