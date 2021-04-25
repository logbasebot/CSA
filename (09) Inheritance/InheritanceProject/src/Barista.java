public class Barista extends Employee {

    // ATTRIBUTES
    boolean doesLatteArt;
    boolean isCertifiedFoodSafe;

    // CONSTRUCTORS
    public Barista () {
        setHourlyRate(10.00);
    }

    public Barista (String name, int id) {
        super(name, id);
        setHourlyRate(10.00);

        doesLatteArt = false;
        isCertifiedFoodSafe = false;
    }

    // METHODS
    public String Category () {
        return "Barista";
    }

    public void Describe () {
        super.Describe();
        System.out.println("Latte Art:" + doesLatteArt +
                "\nCertified Food Safe:" + isCertifiedFoodSafe);
    }

    // ACCESSORS
    public boolean getDoesLatteArt() {
        return doesLatteArt;
    }

    public boolean getIsCertifiedFoodSafe() {
        return isCertifiedFoodSafe;
    }

    // MUTATORS
    public void setDoesLatteArt(boolean doesLatteArt) {
        this.doesLatteArt = doesLatteArt;
    }

    public void setCertifiedFoodSafe(boolean certifiedFoodSafe) {
        isCertifiedFoodSafe = certifiedFoodSafe;
    }

}
