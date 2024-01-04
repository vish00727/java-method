import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodOfpromenum {
    int Prime (int nums ){

        int count=0;
        for(int i=2; i<=nums; i++){
            if(nums%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("it is prime number");
        }else {
            System.out.println("it is not prime number");
        }
        return 0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int a=Integer.parseInt(br.readLine());
        MethodOfpromenum obj1=new MethodOfpromenum();
        int num=obj1.Prime(a);
        System.out.println(num);

    }


}
