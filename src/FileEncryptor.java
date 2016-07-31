import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.alutam.ziputils.ZipEncryptOutputStream;

public class FileEncryptor extends javax.swing.JFrame {
	public static void main(String[] args) throws IOException {
		
		String hints1Pass = "bnwh!d2$4lw";
		String hints2Pass = "nttnt3$dt";
		String hints3Pass = "p0c$m0gj#m";
		String pdfPass = "s!@n$t1sim@tn";
		
        // create streams that will encrypt the resulting zip files
        // using the password provided
        ZipEncryptOutputStream zeos1 = new ZipEncryptOutputStream(new FileOutputStream("hints1.zip"), hints1Pass);
        // create the standard zip output stream, initialize it with our encrypting stream
        ZipOutputStream zos1 = new ZipOutputStream(zeos1);
 
        // write the zip files
        ZipEntry ze1 = new ZipEntry("session1-146hints.txt");
        zos1.putNextEntry(ze1);
        InputStream is1 = new FileInputStream("session1-146hints.txt");
        int b1;
        while ((b1 = is1.read()) != -1) {
            zos1.write(b1);
        }
        zos1.closeEntry();
        zos1.close();
        
        
        
        ZipEncryptOutputStream zeos2 = new ZipEncryptOutputStream(new FileOutputStream("hints2.zip"), hints2Pass);
        ZipOutputStream zos2 = new ZipOutputStream(zeos2);
 
        ZipEntry ze2 = new ZipEntry("session1-148hints.txt");
        zos2.putNextEntry(ze2);
        InputStream is2 = new FileInputStream("session1-148hints.txt");
        int b2;
        while ((b2 = is2.read()) != -1) {
            zos2.write(b2);
        }
        zos2.closeEntry();
        zos2.close();
        

        ZipEncryptOutputStream zeos3 = new ZipEncryptOutputStream(new FileOutputStream("hints3.zip"), hints3Pass);
        ZipOutputStream zos3 = new ZipOutputStream(zeos3);
 
        ZipEntry ze3 = new ZipEntry("session1-158hints.txt");
        zos3.putNextEntry(ze3);
        InputStream is3 = new FileInputStream("session1-158hints.txt");
        int b3;
        while ((b3 = is3.read()) != -1) {
            zos3.write(b3);
        }
        zos3.closeEntry();
        zos3.close();
        

        ZipEncryptOutputStream zeos4 = new ZipEncryptOutputStream(new FileOutputStream("Session01.zip"), pdfPass);
        ZipOutputStream zos4 = new ZipOutputStream(zeos4);
 
        ZipEntry ze4 = new ZipEntry("Session01.pdf");
        zos4.putNextEntry(ze4);
        InputStream is4 = new FileInputStream("Session01.pdf");
        int b4;
        while ((b4 = is4.read()) != -1) {
            zos4.write(b4);
        }
        zos4.closeEntry();
        zos4.close();
        
    }
}
