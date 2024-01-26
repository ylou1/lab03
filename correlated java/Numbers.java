public class Numbers{
    public static void main(String[] args){
        int x = 0;
        int sum = 0;
        int n = 100;
        for(int i = 1; i <= n; i++ ){
            sum = x + i;
            x = sum;

        }
        System.out.println(sum);
    }
}