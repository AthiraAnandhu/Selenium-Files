package JavaProgramsProblems;

public class MainoSeq1379111315 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15;i+=2 ) {
            // Skip the number "5"
            if (i != 5) {
                System.out.print(i);

                // Check if it's the last number
                if (i != 15) {
                    System.out.print(" , ");
                }
            }
            if (i > 15) {
                break;
            }
        }
    }
}