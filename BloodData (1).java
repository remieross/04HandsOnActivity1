public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Static fields for valid blood types and Rh factors
    public static final String[] VALID_BLOOD_TYPES = {"O", "A", "B", "AB"};
    public static final String[] VALID_RH_FACTORS = {"+", "-"};

    // Default constructor
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    // Parameterized constructor
    public BloodData(String bloodType, String rhFactor) {
        setBloodType(bloodType);
        setRhFactor(rhFactor);
    }

    // Getter for bloodType
    public String getBloodType() {
        return bloodType;
    }

    // Setter for bloodType with validation
    public void setBloodType(String bloodType) {
        for (String validType : VALID_BLOOD_TYPES) {
            if (validType.equals(bloodType)) {
                this.bloodType = bloodType;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid blood type");
    }

    // Getter for rhFactor
    public String getRhFactor() {
        return rhFactor;
    }

    // Setter for rhFactor with validation
    public void setRhFactor(String rhFactor) {
        for (String validFactor : VALID_RH_FACTORS) {
            if (validFactor.equals(rhFactor)) {
                this.rhFactor = rhFactor;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid Rh factor");
    }

    // Method to display blood details (not required for this output)
    public void display() {
        System.out.println("Blood Type: " + bloodType + rhFactor);
    }
}
