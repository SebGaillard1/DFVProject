package com.example.MSCE.DFVProject;

import com.example.MSCE.DFVProject.business.CsvDataReader;
import com.example.MSCE.DFVProject.business.TransactionImmobiliere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DfvProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfvProjectApplication.class, args);
		CsvDataReader reader = new CsvDataReader();
		String filePath = "full.csv";
		reader.readCsvData(filePath);
	}

}
