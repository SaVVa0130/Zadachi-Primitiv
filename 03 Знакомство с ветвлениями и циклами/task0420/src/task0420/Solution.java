package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n1;
        int n2;
        int n3;
        if (a >= b && a >= c){
            n1 =  a;}
        else if (b >= c && b >= a) {
            n1 = b;}
        else {
            n1 = c;}
        if (a <= c && a >= b || a <= b && a >= c) {
            n2 = a;}
        else if (b <= a && b >= c || b <= c && b >= a) {
            n2= b;}
        else  {
            n2= c;}
        if (a <= b && a <= c) {
            n3 = a;}
        else if (b <= c && b <= a) {
            n3 = b;}
        else {
            n3 = c;}
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
