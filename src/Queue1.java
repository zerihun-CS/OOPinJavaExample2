import java.util.Arrays;
import java.util.Queue;

public class Queue1 {
    int size;
    int[] storage;
    Queue1(int size){
        this.size = size;
        storage = new int[size];
    }

    int front = 0 ;
    int back;
    int index;
    int count = 0;



    void add(int value){
        this.storage[index] = value;
        count++;
        index  =  (index+1) % size;
        back = index;
        System.out.println("back value"+back);



    }


    void remove(){

        front = (front+1)% size;
        count--;
        System.out.println("front value"+ front);

    }

    void print(){
       int index=front;
       int count1 = 0;
       int[] newArray  = new int[count];
       while(count1< count){
            newArray[count1]  = storage[index];


            index = (index+1) % size;
            count1++;
        }
        System.out.println(Arrays.toString(newArray));

    }

}

