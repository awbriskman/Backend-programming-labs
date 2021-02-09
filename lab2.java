public class lab2 {
    public static void main (String[] args){
        int age = 14;
        System.out.println(age > 16);
        age = 18;
        System.out.println(age > 16);
         
        if (age > 16){
            System.out.println("you can drive");
        } else{
            System.out.println("you cant drive");
        }

        int thirstLevel = 4;
        double costOfMilk = 3.14;
        if (thirstLevel > 6 || costOfMilk < 2.5){
            System.out.println("Milk Please");
        }else{
            System.out.println("No Thanks");
        }

        int numberOfCookies = 13;
        int numberOfChildren = 4;
        int remainingCookies = numberOfCookies % numberOfChildren;
        if (remainingCookies == 0){
            System.out.println("Sad Face");
        } else if(remainingCookies <= 2){
            System.out.println("Yes!");
        } else if (remainingCookies <= 5){
            System.out.println("Woohoo");
        } else {
            System.out.println("Jackpot");
        }

        String loyaltyMemberStatus = "SILVER";
        double loyaltyMemberDiscount = 0.0;
        switch(loyaltyMemberStatus){
        case "Silver": 
            loyaltyMemberDiscount = 0.0; 
            break;
        case "GOLD":
            loyaltyMemberDiscount = 0.15;
            break;
        case "PLATINUM":
            loyaltyMemberDiscount = 0.25;
            break;
        default:
            break;
        }

        int billTotal = 625;
        int adjustedBill = billTotal - (int)(billTotal * loyaltyMemberDiscount); 
        if (adjustedBill > 500) {
            if (loyaltyMemberStatus.equals("GOLD")){
                loyaltyMemberStatus = "PLATINUM";
            } 
            if (loyaltyMemberStatus.equals("SILVER")){
                loyaltyMemberStatus = "GOLD";
            }
        }
        
        String username = "1337H4X0R69420";
        String password = "Swordfish";
        if (username.equals("Tommy123") && password.equals("12345")){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("access denied");
        }

        for (int i = 0; i < 10; i= i + 1){
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i= i - 1){
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i= i + 1){
            System.out.print(i);
            if (i % 2 == 0){
                System.out.println(" Even");
            } else {
                System.out.println(" Odd");
            }
        }

        for (int i = 100; i >= 0; i= i - 1){
            System.out.println(i + " remainder 3: " + i%3);
        }
    }
}
