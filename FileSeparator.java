

package JAVA.Project;       


import java.io.File;
import java.util.*;

public class FileSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory Path : "); 
        String dirName = sc.nextLine();

        File file = new File(dirName);


        File pdf = new File(dirName + "\\PDF");
        File img = new File(dirName + "\\IMAGE");
        File docx = new File(dirName + "\\DOCUMENT");
        File txt = new File(dirName + "\\TEXT");
        File vid = new File(dirName + "\\VIDEO");

        File[] allfiles = file.listFiles();   

        for (int i = 0; i < allfiles.length; i++) {

            String filename = "";  
            String[] extension;   

            if (allfiles[i].isFile()) {  

                filename = allfiles[i].getName();  
                extension = filename.split("\\.");   

                switch (extension[extension.length - 1]) {  
                    case "pdf":  
                        File moveto;  
                        Boolean done;
                        if (!pdf.exists()) {  
                            if (pdf.mkdir()) {
                                System.out.println("PDF DONE"); 
                            }
                        }
                        moveto = new File(pdf + "\\" + filename); 
                        allfiles[i].renameTo(moveto); 
                        break;

                    case "docx":
                        if (!docx.exists()) {
                            if (docx.mkdir()) {
                                System.out.println("DOCX DONE");
                            }
                        }
                        moveto = new File(docx + "\\" + filename);
                        allfiles[i].renameTo(moveto);
                        break;
                    case "jpg":
                        if (!img.exists()) {
                            if (img.mkdir()) {
                                System.out.println("IMG DONE");
                            }
                        }
                        moveto = new File(img + "\\" + filename);
                        allfiles[i].renameTo(moveto);
                        break;
                    case "txt":
                        if (!txt.exists()) {
                            if (txt.mkdir()) {
                                System.out.println("TXT DONE");
                            }
                        }
                        moveto = new File(txt + "\\" + filename);
                        allfiles[i].renameTo(moveto);
                        break;
                    case ("mp4"):
                        if (!vid.exists()) {
                            if (vid.mkdir()) {
                                System.out.println("VIDEO DONE");
                            }
                        }
                        moveto = new File(vid + "\\" + filename);
                        allfiles[i].renameTo(moveto);
                        break;
                    case ("mkv"):
                        if (!vid.exists()) {
                            if (vid.mkdir()) {
                                System.out.println("VIDEO DONE");
                            }
                        }
                        moveto = new File(vid + "\\" + filename);
                        allfiles[i].renameTo(moveto);
                        break;
                }
            }
        }
    }
}