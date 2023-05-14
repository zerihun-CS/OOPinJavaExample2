import java.util.Arrays;

public class CarParkingLoot {
    int parkingCapacity;
    String [] vehicleList;
    String CarParkingName;
    String closingTime;
    String openingTime;
    float ratePerHour;
    int vehicleCount;

    public CarParkingLoot(int parkingCapacity) {

        this.parkingCapacity = parkingCapacity;

           vehicleList = new String[parkingCapacity];
    }
    void vehicleRegister(String plateNumber){

        if(this.availableSpace() > 0 ) {
            vehicleList[vehicleCount] = plateNumber;
            vehicleCount++;
        }
        else System.out.println("loot is Full ");
    }
    void vehicleListView(){

        System.out.println(Arrays.toString(vehicleList));
    }
    int availableSpace(){
        return (parkingCapacity - vehicleCount);
    }





}
