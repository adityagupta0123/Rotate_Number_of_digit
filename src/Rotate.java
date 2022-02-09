import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int count =0;
        while(temp>0){
            temp /= 10;
             count++;
        }
        k = k % count;
        if(k < 0)
           k = k + count;

        int mul =1;
        int div =1;
        for(int i=1; i<=count; i++){
            if(i <= k)
                div = div *10;
            else
                mul = mul *10;
        }
        int q = n / div;
        int r = n % div;

        int res = mul * r + q;
        System.out.println(res);
    }
}
