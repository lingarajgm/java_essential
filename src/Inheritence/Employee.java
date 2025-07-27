package Inheritence;

public class Employee extends Person {
private String empId;
private String title;

public Employee() {
    System.out.println("In Employee Default Cons Called");
}

public void setEmpid(String empId) {
        this.empId = empId;
    }
    public void setTitle(String title) {
        this.title = title;
    }

 public String getEmpid() {
        return empId;
    }
public String getTitle() {
        return title;
    }   
}