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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tuan29.Bai1;
import tuan29.Bai2;
import tuan29.Bai3;
import tuan29.Bai4;
import tuan29.Bai5;
import tuan29.Bai6;
import tuan29.Bai7;
import javax.swing.border.LineBorder;

public class Application extends JFrame {
	private List<JPanel> lstPanel = new ArrayList<JPanel>();
	private JPanel lstBaiTapTuan29;
	private JPanel lstBaiTapTuan30;
	private JPanel lstBaiTapTuan31;
	private JPanel lstBaiTapTuan32;
	private JPanel lstBaiTapTuan33;
	private JPanel lstBaiTapTuan34;
	private int mode = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4737499706082370608L;
	private JPanel contentPane;
	private JTextField textMode;
	private JTextField txtLoaiCanBo;
	private JTextField txtHoTen;
	private JTextField txtGioiTinh;
	private JTextField txtNamSinh;
	private JTextField txtSoLuongCB;

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

//		addLayoutTuan29(contentPane);
//		addLayoutTuan30(contentPane);
//		addLayoutTuan31(contentPane);
//		addLayoutTuan32(contentPane);
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
				txtKetQua.setText("");
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

		JTextField txtN_BT1 = new JTextField();
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

		JTextField txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		txtN_BT1.setColumns(10);

		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 120);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);

		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);

		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setControlForPanel(txtKetQua, 1, panelBai1, txtN_BT1);
			}
		});

		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setControlForPanel(txtKetQua, 2, panelBai1, txtN_BT1);
			}
		});

		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setControlForPanel(txtKetQua, 3, panelBai1, txtN_BT1);
			}
		});

		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setControlForPanel(txtKetQua, 4, panelBai1, txtN_BT1);
			}
		});

		lstBaiTapTuan30.setLayout(null);
		lstBaiTapTuan30.add(btnBai1_T29);
		lstBaiTapTuan30.add(txtKetQua);
		lstBaiTapTuan30.add(btnBai2_T29);
		lstBaiTapTuan30.add(btnBai3_T29);
		lstBaiTapTuan30.add(btnBai4_T29);

		panelBai1.setBounds(0, 72, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan30.add(panelBai1);

		JLabel lbl_BT1 = new JLabel("Nhập n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		panelBai1.add(txtN_BT1);

		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}

				int nInt = Integer.parseInt(n);
				String ketQua = null;

				if (mode == 1) {
					ketQua = tuan30.Bai1.getKetQua(nInt);
				} else if (mode == 2) {
					ketQua = tuan30.Bai2.getKetQua(nInt);
				} else if (mode == 3) {
					ketQua = tuan30.Bai3.getKetQua(nInt);
				} else if (mode == 4) {
					ketQua = tuan30.Bai4.getKetQua(nInt);
				}

				txtKetQua.setText(ketQua);
			}
		});
		btnKetQua_BT1.setBounds(151, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);

		lstPanel.add(lstBaiTapTuan30);
	}

	private void setControlForPanel(JTextArea txtKetQua, int mode, JPanel panel, JTextField txtN_BT1) {
		panel.setVisible(true);
		txtKetQua.setText("");
		this.mode = mode;
		txtN_BT1.setText("");
	}

	private void addLayoutTuan31(JPanel contentPane) {
		List<JTextField> txtArr = new ArrayList<JTextField>();
		JButton btnKetQua = new JButton("Kết quả");
		
		lstBaiTapTuan31 = new JPanel();
		lstBaiTapTuan31.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan31);
		
		JPanel panelElementArray = new JPanel();
		panelElementArray.setBounds(0, 110, 258, 37);
		panelElementArray.setLayout(null);
//		
		JTextField txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(160, 10, 50, 20);
		txtN_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelElementArray.setVisible(true);
				String n = txtN_BT1.getText();
				if (n.equals("")) {
					return;
				}
				
				panelElementArray.removeAll();
				txtArr.clear();

				int nInt = Integer.parseInt(n);
				for (int i = 0; i < nInt; i++) {
					JPanel panel = new JPanel();
					panel.setBounds(i * 30, 0, 80, 37);
					panel.setLayout(null);
					
					JLabel lbl = new JLabel("a["+ i +" - "+ (nInt - 1) +"]");
					lbl.setBounds(0, 0, 50, 20);
					panel.add(lbl);
					
					JTextField txt = new JTextField();
					txt.setText(" ");
					txt.setBounds(50, 0, 20, 20);
					panel.add(txt);
					
					txtArr.add(txt);
					
					panelElementArray.add(panel);
					panelElementArray.updateUI();
				}
				
				btnKetQua.setVisible(true);
			}
		});
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLocation(0, 170);
		txtKetQua.setSize(607, 419);
		txtKetQua.setLineWrap(true);

		JPanel panelBai1 = new JPanel();
		panelBai1.setVisible(false);

		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.setLocation(0, 11);
		btnBai1_T29.setSize(91, 50);
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 1, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
			}
		});

		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 2, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
			}
		});

		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 3, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan31.Bai3.getKetQua());
			}
		});

		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 4, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan31.Bai4.getKetQua());
			}
		});

		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 5, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
			}
		});

		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlVisableTuan31(panelBai1, 6, txtKetQua, panelElementArray, txtN_BT1, btnKetQua);
			}
		});

		lstBaiTapTuan31.setLayout(null);
		lstBaiTapTuan31.add(panelElementArray);
		
		btnKetQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int[] arr = new int[txtArr.size()];
				for (int i = 0; i < txtArr.size(); i++) {
					String n = txtArr.get(i).getText().trim();
					if (n.equals("")) {
						continue;
					}

					int nInt = Integer.parseInt(n);
					arr[i] = nInt;
				}
				
				String ketQua = null;
				if (mode == 1) {
					ketQua = tuan31.Bai1.getKetQua(arr);
				} else if (mode == 2) {
					ketQua = tuan31.Bai2.getKetQua(arr, txtArr.size());
				} else if (mode == 5) {
					ketQua = tuan31.Bai5.getKetQua(arr, txtArr.size());
				} else if (mode == 6) {
					ketQua = tuan31.Bai6.getKetQua(arr, txtArr.size());
				}
				
				txtKetQua.setText(ketQua);
			}
		});
		btnKetQua.setBounds(0, 140, 89, 23);
		btnKetQua.setVisible(false);
		lstBaiTapTuan31.add(btnKetQua);
		
		lstBaiTapTuan31.add(btnBai1_T29);
		lstBaiTapTuan31.add(txtKetQua);
		lstBaiTapTuan31.add(btnBai2_T29);
		lstBaiTapTuan31.add(btnBai3_T29);
		lstBaiTapTuan31.add(btnBai4_T29);
		lstBaiTapTuan31.add(btnBai5_T29);
		lstBaiTapTuan31.add(btnBai6_T29);

		panelBai1.setBounds(0, 72, 258, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan31.add(panelBai1);

		JLabel lbl_BT1 = new JLabel("Nhập số phần tử của mảng: ");
		lbl_BT1.setLocation(0, 11);
		lbl_BT1.setSize(170, 18);
		panelBai1.add(lbl_BT1);
		panelBai1.add(txtN_BT1);

		lstPanel.add(lstBaiTapTuan31);
	}
	
	private void controlVisableTuan31(JPanel panelBai1, int mode, JTextArea txt, JPanel panelElementArray, JTextField txtN_BT1, JButton btnKetQua) {
		panelBai1.setVisible(true);
		this.mode = mode;
		txt.setText("");
		panelElementArray.setVisible(false);
		txtN_BT1.setText("");
		btnKetQua.setVisible(false);
	}
	
	private void addLayoutTuan32(JPanel contentPane) {
		lstBaiTapTuan32 = new JPanel();
		lstBaiTapTuan32.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan32);
		
		JLabel lbl_BT1 = new JLabel("");
		lbl_BT1.setLocation(0, 11);
		lbl_BT1.setSize(70, 18);
		
		JTextField txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(70, 10, 86, 20);

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
				mode = 1;
				lbl_BT1.setText("Nhập chuỗi");
				panelBai1.setVisible(true);
				txtKetQua.setText("");
			}
		});

		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.setLocation(101, 11);
		btnBai2_T29.setSize(91, 50);
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan32.Bai2.getKetQua());
			}
		});

		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.setLocation(202, 11);
		btnBai3_T29.setSize(91, 50);
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_BT1.setText("Nhập họ tên");
				panelBai1.setVisible(true);
				txtKetQua.setText("");
				mode = 3;
			}
		});

		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.setLocation(302, 11);
		btnBai4_T29.setSize(91, 50);
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_BT1.setText("Nhập họ tên");
				panelBai1.setVisible(true);
				txtKetQua.setText("");
				mode = 4;
			}
		});

		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.setLocation(402, 11);
		btnBai5_T29.setSize(94, 50);
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_BT1.setText("Nhập xau 01");
				panelBai1.setVisible(true);
				txtKetQua.setText("");
				mode = 5;
			}
		});

		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.setLocation(506, 11);
		btnBai6_T29.setSize(91, 50);
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_BT1.setText("Nhập xâu");
				panelBai1.setVisible(true);
				txtKetQua.setText("");
				mode = 6;
			}
		});

		JButton btnBai7_T29 = new JButton("B\u00E0i 7");
		btnBai7_T29.setLocation(0, 72);
		btnBai7_T29.setSize(94, 50);
		btnBai7_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan32.Bai7.getKetQua());
			}
		});

		JButton btnBai8 = new JButton("Bài 8");
		btnBai8.setBounds(101, 72, 94, 50);
		btnBai8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan32.Bai8.getKetQua());
			}
		});

		JButton btnBai9 = new JButton("Bài 9");
		btnBai9.setBounds(202, 72, 94, 50);
		btnBai9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan32.Bai9.getKetQua());
			}
		});

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

		panelBai1.setBounds(0, 133, 400, 37);
		panelBai1.setLayout(null);
		lstBaiTapTuan32.add(panelBai1);
		panelBai1.add(lbl_BT1);

		
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);

		JButton btnKetQua_BT1 = new JButton("Kết quả");
		btnKetQua_BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n = txtN_BT1.getText();
				String ketQua = null;
				if (mode == 1) {
					ketQua = tuan32.Bai1.getKetQua(n);
				} else if (mode == 3) {
					ketQua = tuan32.Bai3.getKetQua(n);
				} else if (mode == 4) {
					ketQua = tuan32.Bai4.getKetQua(n);
				} else if (mode == 5) {
					ketQua = tuan32.Bai5.getKetQua(n);
				} else if (mode == 6) {
					ketQua = tuan32.Bai6.getKetQua(n);
				}
				txtKetQua.setText(ketQua);
			}
		});
		btnKetQua_BT1.setBounds(180, 9, 89, 23);
		panelBai1.add(btnKetQua_BT1);

		lstPanel.add(lstBaiTapTuan32);
	}

	private void addLayoutTuan33(JPanel contentPane) {
		lstBaiTapTuan33 = new JPanel();
		lstBaiTapTuan33.setBounds(185, 11, 607, 639);
		lstBaiTapTuan33.setLayout(null);
		contentPane.add(lstBaiTapTuan33);
		lstPanel.add(lstBaiTapTuan33);
		
		JPanel pnFormInput = new JPanel();
		pnFormInput.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnFormInput.setBounds(10, 217, 587, 177);
		pnFormInput.setLayout(null);
		pnFormInput.setVisible(false);
		
		JPanel pnNhapSoLuongCanBo = new JPanel();
		pnNhapSoLuongCanBo.setBounds(10, 177, 587, 33);
		pnNhapSoLuongCanBo.setLayout(null);
		lstBaiTapTuan33.add(pnNhapSoLuongCanBo);
		
		JLabel lblNewLabel_5 = new JLabel("Ban muon nhap bao nhieu can bo?");
		lblNewLabel_5.setBounds(0, 11, 216, 14);
		pnNhapSoLuongCanBo.add(lblNewLabel_5);
		
		JButton btnNhapForm = new JButton("Nhập");
		btnNhapForm.setBounds(268, 7, 89, 23);
		pnNhapSoLuongCanBo.add(btnNhapForm);
		
		txtSoLuongCB = new JTextField();
		txtSoLuongCB.setBounds(213, 8, 45, 20);
		pnNhapSoLuongCanBo.add(txtSoLuongCB);
		txtSoLuongCB.setColumns(10);
		lstBaiTapTuan33.add(pnFormInput);
		
		JLabel lblNewLabel_1 = new JLabel("Nhap loai can bo CN,KS,NV:");
		lblNewLabel_1.setBounds(10, 38, 156, 14);
		pnFormInput.add(lblNewLabel_1);
		
		txtLoaiCanBo = new JTextField();
		txtLoaiCanBo.setBounds(177, 35, 40, 20);
		pnFormInput.add(txtLoaiCanBo);
		txtLoaiCanBo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nhap Ho Ten");
		lblNewLabel_2.setBounds(10, 66, 131, 14);
		pnFormInput.add(lblNewLabel_2);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(177, 63, 110, 20);
		pnFormInput.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nhap Gioi Tinh");
		lblNewLabel_3.setBounds(10, 99, 131, 14);
		pnFormInput.add(lblNewLabel_3);
		
		txtGioiTinh = new JTextField();
		txtGioiTinh.setBounds(177, 94, 110, 20);
		pnFormInput.add(txtGioiTinh);
		txtGioiTinh.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nhap Nam Sinh");
		lblNewLabel_3_1.setBounds(10, 131, 131, 14);
		pnFormInput.add(lblNewLabel_3_1);
		
		txtNamSinh = new JTextField();
		txtNamSinh.setColumns(10);
		txtNamSinh.setBounds(177, 126, 110, 20);
		pnFormInput.add(txtNamSinh);
		
		JButton btnNewButton = new JButton("Xong");
		btnNewButton.setBounds(488, 143, 89, 23);
		pnFormInput.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Nhap vao thong tin cho can bo thu {0}");
		lblNewLabel_4.setBounds(10, 11, 277, 14);
		pnFormInput.add(lblNewLabel_4);
		
		JTextArea txt = new JTextArea("||===============================||\r\n||                Chuong Trinh QLy Can Bo         ||\r\n||           1. Nhap Thong Tin moi n CBo        ||\r\n||           2. Tim kiem theo ho ten                   ||\r\n||           3. Hien thi thong tin ve dsCB          ||\r\n||           4. Thoat khoi chuong trinh              ||\r\n||===============================||");
		txt.setEditable(false);
		txt.setBounds(10, 11, 575, 137);
		lstBaiTapTuan33.add(txt);
		
		JLabel lblNewLabel = new JLabel("Chọn chức năng:");
		lblNewLabel.setBounds(10, 152, 112, 14);
		lstBaiTapTuan33.add(lblNewLabel);
		
		textMode = new JTextField();
		textMode.setBounds(132, 149, 48, 20);
		lstBaiTapTuan33.add(textMode);
		textMode.setColumns(10);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnFormInput.setVisible(false);
				String mode = textMode.getText();
				if (mode.equals("")) {
					return;
				}
				
				if (mode.equals("1")) {
					pnFormInput.setVisible(true);
				} else if (mode.equals("2")) {
					
				} else if (mode.equals("3")) {
					
				} else if (mode.equals("4")) {
					
				}
			}
		});
		btnRun.setBounds(198, 148, 89, 23);
		lstBaiTapTuan33.add(btnRun);
	}

	private void addLayoutTuan34(JPanel contentPane) {
		lstBaiTapTuan34 = new JPanel();
		lstBaiTapTuan34.setBounds(185, 11, 607, 639);
		contentPane.add(lstBaiTapTuan34);

		lstPanel.add(lstBaiTapTuan34);
	}
}
