/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peertopeer;

import java.io.*;
import java.net.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Matheus
 */
public class TelaInicialController implements Initializable {

    @FXML
    private TextField ta_username;
    @FXML
    private TextField ta_ip;
    @FXML
    private TextField ta_port;
    @FXML
    private TextArea ta_chat;
    @FXML
    private TextArea ta_online;
    @FXML
    private TextField tf_message;
    
    private DatagramSocket skt;
    
    private String IP;
    private int Port;    
    private InetAddress adrSocket;
    private byte[] m;
    
    private String apelido;
    private String msg;
    private DatagramPacket dtg;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try {
            skt = new DatagramSocket();
        } catch (SocketException ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void clk_connect(ActionEvent event) throws UnknownHostException, IOException 
    {
        
        IP = ta_ip.getText();
        Port = Integer.parseInt(ta_port.getText());
        adrSocket = InetAddress.getByName(IP); 
                 
        apelido = ta_username.getText();
        apelido = "nick "+ apelido;
        m = apelido.getBytes();
                
        dtg = new DatagramPacket(m,m.length,adrSocket,Port);
        skt.send(dtg);        
    }

    @FXML
    private void clk_centralDownloads(ActionEvent event) 
    {
    }

    @FXML
    private void clk_enviar(ActionEvent event) throws IOException 
    {
        m = tf_message.getText().getBytes();
        DatagramPacket rq = new DatagramPacket(m,m.length,adrSocket,Port);
        skt.send(rq);        
    } 
    
    @FXML
    private void clk_emote1(ActionEvent event) {
    }

    @FXML
    private void clk_emote2(ActionEvent event) {
    }

    @FXML
    private void clk_emote3(ActionEvent event) {
    }

    @FXML
    private void clk_emote4(ActionEvent event) {
    }

    @FXML
    private void clk_emote5(ActionEvent event) {
    }

    @FXML
    private void clk_emote6(ActionEvent event) {
    }

    @FXML
    private void clk_emote7(ActionEvent event) {
    }

    @FXML
    private void clk_emote8(ActionEvent event) {
    }
    
}
