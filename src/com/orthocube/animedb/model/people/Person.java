package com.orthocube.animedb.model.people;

import com.orthocube.animedb.model.multilang.Description;
import com.orthocube.animedb.model.multilang.Name;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;

public abstract class Person {
    private final ObjectProperty<Name> name;
    private final ObjectProperty<LocalDate> birthdate;
    private final ObjectProperty<Name> birthplace;
    private final ObjectProperty<Description> description;

    public Person() {
        this.name = new SimpleObjectProperty<>(new Name());
        this.birthdate = new SimpleObjectProperty<>(LocalDate.parse("2000-01-01"));
        this.birthplace = new SimpleObjectProperty<>(new Name());
        this.description = new SimpleObjectProperty<>(new Description());
    }

    public Person(Name name, LocalDate birthdate, Name birthplace, Description description) {
        this.name = new SimpleObjectProperty<>(name);
        this.birthdate = new SimpleObjectProperty<>(birthdate);
        this.birthplace = new SimpleObjectProperty<>(birthplace);
        this.description = new SimpleObjectProperty<>(description);
    }

    public Description getDescription() {
        return description.get();
    }

    public void setDescription(Description description) {
        this.description.set(description);
    }

    public ObjectProperty<Description> descriptionProperty() {
        return description;
    }

    public Name getName() {
        return name.get();
    }

    public void setName(Name name) {
        this.name.set(name);
    }

    public ObjectProperty<Name> nameProperty() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate.get();
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate.set(birthdate);
    }

    public ObjectProperty<LocalDate> birthdateProperty() {
        return birthdate;
    }

    public Name getBirthplace() {
        return birthplace.get();
    }

    public void setBirthplace(Name birthplace) {
        this.birthplace.set(birthplace);
    }

    public ObjectProperty<Name> birthplaceProperty() {
        return birthplace;
    }
}
