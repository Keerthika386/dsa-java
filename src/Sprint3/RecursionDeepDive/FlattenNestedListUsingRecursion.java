package Sprint3.RecursionDeepDive;

import java.util.ArrayList;
import java.util.List;

public class FlattenNestedListUsingRecursion {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(1);

        List<Object> inner1 = new ArrayList<>();
        inner1.add(2);

        List<Object> inner2 = new ArrayList<>();
        inner2.add(3);
        inner2.add(4);

        inner1.add(inner2);

        list.add(inner1);
        list.add(5);

        List<Integer> res = new ArrayList<>();

        flatten(list,res,0);
        System.out.println(list);
        System.out.println(res);
//        System.out.println(list.size());
//        System.out.println(res.size());
    }
    public static void flatten(List<Object> list,List<Integer> res,int index){

        if(index >= list.size()){
            return;
        }

        if (list.get(index) instanceof List) {
            List<Object> nested = (List<Object>) list.get(index);

            flatten(nested,res,0);
            flatten(list,res,index+1);

        } else {
            res.add((Integer) list.get(index));
            flatten(list,res,index+1);
        }


    }
}
