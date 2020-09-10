package io.helidon.examples.quickstart.mp;

import io.helidon.microprofile.server.Server;

public class App {

    public static void main(String[] args) {
        Server.builder().build().start();
    }
}
