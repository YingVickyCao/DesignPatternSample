package com.hades.example.designpatterns.command._2;

public class TVSetInputChannelCommand implements Command{
    private TV mTV;

    public TVSetInputChannelCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            mTV.setInputChannel();
        }
    }
}
