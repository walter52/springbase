package com.springbase.idol.imp;

import com.springbase.idol.Instrument;
import com.springbase.idol.Performer;

import java.util.Collection;

/**
 * Created by walter on 2017/7/10.
 */
public class OneManBand implements Performer{
    private Collection<Instrument> instruments;
    public OneManBand(){}

    public void perform(){
        for(Instrument instrument:instruments){
            instrument.play();
        }
    }

    public void setInstruments( Collection<Instrument> instruments){
        this.instruments = instruments;
    }

}
