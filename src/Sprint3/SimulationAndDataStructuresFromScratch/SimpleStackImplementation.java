package Sprint3.SimulationAndDataStructuresFromScratch;

import java.util.ArrayList;
import java.util.List;

public class SimpleStackImplementation {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        push(1,list);
//        push(2,list);
//        System.out.println("Push" + list);
//
//        System.out.println("peek" +  peek(list));
//        System.out.println("pop" +  pop(list));
//        System.out.println("Pop" + list);
//        System.out.println("pop" +  pop(list));
//        System.out.println("Pop" + list);
//        System.out.println("isempty" +  isEmpty(list));
//        System.out.println("size" +  size(list));
//
//        System.out.println("pop" +  pop(list));
//        System.out.println("Pop" + list);

        push(1,list);
        push(2,list);
        push(3,list);

        System.out.println("Push" + list);

        System.out.println("pop" +  pop(list));
        System.out.println("pop" +  pop(list));
        System.out.println("pop" +  pop(list));

        System.out.println("Pop" + list);




    }
    public static void push(int x,List<Integer> list){

        list.add(x);
    }

    public static int pop(List<Integer> list){

        if(list.size() == 0){
            System.out.println("Error: Stack underflow");
            return 0;
        }
        int ele = list.get(list.size()-1);
        list.remove(list.size()-1);
        return ele;
    }

    public static int peek(List<Integer> list){

        if(list.size() == 0){
            System.out.println("Error: Stack underflow");
            return 0;
        }

        return  list.get(list.size()-1);
    }

    public static boolean isEmpty(List<Integer> list){

        return  list.size() == 0 ? true : false;
    }

    public static int size(List<Integer> list){
        return list.size();
    }


}
