public class Power {
    public static double power(double x, int n){
        if(n == 1){
            return x;
        }
        return x * power(x, n-1);
        
    }
    public static void main(String[] args){
        double result = power(5, 4);
        System.out.println(result);
    }
}

