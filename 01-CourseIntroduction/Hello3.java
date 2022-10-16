import java.util.Scanner;

public class Hello3{
    public static void main(String[] args){
        String linia;
        Scanner wejscie = new Scanner(System.in);
        System.out.print("Napisz cos: ");
        linia = wejscie.nextLine();
        System.out.println("Napisales \""+linia+"\"");

        System.out.print("Teraz cos innego: ");
        linia = wejscie.nextLine();
        System.out.println("Napisales tez \""+linia+"\"");
    }
}