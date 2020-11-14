public class CombinationLock {

    // ATTRIBUTES
    private int num1, num2, num3;
    private boolean isLocked;

    // CONSTRUCTOR
    public CombinationLock () {
        isLocked = true;

        num1 = 0;
        num2 = 0;
        num3 = 0;
    }

    // CUSTOM CONSTRUCTOR
    public CombinationLock (int cNum1, int cNum2, int cNum3) {
	isLocked = true;

        num1 = CheckRange(cNum1);
        num2 = CheckRange(cNum2);
        num3 = CheckRange(cNum3);
    }

    // LOCK METHOD
    public void Lock () {
        if (!isLocked) {
            isLocked = true;
            System.out.println("Locked: " + isLocked);
        }
        else {
            System.out.println("Already locked!");
        }

    }

    // UNLOCK METHOD
    public void Unlock (int iNum1, int iNum2, int iNum3) {
        if (isLocked) {
            isLocked = (iNum1 != num1 && iNum2 != num2 && iNum3 != num3); // VERIFY THAT IT IS LOCKED
            System.out.println("Locked: " + isLocked);
        }
        else {
            System.out.println("Already unlocked!"); // DO NOT UNLOCK IF ALREADY UNLOCKED
        }

    }

    // RETURN STATUS (LOCKED/UNLOCKED)
    public boolean GetState () {
        System.out.println("Locked: " + isLocked);
        return isLocked; 
    }

    // RESET THE COMBO
    public void ResetCombination (int old1, int old2, int old3, int new1, int new2, int new3) {
	    // OLD COMBO MATCHES, ALREADY UNLOCKED
        if (old1 == num1 && old2 == num2 && old3 == num3 && !isLocked) { 
            num1 = CheckRange(new1);
            num2 = CheckRange(new2);
            num3 = CheckRange(new3);

            System.out.println("Combination reset!");
        }
	    // NOT ALREADY UNLOCKED
        else if (isLocked) {
            System.out.println("You must unlock it first!");
        }
	    // OLD COMBO WRONG
        else {
            System.out.println("Wrong combination!");
        }

    }

    // COMBO NUMBERS SHOULD BE IN [0,31] RANGE
    private int CheckRange (int n) {
        if (n >= 0 && n <= 31) {
            return n;
        }
        else {
            System.out.println("Warning: Number(s) out of the [0, 31] range set to 0");
            return 0;
        }
    }

}