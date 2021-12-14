package com.promineotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problems {
    public static void Problem1() {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        ages[(ages.length - 1)] -= ages[0];
        System.out.println(Arrays.toString(ages));

        int[] moreAges = {3, 9, 23, 64, 2, 8, 28, 93, 58};
        moreAges[(moreAges.length - 1)] -= moreAges[0];
        System.out.println(Arrays.toString(moreAges));

        int total = 0;
        for(int age : ages){
            total += age;
        }
        System.out.println(total / ages.length);
    }
    public static void Problem2() {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        for (String name : names)
            totalLetters += name.length();
        System.out.println((double)totalLetters / names.length);

        StringBuilder fullList = new StringBuilder();
        for (String name: names)
            fullList.append(name).append(" ");
        System.out.println(fullList);
    }
    public static void Problem5() {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int[] nameLengths = new int[names.length];
        for(int i = 0; i < names.length; i++)
            nameLengths[i] = names[i].length();
        System.out.println(Arrays.toString(nameLengths));
    }
    public static void Problem6() {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int[] nameLengths = new int[names.length];
        int sum = 0;
        for(int i = 0; i < names.length; i++)
            nameLengths[i] = names[i].length();
        for(int length : nameLengths)
            sum += length;
        System.out.println("Sum: " + sum);
    }
    public static String Problem7(String word, int n) {
        String newWord = "";
        if(n > 0) {
            newWord = word;
            for (int i = 1; i < n; i++)
                newWord += word;
        }
        return newWord;
    }
    public static String Problem8(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public static boolean Problem9(int[] myArray) {
        int total = 0;
        for (int num : myArray)
            total += num;
        if (total > 100)
            return true;
        else
            return false;
    }
    public static double Problem10(double[] myArray) {
        double total = 0;
        for (double number : myArray)
            total += number;
        return total / myArray.length;
    }
    public static boolean Problem11(double[] firstArray, double[]secondArray) {
        double firstTotal = 0;
        for (double number : firstArray)
            firstTotal += number;
        double firstAverage = firstTotal / firstArray.length;

        double secondTotal = 0;
        for (double number : secondArray)
            secondTotal += number;
        double secondAverage = secondTotal / secondArray.length;

        if(firstAverage > secondAverage)
            return true;
        return false;
    }
    public static boolean willBuyDrinkProblem12(boolean isHotOutside, double moneyInPocket) {
        if (isHotOutside && moneyInPocket > 10.5)
            return true;
        return false;
    }
    public static void storeAddresses() {
        Scanner in = new Scanner(System.in);
        List<String> addresses = new ArrayList<>();
        while(true) {
            System.out.println("Please add an address.");
            String address;

            System.out.print("Enter the street number and name: ");
            address = in.nextLine() + " ";
            System.out.print("Enter the city and state: ");
            address += in.nextLine() + " ";
            System.out.print("Enter the zip code: ");
            address += in.nextLine();

            addresses.add(address);

            System.out.println("Do you want to add another address? (y/n)");
            if (in.nextLine().equalsIgnoreCase("n"))
                break;
        }
        for(String name : addresses)
        System.out.println(name);
    }
}
