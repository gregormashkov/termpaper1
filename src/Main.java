public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[1] = new Employee("Федоренко Сергей Петрович", 100548.65, 1);
        employees[2] = new Employee("Сергеева Елена Павловна", 120054.50, 3);
        employees[3] = new Employee("Вульф Ирина Дмитриевна", 89500.54, 4);
        printArray();
        System.out.println("Сумма зарплат работников: " + sumSalary());
        System.out.println("Минимальная зарплата работника: " + findMinSalary());
        System.out.println("Максимальная зарплата работника: " + findMaxSalary());
        System.out.println("Средняя зарплата работников: " + findMidSalary());
        printingFullNames();
    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }

        }


    }

    public static double sumSalary() {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee findMinSalary() {
        Employee result = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static Employee findMaxSalary() {
        Employee result1 = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result1 = employees[i];
            }
        }
        return result1;
    }

    public static double findMidSalary() {
        int countNotNullElements = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countNotNullElements++;
            }
        }
        return sumSalary() / countNotNullElements;
    }
    public static void printingFullNames() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}
// курсовая работа завершена








