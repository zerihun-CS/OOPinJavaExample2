import java.time.Year;
import java.time.YearMonth;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

//
//        Student abelOj = new Student();
//
//
//        abelOj.studentID = 345;
//        abelOj.studentName = "Abel Kebede";
//        abelOj.studentDepartment  = "COMP";
//
//        Student senilOj = new Student();
//        senilOj.studentID = 350;
//        senilOj.studentName = "seni tariku";
//        senilOj.studentDepartment  = "COMP";
//
//
//
////
//
//        Flight objEt = new Flight(4, "ETSU");
//        objEt.flightCode = "ET01";
//        objEt.flightOrigin = "Ethiopia/Addis Abeba";
//        objEt.flightDestination ="Sudan / Khartoum";
//
//        objEt.addPassenger("zerihun kebede");
//        objEt.addPassenger("Hailu kebede");
//        objEt.addPassenger("yakob kebede");
//        objEt.addPassenger("asede kebede");
//        objEt.addPassenger("yishak kebede");
//
//
//        objEt.viewPassenger();
//
//        Flight objETDU = new Flight(2,"ET02");
//        objETDU.flightOrigin = "Ethiopia/Addis Abeba";
//        objETDU.flightDestination ="UAE / Dubai";
//
//        objETDU.addPassenger("abel kebede");
//
//        objETDU.viewPassenger();
//
//
//
//
//        Training javaObj = new Training(23);
//
//        javaObj.trainerName = "Hailu";
//        javaObj.trainingDuration = 40;
//        javaObj.trainingFee  = 15_000;
//
//
//
//        javaObj.addTrainees("abel kebede ");
//        javaObj.addTrainees("kebron kebede ");
//        javaObj.addTrainees("samri kebede ");
//        javaObj.addTrainees("biruk kebede ");
//        javaObj.addTrainees("yakob kebede ");
//        javaObj.addTrainees("Hanna kebede ");
//
//        javaObj.viewTrainees();
//


//
//
//        CarParkingLoot obj1 = new CarParkingLoot(5);
//        obj1.CarParkingName ="Megnagha";
//
//        obj1.closingTime = "11:00";
//        obj1.openingTime = "2:00";
//        obj1.ratePerHour = 45;
//
//
//        obj1.vehicleRegister("B456789");
//        obj1.vehicleRegister("B256783");
//        obj1.vehicleRegister("B156786");
//        obj1.vehicleRegister("B356787");
//        obj1.vehicleRegister("B256788");
//
//
//        obj1.vehicleListView();
//
//
//
//
//
//        CarParkingLoot obj2 = new CarParkingLoot(7);
//        obj2.CarParkingName ="Kassanches";
//
//        obj2.closingTime = "11:00";
//        obj2.openingTime = "2:00";
//        obj2.ratePerHour = 60;
//
//
//
//
//
//        ArrayOne studentList = new ArrayOne();
//
//        studentList.put("hanna");
//        studentList.put("abel");
//        studentList.put("kebede");
//        studentList.put("mena");
//        studentList.put("yakob");
//        studentList.put("maki");
//
//        studentList.remove(2);


//        LinkedList1  numbers = new LinkedList1();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(8);
//
//        System.out.println(Arrays.toString(numbers.toArray()));


        Queue1 busNumber = new Queue1(5);

        busNumber.add(11);
        busNumber.add(22);
        busNumber.add(33);
        busNumber.add(44);
        busNumber.remove();
        busNumber.remove();
        busNumber.remove();
        busNumber.add(55);
        busNumber.add(66);
        busNumber.add(77);
        busNumber.remove();
        busNumber.add(88);
        busNumber.add(99);


        busNumber.print();





    }



}