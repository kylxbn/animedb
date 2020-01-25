package com.orthocube.animedb.model.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SampleRate {
    private final IntegerProperty id;
    private final IntegerProperty samplerate;

    public SampleRate(int id) {
        this(id, 0);
    }

    public SampleRate(int id, int samplerate) {
        this.id = new SimpleIntegerProperty(id);
        this.samplerate = new SimpleIntegerProperty(samplerate);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public int getSamplerate() {
        return samplerate.get();
    }

    public IntegerProperty samplerateProperty() {
        return samplerate;
    }

    public void setSamplerate(int samplerate) {
        this.samplerate.set(samplerate);
    }
}
