import java.util.Arrays;

public class ArrayOne {
    String[] storage;
    int index;
    public ArrayOne() {

        storage = new String[5];
    }
    void put(String value){

        if(storage.length == (index)){
            String newArray[]= new String[storage.length];
            System.arraycopy(storage,0,newArray,0,(index));
            storage = new String[(newArray.length*2)];
            System.arraycopy(newArray,0,storage,0,(index));
        }
            storage[index] = value;
            index++;
    }
    void update(int index, String value){

        storage[index] = value;

    }
    void remove(int index){
        storage[index] = null;
        for (int i = index; i < storage.length; i++) {
            if(storage[index+1] != null)storage[index] = storage[index+1];
        }
    }
    void print(){
        System.out.println(Arrays.toString(storage));
    }

    // indexOf
    // size;
    // duplicate
    // valueOf






}
