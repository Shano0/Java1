import java.util.Scanner;
import java.io.*;
import java.time.LocalDateTime;

class FindFile {
    public void findFile(String name,File file, FileWriter logfile) throws IOException {
        File[] list = file.listFiles();
        for (File files : list) {
            if (files.isDirectory()) {
                findFile(name,files,logfile);
            }
            else if (files.getName().startsWith(name)) {
                System.out.println(files.getName());
                logfile.write(LocalDateTime.now()+" მოიძებნა: "+files.getName()+"\n");
            }
        }
    }
}

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("failis saxeli:");
        Scanner input = new Scanner(System.in);
        String inputFile = input.nextLine();
        FindFile file = new FindFile();
        File log = new File("log.log");
        log.createNewFile();
        FileWriter logfile = new FileWriter("log.log");
        logfile.write(LocalDateTime.now()+" შემოტანილი სიტყვაა: "+inputFile+"\n");
        file.findFile(inputFile,new File("C:\\Users\\datos\\OneDrive\\Desktop\\davaleba\\"), logfile);
        logfile.close();

    }
}


