package firstPackageofJava;

public class ArrayConcept {

	public static void main(String[] args) {

		// int
		int i[] = new int[4];
		i[0] = 53;
		i[1] = 54;
		i[2] = 55;
		i[3] = 56;
		System.out.println(i[2]);
		for (int j = 0; j < 4; j++) {
			System.out.println(i[j]);
		}
		System.out.println("#####################################");

		// double
		double d[] = new double[3];
		d[0] = 9.23;
		d[1] = 2.45;
		d[2] = 8.99;
		System.out.println(d[1]);

		for (int k = 0; k < 3; k++) {
			System.out.println(d[k]);
		}
		System.out.println("#####################################");

//char

		char c[] = new char[2];
		c[0] = 'a';
		c[1] = '6';
//c[2]='y'; //ArrayIndexOutOfBoundsException
		for (int n = 0; n < 2; n++) {
			System.out.println(c[n]);
		}

		System.out.println("#####################################");
		// string
		String hi[] = new String[3];
		hi[0] = "Ramu";
		hi[1] = "Radha";
		hi[2] = "76543";
		for (int m = 0; m < hi.length; m++) {
			System.out.println(hi[m]);
		}

		System.out.println("#####################################");
//	boolean
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		System.out.println("#####################################");
		// disadvantages of static array : 1.fixed number of elemnts is stored -- to
		// overcome this we use Collections--Arraylist,Hashtable--dynamic arrays
		// 2. only single data type is used -- to overcome this we use Object array

		// object array (used to store different datatypes in object array
		Object ob[] = new Object[5]; // Object is a super class in Java
		ob[0] = "Ramu";
		ob[1] = 'M';
		ob[2] = 21;
		ob[3] = false;
		ob[4] = 4.56; //why is it not printing double value? why is it rounding off?

		for (int z = 0; z < 4; z++) {
			System.out.println(ob[z]);

		}
		System.out.println(ob.length);
	}

}
