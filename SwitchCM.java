import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchCM {
    int PrimeNo(int x ){
        int count=0;
        for(int i=2; i<=x; i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("it is Prime number");
        }else {
            System.out.println("it is not prime number");
        }
        return 0;
    }

    int Rev(int D){
        int Dim=D;
        int AS=0;
        while (D>0){
            AS=D%10;
            D=D/10;
            System.out.print(AS);

        }

        return 0 ;
    }

    int ArmStrong(int Re){
        int r=0;
        int Ar=0;
        int c=Re;
        while (Re>0){
            r=Re%10;
            Ar=(r*r*r)+Ar;
            Re=Re/10;
        }
        if (Ar==c){
            System.out.println("it is ArmStrong number");
        }else {
            System.out.println("it is not the armstrong");
        }
        return 0;
    }

    int Str(int[] arr1){

        for(int i=0; i<arr1.length; i++){
            System.out.println(i);
        }
        return 0;
    }

    public static void main(String[] args)throws IOException {
        char T = 'c';

        do {
            System.out.println("enter the case number");
            Scanner Sc = new Scanner(System.in);
            int ch = Sc.nextInt();

            switch (ch) {
                case (1):
                    System.out.println("enter the number prime number");
                    Scanner R = new Scanner(System.in);
                    int Y = R.nextInt();
                    SwitchCM TT = new SwitchCM();
                    int ans = TT.PrimeNo(Y);
                    System.out.println();
                    break;

                case (2):
                    System.out.println("enter the number for revsre number");
                    Scanner K = new Scanner(System.in);
                    int Ham = K.nextInt();
                    SwitchCM Hi = new SwitchCM();
                    int ans1 = Hi.Rev(Ham);
                    System.out.println();
                    break;

                case (3):
                    System.out.println("enter the number for armStrong number");
                    Scanner Bg = new Scanner(System.in);
                    int DD = Bg.nextInt();
                    SwitchCM ne = new SwitchCM();
                    int ans2 = ne.ArmStrong(DD);
                    break;
                case (4):
                    BufferedReader Hw = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("enter the Array");
                    int arr = Integer.parseInt(Hw.readLine());
                    int[] arr1 = new int[arr];
                    SwitchCM Fr = new SwitchCM();
                    int RX = Fr.Str(arr1);
                    for (int i = 1; i <= arr; i++) {
                        arr1[i] = Integer.parseInt(Hw.readLine());
                        break;
                    }


            }


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("do you want to continue");
            int LL = br.read();
            T = (char) LL;
            br.skip(1);
        }
        while(T=='c');
    }
}
