/*
 * @project Week9
 * @author  Osbardo Rodriguez
 * Date:    4/17/18
 */
package Week9;

/*
 * Import necessary java packages.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	double score1 = 85.2;
    	double score2 = 75.8;
    	double score3 = 98.5;

    	double average = ( score1 + score2 + score3 ) / 3;

    	System.out.printf( "The average is %.1f\n", average );

    	/*
    	 * All of the scores are the same data type.
    	 * Each one also shares a common name and they
    	 * represent a group of information.
    	 *
    	 * An array is a data structure that allows us to
    	 * conveniently organize this pattern of data
    	 * management.
    	 *
    	 * The key to an array is that all elements in
    	 * the group of data have the same data type.
    	 */

	    /*
	     * Declare "scores" as being an array of doubles.
	     * The actual number of elements to reserve in
	     * the array has not been done yet.
	     */
    	double[] scores;

    	/*
    	 * This line of code physically allocates (reserves)
    	 * 25 elements in memory with each element being a
    	 * double data type.
    	 */
    	scores = new double[ 50 ];

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );
	    int numberOfScores = 0;
	    double sum = 0.0;

	    System.out.print( "Enter a score: " );
	    double userScore = input.nextDouble();

	    while ( userScore != -1 ) {
		    scores[ numberOfScores++ ] = userScore;

		    sum += userScore;

		    System.out.print( "Enter a score: " );
		    userScore = input.nextDouble();
	    }

	    average = sum / numberOfScores;

	    System.out.printf( "The average is %.2f\n", average );

	    /*
	     * This declares a Student array called roster
	     * and allocates 50 memory spots reserved for
	     * Student elements.
	     *
	     * Important to note is that each element at this
	     * point contains no Student object
	     * (each element is currently "null")
	     */
	    Student[] roster = new Student[ 50 ];

	    Student me = new Student();
	    me.setId( 123 );
	    me.setGpa( 3.9 );

	    roster[ 0 ] = new Student();
	    roster[ 0 ].setId( 456 );
	    roster[ 0 ].setGpa( 4.0 );
    }
}
