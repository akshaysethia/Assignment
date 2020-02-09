package com.cg.eis.exception;

public class EmployeeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void choose() {
        System.out.println("Salary Is Less !!!!, need hikes ");
    }
}
