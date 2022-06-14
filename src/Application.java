import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tuan29.Bai1;
import tuan29.Bai2;
import tuan29.Bai3;
import tuan29.Bai4;
import tuan29.Bai5;
import tuan29.Bai6;
import tuan29.Bai7;

import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Application extends JFrame {
	private List<JPanel> lstPanel = new ArrayList<JPanel>();
	private JPanel lstBaiTapTuan29;
	private JPanel lstBaiTapTuan30;
	private JPanel lstBaiTapTuan31;
	private JPanel lstBaiTapTuan32;
	private JPanel lstBaiTapTuan33;
	private JPanel lstBaiTapTuan34;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4737499706082370608L;
	private JPanel contentPane;
	private JTextField txtN_BT1;

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
		btnTuan31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan31);
			}
		});
		
		JButton btnTuan32 = new JButton("Tu\u1EA7n 32");
		btnTuan32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan32);
			}
		});
		
		JButton btnTuan33 = new JButton("Tu\u1EA7n 33");
		btnTuan33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan33);
			}
		});
		
		JButton btnTuan34 = new JButton("Tu\u1EA7n 34");
		btnTuan34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan34);
			}
		});
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		JButton btnTuan29 = new JButton("Tu\u1EA7n 29");
		btnTuan29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan29);
			}
		});
		panel.add(btnTuan29);
		
		JButton btnTuan30 = new JButton("Tu\u1EA7n 30");
		btnTuan30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisableLayout(lstBaiTapTuan30);
			}
		});
		panel.add(btnTuan30);
		panel.add(btnTuan31);
		panel.add(btnTuan32);
		panel.add(btnTuan33);
		panel.add(btnTuan34);
		
		addLayoutTuan29(contentPane);
		addLayoutTuan30(contentPane);
		addLayoutTuan31(contentPane);
		addLayoutTuan32(contentPane);
		addLayoutTuan33(contentPane);
		addLayoutTuan34(contentPane);
		
		setVisableLayout(null);
	}
	
	private void setVisableLayout(JPanel panel) {
		for (JPanel jPanel : lstPanel) {
			if (panel == null) {
				jPanel.setVisible(false);
			} else {
				if (jPanel.equals(panel)) {
					jPanel.setVisible(true);
				} else {
					jPanel.setVisible(false);
				}
			}
			
		}
	}
	
	private void addLayoutTuan29(JPanel contentPane) {
		lstBaiTapTuan29 = new JPanel();
		lstBaiTapTuan29.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan29);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 194);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);
		
		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(true);
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai2.getKetQua());
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai3.getKetQua());
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai4.getKetQua());
			}
		});
		
		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai5.getKetQua());
			}
		});
		
		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai6.getKetQua());
			}
		});
		
		JButton btnBai7_T29 = new JButton("B\u00E0i 7");
		btnBai7_T29.setLocation(0, 72);
		btnBai7_T29.setSize(94, 50);
		btnBai7_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai7.getKetQua());
			}
		});
		
		lstBaiTapTuan29.setLayout(null);
		lstBaiTapTuan29.add(btnBai1_T29);
		lstBaiTapTuan29.add(txtKetQua);
		lstBaiTapTuan29.add(btnBai2_T29);
		lstBaiTapTuan29.add(btnBai3_T29);
		lstBaiTapTuan29.add(btnBai4_T29);
		lstBaiTapTuan29.add(btnBai5_T29);
		lstBaiTapTuan29.add(btnBai6_T29);
		lstBaiTapTuan29.add(btnBai7_T29);
		
		
		panelBai1.setBounds(0, 133, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan29.add(panelBai1);
		
		JLabel lbl_BT1 = new JLabel("Nhập n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		
		txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);
		
		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}
				
				int nInt = Integer.parseInt(n);
				txtKetQua.setText(Bai1.getKetQua(nInt));
			}
		});
		btnKetQua_BT1.setBounds(151, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);
		
		
		lstPanel.add(lstBaiTapTuan29);
	}

	private void addLayoutTuan30(JPanel contentPane) {
		lstBaiTapTuan30 = new JPanel();
		lstBaiTapTuan30.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan30);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 194);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);
		
		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(true);
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai2.getKetQua());
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai3.getKetQua());
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai4.getKetQua());
			}
		});
		
		
		lstBaiTapTuan30.setLayout(null);
		lstBaiTapTuan30.add(btnBai1_T29);
		lstBaiTapTuan30.add(txtKetQua);
		lstBaiTapTuan30.add(btnBai2_T29);
		lstBaiTapTuan30.add(btnBai3_T29);
		lstBaiTapTuan30.add(btnBai4_T29);
		
		
		panelBai1.setBounds(0, 133, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan30.add(panelBai1);
		
		JLabel lbl_BT1 = new JLabel("Nhập n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		
		txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);
		
		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}
				
				int nInt = Integer.parseInt(n);
				txtKetQua.setText(Bai1.getKetQua(nInt));
			}
		});
		btnKetQua_BT1.setBounds(151, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);
		
		lstPanel.add(lstBaiTapTuan30);
	}

	private void addLayoutTuan31(JPanel contentPane) {
		lstBaiTapTuan31 = new JPanel();
		lstBaiTapTuan31.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan31);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 194);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);
		
		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(true);
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai2.getKetQua());
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai3.getKetQua());
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai4.getKetQua());
			}
		});
		
		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai5.getKetQua());
			}
		});
		
		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai6.getKetQua());
			}
		});
		
		lstBaiTapTuan31.setLayout(null);
		lstBaiTapTuan31.add(btnBai1_T29);
		lstBaiTapTuan31.add(txtKetQua);
		lstBaiTapTuan31.add(btnBai2_T29);
		lstBaiTapTuan31.add(btnBai3_T29);
		lstBaiTapTuan31.add(btnBai4_T29);
		lstBaiTapTuan31.add(btnBai5_T29);
		lstBaiTapTuan31.add(btnBai6_T29);
		
		
		panelBai1.setBounds(0, 133, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan31.add(panelBai1);
		
		JLabel lbl_BT1 = new JLabel("Nhập n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		
		txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);
		
		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}
				
				int nInt = Integer.parseInt(n);
				txtKetQua.setText(Bai1.getKetQua(nInt));
			}
		});
		btnKetQua_BT1.setBounds(151, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);
		
		
		lstPanel.add(lstBaiTapTuan31);
	}
	
	private void addLayoutTuan32(JPanel contentPane) {
		lstBaiTapTuan32 = new JPanel();
		lstBaiTapTuan32.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan32);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 194);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);
		
		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(true);
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai2.getKetQua());
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai3.getKetQua());
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai4.getKetQua());
			}
		});
		
		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai5.getKetQua());
			}
		});
		
		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai6.getKetQua());
			}
		});
		
		JButton btnBai7_T29 = new JButton("B\u00E0i 7");
		btnBai7_T29.setLocation(0, 72);
		btnBai7_T29.setSize(94, 50);
		btnBai7_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(Bai7.getKetQua());
			}
		});
		
		JButton btnBai8 = new JButton("Bài 8");
		btnBai8.setBounds(101, 72, 94, 50);
		
		JButton btnBai9 = new JButton("Bài 9");
		btnBai9.setBounds(202, 72, 94, 50);
		
		lstBaiTapTuan32.add(btnBai8);
		lstBaiTapTuan32.add(btnBai9);
		lstBaiTapTuan32.setLayout(null);
		lstBaiTapTuan32.add(btnBai1_T29);
		lstBaiTapTuan32.add(txtKetQua);
		lstBaiTapTuan32.add(btnBai2_T29);
		lstBaiTapTuan32.add(btnBai3_T29);
		lstBaiTapTuan32.add(btnBai4_T29);
		lstBaiTapTuan32.add(btnBai5_T29);
		lstBaiTapTuan32.add(btnBai6_T29);
		lstBaiTapTuan32.add(btnBai7_T29);
		
		
		panelBai1.setBounds(0, 133, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan32.add(panelBai1);
		
		JLabel lbl_BT1 = new JLabel("Nhập n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		
		txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);
		
		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}
				
				int nInt = Integer.parseInt(n);
				txtKetQua.setText(Bai1.getKetQua(nInt));
			}
		});
		btnKetQua_BT1.setBounds(151, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);
		
		
		lstPanel.add(lstBaiTapTuan32);
	}


	private void addLayoutTuan33(JPanel contentPane) {
		lstBaiTapTuan33 = new JPanel();
		lstBaiTapTuan33.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan33);
		
		
		lstPanel.add(lstBaiTapTuan33);
	}
	
	private void addLayoutTuan34(JPanel contentPane) {
		lstBaiTapTuan34 = new JPanel();
		lstBaiTapTuan34.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan34);
		
		
		lstPanel.add(lstBaiTapTuan34);
	}
}
