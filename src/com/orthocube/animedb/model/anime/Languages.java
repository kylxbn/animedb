package com.orthocube.animedb.model.anime;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Languages {
    public final BooleanProperty hasJapanese;
    public final BooleanProperty hasEnglish;
    public final BooleanProperty hasOthers;

    public final BooleanProperty hasOfficialJapanese;
    public final BooleanProperty hasOfficialEnglish;
    public final BooleanProperty hasOfficialOthers;

    public final StringProperty otherLanguages;

    public Languages() {
        hasJapanese = new SimpleBooleanProperty(false);
        hasEnglish = new SimpleBooleanProperty(false);
        hasOthers = new SimpleBooleanProperty(false);

        hasOfficialJapanese = new SimpleBooleanProperty(false);
        hasOfficialEnglish = new SimpleBooleanProperty(false);
        hasOfficialOthers = new SimpleBooleanProperty(false);

        otherLanguages = new SimpleStringProperty("");
    }

    public boolean hasJapanese() {
        return hasJapanese.get();
    }

    public BooleanProperty hasJapaneseProperty() {
        return hasJapanese;
    }

    public void setHasJapanese(boolean hasJapanese) {
        this.hasJapanese.set(hasJapanese);
    }

    public boolean hasEnglish() {
        return hasEnglish.get();
    }

    public BooleanProperty hasEnglishProperty() {
        return hasEnglish;
    }

    public void setHasEnglish(boolean hasEnglish) {
        this.hasEnglish.set(hasEnglish);
    }

    public boolean hasOthers() {
        return hasOthers.get();
    }

    public BooleanProperty hasOthersProperty() {
        return hasOthers;
    }

    public void setHasOthers(boolean hasOthers) {
        this.hasOthers.set(hasOthers);
    }

    public boolean hasOfficialJapanese() {
        return hasOfficialJapanese.get();
    }

    public BooleanProperty hasOfficialJapaneseProperty() {
        return hasOfficialJapanese;
    }

    public void setHasOfficialJapanese(boolean hasOfficialJapanese) {
        this.hasOfficialJapanese.set(hasOfficialJapanese);
    }

    public boolean hasOfficialEnglish() {
        return hasOfficialEnglish.get();
    }

    public BooleanProperty hasOfficialEnglishProperty() {
        return hasOfficialEnglish;
    }

    public void setHasOfficialEnglish(boolean hasOfficialEnglish) {
        this.hasOfficialEnglish.set(hasOfficialEnglish);
    }

    public boolean hasOfficialOthers() {
        return hasOfficialOthers.get();
    }

    public BooleanProperty hasOfficialOthersProperty() {
        return hasOfficialOthers;
    }

    public void setHasOfficialOthers(boolean hasOfficialOthers) {
        this.hasOfficialOthers.set(hasOfficialOthers);
    }

    public String getOtherLanguages() {
        return otherLanguages.get();
    }

    public StringProperty otherLanguagesProperty() {
        return otherLanguages;
    }

    public void setOtherLanguages(String otherLanguages) {
        this.otherLanguages.set(otherLanguages);
    }
}
