public class lab1{
    
    public static void main(String[] args){
        int remainingSeats = 25;
        double groceryTotalCost = 30.42;
        char middleInitial = 'W';
        boolean isHotOutside = false;
        String firstName = "Harold";
        String streetAddress = "12 byron way";


        System.out.println("There are " + remainingSeats + " seats remaining");
        System.out.println("Your current grocery total is $" + groceryTotalCost);
        System.out.println("The middle initial is " + middleInitial);
        System.out.println("Is it hot outside?: " + isHotOutside);
        System.out.println("The customers first name is " + firstName);
        System.out.println("They live at " + streetAddress);

        remainingSeats -= 2;
        System.out.println(remainingSeats);
        groceryTotalCost = groceryTotalCost + 2.15;
        System.out.println(groceryTotalCost);
        middleInitial = 'L';
        System.out.println(middleInitial);
        isHotOutside = !isHotOutside;
        System.out.println(isHotOutside);
        String fullName = firstName + " " + middleInitial + " Green";
        System.out.println("The customer " + fullName + " lives at " + streetAddress);

    }

}