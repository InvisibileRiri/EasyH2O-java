package nl.wouterdebruijn.EasyH2O;

public class Main {
    /**
     * Main function, creates the Dashboard instance and draws the JFrame.
     */
    public static void main(String[] args) {
        System.out.println("Program started!");

        Dashboard dashboard = new Dashboard();
        dashboard.createAndShow();
    }
}
