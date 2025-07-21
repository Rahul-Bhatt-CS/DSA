import java.util.*;
public class DSA_6_Recursion {
    public static void main(String[] args) {
        walk(5);
    }
    private static void walk(int steps){
        if(steps < 1) return;
        System.out.println("you have walked " + steps + "steps.");
        walk(steps-1);
    }
}