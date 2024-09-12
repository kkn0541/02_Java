package edu.kh.execption.run;

import edu.kh.execption.model.service.ExceptionService;
import edu.kh.execption.model.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExceptionService().ex4();

		try {
			new ExceptionService().ex5();

		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
