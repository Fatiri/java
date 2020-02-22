 public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="" ;
        for (int i = A.length() - 1; i>-1; i--) {
            reverse = reverse + A.charAt(i);
        }

        if (!(reverse==reverse)){
          System.out.println("Yes");
        }else if(reverse.equals(A)){
          System.out.println("Yes");
        }
        else if(A!=reverse){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }
       
        /* Enter your code here. Print output to STDOUT. */
    }
