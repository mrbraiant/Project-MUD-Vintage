/**
 * @author Braioso
 */
package com.projectmudvintage;

public class Main {
    public static void main(String[] args) {
        Room room = new Room("Temple of Midgard", "A very huge temple with a monumental found in the center that you can see at right a donation room.","N, S, E, W");
        room.showRoom();
        System.out.println("\n\nIll continue... btw tysm");
    }
}
class Room {
    String name, description, direction;

    public Room(){};
    public Room(String name, String description, String direction){
        this.name = name;
        this.description = description;
        this.direction = direction;
    }
    public void showRoom(){
        System.out.printf("Room Name: %s\nDescriptions: %s\nDirections: [%s]", this.name, this.description, this.direction);
    }
}
