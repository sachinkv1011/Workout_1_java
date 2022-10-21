import java.util.Scanner;

public class DegreeToFarenheit {
    float faren,celsius;

    float converter(float faren)
    {
        return(faren-32)*5/9;
    }

    public static void main(String[] args) {
        DegreeToFarenheit ob=new DegreeToFarenheit();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in farenheit: ");
        ob.faren=sc.nextFloat();
        ob.celsius=ob.converter(ob.faren);
        System.out.println("Temperature in Degree : "+ob.celsius);

    }

}
