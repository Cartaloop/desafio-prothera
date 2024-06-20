import controller.EmployeeController;
import service.EmployeeLocalService;
import service.PrintTable;


public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        PrintTable printer = new PrintTable();

        controller.deleteEmployeeByName("João");
        printer.printTable(controller.getAllEmployees());
        controller.increaseSalaryForAllEmployees(10);
        printer.printTable(controller.getAllEmployees());
        printer.printTable(controller.groupEmployeeByRole());
        printer.printTable(controller.filterByDateRange("19/11/1999", "18/10/2000"));
        printer.printTable(controller.getSeniorEmployee());
        printer.printTable(controller.getAllEmployeesInAlphabeticOrder());
        printer.printTable(controller.getTotalSalary());
        printer.printTable(controller.calculateMinimumSalary());



    }
}