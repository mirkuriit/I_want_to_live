package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Employes {
    ArrayList<Employee> employeeArrayList;
    public Employes(){
        employeeArrayList = new ArrayList<Employee>();
    }
    public Employes(ArrayList<Employee> employeeArrayList){
        this.employeeArrayList = employeeArrayList;
    }


    public void add(Employee employee){
        employeeArrayList.add(employee);
        employeeArrayList.sort(new CompSur());
    }


    public void printList(){
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i).toString());
        }
    }

    public void del(String surname){
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if ((employeeArrayList.get(i).surname).equals(surname)){
                employeeArrayList.remove(i);
            }
        }
    }

    public void sortDate(){
        employeeArrayList.sort(new CompDate());

    }

    class CompDate implements Comparator<Employee>{
        @Override
        public int compare(Employee employee, Employee t1) {
            Date employDate = new Date(employee.year, employee.month, employee.day);
            Date t1Date = new Date(t1.year, t1.month, t1.day);
            if (employDate.getTime()>t1Date.getTime()){
                return 1;
            }
            if (employDate.getTime()<t1Date.getTime()){
                return -1;
            }
            else
                return 0;
        }
    }


    class CompSur implements Comparator<Employee> {
        @Override
        public int compare(Employee employee, Employee t1) {
            int e = (employee.surname).charAt(0);
            int t = (t1.surname).charAt(0);
            if (e > t){
                return 1;
            }
            if (e < t){
                return -1;
            }
            else
                return 0;
        }
    }
}
