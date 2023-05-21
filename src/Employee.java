abstract class Employee {

    private  String employeeName;
    private String employeeID;

    private  float paymentPerHour;


//     Employee(String employeeName, float paymentPerHour) {
//        this.employeeName = employeeName;
//        this.paymentPerHour = paymentPerHour;
//    }


    abstract float calculateSalary();


    abstract  float calculateOT();


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(float paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
