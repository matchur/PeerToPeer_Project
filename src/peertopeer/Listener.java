package peertopeer;

import java.net.DatagramPacket;

/**
 *
 * @author Matheus
 */
public class Listener implements Runnable
{
    private String mensagem;
    private byte[] buffer;
    private DatagramPacket resposta;
    private String IP;
    private int Porta;
    
    
    public Listener(int porta, String IP)
    {
        this.IP = IP;
        this.Porta = Porta;
        buffer = new byte[3500];
    }
    
    @Override
    public void run() 
    {
        
        try
        {
            do
            {
                resposta = new DatagramPacket();
                if()
                {
                    
                }
            }while(true);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
