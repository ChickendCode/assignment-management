import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tuan29.baitap.Bai1;
import tuan29.baitap.Bai2;
import tuan29.baitap.Bai3;
import tuan29.baitap.Bai4;
import tuan29.baitap.Bai5;
import tuan29.baitap.Bai6;
import tuan29.baitap.Bai7;

import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;

public class Application extends JFrame {
	private JPanel lstBaiTapTuan29;
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
		setBounds(100, 100, 818, 700);
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
		
		addLayoutTuan29(contentPane);
	}
	
	private void addLayoutTuan29(JPanel contentPane) {
		lstBaiTapTuan29 = new JPanel();
		lstBaiTapTuan29.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan29);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 154);
		txtKetQua.setSize(607, 459);
		txtKetQua.setLineWrap(true);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai1.getKetQua(70));
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai2.getKetQua());
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai3.getKetQua());
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai4.getKetQua());
			}
		});
		
		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai5.getKetQua());
			}
		});
		
		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai6.getKetQua());
			}
		});
		
		JButton btnBai7_T29 = new JButton("B\u00E0i 7");
		btnBai7_T29.setLocation(0, 72);
		btnBai7_T29.setSize(94, 50);
		btnBai7_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKetQua.setText(Bai7.getKetQua());
			}
		});
		
//		lstBaiTapTuan29.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		lstBaiTapTuan29.setLayout(null);
		lstBaiTapTuan29.add(btnBai1_T29);
		lstBaiTapTuan29.add(txtKetQua);
		lstBaiTapTuan29.add(btnBai2_T29);
		lstBaiTapTuan29.add(btnBai3_T29);
		lstBaiTapTuan29.add(btnBai4_T29);
		lstBaiTapTuan29.add(btnBai5_T29);
		lstBaiTapTuan29.add(btnBai6_T29);
		lstBaiTapTuan29.add(btnBai7_T29);
	}
}
