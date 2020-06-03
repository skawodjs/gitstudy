package swingsample.combobox;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeCalc extends JFrame implements ActionListener{
	public static final float USD =  1225.60f;
	public static final float JPY =  1137.92f;
	public static final float EUR =  1363.66f;
	public static final float CNY =  171.89f;
	
	JComboBox<String> combo;
	String[] money = {"�޷�", "��", "����", "����"};
	JPanel pan1 ,pan2;
	JLabel lbl;
	JButton btn;
	JTextField txt;
	
	public ExchangeCalc() {
		
		pan1 = new JPanel();
		pan2 = new JPanel();
		
		txt = new JTextField(10);		//	JTextField(ũ��)			//�Ʒ� 3�� pan1
		combo = new JComboBox<>(money);
		btn = new JButton("��ȯ");    //JButton(����)
		
		
		lbl = new JLabel("��ȯ ���");  //pan2
		
		
		setTitle("ȯ�� ����");
				
		getContentPane().setLayout(new BorderLayout()); //setLayout(new FlowLayout()); //doLayout; 
		pan1.add(new JLabel("��ȭ"));
		pan1.add(txt);
		pan1.add(combo);
		pan1.add(btn);
		
		pan2.add(lbl);
		
		getContentPane().add(pan1, "North");     //�ڸ� ��ġ(BorderLayout)
		getContentPane().add(pan2, "Center");
		
		setBounds(300, 300, 300, 150);  // public void setBounds(int x, int y, int width, int height)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(this);
	}
	public static void main(String[] args) {
		new ExchangeCalc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculate();
	}
	public void calculate() {
		float won = Float.parseFloat(txt.getText());                //���ڿ� ���� ǥ�� 
		String result = null;
		String money = combo.getSelectedItem().toString();    //�������� ����
		
		
	if(money.equals("�޷�")) {
		result = String.format("%.2f", won / USD);
	}
	else if(money.equals("��")) {
		result = String.format("%.2f", won / JPY);
	}
	else if(money.equals("����")) {
		result = String.format("%.2f", won / EUR);
	}
	else if(money.equals("����")) {
		result = String.format("%.2f", won / CNY);
	}
	lbl.setText(result);
	}
	

}
