import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        String var=sc.nextLine();
        int flag=0;
        int len=var.length();
        for(int i=0;i<len/2;i++)
        {
            if(var.charAt(i)!=var.charAt(len-1-i))
            {
                System.out.println("Not");
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("yes");
        }
    }
}
