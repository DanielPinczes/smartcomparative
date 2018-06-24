package com.danielpinczes.haffner.smartcomparative;

import com.danielpinczes.haffner.smartcomparative.table.Table;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SmartComparativeApplication {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        Table table1 = new Table("C:/workspace/smart.xlsx");
        int foo = 5;
        //SpringApplication.run(SmartComparativeApplication.class, args);
    }
}
