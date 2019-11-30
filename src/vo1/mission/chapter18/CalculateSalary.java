package vo1.mission.chapter18;

public class CalculateSalary {

    public static void main(String[] args) {
        CalculateSalary salary = new CalculateSalary();
        salary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        switch (employee.getType()) {
            case 1:
                return (long) (employee.getSalary() * (0.05));
            case 2:
                return (long) (employee.getSalary() * 1.1);
            case 3:
                return (long) (employee.getSalary() * 1.2);
            case 4:
                return (long) (employee.getSalary() * 1.3);
            case 5:
                return (long) (employee.getSalary() * 2);
            default:
                return 0;
        }
    }

    public void calculateSalaries() {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employee[1] = new Employee("KimManager", 2, 100000000);
        employee[2] = new Employee("WhangDesign", 3, 70000000);
        employee[3] = new Employee("ParkArchi", 4, 80000000);
        employee[4] = new Employee("LeeDevelop", 5, 60000000);

        for (Employee employee1 : employee) {
            System.out.println(employee1.getName() + " : " + getSalaryIncrease(employee1));
        }
    }
}
