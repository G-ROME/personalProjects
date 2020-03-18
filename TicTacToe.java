//Created by Jerome Lalunio

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TicTacToe{
	
	private static JFrame frame=new JFrame();
	private static JFrame popup=new JFrame();
	
	private static JPanel panel=new JPanel();
	private static JLabel label=new JLabel();
	
	private static JPanel turnPanel=new JPanel();
	private static JLabel turnLabel=new JLabel();
	
	private static JPanel Xpanel=new JPanel();
	private static JLabel Xscore=new JLabel();
		private static int X=0;
		
	private static JPanel Opanel=new JPanel();
	private static JLabel Oscore=new JLabel();
		private static int O=0;
	
	private static JButton b1=new JButton();
	private static JButton b2=new JButton();
	private static JButton b3=new JButton();
	private static JButton b4=new JButton();
	private static JButton b5=new JButton();
	private static JButton b6=new JButton();
	private static JButton b7=new JButton();
	private static JButton b8=new JButton();
	private static JButton b9=new JButton();
	
	private static JButton resetScoreBTN=new JButton("Reset");
	
	private static boolean XsTurn=true;
	private static int toDraw=0;
	
	private static int HEIGHT=500;
	private static int WIDTH=500;
	
	public static void main(String[]args){
		game();
	}
	
	private static void game(){
		
		panel.setBounds(0, 0, WIDTH, 100);
		panel.setBackground(Color.gray);
			label.setText("Tic Tac Toe");
			label.setForeground(Color.white);
			label.setFont(new Font("Comic Sans MS",100 ,70));
		panel.add(label);
						
		turnPanel.setBounds(0, 100, WIDTH, 50);
		turnPanel.setBackground(Color.lightGray);
			turnLabel.setText("Player X's turn");
			turnLabel.setForeground(Color.white);
			turnLabel.setFont(new Font("Comic Sans MS", 100, 30));
		turnPanel.add(turnLabel);
		
		Xpanel.setBounds(0, 100, 100, 50);
		Xpanel.setBackground(Color.gray);
			Xscore.setText("X: "+String.valueOf(X));
			Xscore.setForeground(Color.white);
			Xscore.setFont(new Font("Comic Sans MS", 100, 30));
		Xpanel.add(Xscore);
		
		Opanel.setBounds(400, 100, 100, 50);
		Opanel.setBackground(Color.gray);
			Oscore.setText("O: "+String.valueOf(O));
			Oscore.setForeground(Color.white);
			Oscore.setFont(new Font("Comic Sans MS", 100, 30));
		Opanel.add(Oscore);
		
		b1.setBounds(100, 170, 80, 80);	b2.setBounds(200, 170, 80, 80);	b3.setBounds(300, 170, 80, 80);
		b4.setBounds(100, 270, 80, 80);	b5.setBounds(200, 270, 80, 80);	b6.setBounds(300, 270, 80, 80);
		b7.setBounds(100, 370, 80, 80);	b8.setBounds(200, 370, 80, 80);	b9.setBounds(300, 370, 80, 80);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b1.setText("X");
					b1.setEnabled(false);
					checkWinner();
				}else{
					b1.setText("O");
					b1.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b2.setText("X");
					b2.setEnabled(false);
					checkWinner();
				}else{
					b2.setText("O");
					b2.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b3.setText("X");
					b3.setEnabled(false);
					checkWinner();
				}else{
					b3.setText("O");
					b3.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b4.setText("X");
					b4.setEnabled(false);
					checkWinner();
				}else{
					b4.setText("O");
					b4.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b5.setText("X");
					b5.setEnabled(false);
					checkWinner();
				}else{
					b5.setText("O");
					b5.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b6.setText("X");
					b6.setEnabled(false);
					checkWinner();
				}else{
					b6.setText("O");
					b6.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b7.setText("X");
					b7.setEnabled(false);
					checkWinner();
				}else{
					b7.setText("O");
					b7.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b8.setText("X");
					b8.setEnabled(false);
					checkWinner();
				}else{
					b8.setText("O");
					b8.setEnabled(false);
					checkWinner();
				}
			}
		});
		
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(XsTurn==true){
					b9.setText("X");
					b9.setEnabled(false);
					XsTurn=false;
					checkWinner();
				}else{
					b9.setText("O");
					b9.setEnabled(false);
					checkWinner();
				}
			}
		});
		resetScoreBTN.setBounds(390, 420, 80, 30);
		resetScoreBTN.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				O=0;
				X=0;
				newGame("no Value");
			}
		});
		
		
		frame.add(b1);	frame.add(b2);	frame.add(b3);
		frame.add(b4);	frame.add(b5);	frame.add(b6);
		frame.add(b7);	frame.add(b8);	frame.add(b9);
		
		frame.add(resetScoreBTN);
			
		frame.add(Xpanel);
		frame.add(Opanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(turnPanel);
		frame.add(panel);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(HEIGHT, WIDTH);
		frame.setVisible(true);
		
	}
	
	private static void checkWinner(){
		
		if(XsTurn==true){
			XsTurn=false;
		}else{
			XsTurn=true;
		}
		
		if(XsTurn==true){
			turnLabel.setText("Player X's turn");
		}else{
			turnLabel.setText("Player O's turn");
		}
		toDraw++;
		
		if(b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		if(b7.getText().toString().equals("X") && b5.getText().toString().equals("X") && b3.getText().toString().equals("X")){
			JOptionPane.showMessageDialog(popup,"Player X wins");
			newGame("X");
		}
		
		if(b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(b7.getText().toString().equals("O") && b5.getText().toString().equals("O") && b3.getText().toString().equals("O")){
			JOptionPane.showMessageDialog(popup,"Player O wins");
			newGame("O");
		}
		if(toDraw==9){
			JOptionPane.showMessageDialog(popup,"Draw");
			newGame("noWinner");
		}
	}
	
	private static void newGame(String winner){	
		
		if(winner.equals("X")){
			X++;
		}
		if(winner.equals("O")){
			O++;
		}
		
		Xscore.setText("X: "+String.valueOf(X));
		Oscore.setText("O: "+String.valueOf(O));
		
		turnLabel.setText("Player X's turn");
		toDraw=0;
		XsTurn=true;
		
		b1.setEnabled(true);	b2.setEnabled(true);	b3.setEnabled(true);
		b4.setEnabled(true);	b5.setEnabled(true);	b6.setEnabled(true);
		b7.setEnabled(true);	b8.setEnabled(true);	b9.setEnabled(true);
		
		
		b1.setText("");		b2.setText("");		b3.setText("");
		b4.setText("");		b5.setText("");		b6.setText("");
		b7.setText("");		b8.setText("");		b9.setText("");
	}
}
