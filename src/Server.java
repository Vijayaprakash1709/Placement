import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = null;
        try
        {
            serverSocket = new ServerSocket(4444);
            System.out.println("Server Side is Running !!");
        }
        catch (IOException e)
        {
            System.err.println("Could not listen on port: 4444.");
            System.exit(-1);
        }

        Socket client = null;
        BufferedReader clientIn = null;
        PrintWriter clientOut = null;
        String input = null;

        try
        {
            client = serverSocket.accept ();
            clientIn = new BufferedReader (new InputStreamReader (client.getInputStream ()));
            clientOut = new PrintWriter (client.getOutputStream (), true);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }

        do
        {
            try
            {
                input = clientIn.readLine ();
                clientOut.println (input.toUpperCase ());
            }
            catch (Exception e)
            {
                e.printStackTrace ();
            }
        }
        while (! input.equals ("Bye"));

        try
        {
            clientIn.close ();
            clientOut.close ();
            client.close ();
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }

        serverSocket.close();
    }
}