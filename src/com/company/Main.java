package com.company;

public class Main {

    public static void main(String[] args) {
	Employes employes = new Employes();
    employes.printList();

    employes.add(new Employee("Василий", "Скородед", "Андреевич", "89506428442", 1998, 12, 1));
    employes.add(new Employee("Егор", "Егоров", "Егорович", "89906328442", 2004, 2, 12));
    employes.add(new Employee("Артем", "Самойлов", "Кретович", "89996422282", 2006, 5, 7));
    employes.add(new Employee("Киаун", "Кианов", "Каркарычев", "87502090287", 2077, 2, 1));
    employes.add(new Employee("ЧЕл", "Архангельск", "Телеграмович", "66666666666", 6666, 1,1));
    employes.add(new Employee("НуЧеееел", "Аахангельск", "Нучеловеч", "66666766666", 998, 3,22));
    employes.printList();
    employes.del("Скородед");
    employes.sortDate();

    System.out.println();
    employes.printList();
    }
}
