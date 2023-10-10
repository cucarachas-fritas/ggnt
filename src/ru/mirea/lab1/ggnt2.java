package ru.mirea.lab1;
import java.util.Scanner;
public class ggnt2 {
        public static void main(String[] args)
        {
            Scanner vod = new Scanner(System.in);
            System.out.print("сколько элементов в массиве?" + "\n");
            int dlina = vod.nextInt();
            if (dlina == 0)
            {
                System.out.print("Ошибка");
            }
            else
            {
                int array = (int) dlina;
                int[] numbers = new int[array];
                for (int i = 0; i < array; i++)
                {
                    System.out.print("элемент под индексом " + i + "\n");
                    numbers[i] = vod.nextInt();
                }

                int sum = 0;
                int p = 0;
                while (p != dlina)
                {
                    sum += numbers[p];
                    p += 1;
                }

                int l = 0;
                int max = -1000000000;
                do
                {
                    if (numbers[l] > max)
                    {
                        max = numbers[l];
                    }
                    l += 1;
                }while (l != dlina);

                int w = 0;
                int min = 1000000000;
                do
                {
                    if (numbers[w] < min)
                    {
                        min = numbers[w];
                    }
                    w += 1;
                }while (w != dlina);

                System.out.println("сумма всех элементов равна: " +sum+ "\n" + "максимальное значение равно " +max+  "\n" + "минимальное значение равно "+min);
            }
        }
    }