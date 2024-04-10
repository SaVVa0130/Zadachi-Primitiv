package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b)
            System.out.println("3");
        else if (a == c)
            System.out.println("2");
        else if (b == c)
            System.out.println("1");
    }
}
