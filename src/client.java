import java.io.*;
import java.net.*;

public class client
{
    public static void main(String[] args) throws IOException
    {
        Socket server = null;
        PrintWriter serverOut = null;
        BufferedReader serverIn = null;

        try
        {
            server = new Socket("localhost", 4444);
            System.out.print("Client Message : ");
            serverOut = new PrintWriter(server.getOutputStream(), true);
            serverIn = new BufferedReader(new InputStreamReader(server.getInputStream()));
        }
        catch (UnknownHostException e)
        {
            System.err.println("Can't find localhost.");
            return;
        }
        catch (IOException e)
        {
            System.err.println("IO Error on connection to localhost. Is server running?");
            return;
        }

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        do
        {
            userInput = stdIn.readLine();
            serverOut.println(userInput);
            System.out.println ("Server Message: " + serverIn.readLine ());
        }
        while (! userInput.equals ("Bye"));

        serverOut.close();
        serverIn.close();
        server.close();
    }
}