// CS112 Exam#01
// Name: Kenny Fok
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testVehicle {

	public static void main(String[] args) throws EnviroNotFriendly, FileNotFoundException {		
		File 		inFile = new File("inputEx01_03.txt");
		Scanner		input = new Scanner(inFile);
		int			nCount;
		int			nType;
		int			nPerson;
		double		dGas = 0;
		Vehicle		myVeh = null;
	
		nCount = input.nextInt();
		for ( int i = 0 ; i < nCount ; i++ ) {
			nType = input.nextInt();
			try {
				dGas = input.nextDouble();
				if (dGas < 10) {
					throw new IllegalArgumentException("Illegal number of person");
				}
			} catch (IllegalArgumentException f) {
				System.out.println(f.getMessage());
			}
			try {
				nPerson = input.nextInt();
				if (nPerson < 0) {
					throw new EnviroNotFriendly("Negative number of Person");
				}
			} catch (EnviroNotFriendly f) {
				System.out.println(f.getMessage());
			}
			try {
				if (nType == 0 || nType == 3) {
					throw new EnviroNotFriendly("Gas/diesel car");
				}
				myVeh = new Vehicle(dGas, nType);
			} catch (EnviroNotFriendly f) {
				System.out.println(f.getMessage());
			}
			System.out.println(myVeh);
		}
	}
}