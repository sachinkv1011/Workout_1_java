public class Fibonocci {
    static int fib(int n){
        if (n==0)
           return 0;
        if(n==1 || n==2)
           return 1;

        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
