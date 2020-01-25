package com.orthocube.animedb.view;

import com.orthocube.animedb.model.anime.Series;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SeriesEditDialogController {

    private Stage dialogStage;
    private Series series;
    private boolean okClicked = false;

    //<editor-fold desc="FXML injects">
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtJapanese;
    @FXML
    private TextField txtFurigana;
    @FXML
    private TextField txtRomaji;
    @FXML
    private TextField txtEnglish;
    @FXML
    private Button cmdSave;
    //</editor-fold>

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setSeries(Series series) {
        this.series = series;

        txtJapanese.setText(series.getTitle().getJapaneseTitle());
        txtFurigana.setText(series.getTitle().getFuriganaTitle());
        txtRomaji.setText(series.getTitle().getRomajiTitle());
        txtEnglish.setText(series.getTitle().getEnglishTitle());
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    void cmdSaveAction(ActionEvent event) {
        series.getTitle().setJapaneseTitle(txtJapanese.getText());
        series.getTitle().setFuriganaTitle(txtFurigana.getText());
        series.getTitle().setRomajiTitle(txtRomaji.getText());
        series.getTitle().setEnglishTitle(txtEnglish.getText());

        okClicked = true;
        dialogStage.close();
    }

    @FXML
    void initialize() {
        //<editor-fold desc="Assert not null">
        assert txtJapanese != null : "fx:id=\"txtJapanese\" was not injected: check your FXML file 'SeriesEditDialog.fxml'.";
        assert txtFurigana != null : "fx:id=\"txtFurigana\" was not injected: check your FXML file 'SeriesEditDialog.fxml'.";
        assert txtRomaji != null : "fx:id=\"txtRomaji\" was not injected: check your FXML file 'SeriesEditDialog.fxml'.";
        assert txtEnglish != null : "fx:id=\"txtEnglish\" was not injected: check your FXML file 'SeriesEditDialog.fxml'.";
        assert cmdSave != null : "fx:id=\"cmdSave\" was not injected: check your FXML file 'SeriesEditDialog.fxml'.";
        //</editor-fold>

    }
}
