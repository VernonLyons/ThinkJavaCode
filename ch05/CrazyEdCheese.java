import java.util.Scanner;

public class CrazyEdCheese
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cheeseDiameter, cheeseYardage;

        System.out.println("=======================================================");
        System.out.println("Welcome to Crazy Ed's Wholesale String Cheese Emporium!");
        System.out.println("=======================================================");
        System.out.println(" ");
        System.out.println("Pricing: 1 in. = $2 per yardage, $2 shipping per yardage, & FREE SHIPPING for yardage over 50 yards!!!");
        System.out.println("Pricing: 2 in. = $4 per yardage, $2 shipping per yardage, & FREE SHIPPING for yardage over 75 yards!!!");
        System.out.println("Pricing: 3 in. = $6 per yardage, $4 shipping per yardage, & FREE SHIPPING for yardage over 25 yards!!!");
        System.out.println("All prices include a $5 handling fee.");
        System.out.println("To begin your order, please choose a diameter of string cheese; 1, 2, or 3: ");

        cheeseDiameter = scanner.nextInt();

        if ((cheeseDiameter < 1) || (cheeseDiameter > 3))
        {
            System.out.println("That order is just TOO CRAZY, even for me!!");
        }

        else
            {
                System.out.println("Please indicate the yardage of string cheese you would like to order: ");
            }

        cheeseYardage = scanner.nextInt();

        shippingCalculation(cheeseDiameter, cheeseYardage);
    }

    public static void shippingCalculation(int cheeseDiameter, int cheeseYardage)
    {
        int cheeseYardageTotal, cheeseShipping;

        switch(cheeseDiameter)
        {
            case 1 :
            {
                if (cheeseYardage <= 50)
                    {
                    cheeseYardageTotal = ((cheeseYardage * 2) + (cheeseYardage * 2));
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                    }

                else if (cheeseYardage > 50)
                    {
                    cheeseYardageTotal = (cheeseYardage * 2);
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                    }
            } break;

            case 2 :
            {
                if (cheeseYardage <= 75)
                {
                    cheeseYardageTotal = ((cheeseYardage * 4) + (cheeseYardage * 2));
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                }
                else if (cheeseYardage > 75)
                {
                    cheeseYardageTotal = (cheeseYardage * 4);
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                } break;
            }

            case 3 :
            {
                if (cheeseYardage <= 25)
                {
                    cheeseYardageTotal = ((cheeseYardage * 6) + (cheeseYardage * 4));
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                }
                else if (cheeseYardage > 25)
                {
                    cheeseYardageTotal = (cheeseYardage * 6);
                    cheeseShipping = cheeseYardageTotal + 5;
                    System.out.println("The total shipping for your order comes to: $" + cheeseShipping);
                }
            } break;
        }
    }
}
