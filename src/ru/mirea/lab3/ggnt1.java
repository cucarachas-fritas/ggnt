package ru.mirea.lab3;
import java.util.Random;
import java.util.Arrays;

public class ggnt1 {
    public static void main(String[] args){
        double[] arr = new double[6];
        for (int i = 0; i < (arr.length / 2); i++)
        {
            arr[i] = Math.random() * 10;
            System.out.println(arr[i]);
        }
        for (int i = arr.length / 2; i < arr.length; i++)
        {
            Random rand = new Random();
            arr[i] = rand.nextDouble(10);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}