package org.xander.structural.Facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        System.out.println("Preparing all components for the home theater");

        Player player = new Player();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tuner, player, projector, theaterLights, screen, popcornPopper);
        homeTheaterFacade.watchMovie("The Gladiator");
        homeTheaterFacade.endMovie();
    }
}