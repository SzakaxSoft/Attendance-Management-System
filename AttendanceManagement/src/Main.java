import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        System.out.println("Attendance Management System");

        System.out.println("1) Teacher");
        System.out.println("2) Student");

        Scanner studentOrTeacher = new Scanner(System.in);
        System.out.print("Press 1 or 2: ");
        int num = studentOrTeacher.nextInt();

        if (num == 2) {
            Scanner name = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String studentName = name.nextLine();

            if (!studentName.contains(" ")) {
                System.out.println("Enter your REAL NAME or enter SPACE");
            } else {
                System.out.println("Welcome " + studentName);

                Scanner school = new Scanner(System.in);
                System.out.print("Enter your school fullname: ");
                String schoolName = school.nextLine();

                Scanner cnp = new Scanner(System.in);
                System.out.print("Enter your CNP number: ");
                String cnp1 = cnp.nextLine();

                if (cnp1.length() == 13) {
                    System.out.println("Your CNP is CORRECT");

                    Scanner grades = new Scanner(System.in);
                    System.out.print("Enter your Math Grade: ");
                    double mathNum = grades.nextDouble();

                    System.out.print("Enter your English Grade: ");
                    double englishGrade = grades.nextDouble();

                    System.out.print("Enter your History Grade: ");
                    double historyGrade = grades.nextDouble();

                    double gradesResult = (mathNum + englishGrade + historyGrade) / 3;
                    System.out.println("Your full grade is " + gradesResult);

                    if (gradesResult >= 6.00 && mathNum >= 5.00 && englishGrade >= 5.00 && historyGrade >= 5.00) {
                        System.out.println("You are accepted");
                    } else {
                        System.out.println("You are declined");
                    }

                    try {
                        FileWriter writer= new FileWriter("students.txt", true);
                        writer.write("Name: " + studentName + "\n");
                        writer.write("School: " + schoolName + "\n");
                        writer.write("CNP: " + cnp1 + "\n");
                        writer.write("Math: " + mathNum + ", Enlglish: " + englishGrade + ", History: " + historyGrade);
                        writer.write("Avarage: " + gradesResult + "\n");
                        writer.write("-----------------------------\n");
                        writer.close();
                        System.out.println("Student data saved to file");
                    } catch (IOException e) {
                        System.out.println("Erro data saved to file");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Your CNP is INVALID");
                }
            }
        }

        if (num == 1) {
            Scanner username = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username1 = username.nextLine();

            if (username1.contains("_")) {
                System.out.println("This name is INVALID");
            } else if (username1.contains(" ")) {
                System.out.println("This name is INVALID");
            } else {
                System.out.println("Welcome Mr/Mrs " + username1);

                Scanner password = new Scanner(System.in);
                System.out.print("Enter your password: ");
                String password1 = password.nextLine();

                if (password1 == "1234") {
                    System.out.println("The password is NOT CORRECT");
                } else {
                    System.out.println("The password is CORRECT");

                    System.out.println("See students here");
                    System.out.println("");
                    System.out.println("");

                    try {
                        File file = new File("students.txt");
                        Scanner reader = new Scanner(file);
                        while (reader.hasNextLine()) {
                            System.out.println(reader.nextLine());
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Erro reading from file");
                    }

                }
            }
        }
    }
}