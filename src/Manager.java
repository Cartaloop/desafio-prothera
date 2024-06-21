import controller.EmployeeController;
import service.PrintTable;

import static tools.StaticTools.clearScreen;

public class Manager {
    public EmployeeController controller = new EmployeeController();
    PrintTable printer = new PrintTable();

    public void execute() {
        boolean power = true;
        while(power) {
            System.out.println("Usuários inseridos com sucesso.");
            clearScreen();

            controller.deleteEmployeeByName("João");
            clearScreen();

            printer.printTable(controller.getAllEmployees());
            clearScreen();

            controller.increaseSalaryForAllEmployees(10);
            clearScreen();

            printer.printTable(controller.getAllEmployees());
            clearScreen();

            printer.printTable(controller.groupEmployeeByRole());
            clearScreen();

            printer.printTable(controller.filterByDateRange(11, 12));
            clearScreen();

            printer.printTable(controller.getSeniorEmployee());
            clearScreen();

            printer.printTable(controller.getAllEmployeesInAlphabeticOrder());
            clearScreen();

            printer.printTable(controller.getTotalSalary());
            clearScreen();

            printer.printTable(controller.calculateMinimumSalary());
            clearScreen();

            power = false;
        }
    }
}
