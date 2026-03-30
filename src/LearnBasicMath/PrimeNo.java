package LearnBasicMath;

public class PrimeNo {
    void checkPrime(int n){
        int count =0;
        for(int i = 1; i*i < n; i++){
            if(n % i == 0){
               count++;
               if((n/i) != i){
                    count++;
                }
            }
        }
        if(count == 2) System.out.println("Prime");
        else{
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        PrimeNo pri = new PrimeNo();
        pri.checkPrime(13);
    }
}
