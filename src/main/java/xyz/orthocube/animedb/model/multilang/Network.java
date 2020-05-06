package xyz.orthocube.animedb.model.multilang;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Network {
    private final StringProperty japaneseName;
    private final StringProperty furigana;
    private final StringProperty romajiName;
    private final StringProperty englishName;

    public Network() {
        japaneseName = new SimpleStringProperty("");
        furigana = new SimpleStringProperty("");
        romajiName = new SimpleStringProperty("");
        englishName = new SimpleStringProperty("");
    }

    public Network(String j) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty("");
        romajiName = new SimpleStringProperty("");
        englishName = new SimpleStringProperty("");
    }

    public Network(String j, String f) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiName = new SimpleStringProperty("");
        englishName = new SimpleStringProperty("");
    }

    public Network(String j, String f, String r) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiName = new SimpleStringProperty(r);
        englishName = new SimpleStringProperty("");
    }

    public Network(String j, String f, String r, String t) {
        japaneseName = new SimpleStringProperty(j);
        furigana = new SimpleStringProperty(f);
        romajiName = new SimpleStringProperty(r);
        englishName = new SimpleStringProperty(t);
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

    public String getEnglishName() {
        return englishName.get();
    }

    public StringProperty englishNameProperty() {
        return englishName;
    }

    public void setEnglishName(String translatedTitle) {
        this.englishName.set(translatedTitle);
    }
}
