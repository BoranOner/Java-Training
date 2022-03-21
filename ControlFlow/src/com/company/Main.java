package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    }

    public static int getBucketCount(double width,double height,double areaPerBucket,double extraBucket){



    }

    public static void inputThenPrintSumAndAverage(){
        int avg=0,sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
               int number = scanner.nextInt();
               sum += number;
               avg++;
            }
            else{
                System.out.println("SUM = "+sum +" AVG = "+Math.round((double) sum/avg));
                break;
            }
        }
    }
    public static void minMax(){
        int max=-1,min=0;
        boolean first=true;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first || min>number){
                    first = false;
                    min=number;
                }
                if(max<number)max=number;
            }
            else break;
        }
        System.out.println("Minimum Number: "+min+" Maximum Number: "+max);
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else {
            for(int row=1;row<=number;row++) {
                for (int column=1; column<=number;column++) {
                    if(column==1 || column==number || column ==row || column == ((number-row) +1)) System.out.print("*");
                    else if (column!=1 && column!=number && (row==1 || row==number)) System.out.print("*");
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }
        }
    }
    public static int getLargestPrime(int number){
        if(number < 2)return -1;
        for(int i=number/2;i>1;i--){
           if(number%i==0)number=i;
        }
        return number;
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)return false;
        //goal 10 big 1 small 6 diyelim 1 big 5 small kullanılır kenarda kalması uygun ama fazla koyulması uygun değil
        for(int i=0;i<=bigCount;i++){
            for(int y=0;y<=smallCount;y++){
                if((i*5+y) == goal)return true;
            }
        }
        return false;
    }
    public static void numberToWords(int number){
        if(number < 0) System.out.println("Invalid Value");
        if(number == 0) System.out.println("Zero ");
        int numDigit = getDigitCount(number);
        int revDigit = getDigitCount(reverse(number));
        int zerosToPrint = numDigit - revDigit;
        number = reverse(number);
        String stringNumber = "";
        int lastDigit;

        while(number > 0){
            lastDigit = number%10;
            switch(lastDigit){
                case 0:
                    stringNumber +="Zero ";
                    break;
                case 1:
                    stringNumber +="One ";
                    break;
                case 2:
                    stringNumber +="Two ";
                    break;
                case 3:
                    stringNumber +="Three ";
                    break;
                case 4:
                    stringNumber +="Four ";
                    break;
                case 5:
                    stringNumber +="Five ";
                    break;
                case 6:
                    stringNumber +="Six ";
                    break;
                case 7:
                    stringNumber +="Seven ";
                    break;
                case 8:
                    stringNumber +="Eight ";
                    break;
                case 9:
                    stringNumber +="Nine ";
                    break;
            }
            number /= 10;

        }

        for(int i=0;i<zerosToPrint;i++){
            stringNumber+="Zero ";
        }
        System.out.println(stringNumber);
    }
    public static int reverse(int number){
        int lastDigit = 0,reverse = 0;

        while(number != 0){
            lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;
            if(number != 0){
                reverse *=10;
            }
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0)return -1;
        if(number ==0)return 1;
        int digitCount = 0;
        for(;number>0;digitCount++){
            number/=10;
        }
        return digitCount;
    }
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number < 1)return false;
        for(int i = 1;i<number;i++){
            if(number%i == 0)sum += i;
        }
        if(sum == number)return true;
        return false;
    }
    public static void printFactors(int number){

        String stringNumber="";

        if(number < 1) System.out.println("Invalid Value");
        for(int i = 1;i<=number;i++){
            if(number%i == 0){
                stringNumber+=(" " + i);
            }
        }
        System.out.println(stringNumber);
    }
    public static int getGreatestCommonDivisor(int first,int second){

        if(first < 10 || second < 10)return -1;
        int smallest = first,divisor=0;
        if(smallest > second)smallest = second;

        for(int i =1;i<=smallest;i++){
            if(first%i == 0 && second%i == 0)divisor=i;
        }
        return divisor;
    }
    public static boolean hasSameLastDigit(int number1,int number2,int number3){

        if(isValidHasSameLastDigit(number1) && isValidHasSameLastDigit(number2) && isValidHasSameLastDigit(number3)){
            number1 %= 10;
            number2 %= 10;
            number3 %= 10;

            return (number1 == number2 ||number1 == number3 || number2 == number3);
        }
        return false;
    }
    public static boolean isValidHasSameLastDigit(int number){
        return ((number >= 10) && (number <=1000));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)return false;
        int lastDigit1 = 0,lastDigit2 = 0,originalNumber2= number2;
        while(true){
            lastDigit1 = number1 % 10;
            number1 = number1 /10;
            while(true){
                lastDigit2 = number2 %10;
                number2 = number2 /10;
               // System.out.println("Lastdigit1 = "+lastDigit1+"Lastdigit2 = "+lastDigit2);
                if(lastDigit1 == lastDigit2)return true;
                if(number2 == 0)break;
            }
            if(number1 == 0)break;
            number2 = originalNumber2;
        }
        return false;
    }
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int lastDigit = 0,sum = 0;
        while(true){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0) sum += lastDigit;
            number = number /10;
            if(number <= 0)break;
        }
            return sum;
    }
    public static int sumFirstAndLastDigit(int number){
        if(number <0)return -1;
        int  firstDigit,lastDigit,length,x=10;
        length = String.valueOf(number).length();
        if(length!=1) {
            for (int y = 1; y < length - 1; y++) {
                x *= 10;
            }
            firstDigit = number / x;
        }
        else firstDigit = number;
        lastDigit = number % (10);
        System.out.println("First Digit: "+firstDigit + " Last Digit "+ lastDigit);
         return lastDigit+firstDigit;
    }
    public static boolean isPalindrome(int number){
        if(number < 0) number = number * -1;
        int originalNumber = number;
        int lastDigit = 0,reverse = 0;
        while(true){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number /10;
            if(number <= 0)break;
        }
        if(originalNumber == reverse)return true;
        else return false;
    }
    public static boolean isEvenNumber(int a){
        if(a%2 == 0)return true;

        return false;
    }
    public static boolean isOdd(int number){
        if(number < 0 || number % 2 == 0 )return false;
        return true;
    }
    public static int sumOdd(int start,int end){
        int sum = 0;
        if(end < start || end < 0 || start < 0)return -1;
            for(;start<=end;start++){
                if(isOdd(start)){
                    sum += start;
                }
            }
            return sum;
    }
    public static void printDayOfTheWeek(int day) {

        switch(day){
            case 0:
                System.out.println("Day is Sunday");
                break;
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

    }
    public static void printNumberInWord(int number){

        switch(number){

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
    public static boolean isLeapYear(int year){
        if(year<1 || year > 9999)return false;
        if((year%4 == 0 && year%100 !=0) || (year % 400 == 0))return true;

        return false;

    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12)return -1;
        if(year < 1 || year >9999)return -1;

        switch(month){

            case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                if(isLeapYear(year) == true) return 29;
                else return 28;
            case 4:case 6:case 9:case 11:
                return 30;
            default:
                return -1;
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }


}

