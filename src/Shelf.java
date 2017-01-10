import javax.swing.JOptionPane;


public class Shelf {

	public void has(String book, String code) {
		JOptionPane.showMessageDialog(null,"ο κωδικός "+code+" υπάρχει"," ",JOptionPane.PLAIN_MESSAGE);

		Book vivliaraki=new Book();
		vivliaraki.has(book);
	}

	
			
}
