package br.com.echo.echo_backend.Adventurers.Model;

import java.util.UUID;

public class Adventurer {

    String idAdventurer = UUID.randomUUID().toString();
    String nameAdventurer;
    String passwordAdventurer;
    String emailAdventurer;

}
