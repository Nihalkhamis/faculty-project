
public abstract class Employee {
    private String name;
    private double salary;
    private String department;
    private double promotion;
    private boolean supplement;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getPromotion() {
        return promotion;
    }

    public boolean isSupplement() {
        return supplement;
    }
    
      
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }

    public void setSupplement(boolean supplement) {
        this.supplement = supplement;
    }
    

    
    
    
    
}
