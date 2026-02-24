import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
int sum = 0;

for (int i = 0; i < n; i++) {
    sum += marks[i];
}

double average = (double) sum / n;

System.out.println("Average Marks: " + average);
        int highest = marks[0];
String topper = names[0];

for (int i = 1; i < n; i++) {
    if (marks[i] > highest) {
        highest = marks[i];
        topper = names[i];
    }
}

System.out.println("Highest Scoring Student: " + topper + " (" + highest + ")");
        sc.close();
    }
}
