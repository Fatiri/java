import java.util.Scanner;

public class main{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String reverse = "";
        Boolean logic = false;
        for (int i = input.length() - 1; i>-1; i--) {
                reverse = reverse + input.charAt(i);
                if(input.equals(reverse)){
                    logic = true;
                }
            }
        System.out.println(reverse);
        System.out.println(logic);
        }
    }
