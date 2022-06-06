import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        // a method that sums together every consecutive integer from 1 to the admin input (parameter - Ninja Bonus) and returns the sum.
        int sum = 0;
        for(int i = 0; i < (numWeeks+1); i++){
            sum+=i;
        }
        return sum;
    } 

    // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
    public double getOrderTotal(double[] prices) {
        double sum = 0.0;
        for(int i = 0; i < prices.length; i++){
            sum+=prices[i];
        }return sum;
    }

    // Given an ArrayList of menu items (strings), print out each index and menu item. 
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double total = 0.0;
        for(int i=0; i<maxQuantity; i++){
            total+=price;
            System.out.println((i+1) + " - $" + total);
        }
    }








}