package ge.edu.btu.chat.client;
import ge.edu.btu.chat.Server.Server;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("დასვი კითხვა: ");
            String inputValue=input.nextLine();
            Server server = new Server();
            System.out.println(inputValue);
            server.answerQuestion(inputValue);
        }

    }
}
