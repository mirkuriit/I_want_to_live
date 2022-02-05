package com.company;

public class Employee {
    private String name;
    public String surname;
    private String patronymic;
    private String number;
    public int year, month, day;

    public Employee(String name, String surname, String patronymic, String number, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.number = number;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, %s, %s.%s.%s", name, patronymic, surname, number, year, month, day);
    }
}
