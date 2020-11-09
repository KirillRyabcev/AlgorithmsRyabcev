package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static int inputInt(){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while(true){
                System.out.println("Введите число: ");
                if (scan.hasNextInt()){
                    n = scan.nextInt();
                    break;
                }else {
                    scan.nextLine();
                }
        }
        return n;
    }

    public static String inputString(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        return str;
    }

    public static int[] inputIntArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = inputInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            while (true) {
                if (scan.hasNextInt()) {
                    array[i] = scan.nextInt();
                    break;
                }else {
                    scan.nextLine();
                }
            }
        }
        return array;
    }

    public static boolean containsIllegals(String toExamine) {
        Pattern pattern = Pattern.compile("[~#@*+%{}<>\\[\\]|\"\\_^]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }


}
