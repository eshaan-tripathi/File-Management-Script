
Here's a detailed and professional README.md for your FileSeparator project:

File Separator
A File Separator utility built in Java that helps organize files in a specified directory into categorized subfolders based on their extensions. This project demonstrates the use of Java I/O operations, directory management, and user interaction via the console.

Features
Automatic File Categorization:
Organizes files into subfolders like PDF, IMAGE, DOCUMENT, TEXT, and VIDEO based on file extensions.

Dynamic Directory Input:
Accepts the directory path from the user via the console, making it flexible for any folder structure.

Folder Creation:
Automatically creates subfolders (PDF, IMAGE, DOCUMENT, etc.) if they do not exist.

File Relocation:
Moves files to the respective subfolders, ensuring a clean and organized directory structure.

Support for Multiple File Types:
Handles popular file extensions such as .pdf, .docx, .jpg, .txt, .mp4, and .mkv.

Error Handling:
Gracefully handles cases like invalid directory paths or missing permissions.

Technologies Used
Language: Java
Java Features Used: File I/O, Scanner, Loops, and Switch Case Statements.
How to Use
Prerequisites
Ensure you have Java JDK 8+ installed on your system.
Set up the JAVA_HOME and add bin to your system's PATH.
Steps to Run
Clone or download the repository.
Navigate to the directory containing the FileSeparator.java file.
Compile the Java file:
bash
Copy code
javac JAVA/Project/FileSeparator.java
Run the program:
bash
Copy code
java JAVA.Project.FileSeparator
Enter the full directory path when prompted. Example:
mathematica
Copy code
Enter Directory Path: C:\Users\YourName\Downloads
The program will organize the files in the specified directory into the following subfolders:
PDF
IMAGE
DOCUMENT
TEXT
VIDEO
Example Output
Input:
mathematica
Copy code
Enter Directory Path: C:\Users\YourName\Documents\TestFolder
Output:
css
Copy code
PDF DONE
IMAGE DONE
DOCX DONE
TXT DONE
VIDEO DONE
Folder Structure After Execution:
css
Copy code
TestFolder
│
├── PDF
│   ├── example1.pdf
│   └── example2.pdf
│
├── IMAGE
│   └── picture.jpg
│
├── DOCUMENT
│   └── file.docx
│
├── TEXT
│   └── notes.txt
│
└── VIDEO
    ├── video1.mp4
    └── video2.mkv
