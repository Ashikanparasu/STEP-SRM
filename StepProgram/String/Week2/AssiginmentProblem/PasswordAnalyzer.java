import java.util.*;
public class PasswordAnalyzer {
    public static int[] analyze(String password) {
        int up=0,low=0,dig=0,spec=0;
        for(int i=0;i<password.length();i++) {
            char c=password.charAt(i);
            if(c>=65&&c<=90) up++;
            else if(c>=97&&c<=122) low++;
            else if(c>=48&&c<=57) dig++;
            else spec++;
        }
        return new int[]{up,low,dig,spec};
    }
    public static int calculateScore(String pwd,int[] counts) {
        int score=0;
        if(pwd.length()>8) score+=(pwd.length()-8)*2;
        for(int c:counts) if(c>0) score+=10;
        if(pwd.contains("123")||pwd.contains("abc")||pwd.contains("qwerty")) score-=10;
        return score;
    }
    public static String getStrength(int score) {
        if(score<=20) return "Weak";
        if(score<=50) return "Medium";
        return "Strong";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        System.out.printf("%-15s %-8s %-8s %-8s %-8s %-8s %-8s %-10s\n","Password","Len","Upper","Lower","Digit","Spec","Score","Strength");
        for(int i=0;i<n;i++) {
            String pwd=sc.nextLine();
            int[] counts=analyze(pwd);
            int score=calculateScore(pwd,counts);
            String strength=getStrength(score);
            System.out.printf("%-15s %-8d %-8d %-8d %-8d %-8d %-8d %-10s\n",pwd,pwd.length(),counts[0],counts[1],counts[2],counts[3],score,strength);
        }
    }
}