package Hashing;

import java.util.Scanner;


public class LearnHashing2 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int [] hash = new int[25];
        for( int i =0; i< s.length() ; i++){
            hash[s.charAt(i)-'a'] += 1;
        }

        System.out.println("Enter integer: ");
        int q;
        q = sc.nextInt();
        sc.nextLine();
        while (q>0){
            q--;
            char c;
            c = sc.nextLine().charAt(0);
            System.out.println(hash[c-'a']);

        }
    }
}
