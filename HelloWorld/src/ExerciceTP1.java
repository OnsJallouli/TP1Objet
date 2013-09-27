import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class ExerciceTP1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciceTP1 window = new ExerciceTP1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExerciceTP1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTraitementDesImages = new JLabel("Traitement des images ");
		lblTraitementDesImages.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTraitementDesImages.setBounds(24, 22, 174, 21);
		frame.getContentPane().add(lblTraitementDesImages);
		
		JButton btnImporterImage = new JButton("Importer Image ");
		btnImporterImage.setBounds(48, 76, 116, 23);
		frame.getContentPane().add(btnImporterImage);
		
		JButton btnNewButton = new JButton("Modifier Image");
		btnNewButton.setBounds(48, 120, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEnregistrerImage = new JButton("Enregistrer Image");
		btnEnregistrerImage.setBounds(48, 168, 116, 23);
		frame.getContentPane().add(btnEnregistrerImage);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(210, 78, 180, 148);
		frame.getContentPane().add(panel);
	}
}
