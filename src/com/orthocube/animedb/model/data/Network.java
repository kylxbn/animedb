package com.orthocube.animedb.model.data;

import com.orthocube.animedb.model.multilang.Description;
import com.orthocube.animedb.model.multilang.Name;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Network {
    private final IntegerProperty id;

    private final ObjectProperty<Name> name;
    private final ObjectProperty<Name> address;
    private final ObjectProperty<Description> description;

    public Network(int id) {
        this(id, new Name(), new Name(), new Description());
    }

    public Network(int id, Name name, Name address, Description desc) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleObjectProperty<>(name);
        this.address = new SimpleObjectProperty<>(address);
        this.description = new SimpleObjectProperty<>(desc);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
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

    public Name getAddress() {
        return address.get();
    }

    public void setAddress(Name address) {
        this.address.set(address);
    }

    public ObjectProperty<Name> addressProperty() {
        return address;
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
}
