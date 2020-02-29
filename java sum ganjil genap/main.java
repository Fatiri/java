import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sumGanjil = 0;
        int sumGenap = 0;

        for(int i =1; i<=a; i++){
            if(i%2==0){
                sumGenap += i;
            }else{
                sumGanjil += i;
            }
        }
        System.out.println(sumGenap);
        System.out.println(sumGanjil);
    }
}