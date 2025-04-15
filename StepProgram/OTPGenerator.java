public class OTPGenerator {

    public static void main(String[] args) {
        int[] otps = new int[10];
        boolean areOTPsUnique = true;

        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
            otps[i] = otp;
            System.out.println("Generated OTP #" + (i + 1) + ": " + otp);
        }

        areOTPsUnique = areUniqueOTPs(otps);

        if (areOTPsUnique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nThere are duplicate OTPs.");
        }
    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
