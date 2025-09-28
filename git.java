public class gg {
    public static void main(String[] args) {
        int[][] scores = {
            {20, 60, 90},
            {10, 100, 100},
            {30, 75, 50},
            {80, 30, 10} 
        };                                // initiaize the score array 

        String[] studentNames = {"Alice", "Bob", "Charlie", "Nora"};  
        // initializing 1D array which can be expressedas 2D array 1:n column. This one will go with system.out.println
        
        String[] subjects = {"Math", "Science", "English"}; //  initializing the 1D array. This one will go with System.out.print 

        String[][] results = new String[scores.length][scores[0].length];
        int pass = 0;
        int fail = 0;

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                if (scores[row][col] > 50) {
                    results[row][col] = "pass";
                    pass++;
                } else {
                    results[row][col] = "fail";
                    fail++;
                }
            }
        }

        // --- Print Table Header ---
        System.out.printf("%-10s", "Student"); // left-align with width 10
        for (String subject : subjects) {
            System.out.printf("%-10s", subject);
        }
        System.out.println();

        // --- Print Table Rows ---
        for (int row = 0; row < results.length; row++) {
            System.out.printf("%-10s", studentNames[row]); // student name column
            for (int col = 0; col < results[row].length; col++) {
                System.out.printf("%-10s", results[row][col]); // each result column
            }
            System.out.println();
        }

        // --- Print Summary ---
        System.out.println("\nTotal Pass: " + pass);
        System.out.println("Total Fail: " + fail);

        double decimal = (double) pass / (pass + fail);  // type casting from  integer to double is made here . 
        double passPercent = decimal * 100;
        System.out.printf("Pass Percentage: %.2f%%\n", passPercent);
    }

}
