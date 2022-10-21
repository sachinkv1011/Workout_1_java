import java.util.Scanner;

public class VowelConsonantCheck {
    public void check(char var) {

        switch (var) {

            case 'A':
                System.out.println("vowel");
                break;

            case 'E':
                System.out.println("vowel");
                break;

            case 'I':
                System.out.println("vowel");
                break;

            case 'O':
                System.out.println("vowel");
                break;

            case 'U':
                System.out.println("vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character to check ");
            char ch = sc.next().charAt(0);
            ch=Character.toUpperCase(ch);
            VowelConsonantCheck ob = new VowelConsonantCheck();
            ob.check(ch);


        }

    }
