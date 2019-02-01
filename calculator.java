import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{
	JTextField enter;
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,plus,minus,divide,multiply,leftp,rightp,result,modulo,backspace,clear;
	public Calculator(){
		enter = new JTextField();
		enter.setBounds(10,10,300,50);
		enter.setFont(new Font("Serif",Font.BOLD,25));
		add(enter);

		backspace = new JButton("B");
		backspace.setBackground(Color.RED);
		backspace.setBounds(320,10,50,50);
		backspace.setFont(new Font("Serif",Font.BOLD,15));
		backspace.addActionListener(this);
		add(backspace);


		num0 = new JButton("0");
		num0.setBackground(Color.BLUE);
		num0.setBounds(10,100,50,50);
		num0.setFont(new Font("Serif",Font.BOLD,15));
		num0.addActionListener(this);
		add(num0);

		num1 = new JButton("1");
		num1.setBounds(70,100,50,50);
		num1.setBackground(Color.BLUE);
		num1.setFont(new Font("Serif",Font.BOLD,15));
		num1.addActionListener(this);
		add(num1);

		num2 = new JButton("2");
		num2.setBounds(130,100,50,50);
		num2.setBackground(Color.BLUE);
		num2.setFont(new Font("Serif",Font.BOLD,15));
		num2.addActionListener(this);
		add(num2);

		num3 = new JButton("3");
		num3.setBounds(190,100,50,50);
		num3.setBackground(Color.BLUE);
		num3.setFont(new Font("Serif",Font.BOLD,15));
		num3.addActionListener(this);
		add(num3);

		num4 = new JButton("4");
		num4.setBounds(250,100,50,50);
		num4.setBackground(Color.BLUE);
		num4.setFont(new Font("Serif",Font.BOLD,15));
		num4.addActionListener(this);
		add(num4);

		num5 = new JButton("5");
		num5.setBounds(10,160,50,50);
		num5.setBackground(Color.BLUE);
		num5.setFont(new Font("Serif",Font.BOLD,15));
		num5.addActionListener(this);
		add(num5);

		num6 = new JButton("6");
		num6.setBounds(70,160,50,50);
		num6.setBackground(Color.BLUE);
		num6.setFont(new Font("Serif",Font.BOLD,15));
		num6.addActionListener(this);
		add(num6);

		num7 = new JButton("7");
		num7.setBounds(130,160,50,50);
		num7.setBackground(Color.BLUE);
		num7.setFont(new Font("Serif",Font.BOLD,15));
		num7.addActionListener(this);
		add(num7);

		num8 = new JButton("8");
		num8.setBounds(190,160,50,50);
		num8.setBackground(Color.BLUE);
		num8.setFont(new Font("Serif",Font.BOLD,15));
		num8.addActionListener(this);
		add(num8);

		num9 = new JButton("9");
		num9.setBounds(250,160,50,50);
		num9.setBackground(Color.BLUE);
		num9.setFont(new Font("Serif",Font.BOLD,15));
		num9.addActionListener(this);
		add(num9);

		plus = new JButton("+");
		plus.setBounds(10,220,50,50);
		plus.setBackground(Color.ORANGE);
		plus.setFont(new Font("Serif",Font.BOLD,15));
		plus.addActionListener(this);
		add(plus);

		minus = new JButton("-");
		minus.setBounds(70,220,50,50);
		minus.setBackground(Color.ORANGE);
		minus.setFont(new Font("Serif",Font.BOLD,15));
		minus.addActionListener(this);
		add(minus);

		multiply = new JButton("*");
		multiply.setBounds(130,220,50,50);
		multiply.setBackground(Color.ORANGE);
		multiply.setFont(new Font("Serif",Font.BOLD,15));
		multiply.addActionListener(this);
		add(multiply);

		divide = new JButton("/");
		divide.setBounds(190,220,50,50);
		divide.setBackground(Color.ORANGE);
		divide.setFont(new Font("Serif",Font.BOLD,15));
		divide.addActionListener(this);
		add(divide);

		modulo = new JButton("%");
		modulo.setBounds(250,220,50,50);
		modulo.setBackground(Color.ORANGE);
		modulo.setFont(new Font("Serif",Font.BOLD,15));
		modulo.addActionListener(this);
		add(modulo);

		leftp = new JButton("(");
		leftp.setBounds(310,160,50,50);
		leftp.setFont(new Font("Serif",Font.BOLD,15));
		leftp.addActionListener(this);
		add(leftp);

		rightp = new JButton(")");
		rightp.setBounds(310,220,50,50);
		rightp.setFont(new Font("Serif",Font.BOLD,15));
		rightp.addActionListener(this);
		add(rightp);

		result = new JButton("=");
		result.setBounds(310,100,50,50);
		result.setBackground(Color.GREEN);
		result.setFont(new Font("Serif",Font.BOLD,15));
		result.addActionListener(this);
		add(result);

		clear = new JButton("CLEAR");
		clear.setBackground(Color.RED);
		clear.setBounds(10,280,350,50);
		clear.setFont(new Font("Serif",Font.BOLD,15));
		clear.addActionListener(this);
		add(clear);



		setBounds(200,200,380,350);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		String expression;
		if(e.getSource()==num1){
			expression = enter.getText();
			expression = expression+"1";
			enter.setText(expression);
		}
		if(e.getSource()==num2){
			expression = enter.getText();
			expression = expression+"2";
			enter.setText(expression);
		}
		if(e.getSource()==num3){
			expression = enter.getText();
			expression = expression+"3";
			enter.setText(expression);
		}
		if(e.getSource()==num4){
			expression = enter.getText();
			expression = expression+"4";
			enter.setText(expression);
		}
		if(e.getSource()==num5){
			expression = enter.getText();
			expression = expression+"5";
			enter.setText(expression);
		}
		if(e.getSource()==num6){
			expression = enter.getText();
			expression = expression+"6";
			enter.setText(expression);
		}
		if(e.getSource()==num7){
			expression = enter.getText();
			expression = expression+"7";
			enter.setText(expression);
		}
		if(e.getSource()==num8){
			expression = enter.getText();
			expression = expression+"8";
			enter.setText(expression);
		}
		if(e.getSource()==num9){
			expression = enter.getText();
			expression = expression+"9";
			enter.setText(expression);
		}
		if(e.getSource()==num0){
			expression = enter.getText();
			expression = expression+"0";
			enter.setText(expression);
		}
		if(e.getSource()==plus){
			expression = enter.getText();
			expression = expression+"+";
			enter.setText(expression);
		}
		if(e.getSource()==minus){
			expression = enter.getText();
			expression = expression+"-";
			enter.setText(expression);
		}
		if(e.getSource()==multiply){
			expression = enter.getText();
			expression = expression+"*";
			enter.setText(expression);
		}
		if(e.getSource()==divide){
			expression = enter.getText();
			expression = expression+"/";
			enter.setText(expression);
		}
		if(e.getSource()==leftp){
			expression = enter.getText();
			expression = expression+"(";
			enter.setText(expression);
		}
		if(e.getSource()==rightp){
			expression = enter.getText();
			expression = expression+")";
			enter.setText(expression);
		}
		if(e.getSource()==modulo){
			expression = enter.getText();
			expression = expression+"%";
			enter.setText(expression);
		}
		if( e.getSource()==backspace){
			expression = enter.getText();
			StringBuilder back = new StringBuilder(expression);
			back.delete(expression.length()-1,expression.length());
			enter.setText(new String(back));
		}
		if(e.getSource()==clear){
			enter.setText("");
		}
		if(e.getSource()==result){
			expression = enter.getText();
			char stack[] = new char[expression.length()];
			boolean invalid = false;
			int top = -1;
			StringBuilder postfix[] = new StringBuilder[expression.length()]; 
			int i=0,j=0;
			while(i<expression.length()){
				if(expression.charAt(i)=='('){
					stack[++top] = expression.charAt(i);
					i++;
				}
				else if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='/' || expression.charAt(i)=='*' || expression.charAt(i)=='%'){
					while(top!=-1 && stack[top]!='(' && priorityOf(stack[top]) > priorityOf(expression.charAt(i))){
						postfix[j] = new StringBuilder(""+stack[top]);
						top--;
						j++;
					}
					stack[++top] = expression.charAt(i);
					i++;
				}
				else if((int)expression.charAt(i)>=48 && (int)expression.charAt(i)<=57){
					String num="";
					while(i<expression.length() && (int)expression.charAt(i)>=48 && (int)expression.charAt(i)<=57){
						num = num + expression.charAt(i);
						i++;
					}
					postfix[j] = new StringBuilder(num);
					j++;
				}
				else if(expression.charAt(i)==')'){
					while(top!=-1 && stack[top]!='('){
						postfix[j] = new StringBuilder(""+stack[top]);
						top--;
						j++;
					}
					i++;
					if(top==-1){
						System.out.println("Invalid Expression");
						enter.setText("Invalid Expression");
						invalid = true;
						break;
					}
					top--;
				}
				else{
					System.out.println("Invalid Expression");
					enter.setText("Invalid Expression");
					invalid = true;
					break;
				}
			}
			if(!invalid){
				while(top!=-1){
					postfix[j] = new StringBuilder(""+stack[top]);
					top--;
					j++;
				}
				//System.out.println(j);
				for(int p=0;p<j;p++){
					String plus = new String("+");
					String minus = new String("-");
					String multiply = new String("*");
					String divide = new String("/");
					String modulo = new String("%");
					if(new String(postfix[p]).compareTo(plus)==0){
						double operand1 = Double.parseDouble(new String(postfix[p-2]));
						double operand2 = Double.parseDouble(new String(postfix[p-1]));
						double operation = operand1 + operand2;
						postfix[p-2] = new StringBuilder(""+operation);
						for(int d=p+1;d<j;d++){
							postfix[d-2] = postfix[d];
						}
						j = j-2;
						//System.out.println(j);
						//System.out.println("plus");
						//System.out.println(operation);
						p = 0;
					}
					if(new String(postfix[p]).compareTo(minus)==0){
						double operand1 = Double.parseDouble(new String(postfix[p-2]));
						double operand2 = Double.parseDouble(new String(postfix[p-1]));
						double operation = operand1 - operand2;
						postfix[p-2] = new StringBuilder(""+operation);
						for(int d=p+1;d<j;d++){
							postfix[d-2] = postfix[d];
						}
						j = j-2;
						//System.out.println(j);
						//System.out.println("minus");

						//System.out.println(operation);
						p = 0;
					}
					if(new String(postfix[p]).compareTo(multiply)==0){
						double operand1 = Double.parseDouble(new String(postfix[p-2]));
						double operand2 = Double.parseDouble(new String(postfix[p-1]));
						double operation = operand1 * operand2;
						postfix[p-2] = new StringBuilder(""+operation);
						for(int d=p+1;d<j;d++){
							postfix[d-2] = postfix[d];
						}
						j = j-2;
						//System.out.println(j);
						//System.out.println("minus");
						//System.out.println(operation);
						p = 0;
					}
					if(new String(postfix[p]).compareTo(divide)==0){
						double operand1 = Double.parseDouble(new String(postfix[p-2]));
						double operand2 = Double.parseDouble(new String(postfix[p-1]));
						double operation = operand1 / operand2;
						postfix[p-2] = new StringBuilder(""+operation);
						for(int d=p+1;d<j;d++){
							postfix[d-2] = postfix[d];
						}
						j = j-2;
						//System.out.println(j);
						//System.out.println("minus");
						//System.out.println(operation);
						p = 0;
					}
					if(new String(postfix[p]).compareTo(modulo)==0){
						double operand1 = Double.parseDouble(new String(postfix[p-2]));
						double operand2 = Double.parseDouble(new String(postfix[p-1]));
						double operation = operand1 % operand2;
						postfix[p-2] = new StringBuilder(""+operation);
						for(int d=p+1;d<j;d++){
							postfix[d-2] = postfix[d];
						}
						j = j-2;
						//System.out.println(j);
						//System.out.println("minus");
						//System.out.println(operation);
						p = 0;
					}
				}
				enter.setText(new String(postfix[0]));
			}	
		}
	}
	public static int priorityOf(char op){
		if(op=='+' || op=='-'){
			return 0;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}