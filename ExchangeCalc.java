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
	String[] money = {"달러", "엔", "유로", "위안"};
	JPanel pan1 ,pan2;
	JLabel lbl;
	JButton btn;
	JTextField txt;
	
	public ExchangeCalc() {
		
		pan1 = new JPanel();
		pan2 = new JPanel();
		
		txt = new JTextField(10);		//	JTextField(크기)			//아래 3개 pan1
		combo = new JComboBox<>(money);
		btn = new JButton("변환");    //JButton(내용)
		
		
		lbl = new JLabel("변환 결과");  //pan2
		
		
		setTitle("환율 계산기");
				
		getContentPane().setLayout(new BorderLayout()); //setLayout(new FlowLayout()); //doLayout; 
		pan1.add(new JLabel("원화"));
		pan1.add(txt);
		pan1.add(combo);
		pan1.add(btn);
		
		pan2.add(lbl);
		
		getContentPane().add(pan1, "North");     //자리 배치(BorderLayout)
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
		float won = Float.parseFloat(txt.getText());                //문자열 숫자 표기 
		String result = null;
		String money = combo.getSelectedItem().toString();    //아이템은 문자
		
		
	if(money.equals("달러")) {
		result = String.format("%.2f", won / USD);
	}
	else if(money.equals("엔")) {
		result = String.format("%.2f", won / JPY);
	}
	else if(money.equals("유로")) {
		result = String.format("%.2f", won / EUR);
	}
	else if(money.equals("위안")) {
		result = String.format("%.2f", won / CNY);
	}
	lbl.setText(result);
	}
	

}
