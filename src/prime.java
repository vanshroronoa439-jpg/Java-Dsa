import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count =0;
        if(num == 1){
            System.out.println("Number is not prime");
        }
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}