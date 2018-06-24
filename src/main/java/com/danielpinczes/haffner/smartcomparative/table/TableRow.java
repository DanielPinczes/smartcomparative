package com.danielpinczes.haffner.smartcomparative.table;

import lombok.Getter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import java.util.ArrayList;
import java.util.List;

class TableRow {

    @Getter
    private List<String> cells = new ArrayList<>();
    @Getter
    private int cellCount = cells.size();

    TableRow(Row row) {
        row.forEach(this::addFormattedCellToCells);
    }

    private void addFormattedCellToCells(Cell cell) {
        String stringCell = formatCell(cell);
        if (stringCell.equals("")) cells.add(stringCell);
    }

    private String formatCell(Cell cell) {
        DataFormatter dataFormatter = new DataFormatter();
        return dataFormatter.formatCellValue(cell);
    }
}
