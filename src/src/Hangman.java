package src;

public class Hangman {
    public static void guess(String ord, int life)  {
        char[] filler= new char[ord.length()];
        int i=0;
        while (i<ord.length()){
            filler[i]='-';
        }
    }
    public static void main(String[] args) {
        String ord ="Rbuh";
        int life=6;
        guess(ord,life);


    }
}
