import javax.swing.JOptionPane;


public class Library {

	public static void main(String[] args) {
		
		
		
		String BOOK = (String)JOptionPane.showInputDialog(
			      null, "Παρακαλώ εισάγετε τον τίτλο του βιβλίου", "Τίτλος βιβλίου", JOptionPane.INFORMATION_MESSAGE,
			null, null, null);
		System.out.println(" "+BOOK);
		String CODE = (String)JOptionPane.showInputDialog(
			      null, "Παρακαλώ εισάγετε τον κωδικό του βιβλίου", "Κωδικός βιβλίου", JOptionPane.INFORMATION_MESSAGE,
			null, null, null);
		System.out.println(" "+CODE);
		
		Librarian AUTOS=new Librarian(BOOK,CODE);
		AUTOS.request(BOOK, CODE);
		
		Cashier EKEINOS=new Cashier();
		AUTOS.responce(BOOK, CODE, 100);
		EKEINOS.charge(BOOK, CODE, 100);
		AUTOS.getCredits(100);
	}

}
