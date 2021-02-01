public class App {
    public static void main(String[] args) {
        int itemPrice = 12;
        int moneyInWallet = 65;
        int numFriends = 14;
        int age = 25;
        String firstName = "Alex";
        String lastName = "Briskman";
        char middleInitial = 'W';


        int remainingWallet = moneyInWallet - itemPrice;
        double friendsPerYear = (double) numFriends / age;
        String fullName = firstName + " " + middleInitial + " " + lastName;


        System.out.println("The item costs $" + itemPrice );
        System.out.println("I have $" + moneyInWallet + " in my wallet");
        System.out.println("After buying the item, I have $" + remainingWallet + " left");
        System.out.println("I have " + numFriends + " friends");
        System.out.println("I am " + age + " years old");
        System.out.println("I have made " + friendsPerYear + " friends per year");
        System.out.println("My first name is: " + firstName);
        System.out.println("My last name is: " + lastName);
        System.out.println("My middle initial is: " + middleInitial);
        System.out.println("My full name is: " + fullName);
    }
}