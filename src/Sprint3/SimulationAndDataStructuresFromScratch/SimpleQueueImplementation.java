package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueueImplementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        enqueue(1,list);
        enqueue(2,list);
        enqueue(3,list);
        System.out.println(list);
        System.out.println("front" + front(list));
        System.out.println("dequeue" + dequeue(list));
        System.out.println("de"+ list);
        System.out.println("empty"+ isEmpty(list));
        System.out.println("size"+ size(list));


    }

    public static void enqueue(int x, List<Integer> list){

        list.add(x);
    }

    public static int dequeue(List<Integer> list){

        if(list.size() == 0){
            System.out.println("Error: Queue empty");
            return 0;
        }
        int ele = list.get(0);
        list.remove(0);
        return ele;
    }

    public static int front(List<Integer> list){

        if(list.size() == 0){
            System.out.println("Error: Queue empty");
            return 0;
        }

        return  list.get(0);
    }

    public static boolean isEmpty(List<Integer> list){

        return  list.size() == 0 ? true : false;
    }

    public static int size(List<Integer> list){
        return list.size();
    }

}
