import java.util.HashMap;

public class Training {
    int capacity;
    Training(int capacity){
        this.capacity = capacity;
        System.out.println("constructor is invoked ");
    }

    String trainingName;
    int trainingDuration;
    float trainingFee;
    String trainerName;
    HashMap<Integer, String> trainees = new HashMap<>();
    int count;



    void addTrainees(String trainee){

        if(maxTrainee()) {
            trainees.put(count, trainee);
            count++;
        }
        else
            System.out.println("no training Space");

    }

    void viewTrainees(){
        System.out.println(trainees);
    }


    boolean maxTrainee(){

        if(count >= capacity)
            return false;
        else
            return true;
    }



}
