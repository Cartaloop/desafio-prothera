import database.MemoryDatabase;
import service.EmployeeLocalService;
import service.PrintTable;

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

        //Aumenta em 20% o salário de todos os funcionários
        System.out.println("\n\n\n");
        service.increaseSalaryForAllEmployees(20);
        print.printTable(service.getAllEmployees());

    }
}