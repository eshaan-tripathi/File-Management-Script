##File Separator 🚀
A simple and efficient Java utility to organize files in a directory into categorized subfolders based on their extensions. This tool helps keep your folders clean and organized, demonstrating Java's file-handling capabilities.

✨ Features
Automatic File Organization:
Files are moved into subfolders like PDF, IMAGE, DOCUMENT, TEXT, and VIDEO based on their extensions.

Dynamic Input:
Accepts the directory path from the user at runtime, making it flexible to use with any folder.

Automatic Folder Creation:
Subfolders (PDF, IMAGE, etc.) are created if they don’t already exist.

File Relocation:
Moves files to appropriate subfolders for a cleaner structure.

Supported Extensions:
Handles popular formats including .pdf, .docx, .jpg, .txt, .mp4, and .mkv.

🛠️ Technologies Used
Language: Java
Java Features: File I/O, Directory Management, and User Input Handling.
🚀 Getting Started
Prerequisites
Java Development Kit (JDK 8+).
Set up the JAVA_HOME environment variable and ensure the bin directory is added to your system's PATH.
Installation & Usage
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/FileSeparator.git
cd FileSeparator
Compile the Code:

bash
Copy code
javac JAVA/Project/FileSeparator.java
Run the Application:

bash
Copy code
java JAVA.Project.FileSeparator
Follow the Prompt: Enter the full path of the directory to organize. Example:

mathematica
Copy code
Enter Directory Path: C:\Users\YourName\Downloads
🖼️ Example Output
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
Resulting Folder Structure:
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
