package main.java;

import main.java.exception.FirstAlgorithmLogicException;
import main.java.exception.SecondAlgorithmLogicException;
import main.java.exception.ThirdAlgorithmLogicException;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите номер алгоритма и нажмите Enter: \n" +
                "1 - Вывод слова 'Привет' для чисел больше 7 \n" +
                "2 - Проверка имени на совпадение с именем 'Вячеслав' \n" +
                "3 - Вывод элементов массива кратных трем \n" +
                "Любая другая цифра - Выход из программы \n"
        );

        int in = Helper.inputInt();

        try {
            switch (in) {
                case 1:
                    Algorithm.firstAlgorithm();
                    break;
                case 2:
                    Algorithm.secondAlgorithm();
                    break;
                case 3:
                    Algorithm.thirdAlgorithm();
                    break;
                default:
                    System.exit(0);
            }
        }catch (FirstAlgorithmLogicException | SecondAlgorithmLogicException | ThirdAlgorithmLogicException ex){
            ex.printStackTrace();
            ex.getMessage();
        }

    }
}
