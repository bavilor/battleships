package components.gamemap;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class GameMap extends GridPane {
    private final int ROWS = 10;
    private final int COLUMNS = 10;

    public GameMap() {
        initCells();
    }

    private void initCells() {
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                Cell cell = new Cell();

                GridPane.setRowIndex(cell, i);
                GridPane.setColumnIndex(cell, j);
                cell.setText("" + i + "" + j);

                getChildren().add(cell);
            }
        }
    }

    private class Cell extends Label {

        public Cell() {
            getStyleClass().add("map-cell");
        }
    }
}
