import java.util.*;
public class DSA_5_ArrayLists {

//    making our own dynamic array.
    static class DynamicArray{
        int size;
        int capacity = 10;
        Object[] array;

        public DynamicArray(){
            this.array = new Object[capacity];
        }
        public DynamicArray(int capacity){
            this.capacity = capacity;
            this.array = new Object[capacity];
        }

        public void add(Object data){
            if(size >= capacity){
                grow();
            }
            array[size] = data;
            size++;
        }
        public void insert(int index, Object data){
            if (size >= capacity) {
                grow();
            }
            for(int i = size; i >= index;i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
        }
        public void delete(Object data){
            for(int i = 0;i<size; i++){
                if(array[i] == data){
                    if(i == capacity){
                        size--;
                        if(size<= (int) (capacity/3)){
                            shrink();
                        }
                        return;
                    }else {
                        for (int j = i; j < size; j++) {
                            array[j] = array[j + 1];
                        }
                        size--;
                        if(size<= (int) (capacity/3)){
                            shrink();
                        }
                        return;
                    }
                }
            }
        }
        public int search(Object data){
            for(int i = 0;i<size;i++){
                if(array[i] == data){
                    return i;
                }
            }
            return -1;
        }
        private void grow(){
            int newcapacity = (int) capacity*2;
            Object[] newarray = new Object[newcapacity];

            for(int i = 0;i<size;i++){
                newarray[i] = array[i];
            }
            capacity = newcapacity;
            array = newarray;
        }
        private void shrink(){
            int newcapacity = (int) capacity/2;
            Object[] newarray = new Object[newcapacity];

            for(int i = 0;i<size;i++){
                newarray[i] = array[i];
            }
            capacity = newcapacity;
            array = newarray;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public String toString(){
            String string = "";

            for(int i = 0; i < size; i++){
                string += array[i] + ", ";
            }
            if(string != ""){
                string = "[" + string.substring(0, string.length() - 2) + "]";
            }else{
                string = "[]";
            }
            return string;
        }


    }

    public static void main(String[] args) {
        int[] array = new int[20];
//        this is a static array which is size immutable and takes same space even if no element is stored.
//        on the other hand a dynamic array has a mutable size.

//        a dynamic array uses different static arrays to store a set of values.
//        when the previous array is filled completely then the compiler defines a new array with increased size.
//        for java the growth factor is 1.5 times. i.e. the new array initialized will be 1.5 times the previous one.

//        Advantages of ArrayLists:
//              we can do random access in O(1) time;
//              Good locality of reference and data cache utilization.
//              Easy to insert and delete at the end.
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(1,"D");
        dynamicArray.delete("C");
        dynamicArray.add("X");
        dynamicArray.add("Y");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        dynamicArray.add("Z");
        System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray.capacity);

    }
}