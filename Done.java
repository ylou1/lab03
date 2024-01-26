import java.util.Scanner;

public class test1 {
    public static void main (String [] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int i, j, n, l, max,startNum;
            n = 1;
            l = 1;
            max = 1;
            
            //input and scan i, j
            i = scnr.nextInt();
            j = scnr.nextInt();
            startNum = i;
            

            while(i < j){
                n = i;
                l = 1;
                while (n !=1){
                    n = (n % 2 == 0)? n / 2 : n * 3 + 1;
                    l += 1;
                    
                }
                if (max < l)
                    max = l;
                i += 1;
            }
            System.out.println(startNum + " " + j + " " + max);
        }
    }
}
        
