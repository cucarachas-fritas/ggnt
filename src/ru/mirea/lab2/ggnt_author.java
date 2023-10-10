package ru.mirea.lab2;

public class ggnt_author {
    private String Name, Email;
    private char Gender;

    public ggnt_author(String name, String email, char gender)
    {
        this.Name = name;
        this.Email = email;
        if(gender != 'm' && gender != 'f')
            throw new IllegalArgumentException("Ошибка: введите m или f ");
        this.Gender = gender;
    }
    public String getName()
    {
        return Name;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String email)
    {
        this.Email = email;
    }
    public char getGender()
    {
        return Gender;
    }
    public String toString()
    {
        return "Author{" + "name='" + Name + ", email='" + Email + ", gender=" + Gender + '}';
    }
}