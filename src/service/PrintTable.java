    package service;

    import controller.EmployeeController;
    import dto.MinimumSalary;
    import dto.SeniorEmployee;
    import model.Employee;

    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import static tools.StaticTools.*;

    public class PrintTable {

        public void printTable(List<Employee> employees) {
            template(employees);
        }
        public void printTable(Set<MinimumSalary> minimumSalaries) {
            template(minimumSalaries);
        }

        public void printTable(Map<String, List<Employee>> employees) {
            template(employees);
        }

        public void printTable(SeniorEmployee employee){
            template(employee);
        }

        public void printTable(BigDecimal totalSalary) {
            template(totalSalary);
        }


        private void template (List<Employee> condition) {
            System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento ", "Salário", "Função");
            System.out.println("--------------------------------------------------------------------------------");

            for (Employee person : condition) {
                System.out.printf("%-20s %-30s %-15s %-15s\n",
                        person.getName(),
                        dateFormater.format(person.getBirthDate()),
                        decimalFormater.format(person.getSalary()),
                        person.getRole());

            }
        }

        private void template(Map<String, List<Employee>> groupedByRole) {
            System.out.println("Ordenação por Função");
            System.out.printf("%-20s %-30s %-15s %-15s\n", "Nome", "Data Nascimento", "Salário", "Função");
            System.out.println("--------------------------------------------------------------------------------");

            groupedByRole.forEach((role, empList) -> empList.forEach(employee -> System.out.printf("%-20s %-30s %-15s %-15s\n",
                    employee.getName(),
                    dateFormater.format(employee.getBirthDate()),
                    employee.getSalary(),
                    employee.getRole())));
        }

        private void template(SeniorEmployee employee){
            System.out.println("Busca por funcionário mais velho");
            System.out.printf("%-20s %-20s\n", "Nome", "Idade");
            System.out.println("--------------------------");

            System.out.printf("%-20s %-30s\n",
                    employee.getName(),
                    (employee.getAge() + " anos"));
        }

        private void template(BigDecimal amount){
            System.out.println("Total de salários dos funcionários");
            System.out.println("--------------------------");

            System.out.printf("%-20s %-30s\n",
                    "Total: ",
                    decimalFormater.format(amount));
        }

        private void template(Set<MinimumSalary> minimumSalaries) {
            System.out.printf("%-20s %-30s\n", "Nome", "Total de salário mínimo");
            System.out.println("----------------------------------------------------");

            for (MinimumSalary entry : minimumSalaries) {
                System.out.printf("%-20s %-30s\n", entry.getName(), numberFormater.format(entry.getSalary().setScale(2, RoundingMode.HALF_UP)));
            }
        }

    }



