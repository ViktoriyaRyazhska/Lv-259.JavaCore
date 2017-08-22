package regina.com;

public enum Breed {
    LABRADOR("labrador"),
    BOXER("boxer"),
    SPANIEL("spaniel");

    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
