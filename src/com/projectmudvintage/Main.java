/**
 * @author Braioso
 */
package com.projectmudvintage;

public class Main {
    public static void main(String[] args) {
        Sala room = new Sala("Templo de Midgard", "A very huge temple with a monumental found in the center that you can see at right a donation room.","N, S, E, W");
        room.showSala();
        System.out.println("It'll continue... btw tysm \o/");
    }
}
class Sala {
    String name, description, direction;

    public Sala(){};
    public Sala(String name, String description, String direction){
        this.name = name;
        this.description = description;
        this.direction = direction;
    }
    public void showSala(){
        System.out.printf("Room Name: %s\nDescriptions: %s\nDirections: [%s]", this.name, this.description, this.direction);
    }
}
