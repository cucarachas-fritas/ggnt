package ru.mirea.lab3;
import java.util.Scanner;

public class ggnt_conventor {
    public static void main(String[] args){
        int choice;
        double amount;
        double rub, dollar, euro;
        Scanner vod = new Scanner(System.in);
        System.out.println("Выберите валюту:" +"\n" + "нажмите 1 если рубли" + "\n" + "нажмите 2 если доллары" + "\n" + "нажмите 3 если евро");
        choice = vod.nextInt();

        System.out.println("Введите сумму для конвентарции");
        amount = vod.nextFloat();
        if(amount < 1)
        {
            System.out.println("Займите в долг у кого нибудь");
            return;
        }

        if(choice == 1)
        {
            System.out.println("Вы выбрали рубли:");
            euro = amount * 0.0094;
            dollar = amount * 0.01;
            System.out.println("Результат конвертации " + "\n" + "Рубли в евро " + euro + "\n" + "Рубли в доллары " + dollar);
        }
        else if(choice == 2)
        {
            System.out.println("Вы выбрали доллары:");
            euro = amount * 0.94;
            rub = amount * 100.12;
            System.out.println("Результат конвертации " + "\n" + "Доллары в евро " + euro + "\n" + "Доллары в рубли " + rub);
        }

        else if(choice == 3)
        {
            System.out.println("Вы выбрали евро:");
            dollar = amount * 1.06;
            rub = amount * 106.41;
            System.out.println("Результат конвертации " + "\n" + "Евро в доллары " + dollar + "\n" + "Евро в рубли " + rub);
        }
        else
        {
            System.out.println("Ошибка: вы не выбрали валюту");
            return;
        }
    }
}
