import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

//* fuckad stat*//
public class Hangman {


    public static void guess(String ord, int life) {

        char[] filler = new char[ord.length()];
        int i = 0;
        while (i < ord.length()) {
            filler[i] = '-';
            if (ord.charAt(i) == ' ') {
                filler[i] = ' ';

            }
            i++;
        }
        System.out.print(filler);
        System.out.println("    Life remaining=" + life);

        Scanner s = new Scanner(System.in);

        ArrayList<Character> l=new ArrayList<Character>();
        while (life > 0) {
            char x = s.next().charAt(0);

            if (l.contains(x)){
                System.out.println("Already entered");
                continue;
            }
            l.add(x);

            if (ord.contains(x + "")) {
                for (int y = 0; y < ord.length(); y++) {
                    if (ord.charAt(y) == x) {
                        filler[y]=x;
                    }
                }
            }
            else{
                life--;
            }
            if (ord.equals(String.valueOf(filler))){
                System.out.print(filler);
                System.out.println("DU FUCKING VANN!");
                break;
            }

            System.out.print(filler);
            System.out.println("  Life remaining=" + life);
        }

        if(life==0){
            System.out.println("Häängd!Noob!");
        }
    }



    public static void main(String[] args) {
        String ord ="Rbuh";
        int life=6;
        guess(ord,life);

    }
}
