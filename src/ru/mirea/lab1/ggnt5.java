package ru.mirea.lab1;
import java.util.Scanner;
public class ggnt5 {
    static int calculateFactorial(int n) {
        if(n < 0)
        {
            System.out.println("Ошибка: отрицательное число");
            return 0;
        }
        if(n == 0){
            System.out.println("1");
            return 1;
        }

        int otvet = 1;
        for (int i = 1; i <= n; i++)
        {
            otvet = otvet * i;
        }
        return otvet;
    }

    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = vod.nextInt();
        System.out.println("факториал равен " + calculateFactorial(n));
    }
}