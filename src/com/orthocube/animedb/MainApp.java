package com.orthocube.animedb;

import com.orthocube.animedb.model.anime.Season;
import com.orthocube.animedb.model.anime.Series;
import com.orthocube.animedb.model.multilang.Title;
import com.orthocube.animedb.view.SeasonEditDialogController;
import com.orthocube.animedb.view.SeriesEditDialogController;
import com.orthocube.animedb.view.SeriesOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    private ObservableList<Series> animeData = FXCollections.observableArrayList();

    public MainApp() {
        Series kiminonawa = new Series(new Title("君の名は。", "きみのなは", "Kimi no Na wa.", "Your Name"));
        Series aho = new Series(new Title("アホガール", "あほガール", "Aho Girl", "Idiot Girl"));
        Series ntr = new Series(new Title("捏造トラップ", "ねつぞうトラップ", "Constructed Trap"));

        Season ahos = new Season(new Title("アホガール", "アホガール", "Aho Girl", "Idiot Girl"));


        kiminonawa.addSeason(new Season(new Title("君の名は。", "きみのなは", "Kimi no Na wa.", "Your Name")));
        aho.addSeason(ahos);
        ntr.addSeason(new Season(new Title("捏造トラップ", "ねつぞうトラップ", "Constructed Trap")));


        animeData.addAll(kiminonawa, aho, ntr);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Series> getAnimeData() {
        return animeData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AnimeDB");

        initRootLayout();
        showAnimeSeriesOverview();
    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAnimeSeriesOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/SeriesOverview.fxml"));
            SplitPane animeSeriesOverview = loader.load();
            rootLayout.setCenter(animeSeriesOverview);
            SeriesOverviewController controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean showAnimeSeriesEditDialog(Series series) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/SeriesEditDialog.fxml"));
            VBox page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Anime Series");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            SeriesEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setSeries(series);

            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean showAnimeSeasonEditDialog(Season season) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/SeasonEditDialog.fxml"));
            VBox page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Anime Season");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            SeasonEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setSeason(season);

            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
