
// student_firstname_surname :Arjun Thapa STUDENT_ID:21524045 Programming Coursework
// Task 3
import java.util.Scanner;
import static java.lang.System.exit;

public class Store {
    int totalCost = 0;
    public static void main(String[] args) {
        Store s = new Store();
        s.welcomeMessage();
    }
    void welcomeMessage(){
        System.out.println("Welcome To The Online Store");
        displayProduct();
    }
    void displayProduct(){
        System.out.println("1. Soap for $1");
        System.out.println("2. Brush for $2");
        System.out.println("3. Shocks for $5");
        System.out.println("4. Cap for $5");
        chooseProduct();
    }
    void chooseProduct(){
        Scanner s =new Scanner(System.in);
        String item = s.nextLine();

        switch (item) {
            case "1":
                calcSoap();
                System.out.println("Continue Shopping");
                displayProduct();
                break;
            case "2":
                calcBrush();
                System.out.println("Continue Shopping");
                displayProduct();
                break;
            case "3":
                calcShocks();
                System.out.println("Continue Shopping");
                displayProduct();
                break;
            case "4":
                calcCap();
                System.out.println("Continue Shopping");
                displayProduct();
                break;
            case "q":
                calculateTotal();
                exit(0);
        }
    }
    void calcSoap(){
        Scanner s = new Scanner(System.in);
        System.out.println("You've wished to buy Soap");
        System.out.print("Please Enter the Quantity:");
        int soapCount = s.nextInt();
        int soapCost = 1*soapCount;
        totalCost = totalCost + soapCost;
    }
    void calcBrush(){
        Scanner s = new Scanner(System.in);
        System.out.println("You've wished to buy Brush");
        System.out.print("Please Enter the Quantity:");
        int brushCount = s.nextInt();
        int brushCost = 2*brushCount;
        totalCost = totalCost + brushCost;
    }
    void calcShocks(){
        Scanner s = new Scanner(System.in);
        System.out.println("You've wished to buy Shocks");
        System.out.print("Please Enter the Quantity:");
        int shocksCount = s.nextInt();
        int shocksCost = 5*shocksCount;
        totalCost = totalCost + shocksCost;
    }
    void calcCap(){
        Scanner s = new Scanner(System.in);
        System.out.println("You've wished to buy Cap");
        System.out.print("Please Enter the Quantity:");
        int capCount = s.nextInt();
        int capCost = 5*capCount;
        totalCost = totalCost + capCost;
    }
    void calculateTotal() {
        System.out.println("Total amount for product you've selected is:"+ totalCost);
    }
}
