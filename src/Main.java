import database.MemoryDatabase;
import model.Employee;
import service.EmployeeLocalService;
import service.PrintTable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MemoryDatabase db = new MemoryDatabase();
        EmployeeLocalService service = new EmployeeLocalService(db);

        PrintTable print = new PrintTable();
        print.printTable(service.getAllEmployees());

        //Remove o funcionário João
        System.out.println("\n\n\n");
        service.deleteEmployeeByName("João");
        print.printTable(service.getAllEmployees());

        //Aumenta em 10% o salário de todos os funcionários
        System.out.println("\n\n\n");
        service.increaseSalaryForAllEmployees(10);
        print.printTable(service.getAllEmployees());

        System.out.println("\n\n\n");
        print.printTableGroupedByRole(service);

    }
}