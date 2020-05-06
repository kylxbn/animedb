package xyz.orthocube.animedb.view;

import xyz.orthocube.animedb.model.anime.Season;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SeasonEditDialogController {

    //<editor-fold desc="FXML injections">
    @FXML
    private TextField txtJapanese;
    @FXML
    private TextField txtFurigana;
    @FXML
    private TextField txtRomaji;
    @FXML
    private TextField txtEnglish;
    @FXML
    private Label lblWriter;
    @FXML
    private Button cmdChooseWriter;
    @FXML
    private ChoiceBox<?> cboDemographic;
    @FXML
    private Button cmdChooseDirector;
    @FXML
    private Button cmdChooseComposer;
    @FXML
    private Button cmdChooseStudio;
    @FXML
    private Button cmdChooseNetwork;
    @FXML
    private DatePicker dpkFrom;
    @FXML
    private DatePicker dpkTo;
    @FXML
    private TextField txtEpisodes;
    @FXML
    private Label lblDirector;
    @FXML
    private Label lblComposer;
    @FXML
    private Label lblStudio;
    @FXML
    private Label lblNetwork;
    @FXML
    private Button cmdSave;
    @FXML
    private ImageView pboPicture;
    @FXML
    private TextArea txtPlot;
    //</editor-fold>

    private Stage dialogStage;
    private Season season;
    private boolean okClicked = false;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setSeason(Season season) {
        this.season = season;

        txtJapanese.setText(season.getTitle().getJapaneseTitle());
        txtFurigana.setText(season.getTitle().getFuriganaTitle());
        txtRomaji.setText(season.getTitle().getRomajiTitle());
        txtEnglish.setText(season.getTitle().getEnglishTitle());
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    void cmdChooseComposerAction(ActionEvent event) {

    }

    @FXML
    void cmdChooseDirectorAction(ActionEvent event) {

    }

    @FXML
    void cmdChooseNetworkAction(ActionEvent event) {

    }

    @FXML
    void cmdChooseStudioAction(ActionEvent event) {

    }

    @FXML
    void cmdChooserWriterAction(ActionEvent event) {

    }

    @FXML
    void cmdChoosePictureAction(ActionEvent event) {

    }

    @FXML
    void cmdSaveAction(ActionEvent event) {
        season.getTitle().setJapaneseTitle(txtJapanese.getText());
        season.getTitle().setFuriganaTitle(txtFurigana.getText());
        season.getTitle().setRomajiTitle(txtRomaji.getText());
        season.getTitle().setEnglishTitle(txtEnglish.getText());

        okClicked = true;
        dialogStage.close();
    }

    @FXML
    void initialize() {
        //<editor-fold desc="Not Null Asserts">
        assert txtJapanese != null : "fx:id=\"txtJapanese\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert txtFurigana != null : "fx:id=\"txtFurigana\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert txtRomaji != null : "fx:id=\"txtRomaji\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert txtEnglish != null : "fx:id=\"txtEnglish\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert lblWriter != null : "fx:id=\"lblWriter\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdChooseWriter != null : "fx:id=\"cmdChooseWriter\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cboDemographic != null : "fx:id=\"cboDemographic\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdChooseDirector != null : "fx:id=\"cmdChooseDirector\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdChooseComposer != null : "fx:id=\"cmdChooseComposer\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdChooseStudio != null : "fx:id=\"cmdChooseStudio\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdChooseNetwork != null : "fx:id=\"cmdChooseNetwork\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert dpkFrom != null : "fx:id=\"dpkFrom\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert dpkTo != null : "fx:id=\"dpkTo\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert txtEpisodes != null : "fx:id=\"txtEpisodes\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert lblDirector != null : "fx:id=\"lblDirector\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert lblComposer != null : "fx:id=\"lblComposer\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert lblStudio != null : "fx:id=\"lblStudio\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert lblNetwork != null : "fx:id=\"lblNetwork\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        assert cmdSave != null : "fx:id=\"cmdSave\" was not injected: check your FXML file 'SeasonEditDialog.fxml'.";
        //</editor-fold>


    }

}
