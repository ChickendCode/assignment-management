import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tuan29.LayoutTuan29;

public class Application extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4737499706082370608L;
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 165, 639);
		contentPane.add(panel);
		
		JButton btnTuan31 = new JButton("Tu\u1EA7n 31");
		
		JButton btnTuan32 = new JButton("Tu\u1EA7n 32");
		
		JButton btnTuan33 = new JButton("Tu\u1EA7n 33");
		
		JButton btnTuan34 = new JButton("Tu\u1EA7n 34");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		JButton btnTuan29 = new JButton("Tu\u1EA7n 29");
		panel.add(btnTuan29);
		
		JButton btnTuan30 = new JButton("Tu\u1EA7n 30");
		panel.add(btnTuan30);
		panel.add(btnTuan31);
		panel.add(btnTuan32);
		panel.add(btnTuan33);
		panel.add(btnTuan34);
		
		LayoutTuan29.addLayout(contentPane);
	}
}
