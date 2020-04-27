package ru.task.figure.Eulers_tasks.MultiplesOf3Or5;

public class MultiplesOf3Or5 {
    /**
     * task1.
     * Если выписать все натуральные числа меньше 10,
     * кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
     *
     * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.*/

    public static void main(String[] args) {
        int summa = 0;
        for (int i = 0; i < 1001; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                summa = summa + i;
                System.out.println("i: " + i + " Summa: " + summa );
            } else { continue;}

        }

    }
}
