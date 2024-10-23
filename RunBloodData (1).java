import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bt = sc.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = sc.nextLine();

        BloodData bd;
        if (bt.equals("") && rh.equals("")) {
            bd = new BloodData();  // Default constructor (O+)
        } else {
            bd = new BloodData(bt, rh);  // Parameterized constructor
        }
        
        // Print output in the required format
        System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
    }
}
