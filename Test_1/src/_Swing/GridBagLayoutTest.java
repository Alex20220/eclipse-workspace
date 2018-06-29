package _Swing;

import java.awt.*;
import javax.swing.*;
 
class GridBagLayoutTest extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridBagLayoutTest()
    {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
 
        getContentPane().setLayout(gridbag);
 
        c.fill = GridBagConstraints.BOTH;
        // ���������� ������ ��� ������
        c.weightx = 1.0;
        makebutton("Button1", gridbag, c);
        makebutton("Button2", gridbag, c);
        makebutton("Button3", gridbag, c);
 
        c.gridwidth = GridBagConstraints.REMAINDER; //����� ������
        makebutton("Button4", gridbag, c);
 
        c.weightx = 0.0;     // ������� � �������� �� ���������
        makebutton("Button5", gridbag, c); //������ ������
 
        // ���������� ������� ��� ������ � ������� ��������� �� ���
        c.gridwidth = GridBagConstraints.RELATIVE; //������������� �������
        //c.gridwidth = 1;
        makebutton("Button6", gridbag, c);
 
        c.gridwidth = GridBagConstraints.REMAINDER; //����� ������
        makebutton("Button7", gridbag, c);
 
        c.gridwidth = 1;        //���������� �������� �� ���������
        c.gridheight = 2;
        // ���������� ������ ��� ������
        c.weighty = 1.0;
        makebutton("Button8", gridbag, c);
 
        // ���������� ������ ��� ������
        c.weighty = 0.0;     //���������� �������� �� ���������
        c.gridwidth = GridBagConstraints.REMAINDER; //����� ������
        c.gridheight = 1;     //���������� �������� �� ���������
        makebutton("Button9", gridbag, c);
        makebutton("Button10", gridbag, c);
 
        setBounds(100,100,600,400);
    }
 
    protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints c)
    {
        Button button = new Button(name);
        gridbag.setConstraints(button, c);
        getContentPane().add(button);
    }
 
    public static void main(String[] args)
    {
        GridBagLayoutTest flt = new GridBagLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}