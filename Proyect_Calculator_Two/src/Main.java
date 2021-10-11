import java.awt.event.*;
import java.util.*;

import javax.swing.*;



public class Main extends JFrame implements KeyListener{

    public static void main(String[] args){
        selecttion.add("0");//0
        selecttion.add("1");//1
        selecttion.add("2");//2
        selecttion.add("3");//3
        selecttion.add("4");//4
        selecttion.add("5");//5
        selecttion.add("6");//6
        selecttion.add("7");//7
        selecttion.add("8");//8
        selecttion.add("9");//9
        selecttion.add("+");//+
        selecttion.add("-");//-
        selecttion.add("x");//x
        selecttion.add("/");//div
        selecttion.add("c");//c
        new Main();
    }

    Main(){
        main();
    }

    static ArrayList<String> selecttion = new ArrayList<String>();
    static String teclado = new String();
    static String teclado2 = new String();
    static String frase = new String();
	static String fraseShow = new String();
	static String memory = new String();
    static JLabel pantalla = new JLabel("0");
    static JFrame frame = new JFrame();
    static String coman = new String();

    public void main(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 350, 300);
        frame.setLayout(null);
        
        frame.setVisible(true);
	
		// panel.setBounds(6, 6, 338, 75);
		// frame.add(panel);
		// panel.setLayout(null);

        pantalla.setBounds(27, 6, 288, 63);
		frame.add(pantalla);

        JButton btn0 = new JButton("0");
        btn0.setBounds(83, 233, 58, 29);
        frame.getContentPane().add(btn0);
        btn0.addKeyListener(this);
        
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "0";
                replace(coman);
                
        }});

        JButton btn1 = new JButton("1");
        btn1.setBounds(19, 128, 58, 29);
        frame.getContentPane().add(btn1);
        btn1.addKeyListener(this);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "1";
                replace(coman);
                
        }});

        JButton btn2 = new JButton("2");
        btn2.setBounds(83, 128, 58, 29);
        frame.getContentPane().add(btn2);
        btn2.addKeyListener(this);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "2";
                replace(coman);
                
        }});

        JButton btn3 = new JButton("3");
        btn3.setBounds(147, 128, 58, 29);
        frame.getContentPane().add(btn3);
        btn3.addKeyListener(this);

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "3";
                replace(coman);
                
        }});

        JButton btn4 = new JButton("4");
        btn4.setBounds(19, 163, 58, 29);
        frame.getContentPane().add(btn4);
        btn4.addKeyListener(this);

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "4";
                replace(coman);
                
        }});

        JButton btn5 = new JButton("5");
        btn5.setBounds(83, 163, 58, 29);
        frame.getContentPane().add(btn5);
        btn5.addKeyListener(this);

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "5";
                replace(coman);
                
        }});

        JButton btn6 = new JButton("6");
        btn6.setBounds(147, 163, 58, 29);
        frame.getContentPane().add(btn6);
        btn6.addKeyListener(this);

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "6";
                replace(coman);
                
        }});

        JButton btn7 = new JButton("7");
        btn7.setBounds(19, 198, 58, 29);
        frame.getContentPane().add(btn7);
        btn7.addKeyListener(this);

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "7";
                replace(coman);
                
        }});

        JButton btn8 = new JButton("8");
        btn8.setBounds(83, 198, 58, 29);
        frame.getContentPane().add(btn8);
        btn8.addKeyListener(this);

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "8";
                replace(coman);
                
        }});

        JButton btn9 = new JButton("9");
        btn9.setBounds(147, 198, 58, 29);
        frame.getContentPane().add(btn9);
        btn9.addKeyListener(this);

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "9";
                replace(coman);
                
        }});

        JButton btnDot = new JButton(".");
        btnDot.setBounds(19, 233, 58, 29);
        frame.getContentPane().add(btnDot);
        btnDot.addKeyListener(this);
        
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = ".";
                replace(coman);
                
        }});

        JButton btnPlu = new JButton("+");
        btnPlu.setBounds(208, 128, 58, 29);
        frame.getContentPane().add(btnPlu);
        btnPlu.addKeyListener(this);

        btnPlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "+";
                replace(coman);
                
        }});

        JButton btnMen = new JButton("-");
        btnMen.setBounds(272, 128, 58, 29);
        frame.getContentPane().add(btnMen);
        btnMen.addKeyListener(this);
        
        btnMen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "-";
                replace(coman);
                
        }});

        JButton btnX = new JButton("x");
        btnX.setBounds(208, 163, 58, 29);
        frame.getContentPane().add(btnX);
        btnX.addKeyListener(this);
        
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "x";
                replace(coman);
                
        }});

        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(272, 163, 58, 29);
        frame.getContentPane().add(btnDiv);
        btnDiv.addKeyListener(this);
        
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coman = "/";
                replace(coman);
                
        }});

        JButton btnSM = new JButton("S M");
        btnSM.setBounds(147, 233, 58, 29);
        frame.getContentPane().add(btnSM);
        btnSM.addKeyListener(this);
        
        btnSM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(Float.toString(calculadora(frase)));
				memory = String.valueOf(calculadora(frase));
				frase = "";
				fraseShow = "";
                
        }});

        JButton btnUM = new JButton("U M");
        btnUM.setBounds(208, 233, 58, 29);
        frame.getContentPane().add(btnUM);
        btnUM.addKeyListener(this);
        
        btnUM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frase += memory;
				fraseShow += memory;
				pantalla.setText(fraseShow);
                
        }});

        JButton btnRM = new JButton("R M");
        btnRM.setBounds(272, 233, 58, 29);
        frame.getContentPane().add(btnRM);
        btnRM.addKeyListener(this);
        
        btnRM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                memory = "";
                
        }});

        JButton btnC = new JButton("C");
        btnC.setBounds(208, 93, 58, 29);
        frame.getContentPane().add(btnC);
        btnC.addKeyListener(this);
        
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frase = "";
				fraseShow = "";
				pantalla.setText("0");

        }});

        JButton btnSup = new JButton("<=");
        btnSup.setBounds(272, 93, 58, 29);
        frame.getContentPane().add(btnSup);
        btnSup.addKeyListener(this);
        
        btnSup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frase = frase.replaceFirst(".$","");
				fraseShow = fraseShow.replaceFirst(".$","");
				pantalla.setText(fraseShow);

        }});

        JButton btnIgu = new JButton("=");
        btnIgu.setBounds(208, 198, 122, 29);
        frame.getContentPane().add(btnIgu);
        btnIgu.addKeyListener(this);
        
        btnIgu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(Float.toString(calculadora(frase)));
				frase = "";
				fraseShow = "";

        }});

    }

    private void replace(String code){
        frase += code;
        fraseShow += code;
        pantalla.setText(fraseShow);
    }

    private float calculadora(String frase){
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
				if(i == 0 && !intro.get(i).equals("-")){
					System.out.println("Error: Has introducido " + intro.get(i) + " sin ningún valor delante.");
				}else if((i == 0 && intro.get(i).equals("-")) || intro.get(i-1).equals("*") || intro.get(i-1).equals("/") || intro.get(i-1).equals("+") || intro.get(i-1).equals("-")){
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

    private void tecladoPress(String teclado, String teclado2){
        if (teclado2.equals("10")){
            pantalla.setText(Float.toString(calculadora(frase)));
            frase = "";
            fraseShow = "";
        }else if (teclado2.equals("8")){
            frase = frase.replaceFirst(".$","");
            fraseShow = fraseShow.replaceFirst(".$","");
            pantalla.setText(fraseShow);
        }else {
            for(int i = 0; i < selecttion.size(); i++){
                if (selecttion.get(i).equals(teclado)){
                    coman = teclado;
                    replace(coman);
                }
            }
        }

    }
    @Override
    public void keyTyped(KeyEvent e) {
        teclado = ""+e.getKeyChar();
        tecladoPress(teclado, teclado2);

        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        teclado2 = ""+e.getKeyCode();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
        
    }

   
}