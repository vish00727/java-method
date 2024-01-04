import java.util.Scanner;

public class ArmStrongNum {
    int Arms(int nums){
        int r=0;
        int A=0;
        int B=nums;
        while (nums>0){
            r=nums%10;
            A=(r*r*r)+A;
            nums=nums/10;
        }
        if (B==A){
            System.out.println("it is ArmsStrong number");
        }
        else{
            System.out.println("it is not armStrong Number");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        ArmStrongNum obj1=new ArmStrongNum();
        int number=obj1.Arms(n);
}
}

