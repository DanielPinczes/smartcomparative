package com.danielpinczes.haffner.smartcomparative.table;

import lombok.Getter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private Workbook workbook;
    private Sheet sheet0;
    @Getter
    private int rowCount;
    @Getter
    private List<TableRow> rows = new ArrayList<>();

    public Table(String fileLocation) throws IOException, InvalidFormatException {
        openWorkbook(fileLocation);
        readRows();
        workbook.close();
        rowCount = rows.size();
    }

    private void openWorkbook(String fileLocation) throws IOException, InvalidFormatException {
        workbook = WorkbookFactory.create(new File(fileLocation));
        sheet0 = workbook.getSheetAt(0);
    }

    private void readRows() {
        sheet0.forEach(this::addRowToList);
    }

    private void addRowToList(Row row) {
        rows.add(new TableRow(row));
    }

}
