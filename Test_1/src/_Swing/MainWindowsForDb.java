package _Swing;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
public class MainWindowsForDb extends JFrame {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void createGUI() {
         
        JFrame frame = new JFrame("������ � ����� ������");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        Font font = new Font("Verdana", Font.PLAIN, 13);
        Font font2 = new Font("Verdana", Font.PLAIN, 11);
         
        JMenuBar menuBar = new JMenuBar();
         
        JMenu dbMenu = new JMenu("���� ������");
        dbMenu.setFont(font);
        
        JMenuItem conMenu = new JMenuItem("�������������� � ��");
        conMenu.setFont(font2);
        dbMenu.add(conMenu);
        
        JMenu workData = new JMenu("������ � �������");
        workData.setFont(font2);
        dbMenu.add(workData);
                        
        JMenuItem addUser = new JMenuItem("�������� ������������");
        addUser.setFont(font2);
        workData.add(addUser);
         
        JMenuItem delUser = new JMenuItem("������� ������������");
        delUser.setFont(font2);
        workData.add(delUser);
         
        JMenuItem upUser = new JMenuItem("�������� ������ ������������");
        upUser.setFont(font2);
        workData.add(upUser); 
       
        dbMenu.addSeparator();
         
        JMenuItem exitItem = new JMenuItem("�����");
        exitItem.setFont(font2);
        dbMenu.add(exitItem);
         
        
        exitItem.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                System.exit(0);             
            }           
        });
         
        
       menuBar.add(dbMenu);
                 
       frame.setJMenuBar(menuBar);
         
        frame.setPreferredSize(new Dimension(270, 225)); //������ ������
        frame.pack(); //����������� ������ ��� ����������� ����� ���������
        frame.setLocationRelativeTo(null);//���������� ������ � ������ ������
        frame.setVisible(true); //��������� ������
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
