package service;

import model.Employee;
import model.Person;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PrintTable {
    NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public void printTable(List<Employee> persons) {
        System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento ", "Salário", "Cargo");
        System.out.println("--------------------------------------------------------------------------------");

        for (Employee person : persons) {
                System.out.printf("%-20s %-30s %-15s %-15s\n",
                        person.getName(),
                        person.getBirthDate(),
                        df.format(person.getSalary()),
                        person.getRole());

        }
    }
}
