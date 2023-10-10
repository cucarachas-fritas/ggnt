package ru.mirea.lab2;
import java.util.Scanner;

public class ggnt_HowMany {

    public static void main(String[] args) {

        Scanner vod = new Scanner(System.in);
        System.out.println("Введите слова через пробел");
        String words = vod.nextLine();
        int count = 0;

        if(words.length() != 0)
        {
            count++;
            for (int i = 0; i < words.length(); i++)
            {
                if(words.charAt(i) == ' ' && words.charAt(i+1) != ' ')
                {
                    count++;
                }
                else
                {
                    System.out.println("пробел между словами явно больше чем 1");
                    break;
                }
            }
        }
        System.out.println("количество слов равно "+count);
    }
}