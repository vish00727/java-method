import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DoWhileMethod {
    int Prime(int nums){
        int count=0;
        for(int i=2; i<=nums; i++){
            if(nums%i==0){
                count++;
            }
        }
        if (count==1){
            System.out.println("this is prime number ");
        }else {
            System.out.println("this is not prime number");
        }
        return 0;
    }

    int ArmS(int val){
        int Com=0;
        int r=0;
        int K=val;
        while (val>0){
            r=val%10;
            Com=r*r*r+Com;
            val=val/10;
        }
        if (K == Com) {
            System.out.println("it is ArmsStrong number");

        }else {
            System.out.println("it is not ArmStrong number");
        }
        return 0;
    }
    public static void main(String[] args)throws IOException {
        char O='y';
        do {
            System.out.println("enter the number for prime number");
            Scanner a=new Scanner(System.in);
            int S=a.nextInt();

            DoWhileMethod N=new DoWhileMethod();
            int Ans=N.Prime(S);

            System.out.println(" enter the number for ArmStrong");
            Scanner Arm=new Scanner(System.in);
            int c=Arm.nextInt();

            DoWhileMethod GG=new DoWhileMethod();
            int Aws=GG.ArmS(c);
            System.out.println("Do you want to countinue");
            Scanner ans1=new Scanner(System.in);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int LL= br.read();
            O=(char)LL;
            br.skip(1);

        }while (O=='y'||O=='Y');
    }
}
