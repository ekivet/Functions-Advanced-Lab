import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isItEven(90);
        isItTheSame("Hi There", "hi there");
        printLetters("Hello, How Are You?");
        randomNumber();
        calendar();
        newWord();
        printNumbers();
        twoNumbers(2,9);
        countryDomain(us);


    }

    public static boolean isItEven(int x) {

        if (x % 2 == 0) {

            System.out.println("It's Even!");

            return true;
        }

        else {

            System.out.println("It's Odd");

            return false;
        }

    }

    public static boolean isItTheSame(String firstString, String secondString){

        if (firstString.equalsIgnoreCase(secondString)) {

            System.out.println("These Words Match");

            return true;

        }

        else{

            System.out.println("These Words Do Not Match");

            return false;




        }


    }

    public static void printLetters(String myString){

        char[] stringToCharArray = myString.toCharArray();
            for (char output : stringToCharArray) {
                if (output == 'w' || output == 'W') {
                    break;
                }

                else {
                    System.out.println(output);
                }
            }
        }
    }
    
    public static int randomNumber() {

    int numToPrint = (int) (Math.random() * 100);
    System.out.println(numToPrint);

        if (numToPrint >= 50) {
            System.out.println(numToPrint);
            return numToPrint;
        }

        else {

            System.out.println(numToPrint);
            return -1;
        }
    }

    public static String calendar(int day,int month, int year){

        int newDay=day;
        int newMonth = month;
        int newYear = year;

        if (day < 30){

            newDay = day +1;
        }

        else if (day == 30 && month != 12){

            newDay = 1;
            newMonth = month +1;
        }

        else if (month < 12) {

            newDay =1;
            newMonth = 1;
            newYear = year +1;

        }

        System.out.println("day" + newDay + "month" + newMonth + "year" + newYear);

        return "day: " + newDay + " month: " + newMonth + " year: " + newYear;

        public static String newWord(String myString){

        int i;

        for (i = 0; i <= myString.length(); i++){

            System.out.println(myString.charAt(i));

            i++;
        }
        return myString;
    }

    public static void printNumbers(int myNumber){

        if (myNumber <= 5){
            System.out.println("Number is not greater than 5");
        }
        else {
            int i = 0;
            while (i <= myNumber){
                if (i != 4){
                    System.out.println(i);
                }
            i++;
            }
        }
    }

    public static int twoNumbers(int numberOne, int numberTwo){
        if (numberOne != numberTwo){
            numberOne++;
            numberTwo++;

            int sum = numberOne+numberTwo;

            System.out.println(sum);
            return sum;
        }

        else if (numberOne == numberTwo) {
            numberOne += 2;
            numberTwo += 2;

            int sum = numberOne + numberTwo;

            System.out.println(sum);
            return sum;
        }
    }

    public static void countryDomain() {
        Scanner countryScanner = new Scanner(System.in);
        System.out.println("Enter Your Two Letter Country Code");
        String countryCode = countryScanner.nextLine();
        String countryString;
        switch (countryCode) {
            case "us":
                countryString = "United States";
                break;
            case "de":
                countryString = "Germany";
                break;
            case "hu":
                countryString = "Hungary";
                break;
            default:
                countryString = "I don't know that country";
                break;
        }

        System.out.println(countryString);
    }

    public static void lettertype(){
    System.out.println("Type a lettter");
        Scanner letterScanner = new Scanner(System.in);
        String letter = letterScanner.nextLine();
        if (letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")){
            System.out.println("You entered a vowel");
        }
        else {
            System.out.println("You entered a consonent");
        }



    }
}


}
