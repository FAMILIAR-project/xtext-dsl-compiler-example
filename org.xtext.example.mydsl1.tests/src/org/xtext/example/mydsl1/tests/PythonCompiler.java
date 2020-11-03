package org.xtext.example.mydsl1.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xtext.example.mydsl1.myDsl.ProjectModel;

import com.google.common.io.Files;

public class PythonCompiler {
	
	private ProjectModel _model;

	PythonCompiler(ProjectModel model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
	
		// code generation
		String csvFilename = _model.getData();
		String pythonCode = "import pandas as pd\n" + 
				"df = pd.read_csv(\"" + csvFilename + "\")\n" +
				"print(df)";	
		
		// serialize code into Python filename
		String PYTHON_OUTPUT = "foo.py";			
		/*
		FileWriter fw = new FileWriter(PYTHON_OUTPUT);
		fw.write(pythonCode);
		fw.flush();
		fw.close();	
		*/
		// or shorter
		Files.write(pythonCode.getBytes(), new File(PYTHON_OUTPUT));
		
		// execute the generated Python code
		// roughly: exec "python foo.py"
		
		Process p = Runtime.getRuntime().exec("python " + PYTHON_OUTPUT);
	    
		// output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));
	
	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}
	

}
