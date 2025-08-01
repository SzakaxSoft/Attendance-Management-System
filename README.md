# Attendance-Management-System

Description
This is a simple console-based Java application that simulates an attendance management system. It allows two types of users:

Student: Inputs personal and academic data, which is saved to a text file

Teacher: Can view all submitted student records from the file

Features

Student

Enters full name (must include a space)

Enters school name

Enters a valid 13-digit CNP

Inputs grades for Math, English, and History

The system calculates the average grade

Displays whether the student is accepted or declined

Saves all data to a file called students.txt

Teacher

Enters a valid username (no underscores or spaces)

Enters a password (must be exactly 1234)

If credentials are correct, the teacher can:

View the list of all students by reading students.txt

How to Run

Open the project in any Java IDE (IntelliJ, Eclipse, VS Code, etc.)

Open Main.java

Run the main() method

Choose:

1 for Teacher

2 for Student

Follow the prompts

File Output Format (students.txt)

Name: Jane Smith
School: Central High School
CNP: 1234567890123
Math: 7.0, English: 6.5, History: 8.0
Average: 7.17
Error Handling

If the name doesn't contain a space, it is rejected

If the CNP is not 13 digits or contains non-numeric characters, it is rejected

File write or read errors are caught and displayed

Optional Future Features

Track accepted/declined ratio

Allow teachers to delete or search for a student

Password encryption for better security

Save data in a structured format (e.g. CSV or JSON)
