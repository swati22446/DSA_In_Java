package LearnBasicMath;

public class GCD {
    int findHCF(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b% a;
            }
        }
        if(a == 0) return b;
        else{
            return a;
        }
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int y =gcd.findHCF(14,49);
        System.out.println(y);
    }
}
