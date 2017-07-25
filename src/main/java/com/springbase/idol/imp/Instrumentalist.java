package com.springbase.idol.imp;

import com.springbase.idol.Instrument;
import com.springbase.idol.Performer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walter on 2017/6/22.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }
    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing"+song+":");
        instrument.play();
    }
}
