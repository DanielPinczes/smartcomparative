package com.danielpinczes.haffner.smartcomparative;

import com.danielpinczes.haffner.smartcomparative.table.Table;

import java.util.HashMap;
import java.util.Map;

public class TableComparison {

    private Table actualTable;
    private Table expectedTable;

    private Map<String, Integer> actualProductCount = new HashMap<>();
    private Map<String, Integer> expectedProductCount = new HashMap<>();

    public TableComparison(Table actualTable, Table expectedTable) {
        this.actualTable = actualTable;
        this.expectedTable = expectedTable;
    }
}
