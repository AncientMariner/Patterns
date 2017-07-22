package org.xander.structural.facade;

public class HomeTheaterFacade {
    Tuner tuner;
    Player player;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;


    public HomeTheaterFacade(Tuner tuner,
                             Player player,
                             Projector projector,
                             TheaterLights theaterLights,
                             Screen screen,
                             PopcornPopper popcornPopper) {
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Buckle up and get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(15);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        tuner.on();
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting the theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        player.stop();
        player.off();
        tuner.off();
    }
}