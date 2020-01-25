package com.orthocube.animedb.model.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AudioChannels {
    private final IntegerProperty id;
    private final StringProperty channels;

    public AudioChannels(int id) {
        this(id, "");
    }

    public AudioChannels(int id, String c) {
        this.id = new SimpleIntegerProperty(id);
        this.channels = new SimpleStringProperty(c);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getChannels() {
        return channels.get();
    }

    public StringProperty channelsProperty() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels.set(channels);
    }
}
