
package com.gustavo.chat;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class ChatServer extends JFrame {
    private JTextArea messagesArea;
    private JTextField messageField;
    private JButton sendButton;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ChatServer() {
        super("Chat Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create GUI elements
        messagesArea = new JTextArea();
        messagesArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messagesArea);
        messageField = new JTextField();
        sendButton = new JButton("Send");

        // Add GUI elements to the frame
        Container contentPane = getContentPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BorderLayout());
        messagePanel.add(messageField, BorderLayout.CENTER);
        messagePanel.add(sendButton, BorderLayout.EAST);
        contentPane.add(messagePanel, BorderLayout.SOUTH);

        // Add action listeners
        sendButton.addActionListener(e -> sendMessage());
        messageField.addActionListener(e -> sendMessage());

        // Set frame properties
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        // Initialize server socket and wait for client connection
        try {
            serverSocket = new ServerSocket(4444);
            messagesArea.append("Chat server started on port 4444\n");
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            messagesArea.append("Client connected: " + clientSocket.getInetAddress().getHostName() + "\n");
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }

        // Wait for client messages
        String inputLine;
        try {
            while ((inputLine = in.readLine()) != null) {
                messagesArea.append("Client: " + inputLine + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from client.");
        }
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            messagesArea.append("Server: " + message + "\n");
            out.println(message);
            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}
