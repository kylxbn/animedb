package xyz.orthocube.animedb.model.multilang;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Plot {
    private final StringProperty jPlot;
    private final StringProperty ePlot;

    public Plot() {
        jPlot = new SimpleStringProperty("");
        ePlot = new SimpleStringProperty("");
    }

    public Plot(String j, String e) {
        jPlot = new SimpleStringProperty(j);
        ePlot = new SimpleStringProperty(e);
    }

    public String getjPlot() {
        return jPlot.get();
    }

    public StringProperty jPlotProperty() {
        return jPlot;
    }

    public void setjPlot(String jPlot) {
        this.jPlot.set(jPlot);
    }

    public String getePlot() {
        return ePlot.get();
    }

    public StringProperty ePlotProperty() {
        return ePlot;
    }

    public void setePlot(String ePlot) {
        this.ePlot.set(ePlot);
    }
}
