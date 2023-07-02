
package com.gustavo.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient extends JFrame {
    private JTextArea messagesArea;
    private JTextField messageField;
    private JButton sendButton;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ChatClient() {
        super("Chat Client");
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
        messageField.addActionListener(e -> sendMessage());
        sendButton.addActionListener(e -> sendMessage());

        // Set frame properties
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        // Connect to server
        try {
            socket = new Socket("localhost", 4444);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            messagesArea.append("Connected to server: " + socket.getInetAddress().getHostName() + "\n");
        } catch (IOException e) {
            System.err.println("Could not connect to server.");
            System.exit(1);
        }

        // Wait for server messages
        String inputLine;
        try {
            while ((inputLine = in.readLine()) != null) {
                messagesArea.append("Server: " + inputLine + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from server.");
        }
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            out.println(message);
            messagesArea.append("Client: " + message + "\n");
            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}
