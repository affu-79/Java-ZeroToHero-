
public class Program88 {

    // Employee class with encapsulated fields and proper getters/setters
    static class Employee {

        // Private fields to protect data
        private int id;
        private String name;
        private double salary;
        private int age;
        private final String panNumber; // Read-only field
        private String password;        // Write-only field

        // Constructor to initialize the read-only PAN number
        public Employee(String panNumber) {
            this.panNumber = panNumber;
        }

        // Setters with validation
        public void setId(int id) {
            if (id > 0) {
                this.id = id;
            } else {
                throw new IllegalArgumentException("ID must be positive");
            }
        }

        public void setName(String name) {
            if (name != null && !name.trim().isEmpty()) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
        }

        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                throw new IllegalArgumentException("Salary must be non-negative");
            }
        }

        public void setAge(int age) {
            if (age >= 18) {
                this.age = age;
            } else {
                throw new IllegalArgumentException("Age must be 18 or older");
            }
        }

        public void setPassword(String password) {
            if (password != null && password.length() >= 6) {
                this.password = hash(password);
            } else {
                throw new IllegalArgumentException("Password must be at least 6 characters long");
            }
        }

        // Getters for accessing data
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }

        public String getPanNumber() {
            return panNumber;
        }

        // No getter for password (write-only field)
        // Helper method to simulate password hashing
        private String hash(String input) {
            return "hashed_" + input.hashCode();
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an employee object
        Employee emp = new Employee("ABCDE1234F");

        // Setting values
        emp.setId(101);
        emp.setName("Afnan Pasha");
        emp.setAge(21);
        emp.setSalary(85000.50);
        emp.setPassword("securePass");

        // Displaying values
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("PAN Number:(( read - only ) " + emp.getPanNumber());

        // No way to print password, as it's write-only
        // System.out.println(emp.password); //  Compile-time error
    }
}
