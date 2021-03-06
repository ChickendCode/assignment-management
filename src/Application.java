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
import tuan33.QLyCanBo;
import tuan34.QlyKhachSan;

import javax.swing.border.LineBorder;
import javax.swing.JTextPane;

public class Application extends JFrame {
	private List<JPanel> lstPanel = new ArrayList<JPanel>();
	private JPanel lstBaiTapTuan29;
	private JPanel lstBaiTapTuan30;
	private JPanel lstBaiTapTuan31;
	private JPanel lstBaiTapTuan32;
	private JPanel lstBaiTapTuan33;
	private JPanel lstBaiTapTuan34;
	private int mode = 0;
	private int countCanBo = 1;
	private int countInput = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4737499706082370608L;
	private JPanel contentPane;
	private JTextField textMode;
	private JTextField txtLoaiCanBo;
	private JTextField txtHoTen;
	private JTextField txtGioiTinh;
	private JTextField txtDiaChi;
	private JTextField txtSoLuongCB;
	private JTextField txtNamSinh;
	private JTextField txtTuKhoa;
	private JTextField txtMode;
	private JTextField txtHoTenKH;
	private JTextField txtNamSinhKH;
	private JTextField txtCMND;
	private JTextField txtLoaiPhong;
	private JTextField txtSoNgayThue;
	private JTextField txtCmndDel;

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

		JLabel lbl_BT1 = new JLabel("Nh???p n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);

		JTextField txtN_BT1 = new JTextField();
		txtN_BT1.setBounds(55, 10, 86, 20);
		panelBai1.add(txtN_BT1);
		txtN_BT1.setColumns(10);

		JButton btnKetQua_BT1 = new JButton("K???t qu???");
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

		JLabel lbl_BT1 = new JLabel("Nh???p n");
		lbl_BT1.setLocation(10, 11);
		lbl_BT1.setSize(55, 18);
		panelBai1.add(lbl_BT1);
		panelBai1.add(txtN_BT1);

		JButton btnKetQua_BT1 = new JButton("K???t qu???");
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
		JButton btnKetQua = new JButton("K???t qu???");

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

					JLabel lbl = new JLabel("a[" + i + " - " + (nInt - 1) + "]");
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

		JLabel lbl_BT1 = new JLabel("Nh???p s??? ph???n t??? c???a m???ng: ");
		lbl_BT1.setLocation(0, 11);
		lbl_BT1.setSize(170, 18);
		panelBai1.add(lbl_BT1);
		panelBai1.add(txtN_BT1);

		lstPanel.add(lstBaiTapTuan31);
	}

	private void controlVisableTuan31(JPanel panelBai1, int mode, JTextArea txt, JPanel panelElementArray,
			JTextField txtN_BT1, JButton btnKetQua) {
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
				lbl_BT1.setText("Nh???p chu???i");
				txtN_BT1.setText("");
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
				lbl_BT1.setText("Nh???p h??? t??n");
				txtN_BT1.setText("");
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
				lbl_BT1.setText("Nh???p h??? t??n");
				txtN_BT1.setText("");
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
				lbl_BT1.setText("Nh???p xau 01");
				txtN_BT1.setText("");
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
				lbl_BT1.setText("Nh???p x??u");
				txtN_BT1.setText("");
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

		JButton btnBai8 = new JButton("B??i 8");
		btnBai8.setBounds(101, 72, 94, 50);
		btnBai8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBai1.setVisible(false);
				txtKetQua.setText(tuan32.Bai8.getKetQua());
			}
		});

		JButton btnBai9 = new JButton("B??i 9");
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

		JButton btnKetQua_BT1 = new JButton("K???t qu???");
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
		String txtCanBo = "Nhap vao thong tin cho can bo thu {0}";

		lstBaiTapTuan33 = new JPanel();
		lstBaiTapTuan33.setBounds(185, 11, 607, 639);
		lstBaiTapTuan33.setLayout(null);
		contentPane.add(lstBaiTapTuan33);
		lstPanel.add(lstBaiTapTuan33);

		JPanel pnFormInput = new JPanel();
		pnFormInput.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnFormInput.setBounds(10, 217, 587, 211);
		pnFormInput.setLayout(null);
		pnFormInput.setVisible(false);

		JPanel pnNhapSoLuongCanBo = new JPanel();
		pnNhapSoLuongCanBo.setBounds(10, 177, 587, 33);
		pnNhapSoLuongCanBo.setLayout(null);
		pnNhapSoLuongCanBo.setVisible(false);
		
		JLabel lblDoneInput = new JLabel("Da nhap xong . . . .");
		lblDoneInput.setBounds(10, 177, 600, 20);
		lblDoneInput.setVisible(false);
		lstBaiTapTuan33.add(lblDoneInput);
		
		JTextArea areaKetQuaTimKiem = new JTextArea();
		areaKetQuaTimKiem.setEditable(false);
		areaKetQuaTimKiem.setBounds(10, 211, 587, 280);
		
		// Panel search
		JPanel pnSearch = new JPanel();
		pnSearch.setBounds(10, 177, 587, 33);
		pnSearch.setLayout(null);
		pnSearch.setVisible(false);
		lstBaiTapTuan33.add(pnSearch);
		
		JLabel lblNhapTuKhoa = new JLabel("Nhap tu khoa: ");
		lblNhapTuKhoa.setBounds(0, 11, 216, 14);
		pnSearch.add(lblNhapTuKhoa);
		
		txtTuKhoa = new JTextField();
		txtTuKhoa.setBounds(103, 8, 123, 20);
		pnSearch.add(txtTuKhoa);
		txtTuKhoa.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tim Kiem");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaKetQuaTimKiem.setText(QLyCanBo.timKiem(txtTuKhoa.getText()));
			}
		});
		btnTimKiem.setBounds(251, 7, 89, 23);
		pnSearch.add(btnTimKiem);
		// Panel search
		
		lstBaiTapTuan33.add(pnNhapSoLuongCanBo);

		JLabel lblNewLabel_5 = new JLabel("Ban muon nhap bao nhieu can bo?");
		lblNewLabel_5.setBounds(0, 11, 216, 14);
		pnNhapSoLuongCanBo.add(lblNewLabel_5);

		JLabel lblCanBo = new JLabel("Nhap vao thong tin cho can bo thu {0}");
		lblCanBo.setBounds(10, 11, 277, 14);
		pnFormInput.add(lblCanBo);

		JButton btnNhapForm = new JButton("Nh???p");
		btnNhapForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCanBo.setText(txtCanBo.replace("{0}", String.valueOf(countCanBo)));
				pnFormInput.setVisible(true);
				
				int intSoLuongNhap = 0;
				try {
					intSoLuongNhap = Integer.parseInt(txtSoLuongCB.getText());
				} catch (Exception e2) {
					intSoLuongNhap = 0;
				}
				
				QLyCanBo.createMemory(intSoLuongNhap);
				pnNhapSoLuongCanBo.setVisible(true); 
			}
		});
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

		JLabel lblNewLabel_3_1 = new JLabel("Nhap Dia Chi");
		lblNewLabel_3_1.setBounds(10, 131, 131, 14);
		pnFormInput.add(lblNewLabel_3_1);

		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(177, 126, 110, 20);
		pnFormInput.add(txtDiaChi);

		JTextArea txt = new JTextArea(
				"||===============================||\r\n||                Chuong Trinh QLy Can Bo         ||\r\n||           1. Nhap Thong Tin moi n CBo        ||\r\n||           2. Tim kiem theo ho ten                   ||\r\n||           3. Hien thi thong tin ve dsCB          ||\r\n||           4. Thoat khoi chuong trinh              ||\r\n||===============================||");
		txt.setEditable(false);
		txt.setBounds(10, 11, 575, 137);
		lstBaiTapTuan33.add(txt);

		JLabel lblNewLabel = new JLabel("Chon chuc nang");
		lblNewLabel.setBounds(10, 152, 112, 14);
		lstBaiTapTuan33.add(lblNewLabel);

		textMode = new JTextField();
		textMode.setBounds(132, 149, 48, 20);
		lstBaiTapTuan33.add(textMode);
		textMode.setColumns(10);

		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnNhapSoLuongCanBo.setVisible(false);
				lblDoneInput.setVisible(false);
				String txtMode = textMode.getText();
				if (txtMode.equals("")) {
					return;
				}

				if (txtMode.equals("1")) {
					pnNhapSoLuongCanBo.setVisible(true); 
				} else if (txtMode.equals("2")) {
					if (!QLyCanBo.checkHasData()) {
						lblDoneInput.setText("Canh bao: Ban chua nhap danh sach!!");
						lblDoneInput.setVisible(true);
						return;
					}
					
					pnSearch.setVisible(true);

				} else if (txtMode.equals("3")) {
					if (!QLyCanBo.checkHasData()) {
						lblDoneInput.setText("Canh bao: Ban chua nhap danh sach!!");
						lblDoneInput.setVisible(true);
						return;
					}
					
					areaKetQuaTimKiem.setText(QLyCanBo.xuatDanhSach());

				} else if (txtMode.equals("4")) {

				}
			}
		});
		btnRun.setBounds(198, 148, 89, 23);

		JButton btnNewButton = new JButton("Xong");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soLuongNhap = txtSoLuongCB.getText();
				int intSoLuongNhap = 0;
				try {
					intSoLuongNhap = Integer.parseInt(soLuongNhap);
				} catch (Exception e2) {
					intSoLuongNhap = 0;
				}

				if (intSoLuongNhap == 0) {
					return;
				}
					

				String loaiCanBo = txtLoaiCanBo.getText();
				String hoTen = txtHoTen.getText();
				String gioiTinh = txtGioiTinh.getText();
				String diaChi = txtDiaChi.getText();
				String namSinh = txtNamSinh.getText();
				int intNamSinh = 0;
				try {
					intNamSinh = Integer.parseInt(namSinh);
				} catch (Exception e2) {
					intNamSinh = 0;
				}

				QLyCanBo.nhapCanBo(countInput, loaiCanBo, hoTen, gioiTinh, diaChi, intNamSinh);
				
				if (countInput == (intSoLuongNhap - 1) ) {
					pnNhapSoLuongCanBo.setVisible(false);
					pnFormInput.setVisible(false);
					lblDoneInput.setVisible(true);
					lblDoneInput.setText("Da nhap xong . . . .");
					txtSoLuongCB.setText("");
					textMode.setText("");
					return;
				}

				countCanBo += 1;
				countInput += 1;
				lblCanBo.setText(txtCanBo.replace("{0}", String.valueOf(countCanBo)));
				txtLoaiCanBo.setText("");
				txtHoTen.setText("");
				txtGioiTinh.setText("");
				txtNamSinh.setText("");
				txtDiaChi.setText("");
			}
		});
		btnNewButton.setBounds(488, 177, 89, 23);
		pnFormInput.add(btnNewButton);

		JLabel lblNewLabel_3_1_1 = new JLabel("Nhap Nam Sinh");
		lblNewLabel_3_1_1.setBounds(10, 159, 131, 14);
		pnFormInput.add(lblNewLabel_3_1_1);

		txtNamSinh = new JTextField();
		txtNamSinh.setColumns(10);
		txtNamSinh.setBounds(177, 154, 110, 20);
		pnFormInput.add(txtNamSinh);
		lstBaiTapTuan33.add(btnRun);
		lstBaiTapTuan33.add(areaKetQuaTimKiem);
	}

	private void addLayoutTuan34(JPanel contentPane) {
		lstBaiTapTuan34 = new JPanel();
		lstBaiTapTuan34.setBounds(185, 11, 607, 639);
		lstBaiTapTuan34.setLayout(null);
		contentPane.add(lstBaiTapTuan34);

		lstPanel.add(lstBaiTapTuan34);
		
		JPanel pnFormInput = new JPanel();
		pnFormInput.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnFormInput.setBounds(10, 170, 587, 190);
		pnFormInput.setLayout(null);
		pnFormInput.setVisible(false);
		lstBaiTapTuan34.add(pnFormInput);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(10, 213, 587, 319);
		lstBaiTapTuan34.add(txtKetQua);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		pnFormInput.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nhap ho va ten khach hang:");
		lblNewLabel_7.setBounds(10, 11, 229, 21);
		pnFormInput.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Nhap nam sinh khach hang:");
		lblNewLabel_7_1.setBounds(10, 43, 229, 21);
		pnFormInput.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Nhap CMND:");
		lblNewLabel_7_2.setBounds(10, 75, 229, 21);
		pnFormInput.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Nhap loai phong (A hoac B hoac C)");
		lblNewLabel_7_2_1.setBounds(10, 107, 229, 21);
		pnFormInput.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("Nhap so ngay thue phong:");
		lblNewLabel_7_2_1_1.setBounds(10, 144, 229, 21);
		pnFormInput.add(lblNewLabel_7_2_1_1);
		
		txtHoTenKH = new JTextField();
		txtHoTenKH.setBounds(251, 11, 86, 20);
		pnFormInput.add(txtHoTenKH);
		txtHoTenKH.setColumns(10);
		
		txtNamSinhKH = new JTextField();
		txtNamSinhKH.setColumns(10);
		txtNamSinhKH.setBounds(251, 43, 86, 20);
		pnFormInput.add(txtNamSinhKH);
		
		txtCMND = new JTextField();
		txtCMND.setColumns(10);
		txtCMND.setBounds(251, 75, 86, 20);
		pnFormInput.add(txtCMND);
		
		txtLoaiPhong = new JTextField();
		txtLoaiPhong.setColumns(10);
		txtLoaiPhong.setBounds(249, 107, 86, 20);
		pnFormInput.add(txtLoaiPhong);
		
		txtSoNgayThue = new JTextField();
		txtSoNgayThue.setColumns(10);
		txtSoNgayThue.setBounds(249, 144, 86, 20);
		pnFormInput.add(txtSoNgayThue);
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen = txtHoTenKH.getText();
				String loaiPhong = txtLoaiPhong.getText();
				String namSinh = txtNamSinhKH.getText();
				String cmnd = txtCMND.getText();
				String soNgayThue = txtSoNgayThue.getText();
				
				int intNamSinh = 0;
				try {
					intNamSinh = Integer.parseInt(namSinh);
				} catch (Exception e2) {
				}
				
				int intSoNgayThue = 0;
				try {
					intSoNgayThue = Integer.parseInt(soNgayThue);
				} catch (Exception e2) {
				}
				
				QlyKhachSan.addKhachThue(loaiPhong, hoTen, intNamSinh, cmnd, intSoNgayThue);
				
				txtHoTenKH.setText("");
				txtLoaiPhong.setText("");
				txtNamSinhKH.setText("");
				txtCMND.setText("");
				txtSoNgayThue.setText("");
			}
		});
		btnThem.setBounds(488, 156, 89, 23);
		pnFormInput.add(btnThem);
		
		JPanel pnDeleteKH = new JPanel();
		pnDeleteKH.setBounds(10, 170, 587, 32);
		pnDeleteKH.setLayout(null);
		pnDeleteKH.setVisible(false);
		lstBaiTapTuan34.add(pnDeleteKH);
		
		JLabel lblNhapCMND = new JLabel("Nhap CMND");
		lblNhapCMND.setBounds(0, 0, 112, 24);
		pnDeleteKH.add(lblNhapCMND);
		
		txtCmndDel = new JTextField();
		txtCmndDel.setBounds(99, 2, 99, 20);
		pnDeleteKH.add(txtCmndDel);
		txtCmndDel.setColumns(10);
		
		JButton btnThucThi = new JButton("Xoa");
		btnThucThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mode = txtMode.getText();
				String cmnd = txtCmndDel.getText();
				if (cmnd.equals("")) return;
				
				txtKetQua.setVisible(true);
				if (mode.equals("2")) {
					QlyKhachSan.delete(cmnd);
					txtKetQua.setText("Da xoa " + cmnd);
				} else if (mode.equals("3")) {
					txtKetQua.setText(QlyKhachSan.calculator(cmnd));
				}
			}
		});
		btnThucThi.setBounds(226, 1, 89, 23);
		pnDeleteKH.add(btnThucThi);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 587, 102);
		panel.setLayout(null);
		lstBaiTapTuan34.add(panel);
		panel.setBounds(10, 11, 587, 120);
		
		JTextArea txtrThemKhach = new JTextArea();
		txtrThemKhach.setEditable(false);
		txtrThemKhach.setBackground(Color.LIGHT_GRAY);
		txtrThemKhach.setText("1: Them khach thue\r\n2: Xoa khach thue bang CMND\r\n3: Tinh tien thue phong bang CMND\r\n4: Hien thi thong tin khach thue\r\n5: Thoat chuong trinh:");
		txtrThemKhach.setBounds(10, 11, 567, 98);
		panel.add(txtrThemKhach);
		
		JLabel lblNewLabel_4 = new JLabel("Chon chuc nang");
		lblNewLabel_4.setBounds(10, 142, 99, 20);
		lstBaiTapTuan34.add(lblNewLabel_4);
		
		txtMode = new JTextField();
		txtMode.setBounds(119, 142, 47, 20);
		lstBaiTapTuan34.add(txtMode);
		txtMode.setColumns(10);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnFormInput.setVisible(false);
				pnDeleteKH.setVisible(false);
				txtKetQua.setVisible(false);
				txtCmndDel.setText("");
				
				String mode = txtMode.getText();
				if (mode.equals("1")) {
					QlyKhachSan.createMemory();
					pnFormInput.setVisible(true);
				} else if (mode.equals("2")) {
					pnDeleteKH.setVisible(true);
					btnThucThi.setText("Xoa");
				} else if (mode.equals("3")) {
					pnDeleteKH.setVisible(true);
					btnThucThi.setText("Tinh Tien");
				} else if (mode.equals("4")) {
					txtKetQua.setVisible(true);
					txtKetQua.setText(QlyKhachSan.showAll());
				} else if (mode.equals("5")) {
					QlyKhachSan.createMemory();
				}
			}
		});
		btnRun.setBounds(176, 142, 89, 20);
		lstBaiTapTuan34.add(btnRun);
	}
}
