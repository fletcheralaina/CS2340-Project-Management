package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		Random gen = new Random();
		int tracker = name.length();
		int b;
		String newName = "";
		String name2 = name.substring(0, name.length());
		for (int i = 0; i < tracker; i++) {
			b = gen.nextInt(name2.length());
			System.out.println(b);
			System.out.println(name2.length());
			newName = newName + name2.charAt(b);
			if (b == name.length() - 1) {
				name2 = name2.substring(0, b);
			} else if (b == 0) {
				name2 = name2.substring(1, name2.length());
			} else {
				name2 = name2.substring(0, b) + name2.substring(b
						+ 1, name2.length());
			}
		}
		return newName + "";
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
