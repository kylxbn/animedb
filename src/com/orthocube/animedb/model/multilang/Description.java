package com.orthocube.animedb.model.multilang;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Description {
    private final StringProperty jDesc;
    private final StringProperty eDesc;

    public Description() {
        jDesc = new SimpleStringProperty("");
        eDesc = new SimpleStringProperty("");
    }

    public Description(String j, String e) {
        jDesc = new SimpleStringProperty(j);
        eDesc = new SimpleStringProperty(e);
    }

    public String getjDesc() {
        return jDesc.get();
    }

    public void setjDesc(String jDesc) {
        this.jDesc.set(jDesc);
    }

    public StringProperty jDescProperty() {
        return jDesc;
    }

    public String geteDesc() {
        return eDesc.get();
    }

    public void seteDesc(String eDesc) {
        this.eDesc.set(eDesc);
    }

    public StringProperty eDescProperty() {
        return eDesc;
    }
}
