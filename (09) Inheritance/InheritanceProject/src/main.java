import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        // STARTERS
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // INFINITE LOOP
        while (true) {
            // MAIN MENU
            System.out.println("What would you like to do?");
            System.out.println("1. View Employees \n2. Add Employee \n3. Remove Employee");
            System.out.print("Your Choice: ");

            // STORE CHOICE
            int main_choice = input.nextInt();

            if (main_choice == 1) {
                // MENU 1
                System.out.println("Which employees?");
                System.out.println("1. All Employees \n2. Baristas \n3. Front-of-House Managers");
                System.out.println("Your Choice: ");

                // STORE CHOICE
                int choice_first = input.nextInt();

                // DESCRIBE ALL EMPLOYEES
                if (choice_first == 1) {
                    for (Employee employee : EmployeeList) {
                        employee.Describe();
                    }
                }

                // DESCRIBE BARISTAS
                if (choice_first == 2) {
                    for (Employee employee : EmployeeList) {
                        if (employee.getClass().toString().equals("class Barista")) {
                            employee.Describe();
                        }
                    }
                }

                // DESCRIBE FRONT MANAGERS
                if (choice_first == 3) {
                    for (Employee employee : EmployeeList) {
                        if (employee.getClass().toString().equals("class FrontManager")) {
                            employee.Describe();
                        }
                    }
                }

            }

            if (main_choice == 2) {
                // MENU 2
                System.out.println("What kind of employee?");
                System.out.println("1. Barista \n2. Front-of-House Manager");
                System.out.println("Your Choice: ");

                // STORE CHOICE
                int choice_second = input.nextInt();

                System.out.println("Name?");
                String name = input.next();

                System.out.println("ID?");
                int id = input.nextInt();

                // BARISTAS
                if (choice_second == 1) {
                    System.out.println("Latte Art? (true/false)");
                    boolean doesLatteArt = input.nextBoolean();

                    System.out.println("Certified Food Safe? (true/false)");
                    boolean isCertifiedFoodSafe = input.nextBoolean();

                    Barista barista = new Barista(name, id);

                    barista.setDoesLatteArt(doesLatteArt);
                    barista.setCertifiedFoodSafe(isCertifiedFoodSafe);

                    EmployeeList.add(barista);
                }

                // FRONT MANAGERS
                if (choice_second == 2) {

                    System.out.println("Trainer? (true/false)");
                    boolean isTrainer = input.nextBoolean();

                    FrontManager frontmanager = new FrontManager(name, id);
                    frontmanager.setTrainer(isTrainer);

                    EmployeeList.add(frontmanager);
                }

            }

            if (main_choice == 3) {
                // MENU 3
                System.out.println("ID?");
                int id_fired = input.nextInt();
                int index = -1; // DEFAULT

                for (int i = 0; i < EmployeeList.size(); i++) {
                    if (EmployeeList.get(i).id == id_fired) {
                        index = i;
                    }
                }

                // IF STILL DEFAULT INDEX
                if (index == -1) {
                    System.out.println("No Employee Found!");
                }

                else {
                    System.out.println("Employee Removed!");
                    EmployeeList.remove(index);
                }

            }


        }

    }

}
