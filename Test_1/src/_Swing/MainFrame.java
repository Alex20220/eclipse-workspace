package _Swing;

import java.awt.BorderLayout; // BorderLayout
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField t;
	private JTextArea a;
	private DefaultListModel model;

	public static void main(String[] args) {
	new MainFrame();// �������� ����� ������ ����, � ����� � ������������ ��� �������
	}
	
	// ������ ������� �����������
	public MainFrame() throws HeadlessException {
		super();

		setTitle("Hello");

		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE - ��� �������� ����� ��������� � ��������� ������

		setBackground(Color.GREEN);
						
		setPreferredSize(new Dimension(500, 400)); // ��� ������ ����� ������ ������
		
		setSize(500, 400); // ��� ����� ���������, ������ �� ������ ��� �������
		
		setLocationRelativeTo(null);// ������������� ��������� ������ � ����� ������, �������� ����� "pack �����"
		/*
		 * setVisible ����� ������������ ���������� (� ������ ���������� ������� -
		 * ��������� �� �������� �������, ������� ��� ���������� ����� ��������� ��
		 * ����� ������)
		 */
		addComponents(getContentPane());
		
		//pack();
		
		/*
		 pack �����, ��������� ����� setVisible, �� � ������ �������������� ��� ����� ���������� � �������������
		 ����� � ������������, �� ���� ����������� � ����������� ��������
		 */
		setVisible(true);

	}

	@SuppressWarnings("unchecked")
	private void addComponents(Container contentPane) {

		contentPane.setLayout(new BorderLayout());

		/*
		 * ��� "NORTH".... �� ����� ��� MigLayout ������
		 * 
		 * contentPane.add(new JPanel(), "NORTH"); contentPane.add(new JButton("OK"),
		 * "WEST"); contentPane.add(new JTextField("��......."), "SOUTH");
		 * contentPane.add(new JTextArea("�����,,,,"), "CENTER");
		 */
		t = new JTextField("�������� �����");
		contentPane.add(t, BorderLayout.SOUTH);
				
		
		final ButtonAction action = new ButtonAction("Click me!");
		
		JButton b = new JButton(action);
		contentPane.add(b, BorderLayout.WEST);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked");
				a.setText(t.getText());
				a.setBackground(new Color(255,255,0));
				System.out.println(e.getSource()); //������ � ������� ��� � ����� ��������
				
				model.addElement("CC"); // ���������� �������� � ���� � ������� ������ �����
				
			}
		} );
		

		
		a = new JTextArea("���� ����������� ������, ������� ����� � ���� �����");
		contentPane.add(a, BorderLayout.CENTER);
		a.addPropertyChangeListener("background", new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				System.out.println(String.format("Old: %s, New: %s", evt.getOldValue(), evt.getNewValue()));
			
				action.setEnabled(false); //������ ����� ������������ ����������
			}
		});
		
		//contentPane.add(new JButton(action), BorderLayout.EAST);// ������ ����� �� ������ ������, �� ����� ������ ���� � �.�. ��� ������� 14 �����

		JList list = new JList();
		list.setPreferredSize(new Dimension(100, 15));
		contentPane.add(list, BorderLayout.EAST);
		
	
		model = new DefaultListModel();
		list.setModel(model);
		
		model.addElement("AA");
		model.addElement("BB");
		JComboBox combo = new JComboBox();	
		combo.setPreferredSize(new Dimension(200, 70));
		contentPane.add(combo, BorderLayout.NORTH);
	}

}
