package org.xander.Compound.djView_MVC_compound;

public class HeartController implements Controller {
    GeneralHeartModel model;
    DJView view;

    public HeartController(GeneralHeartModel model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {
    }

    public void stop() {
    }

    public void increaseBPM() {
    }

    public void decreaseBPM() {
    }

    public void setBPM(int bpm) {
    }
}
