import java.util.Scanner;


public class PerfectSquare {

    static void perfect(int start,int limit){
        for(int i=start;i<=limit;i++){
            int sum=0;
            for(int j=1;j<=i;j+=2){
                sum+=j;
                if(i==sum){
                    System.out.print(i +" ");

                }

            }

        }
    }


    public static void main(String[] args) {
        int start,limit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start point");
        start=sc.nextInt();
        System.out.println("Enter limit ");
        limit=sc.nextInt();
        System.out.println("Perfect square between "+start+" and "+limit+ " are");
        perfect(start,limit);

    }
}
