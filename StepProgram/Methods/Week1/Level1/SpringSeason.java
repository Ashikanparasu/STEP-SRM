public class SpringSeason {
    
    public static boolean isSpringSeason(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        }
        if (month == 3) {
            return day >= 20;
        }
        if (month == 6) {
            return day <= 20;
        }
        return true;
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }
        
        int month = 0;
        for (int i = 0; i < args[0].length(); i++) {
            month = month * 10 + (args[0].charAt(i) - '0');
        }
        
        int day = 0;
        for (int i = 0; i < args[1].length(); i++) {
            day = day * 10 + (args[1].charAt(i) - '0');
        }
        
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
