package Hashing;

import java.util.*;


public class HashingUsingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [] a = new int [n];
        for(int i =0; i< n; i++){
            a[i]= sc.nextInt();
        }
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i =0; i< n; i++){
            mpp.put(a[i],mpp.getOrDefault(a[i] , 0) + 1);
        }
        List<List<Integer>> l = new ArrayList<>();
//        int q = sc.nextInt();
//        sc.nextLine();
//        while(q-- >0){
//            int num =sc.nextInt();
//            System.out.println(mpp.getOrDefault(num,0));
//        }
        for( Map.Entry<Integer , Integer> e : mpp.entrySet()){
            l.add(Arrays.asList(e.getKey(), e.getValue()));
        }

        System.out.println(l);
    }

}
