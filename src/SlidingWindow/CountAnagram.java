package SlidingWindow;

import java.util.HashMap;

public class CountAnagram {
    int countAnagram(String word, String anagram){
        int n =  word.length();
        int k = anagram.length();
        int count = 0;
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<k ;i++){
            map1.put(word.charAt(i),map1.getOrDefault(word.charAt(i),0)+1);
            map2.put(anagram.charAt(i), map2.getOrDefault(anagram.charAt(i),0)+1);
        }
        if(map1.equals(map2)) count++;
        for(int i=0; i < n-k; i++){
            map1.remove(word.charAt(i));
            map1.put(word.charAt(i+k),map1.getOrDefault(word.charAt(i+k),0)+1);
            if(map1.equals(map2)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountAnagram sub = new CountAnagram();
        String a = "gattactat";
        String b = "att";
        System.out.println(sub.countAnagram(a,b));
    }
}
