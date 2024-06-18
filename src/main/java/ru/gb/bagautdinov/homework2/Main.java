package ru.gb.bagautdinov.homework2;

//       1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//       в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//       2. Написать метод, которому в качестве параметра передается целое число, метод должен
//       напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//       считаем положительным числом.
//       3. Написать метод, которому в качестве параметра передается целое число. Метод должен
//       вернуть true, если число отрицательное, и вернуть false если положительное.
//       4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
//       отпечатать в консоль указанную строку, указанное количество раз;
//       5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//       (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
//       100-го, при этом каждый 400-й – високосный.
//       Если выполнение задач вызывает трудности, можете обратиться к последней странице методического
//       пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять..
public class Main {

    public static void main(String[] args) {
     //  System.out.println(theAmountRangesFrom10To20(4, -61));
     //  isTheNumberPositive(15);
     //  System.out.println(isNegativeNumber((byte) 4));
     //  printTheStringTheSpecifiedNumberOfTimes("Hi", 5);
        System.out.println(isItALeapYear(100));

    }

    public static boolean theAmountRangesFrom10To20(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void isTheNumberPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положителное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegativeNumber(byte c) {
        return c < 0;
    }

    public static void printTheStringTheSpecifiedNumberOfTimes(String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

    public static boolean isItALeapYear(int year) {
     return  (year %4 == 0 || year %400 == 0 || year %100 != 0);
    }
}