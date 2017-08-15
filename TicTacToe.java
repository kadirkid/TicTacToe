import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * HW 3
 * Exercise 1 (Event Handling)
 * Name: Abdulahi Osoble
 * ID: U14110183
 */
public class TicTacToe extends JApplet implements ActionListener{
	//Instance Variables
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9, startover;
		JPanel label;
		JLabel result;
		boolean winnerX = false, winnerO =false;
		int count;
		String letter;
		
		public void init(){
			count = 0;
			letter = "";
			setSize(500,500);
			setLayout(new BorderLayout());
			label = new JPanel();
			label.setSize(500,500);
			label.setLayout(new GridLayout(3,3));
			
			result = new JLabel("");
			setupButtons();
			addbuttons();
			add(label, BorderLayout.CENTER);
			add(result, BorderLayout.EAST);
		}
		
		public void setupButtons(){//setting up the buttons and adding action listener
			b1 = new JButton(letter);
			b1.addActionListener(this);
			b1.setForeground(Color.RED);
			
			b2 = new JButton(letter);
			b2.addActionListener(this);
			b2.setForeground(Color.RED);

			b3 = new JButton(letter);
			b3.addActionListener(this);
			b3.setForeground(Color.RED);

			b4 = new JButton(letter);
			b4.addActionListener(this);
			b4.setForeground(Color.RED);

			b5 = new JButton(letter);
			b5.addActionListener(this);
			b5.setForeground(Color.RED);

			b6 = new JButton(letter);
			b6.addActionListener(this);
			b6.setForeground(Color.RED);

			b7 = new JButton(letter);
			b7.addActionListener(this);
			b7.setForeground(Color.RED);

			b8 = new JButton(letter);
			b8.addActionListener(this);
			b8.setForeground(Color.RED);

			b9 = new JButton(letter);
			b9.addActionListener(this);
			b9.setForeground(Color.RED);
			
			startover = new JButton("Start Over");
			startover.addActionListener(this);
		}//End of setupButtons function
		
		public void addbuttons(){//adding the buttons to the panel
			label.add(b1);
			label.add(b2);
			label.add(b3);
			label.add(b4);
			label.add(b5);
			label.add(b6);
			label.add(b7);
			label.add(b8);
			label.add(b9);
			add(startover,BorderLayout.SOUTH);

		}//End of addbuttons function
		
		public void result(){//conditions for winner / Tic-Tac-Toe Logic
			if(b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X")
				winnerX = true;
			else if(b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X")
				winnerX = true;
			else if(b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X")
				winnerX = true;
			else if(b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X")
				winnerX = true;
			else if(b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X")
				winnerX = true;
			else if(b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X")
				winnerX =true;
			else if(b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X")
				winnerX = true;
			else if(b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X")
				winnerX = true;
			else
				winnerX = false;
			
			if(b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O")
				winnerO = true;
			else if(b1.getText() == "O" && b4.getText() == "O" && b7.getText() == "O")
				winnerO = true;
			else if(b1.getText() == "O" && b5.getText() == "O" && b9.getText() == "O")
				winnerO = true;
			else if(b7.getText() == "O" && b8.getText() == "O" && b9.getText() == "O")
				winnerO = true;
			else if(b3.getText() == "O" && b6.getText() == "O" && b9.getText() == "O")
				winnerO = true;
			else if(b3.getText() == "O" && b5.getText() == "O" && b7.getText() == "O")
				winnerO = true;
			else if(b2.getText() == "O" && b5.getText() == "O" && b8.getText() == "O")
				winnerO = true;
			else if(b4.getText() == "O" && b5.getText() == "O" && b6.getText() == "O")
				winnerO = true;
			else
				winnerO = false;
			
		}//End of result Function
		public void disableAllButtons(){ //Disable all buttons when the winner is decided or if it's a tie
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}//End of disableAllButtons Function
	
		public void reset(){//Resetting the buttons for another round
			count = 0;
			letter = "";
			result.setText("");
			
			b1.setText("");
			b1.setEnabled(true);
			
			b2.setText("");
			b2.setEnabled(true);

			b3.setText("");
			b3.setEnabled(true);
			
			b4.setText("");
			b4.setEnabled(true);
			
			b5.setText("");
			b5.setEnabled(true);
			
			b6.setText("");
			b6.setEnabled(true);
			
			b7.setText("");
			b7.setEnabled(true);
			
			b8.setText("");
			b8.setEnabled(true);
			
			b9.setText("");
			b9.setEnabled(true);
			
		}//End of reset function
		@Override
		public void actionPerformed(ActionEvent ae) {//Action event for the buttons
			// TODO Auto-generated method stub
			Object obj = ae.getSource();
			count++;
			if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9|| count == 11){
				letter = "X";
			}
			else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
				letter = "O";
			}
			
			if(obj == b1){
	            b1.setText(letter);
	            b1.setEnabled(false);
	        } else if(obj == b2){
	            b2.setText(letter);
	            b2.setEnabled(false);
	        } else if(obj == b3){
	            b3.setText(letter);
	            b3.setEnabled(false);
	        } else if(obj == b4){
	             b4.setText(letter);
	             b4.setEnabled(false);
	        } else if(obj == b5){
	             b5.setText(letter);
	             b5.setEnabled(false);
	        } else if(obj == b6){
	             b6.setText(letter);
	             b6.setEnabled(false);
	        } else if(obj == b7){
	             b7.setText(letter);
	             b7.setEnabled(false);
	        } else if(obj == b8){
	             b8.setText(letter);
	             b8.setEnabled(false);
	        } else if(obj == b9){
	             b9.setText(letter);
	             b9.setEnabled(false);
	        }
			
			result();
			
			if(winnerX == true){
				result.setText("The Winner is X / Player 1");
				disableAllButtons()
			}
			else if(winnerO == true){
				result.setText("The Winner is O / Player 2");
				disableAllButtons()
			}
			else if(count == 9 && winnerO == false && winnerX == false){
				result.setText("It is a Tie");
				disableAllButtons()
			}
			 
			if(obj == startover){
		        	reset();
		        }
		}//End of ActionListener
	}//End of program
