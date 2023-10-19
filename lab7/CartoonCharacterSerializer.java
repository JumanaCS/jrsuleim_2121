//package Lab7Student;

//#TODO
//Use appropriate imports
//hint: there are a lot!
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	//Method that writes one CartoonCharacter object out to a file
	public static void serializeCharacter(CartoonCharacter character) {
		//#TODO
		
		FileOutputStream fostream;
		try {
			fostream = new FileOutputStream("Cartoon.ser");
            outputCartoon = new ObjectOutputStream(fostream);//Initialize outputCartoon to serialize objects to a file called Cartoon.ser
            outputCartoon.writeObject(character);//Write the character object out to the file
            fostream.close();
            outputCartoon.close();//Close the stream
        }

            catch (FileNotFoundException ex) {
            	ex.printStackTrace();
            } 

            catch (IOException ex) {
                ex.printStackTrace();
            }
	}
	
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		try {
			FileInputStream fistream = new FileInputStream("Cartoon.ser");//Initialize inputCartoon to read objects from a file called Cartoon.ser
            inputCartoon = new ObjectInputStream(fistream);
            cartoon = (CartoonCharacter)inputCartoon.readObject();//Read one CartoonCharacter object and store it in variable cartoon
            inputCartoon.close();
            fistream.close();
        } 

        catch (FileNotFoundException e) {
        	e.printStackTrace();
        }

        catch(IOException e) {
        	e.printStackTrace();
        } 

        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        return cartoon;
    } 
	
	// NOTE: This is optional and you don't have to do this if you choose not to
	public static void printToFile(String stringToFile) throws FileNotFoundException {
		
		//#TODO
		//Initialize writer to print characters to a file called C-137.txt
		//Print stringToFile to that file
		//Print the string "PrintWriter makes printing 50 times easier!" followed by a newline character out to the file
		//Close the PrintWriter stream
	}

}
