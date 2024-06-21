package JavaProgramsProblems;

public class Main1379111315 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i += 2) {
            // Skip the number "5"
            if (i == 5) {
                continue;
            }

            System.out.print(i);

            // Terminate the loop on "15"
            if (i == 15) {
                break;
            }

            System.out.print(", ");
        }
    }
}