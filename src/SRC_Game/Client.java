
package SRC_Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner inUser = new Scanner(System.in);
            System.out.println("Digite o IP para se conectar (padrão 127.0.0.1): ");
            BufferedReader ipReader = new BufferedReader(new InputStreamReader(System.in)); 
            String ip = ipReader.readLine();
            if(ip == "") {
                ip = "127.0.0.1";
            }
            Socket client = new Socket(ip, 1234);
            Scanner in = new Scanner(client.getInputStream());
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            Client.stringSplit(in);

            while (true) {
                System.out.println("Escolha: ");
                out.println(inUser.nextLine());
                Client.stringSplit(in);
            }
        } catch (IOException e) {
             System.out.println("CONNECTION ERROR" + e);
        }
    }
    
    private static void stringSplit(Scanner in) {
        clearConsole();
        String[] dataString = in.nextLine().split("-");
        for(int i = 0; i < dataString.length; i++) {
            System.out.println(dataString[i]);
        }
    }
    
    private final static void clearConsole() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
        for(int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
}