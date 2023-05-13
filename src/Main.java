public class Main {
    public static void main(String[] args) {


        Student abelOj = new Student();


        abelOj.studentID = 345;
        abelOj.studentName = "Abel Kebede";
        abelOj.studentDepartment  = "COMP";

        Student senilOj = new Student();
        senilOj.studentID = 350;
        senilOj.studentName = "seni tariku";
        senilOj.studentDepartment  = "COMP";





        Flight objEt = new Flight(4, "ETSU");
        objEt.flightCode = "ET01";
        objEt.flightOrigin = "Ethiopia/Addis Abeba";
        objEt.flightDestination ="Sudan / Khartoum";

        objEt.addPassenger("zerihun kebede");
        objEt.addPassenger("Hailu kebede");
        objEt.addPassenger("yakob kebede");
        objEt.addPassenger("asede kebede");
        objEt.addPassenger("yishak kebede");


        objEt.viewPassenger();

        Flight objETDU = new Flight(2,"ET02");
        objETDU.flightOrigin = "Ethiopia/Addis Abeba";
        objETDU.flightDestination ="UAE / Dubai";

        objETDU.addPassenger("abel kebede");

        objETDU.viewPassenger();




        Training javaObj = new Training(23);

        javaObj.trainerName = "Hailu";
        javaObj.trainingDuration = 40;
        javaObj.trainingFee  = 15_000;



        javaObj.addTrainees("abel kebede ");
        javaObj.addTrainees("kebron kebede ");
        javaObj.addTrainees("samri kebede ");
        javaObj.addTrainees("biruk kebede ");
        javaObj.addTrainees("yakob kebede ");
        javaObj.addTrainees("Hanna kebede ");

        javaObj.viewTrainees();








    }
}