package by.kirill.alg;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите номер алгоритма: ");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();

        if (in==1){
            Algorithm.firstAlgorithm();
        }else if (in==2){
            Algorithm.secondAlgorithm();
        }else if (in==3){
            Algorithm.thirdAlgorithm();
        }

        scan.close();

    }
}
