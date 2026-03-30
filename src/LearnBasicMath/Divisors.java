package LearnBasicMath;
import java.lang.Math;

public class Divisors {
    void returnDivisors(int n){
        int x = (int) Math.sqrt(n);
        for(int i =1; i < x ; i++){
            if( n % i == 0){
                System.out.print(i+" ");
                if((n/i)!= i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Divisors div = new Divisors();
        div.returnDivisors(54);
    }
}
