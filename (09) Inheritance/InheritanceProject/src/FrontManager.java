public class FrontManager extends Barista {

    // ATTRIBUTES
    private boolean isTrainer;

    // CONSTRUCTOR
    public FrontManager () {
        setHourlyRate(15.00);
    }

    public FrontManager (String name, int id) {
        super(name, id);
        setHourlyRate(15.00);

        doesLatteArt = true;
        isCertifiedFoodSafe = true;
        isTrainer = false;
    }

    // METHODS
    public String Category () {
        return "Front-of-House Manager";
    }

    public void Describe () {
        super.Describe();
        System.out.println("Trainer: " + isTrainer);
    }

    // ACCESSOR
    public boolean isTrainer() {
        return isTrainer;
    }

    // MUTATOR
    public void setTrainer(boolean trainer) {
        isTrainer = trainer;
    }


}
