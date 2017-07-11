package com.springbase.idol.imp;

import com.springbase.idol.Instrument;
import com.springbase.idol.Performer;

import java.util.Map;

/**
 * Created by walter on 2017/7/11.
 */
public class OneManBandMap implements Performer {
    private Map<String, Instrument> instrumentMap;

    public OneManBandMap() {
    }

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }

    @Override
    public void perform() {
        for (String key : instrumentMap.keySet()) {
            System.out.print(key + ":");
            Instrument instrument = instrumentMap.get(key);
            instrument.play();
        }
    }
}
