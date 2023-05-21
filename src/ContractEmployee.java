public class ContractEmployee extends  Employee  implements EmployeeInfo  {
int workingHour;


    @Override
    public float calculateSalary() {
        return  getPaymentPerHour()* workingHour;
    }

    @Override
    float calculateOT() {
        return (float) (workingHour * getPaymentPerHour() * 0.25);
    }

    @Override
    public void setEmployeeInfo() {

    }
}
