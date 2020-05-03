package com.hades.example.designpatterns.command._3;

public class LightOffCommand implements Command{
    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }
}