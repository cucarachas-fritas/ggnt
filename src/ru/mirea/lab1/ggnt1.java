package ru.mirea.lab1;
import java.util.Scanner;

public class ggnt1 {
    public static void main(String[] args) {
        Scanner vod = new Scanner(System.in);
        System.out.print("сколько элементов в массиве?" + "\n");
        int dlina = vod.nextInt();
        if(dlina == 0){
            System.out.print("Ошибка");
        }
        else {
            int a = (int) dlina;
            int[] numbers = new int[a];
            int sum = 0;

            for (int i = 0; i < a; i++) {
                System.out.print("элемент под индексом " + i + "\n");
                numbers[i] = vod.nextInt();
            }
            float num = 0;
            float sred = 0;
            for (int i = 0; i < a; i++) {
                num = num + numbers[i];
                sred = num / a;
            }
            System.out.print("сумма всех элементов равна: " + num + "\n" + "среднее арифместическое равно" + "\n" + sred);
        }
    }
}