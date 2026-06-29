package VTP_technical;

public class Employee {
    String fullName;
    String empId;

//    public Employee(String fullName, String empId) {
//        this.fullName = fullName;
//        this.empId = empId;
//    }

    public String getFullName() {
        return "Employee Name : " + fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmpId() {
        return "Employee Id : " + empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setFullName("Snehasich Samal");
        emp.setEmpId("1JB23CS150");


        System.out.println(emp.getFullName());
        System.out.println(emp.getEmpId());
        System.out.println(emp);    // print address of the class
        // VTP_technical.Employee@3f99bd52 -> VTP_technical → Package name, Employee → Class name, @ -> Just a separator used by Java's default toString() method.
        //3f99bd52 -> The object's hash code in hexadecimal.
    }
}