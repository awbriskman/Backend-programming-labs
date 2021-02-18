public class lab3 {
    public static void main (String[] args){
        int[] numbers = {1, 5, 2, 8, 13, 6};
        System.out.println(numbers[0]);
        System.out.println(numbers.length-1);
        //System.out.println(numbers[6]);
        //System.out.println(numbers[-1]);
        for (int i = 0; i < numbers.length; i ++){
            System.out.print(numbers[i]+" ");
        }
        for (int number : numbers){
            System.out.println(number + " ");
        }
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        int average = sum / numbers.length;
        for (int number : numbers){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
        String[] names = new String[4];
        names[0] = "Sam";
        names[1] = "Sally";
        names[2] = "Thomas";
        names[3] = "Robert";
        
        int letterSum = 0;
        for (String name : names){
            letterSum += name.length();
        }

        System.out.println(greeting1("Alex"));
        greeting2("Alex");
    }


    public static String greeting1(String name){
        return "Hello, " + name + "!";
    }

    public static void greeting2(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static boolean stringLength(String word, int len){
        return word.length() > len;
    }

    public static int minimum(int[] numArray){
        int min = numArray[0];
        for (int number : numArray){
            if (number < min){
                min = number;
            }
        }
        return min;
    }

    public static double averageDoubleArray(double[] doubleArray){
        double total = 0.0;
        int elements = 0;
        for (double number : doubleArray){
            total += number;
            elements++;
        }
        return total / (double) elements;
    }

    public static int[] stringArrayLength(String[] stringArray){
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            intArray[i] = stringArray[i].length();
        }
        return intArray;
    }

    public static boolean evenOddStrings(String[] stringArray){
        int evenSum = 0;
        int oddSum = 0;
        for (String word : stringArray){
            if (word.length() % 2 == 0){
                evenSum += word.length();
            }
            else oddSum += word.length();
        }
        return evenSum > oddSum;
    }

    public static boolean isPalendrome(String word){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
