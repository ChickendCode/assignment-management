package tuan29;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LayoutTuan29 {
	private static JPanel lstBaiTapTuan29;
	public static void addLayout(JPanel contentPane) {
		lstBaiTapTuan29 = new JPanel();
		lstBaiTapTuan29.setBounds(185, 11, 589, 639);
		contentPane.add(lstBaiTapTuan29);
		
		JButton btnBai1_T29 = new JButton("B\u00E0i 1");
		btnBai1_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai2_T29 = new JButton("B\u00E0i 2");
		btnBai2_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai3_T29 = new JButton("B\u00E0i 3");
		btnBai3_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai4_T29 = new JButton("B\u00E0i 4");
		btnBai4_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai5_T29 = new JButton("B\u00E0i 5");
		btnBai5_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai6_T29 = new JButton("B\u00E0i 6");
		btnBai6_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnBai7_T29 = new JButton("B\u00E0i 7");
		btnBai7_T29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		lstBaiTapTuan29.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		lstBaiTapTuan29.add(btnBai1_T29);
		lstBaiTapTuan29.add(btnBai2_T29);
		lstBaiTapTuan29.add(btnBai3_T29);
		lstBaiTapTuan29.add(btnBai4_T29);
		lstBaiTapTuan29.add(btnBai5_T29);
		lstBaiTapTuan29.add(btnBai6_T29);
		lstBaiTapTuan29.add(btnBai7_T29);
	}
	
	public static void show(boolean isShow) {
		lstBaiTapTuan29.setVisible(isShow);
	}
}
