// Fig. 7.16: GradeBook.java
// GradeBook class using a two-dimensional array to store grades.
class GradeBook {
    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades

    // Constructor initializes courseName and grades array
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // Method to set the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }

    // Perform various operations on the data
    public void processGrades() {
        // Output grades array
        outputGrades();

        // Call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // Output grade distribution chart of all grades on all tests
        outputBarChart();
    }

    // Find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0][0]; // Assume first element is smallest

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    // Find maximum grade
    public int getMaximum() {
        int highGrade = grades[0][0]; // Assume first element is largest

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    // Determine average grade for particular set of grades
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }

    // Output bar chart displaying overall grade distribution
    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        int[] frequency = new int[11]; // Stores frequency of grades

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        for (int count = 0; count < frequency.length; count++) {
            // Output bar label
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Output the contents of the grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("          "); // Align column heads

        // Create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average"); // Student average column heading

        // Create rows/columns representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }

            // Call method getAverage to calculate student's average grade
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}

// Fig. 7.17: GradeBookTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array
// of grades, then invokes method processGrades to analyze them.

public class ch7_15 {
    // Main method begins program execution
    public static void main(String[] args) {
        // Two-dimensional array of student grades
        int[][] gradesArray = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}
        };

        // Create GradeBook object
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);

        // Display welcome message
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook.getCourseName());

        // Process grades
        myGradeBook.processGrades();
    }
}
