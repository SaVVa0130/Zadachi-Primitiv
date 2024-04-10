package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int z =scanner.nextInt();
        int q = scanner.nextInt();
        if (a >= s & a >= z & a >= q) {
            System.out.println(a);
        } else if (s >= a & s >= z & s >= q) {
            System.out.println(s);
        } else if (z >= a & z >= s & z >= q) {
            System.out.println(z);
        } else if (q >= a & q >= s & q >= z) {
            System.out.println(q);
        }
    }
}
