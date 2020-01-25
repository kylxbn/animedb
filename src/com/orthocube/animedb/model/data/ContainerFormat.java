package com.orthocube.animedb.model.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContainerFormat {
    private final IntegerProperty id;
    private final StringProperty container;

    public ContainerFormat(int id) {
        this(id, "");
    }

    public ContainerFormat(int id, String c) {
        this.id = new SimpleIntegerProperty(id);
        this.container = new SimpleStringProperty(c);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getContainer() {
        return container.get();
    }

    public StringProperty containerProperty() {
        return container;
    }

    public void setContainer(String container) {
        this.container.set(container);
    }
}
