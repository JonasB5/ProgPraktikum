package uebung01;

public class ComplexNumber {

	double real;
	double imaginary;

	/**
	 * Constructor
	 * 
	 * @param real
	 * @param imaginary
	 */
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	/**
	 * Addition of another complex number to this one
	 * 
	 * @param other
	 * @return
	 */
	public ComplexNumber add(ComplexNumber other) {

		return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
	}

	/**
	 * Subtraction of another number from this one
	 * 
	 * @param other
	 * @return
	 */
	public ComplexNumber sub(ComplexNumber other) {

		return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
	}

	/**
	 * Multiplication of this complex number with another
	 * 
	 * @param other
	 * @return
	 */
	public ComplexNumber mul(ComplexNumber other) {

		double newReal = (this.real * other.real - this.imaginary * other.imaginary);
		double newImaginary = ((this.real * other.imaginary) + (this.imaginary * other.real));

		return new ComplexNumber(newReal, newImaginary);
	}

	/**
	 * Division of this complex number by another
	 * 
	 * @param other
	 * @return
	 */
	public ComplexNumber div(ComplexNumber other) {

		if (other.real == 0 && other.imaginary == 0) {
			System.out.print("Fehler, da durch Null geteilt würde. Zweite Number ist 0!");
			throw new IllegalArgumentException(Double.toString(other.real));
		}

		double newReal = (this.real * other.real + this.imaginary * other.imaginary)
				/ (other.real * other.real + other.imaginary * other.imaginary);
		double newImaginary = (this.imaginary * other.real - this.real * other.imaginary)
				/ (other.real * other.real + other.imaginary * other.imaginary);

		return new ComplexNumber(newReal, newImaginary);
	}

	/**
	 * Absolute
	 * 
	 * @return
	 */
	public double abs() {
		return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
	}

	/**
	 * Complex Conjuntion of this complex number
	 * 
	 * @return
	 */
	public ComplexNumber complexConj() {
		ComplexNumber conj = new ComplexNumber(this.real, -1 * this.imaginary);
		return conj;
	}

	// --Gerneral Methods

	/**
	 * Own equals method for ComplexNumbers
	 * 
	 * @return
	 */

	@Override
	public boolean equals(Object obj) {

		/*
		 * if (this == obj) return true;
		 */
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		ComplexNumber b = (ComplexNumber) obj;
		if (this.real != b.real || this.imaginary != b.imaginary)
			return false;

		return true;
	}

	/**
	 * toString method modified for ComplexNumbers
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return ("(" + this.real + "/" + this.imaginary + ")");
	}

	/**
	 * Getter/Setter Methods
	 * 
	 * @return
	 */
	public double getReal() {
		return this.real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return this.imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
}
