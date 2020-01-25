package com.orthocube.animedb.model.multilang;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Title {
    private final StringProperty japaneseTitle;
    private final StringProperty furigana;
    private final StringProperty romajiTitle;
    private final StringProperty englishTitle;

    public Title() {
        japaneseTitle = new SimpleStringProperty("");
        furigana = new SimpleStringProperty("");
        romajiTitle = new SimpleStringProperty("");
        englishTitle = new SimpleStringProperty("");
    }

    public Title(String j) {
        japaneseTitle = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty("");
        romajiTitle = new SimpleStringProperty("");
        englishTitle = new SimpleStringProperty("");
    }

    public Title(String j, String f) {
        japaneseTitle = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiTitle = new SimpleStringProperty("");
        englishTitle = new SimpleStringProperty("");
    }

    public Title(String j, String f, String r) {
        japaneseTitle = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiTitle = new SimpleStringProperty(r);
        englishTitle = new SimpleStringProperty("");
    }

    public Title(String j, String f, String r, String t) {
        japaneseTitle = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiTitle = new SimpleStringProperty(r);
        englishTitle = new SimpleStringProperty(t);
    }

    public String getJapaneseTitle() {
        return japaneseTitle.get();
    }

    public void setJapaneseTitle(String japaneseTitle) {
        this.japaneseTitle.set(japaneseTitle);
    }

    public StringProperty japaneseTitleProperty() {
        return japaneseTitle;
    }

    public String getFuriganaTitle() {
        return furigana.get();
    }

    public void setFuriganaTitle(String furigana) {
        this.furigana.set(furigana);
    }

    public StringProperty furiganaProperty() {
        return furigana;
    }

    public String getRomajiTitle() {
        return romajiTitle.get();
    }

    public void setRomajiTitle(String romajiTitle) {
        this.romajiTitle.set(romajiTitle);
    }

    public StringProperty romajiTitleProperty() {
        return romajiTitle;
    }

    public String getEnglishTitle() {
        return englishTitle.get();
    }

    public void setEnglishTitle(String translatedTitle) {
        this.englishTitle.set(translatedTitle);
    }

    public StringProperty englishTitleProperty() {
        return englishTitle;
    }
}
