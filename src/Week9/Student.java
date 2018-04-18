/*
 * @project Week9
 * @author  Osbardo Rodriguez
 * Date:    4/17/18
 */
package Week9;

public class Student {
	private int id;
	private double gpa;

	public Student() {
		id  = -1;
		gpa = 0.0;
	}

	public void setId( int i ) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setGpa( double g ) {
		gpa = g;
	}

	public double getGpa() {
		return gpa;
	}
}
