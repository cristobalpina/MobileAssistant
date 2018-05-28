
public class Ackermann {
    public static int ack(int m, int n){
        if(n < 0 || m < 0){
            throw new IllegalArgumentException("m and n must be positive integers.");
        }
        
        if(m == 0){
            return n+1;
        }
        
        if(n == 0){
            return ack(m-1, 1);
        }
        return ack(m-1, ack(m, n-1));
    }
    public static void main(String[] args){
        int result = ack(3,8);
        System.out.println(result);
    }
}

