
public class main {

    public static void main (String[] args) {

        int age = 17;
        boolean hasPermit = true;
        double examScore = 72.5;
        boolean passedEyeExam = true;
        boolean paidFee = false;
        boolean goodStudent = true;

        // ARE YOU 16?
        if (age >= 16) {

            // DO YOU HAVE A PERMIT?
            if (hasPermit) {

                // DID YOU PASS THE EXAM?
                if (examScore >= 70) {

                    // DID YOU PASS THE EYE EXAM?
                    if (passedEyeExam) {

                        // DID YOU PAY THE FEE?
                        if (paidFee) {
                            System.out.println("You can get a driver's license!");
                        } // LICENSE OBTAINED!

                        else if (goodStudent) {
                            System.out.println("You can get a driver's license, good student!");
                        }

                        else {
                            System.out.println("You must first pay the fee.");
                        }

                    }

                    else {
                        System.out.println("You must pass your eye exam.");
                    }

                }

                else {
                    System.out.println("You must get at least a 70 on your test.");
                }

            }

            else {
                System.out.println("You must have your permit for a year.");
            }

        }

        else {
            System.out.println("You are not old enough for a driver's license.");
        }

    }

}