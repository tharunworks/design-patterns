package com.tharunworks;

import com.tharunworks.patterns.command.example1.before.CommandClient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CommandClient commandClient = new CommandClient();
        commandClient.start();
    }
}
