package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("Hello Guys");

        try{
            int result = 5/0;

            System.out.println(a[7]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Solve hogya bhau");
        } catch (ArithmeticException e) {
            System.out.println("Ye bhi");
        }
    }
}
