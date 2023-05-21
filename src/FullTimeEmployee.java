public class FullTimeEmployee extends Employee {
    float otPerHour;


    @Override
    float calculateSalary() {
        return 0;
    }

    @Override
    float calculateOT() {
        return 0;
    }


    @Override
    public String getEmployeeName() {
        return ("hello "+ super.getEmployeeName());
    }
}
