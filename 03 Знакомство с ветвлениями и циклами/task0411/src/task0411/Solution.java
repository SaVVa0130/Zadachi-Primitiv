package task0411;

/* 
Время года
Напиши метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна


Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод main должен вызывать метод checkSeason.
4. Метод checkSeason должен быть static void, и иметь только один параметр int.
5. Метод checkSeason должен выводить текст на экран согласно заданию.*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        String m;
        switch (month) {
            case 1:
            case 2:
            case 12:
                m = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                m = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                m = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                m = "Осень";
                break;
            default:
                m = "Нет такого месяца!";
        }
        System.out.println(m);
    }
}