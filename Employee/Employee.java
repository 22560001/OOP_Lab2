package Employee;

public class Employee {
    private String name; //first name before last name
    private String jobTitle;
    private double salary; //salary is annual salary in USD

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //the first name before the last name
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary; //salary is annual salary in USD
    }

    public void raiseSalary(double percentage) {
        double raise = (percentage / 100) * salary; //Increasing salary every year if employees work effectively
        salary += raise;
        System.out.println("Salary raised by " + percentage + "%" + "\nUpdated salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Toni Kroos", "Web Developer", 120000);
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Job Title: " + emp1.getJobTitle());
        System.out.println("Salary: " + emp1.getSalary());
        emp1.raiseSalary(5);
        
        Employee emp2 = new Employee("Tuấn Anh Nguyễn", "Principal Software Engineer", 750000);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Job Title: " + emp2.getJobTitle());
        System.out.println("Salary: " + emp2.getSalary());
        emp2.raiseSalary(15);
        
        Employee emp3 = new Employee("Fuluan Zhang", "Security Guard", 75000);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp3.getName());
        System.out.println("Job Title: " + emp3.getJobTitle());
        System.out.println("Salary: " + emp3.getSalary());
        emp3.raiseSalary(2.5);
        
        emp2.setJobTitle("Chief Information Officer");
        emp2.setSalary(1000000);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("New Job Title: " + emp2.getJobTitle());
        System.out.println("New Salary: " + emp2.getSalary());
        emp2.raiseSalary(15);
        
        emp3.setJobTitle("Retire");
        emp3.setSalary(0);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp3.getName());
        System.out.println("Job Title: " + emp3.getJobTitle());
        System.out.println("Salary: " + emp3.getSalary());
        
        
    }
}
