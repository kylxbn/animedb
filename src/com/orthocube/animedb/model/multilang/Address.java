package com.orthocube.animedb.model.multilang;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Address {
    private final StringProperty japaneseName;
    private final StringProperty furigana;
    private final StringProperty romajiName;

    public Address() {
        japaneseName = new SimpleStringProperty("");
        furigana = new SimpleStringProperty("");
        romajiName = new SimpleStringProperty("");
    }

    public Address(String j) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty("");
        romajiName = new SimpleStringProperty("");
    }

    public Address(String j, String f) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiName = new SimpleStringProperty("");
    }

    public Address(String j, String f, String r) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiName = new SimpleStringProperty(r);
    }

    public String getJapaneseName() {
        return japaneseName.get();
    }

    public StringProperty japaneseNameProperty() {
        return japaneseName;
    }

    public void setJapaneseName(String japaneseName) {
        this.japaneseName.set(japaneseName);
    }

    public String getFuriganaTitle() {
        return furigana.get();
    }

    public StringProperty furiganaProperty() {
        return furigana;
    }

    public void setFuriganaTitle(String furigana) {
        this.furigana.set(furigana);
    }

    public String getRomajiName() {
        return romajiName.get();
    }

    public StringProperty romajiNameProperty() {
        return romajiName;
    }

    public void setRomajiName(String romajiName) {
        this.romajiName.set(romajiName);
    }
}
