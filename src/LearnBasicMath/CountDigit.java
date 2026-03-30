package LearnBasicMath;

public class CountDigit {
    int countDig(int x){
        int count = 0;
        while(x>0){
            int lastdig = x % 10;
            count++;
            x /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigit c = new CountDigit();
        int z = c.countDig(154);
        System.out.println(z);
    }
}
