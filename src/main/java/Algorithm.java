package main.java;

import main.java.exception.FirstAlgorithmLogicException;
import main.java.exception.SecondAlgorithmLogicException;
import main.java.exception.ThirdAlgorithmLogicException;

public class Algorithm {

    public static void firstAlgorithm() throws FirstAlgorithmLogicException{
        int n = Helper.inputInt();
        if (n < 0) {
            throw new FirstAlgorithmLogicException("number is incorrect");
        }
        if (n > 7){
            System.out.println("Привет");
        }
    }

    public static void secondAlgorithm() throws SecondAlgorithmLogicException {
        System.out.println("Введите имя: ");
        String name = Helper.inputString();
        if (Helper.containsIllegals(name)){
            throw new SecondAlgorithmLogicException("illegal symbols");
        }
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
    }

    public static void thirdAlgorithm() throws ThirdAlgorithmLogicException{
        int [] array = Helper.inputIntArray();
        if (array.length==0){
            throw new ThirdAlgorithmLogicException("array is empty");
        }
        System.out.println("Элементы массива кратные трем: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%3==0){
                System.out.println(" " + array[i]);
            }
        }
    }

}
