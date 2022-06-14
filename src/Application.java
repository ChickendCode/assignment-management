import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Application extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setTitle("Quan Ly Bai Tap");
					centreWindow(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void centreWindow(Window frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTuan29 = new JButton("Tu\u1EA7n 29");
		btnTuan29.setBounds(54, 124, 89, 45);
		contentPane.add(btnTuan29);
		
		JButton btnTuan30 = new JButton("Tu\u1EA7n 30");
		btnTuan30.setBounds(54, 192, 89, 45);
		contentPane.add(btnTuan30);
		
		JButton btnTuan31 = new JButton("Tu\u1EA7n 31");
		btnTuan31.setBounds(54, 259, 89, 45);
		contentPane.add(btnTuan31);
		
		JButton btnTuan32 = new JButton("Tu\u1EA7n 32");
		btnTuan32.setBounds(54, 331, 89, 45);
		contentPane.add(btnTuan32);
		
		JButton btnTuan33 = new JButton("Tu\u1EA7n 33");
		btnTuan33.setBounds(54, 402, 89, 45);
		contentPane.add(btnTuan33);
		
		JButton btnTuan34 = new JButton("Tu\u1EA7n 34");
		btnTuan34.setBounds(54, 470, 89, 45);
		contentPane.add(btnTuan34);
	}
}
