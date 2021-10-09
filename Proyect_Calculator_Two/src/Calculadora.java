import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Calculadora{
	private static String frase = new String();
	private static String fraseShow = new String();

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
			}
		});
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static float calculadora2(String frase){
		ArrayList<String> intro = new ArrayList<String>();
		String intermedio="";
		char inter;
		for(int i = 0; i < frase.length(); i++){
			inter = frase.charAt(i);
			intermedio = Character.toString(inter);
			intro.add(intermedio);
		}
		String num1S="", num2S="";
		ArrayList<String> datos = new ArrayList<String>();
		ArrayList<String> operadorA = new ArrayList<String>();
		float num1=0, num2=0, res=0;
		int conmu = 0;
		for (int i = 0; i < intro.size(); i++) {
				if(intro.get(i).equals("*") || intro.get(i).equals("/") || intro.get(i).equals("+") || intro.get(i).equals("-")){
					if(intro.get(i-1).equals("*") || intro.get(i-1).equals("/") || intro.get(i-1).equals("+") || intro.get(i-1).equals("-")){
						num1S += "-";
					}else{
						operadorA.add(intro.get(i));
						num2S = num1S;
						datos.add(num2S);
						num1S = "";
					}
				}else if(intro.get(i).equals(".")){
					num1S += intro.get(i);
				}else{
					num1S += intro.get(i);
				}
		}
		num2S = num1S;
		datos.add(num2S);
		try{
			if(operadorA.size() == 0){
				num1 = Float.parseFloat(datos.get(0));
				res = num1;
			}else if(datos.get(1) == ""){
				num1 = Float.parseFloat(datos.get(0));
				res = num1;
			}else{
				for(int i = 1; i < datos.size(); i++) {
					int e = i-1;
					if(conmu == 0){
						num1 = Float.parseFloat(datos.get(e));
						num2 = Float.parseFloat(datos.get(e+1));
						switch(operadorA.get(e)){
							case "+":
								res = num1 + num2;
							break;
							case "-":
								res = num1 - num2;
							break;
							case "*":
								res = num1 * num2;
							break;
							case "/":
								res = num1 / num2;
							break;
							default:
		
							break;
						}
						conmu = 1;
					}else{
						num2 = Float.parseFloat(datos.get(e+1));
						switch(operadorA.get(e)){
							case "+":
								res = res + num2;
							break;
							case "-":
								res = res - num2;
							break;
							case "*":
								res = res * num2;
							break;
							case "/":
								res = res / num2;
							break;
							default:
		
							break;
						}
					}
		
				}
			}
		
		return res;
	}catch(Exception f){

		System.out.println("Error: " + f.getMessage());
	}
		return res;
		
		}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Calculadora() {
		initialize();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "1";
				fraseShow += "1";
				textField.setText(fraseShow);
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "2";
				fraseShow += "2";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "3";
				fraseShow += "3";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "4";
				fraseShow += "4";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "5";
				fraseShow += "5";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "6";
				fraseShow += "6";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "7";
				fraseShow += "7";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "8";
				fraseShow += "8";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "9";
				fraseShow += "9";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "0";
				fraseShow += "0";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += ".";
				fraseShow += ".";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase = "";
				fraseShow = "";
				textField.setText("0");
			}
		});
		
		JButton btnNewButton_12 = new JButton("<=");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase = frase.replaceFirst(".$","");
				//frase = frase.substring(0, frase.length()-1);
				fraseShow = fraseShow.replaceFirst(".$","");
				//fraseShow = fraseShow.substring(1, frase.length()-1);
				textField.setText(fraseShow);

			}
		});
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "/";
				fraseShow += "/";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "*";
				fraseShow += "x";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "+";
				fraseShow += "+";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frase += "-";
				fraseShow += "-";
				textField.setText(fraseShow);
			}
		});
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Float.toString(calculadora2(frase)));
				frase = "";
				fraseShow = "";

			}
		});
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_11, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnC, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_13, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_14, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_12, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_15, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnC)
						.addComponent(btnNewButton_12))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_11)
								.addComponent(btnNewButton_14))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3)
								.addComponent(btnNewButton_4)
								.addComponent(btnNewButton_5)))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnX)
							.addComponent(btnNewButton_13)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_6)
						.addComponent(btnNewButton_7)
						.addComponent(btnNewButton_8)
						.addComponent(btnNewButton_15))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_10)
						.addComponent(btnNewButton_9))
					.addContainerGap(133, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}