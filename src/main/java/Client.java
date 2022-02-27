import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        String host;
        host = "netology.homework";
        int port = 8081;
        Scanner sc = new Scanner(System.in);

        try (Socket client = new Socket(host, port);
             PrintWriter out = new PrintWriter(client.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))) {


            System.out.println(in.readLine());
            out.println(sc.nextLine());

            System.out.println(in.readLine());
            out.println(sc.nextLine());

            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}