package SlidingWindow;

import java.util.HashSet;
//keeping in mind that each word is unique
public class HasAnagram {
    boolean hasAnagram(String word, String anagram){
        int n = word.length();
        int k = anagram.length();
        HashSet <Character> set1 = new HashSet<>();
        HashSet <Character> set2 = new HashSet<>();
        for(int i =0; i<k; i++){
            set1.add(word.charAt(i));
            set2.add(anagram.charAt(i));
        }
        if(set1.equals(set2)) return true;
        for(int i=0; i <n-k; i++){
            set1.remove(word.charAt(i));
            set1.add(word.charAt(i+k));
            if(set1.equals(set2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HasAnagram sub = new HasAnagram();
        String a = "greyhound";
        String b = "hoy";
        System.out.println(sub.hasAnagram(a,b));
    }
}
