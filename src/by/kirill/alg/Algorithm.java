package by.kirill.alg;

import java.util.Scanner;

public class Algorithm {
    public static void firstAlgorithm(){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 7){
            System.out.println("Привет");
        }
    }
    public static void secondAlgorithm(){
        System.out.println("Введите имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (name.contains("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
    }
    public static void thirdAlgorithm(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Элементы массива кратные трем: ");
        for (int i = 0; i < size; i++) {
            if (array[i]%3==0){
                System.out.println(" " + array[i]);
            }
        }

    }
}
