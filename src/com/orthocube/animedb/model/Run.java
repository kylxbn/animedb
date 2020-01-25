package com.orthocube.animedb.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;

public class Run {
    private final ObjectProperty<LocalDate> start;
    private final ObjectProperty<LocalDate> end;

    public Run() {
        this.start = new SimpleObjectProperty<>(LocalDate.parse("2000-01-01"));
        this.end = new SimpleObjectProperty<>(LocalDate.parse("2000-01-01"));
    }

    public Run(LocalDate start, LocalDate end) {
        this.start = new SimpleObjectProperty<>(start);
        this.end = new SimpleObjectProperty<>(end);
    }

    public LocalDate getStart() {
        return start.get();
    }

    public ObjectProperty<LocalDate> startProperty() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start.set(start);
    }

    public LocalDate getEnd() {
        return end.get();
    }

    public ObjectProperty<LocalDate> endProperty() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end.set(end);
    }
}
