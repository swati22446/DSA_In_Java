package Hashing;
import java.util.*;


public class CountingElements {
    public List<List<Integer>> CountEle(int[] num){
        Map<Integer , Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int e : num){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer , Integer> iterator : map.entrySet()){
            list.add(Arrays.asList(iterator.getKey() , iterator.getValue()));
        }

        return list;
    }

    public static void main(String[] args) {
        int [] n = {1, 2, 2, 3, 3, 3, 4};
        CountingElements count = new CountingElements();
        List<List<Integer>> l = count.CountEle(n);
        System.out.println(l);
    }
}
