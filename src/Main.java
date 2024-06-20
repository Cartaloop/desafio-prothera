import service.EmployeeLocalService;
import service.PrintTable;


public class Main {
    public static void main(String[] args) {
        EmployeeLocalService service = new EmployeeLocalService();

        PrintTable print = new PrintTable(service);
        print.printTable();

        //Remove o funcionário João
        System.out.println("\n\n\n");
        service.deleteEmployeeByName("João");
        print.printTable();

        //Aumenta em 10% o salário de todos os funcionários
        System.out.println("\n\n\n");
        service.increaseSalaryForAllEmployees(10);
        print.printTable();

        System.out.println("\n\n\n");
        print.printTableGroupedByRole();

        System.out.println("\n\n\n");
        print.printTable("02/09/1996", "18/10/2000");


    }
}