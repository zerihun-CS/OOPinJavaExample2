public class OOPMethod {

    public static void main(String[] args) {



        FullTimeEmployee obj1 = new FullTimeEmployee();
        obj1.setEmployeeName("abel");
        obj1.setPaymentPerHour(200);
        System.out.println(obj1.calculateSalary());

        System.out.println(obj1.getEmployeeName());


        ContractEmployee obj2 = new ContractEmployee();

        obj2.setEmployeeName("hanna");
        obj2.workingHour = 5;
        obj2.setPaymentPerHour(400);


        System.out.println(obj2.calculateSalary());



    }
}
