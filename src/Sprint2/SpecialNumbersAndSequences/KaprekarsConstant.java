package Sprint2.SpecialNumbersAndSequences;


import java.util.*;

public class KaprekarsConstant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(n != 6174){
            int desc = descending(n);
            int asc = ascending(n);
            n = desc - asc;
            cnt++;
        }

//        int desc = descending(n);
//        int asc = ascending(n);
//        System.out.println("desc" + desc);
//        System.out.println("asc" + asc);
        System.out.println("cnt" + cnt);

    }
    public static int descending(int n){

        List<Integer> list = new ArrayList<>();
        int count  = 0;
        while(count < 4){

            int digit = n % 10;
            list.add(digit);
            n /=10;
            count++;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size()-1;i++){
            int max = i;
            for(int j=i+1;j<list.size();j++){

                if(list.get(j) > list.get(max)){
                    max = j;
                }
            }
            int temp = list.get(i);
            list.set(i,list.get(max));
            list.set(max,temp);
        }
        int finaln = 0;
        for(int i=0;i<list.size();i++){
            finaln  =  (finaln * 10) + list.get(i);
        }

        return finaln;
    }

    public static int ascending(int n){

        List<Integer> list = new ArrayList<>();
        int count  = 0;
        while(count < 4){

            int digit = n % 10;
            list.add(digit);
            n /=10;
            count++;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size()-1;i++){
            int min = i;
            for(int j=i+1;j<list.size();j++){

                if(list.get(j) < list.get(min)){
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i,list.get(min));
            list.set(min,temp);
        }
        int finaln = 0;
        for(int i=0;i<list.size();i++){
            finaln  =  (finaln * 10) + list.get(i);
        }

        return finaln;
    }
}
