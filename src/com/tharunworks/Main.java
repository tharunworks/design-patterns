package com.tharunworks;

import com.tharunworks.patterns.adapter.example1.after.AdapterDemo;
import com.tharunworks.patterns.command.example1.before.CommandClient;

public class Main {

    public static void main(String[] args) {
//        CommandClient commandClient = new CommandClient();
//        commandClient.start();

        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.start();
    }
}
