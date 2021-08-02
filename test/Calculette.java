package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculette extends JFrame {

	private JPanel contentPane;
	private JTextField saisieFirstNumber;
	private JTextField saisieOperateur;
	private JTextField saisieSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculette frame = new Calculette();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculette() {
		setTitle("Calculette graphique");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstNumber = new JLabel("1er nombre :");
		firstNumber.setBounds(10, 14, 80, 14);
		contentPane.add(firstNumber);
		
		saisieFirstNumber = new JTextField();
		saisieFirstNumber.setBounds(90, 11, 46, 20);
		contentPane.add(saisieFirstNumber);
		saisieFirstNumber.setColumns(10);
		
		saisieOperateur = new JTextField();
		saisieOperateur.setBounds(217, 11, 46, 20);
		contentPane.add(saisieOperateur);
		saisieOperateur.setColumns(10);
		
		saisieSecondNumber = new JTextField();
		saisieSecondNumber.setBounds(357, 11, 46, 20);
		contentPane.add(saisieSecondNumber);
		saisieSecondNumber.setColumns(10);
		
		JLabel resultat = new JLabel("Resultat :");
		resultat.setBounds(44, 62, 59, 14);
		contentPane.add(resultat);
		
		JLabel afficheResultat = new JLabel("0");
		afficheResultat.setBounds(113, 62, 290, 14);
		contentPane.add(afficheResultat);
		
		JButton calculerButton = new JButton("Calculer");
		calculerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double firstNumber=Double.parseDouble(saisieFirstNumber.getText());
				char operateur = saisieOperateur.getText().charAt(0);
				double secondNumber=Double.parseDouble(saisieSecondNumber.getText());
				double resultat=0;
				
				switch (operateur)  {
		         case '+' : resultat = firstNumber + secondNumber;
		                    break;
		         case '-' : resultat = firstNumber - secondNumber;
		                    break;
		         case '/' : resultat = firstNumber / secondNumber;
		                    break;
		         case '*' : resultat = firstNumber * secondNumber ; 
		                    break;
		         default : afficheResultat.setText("Merci d'utiliser les opérateurs + - / *");
		         		
		          }
				if(resultat != 0) {
					afficheResultat.setText(Double.toString(resultat));
				}
			}
		});
		calculerButton.setBounds(188, 102, 89, 23);
		contentPane.add(calculerButton);
		
		JLabel operateur = new JLabel("Operateur :");
		operateur.setBounds(146, 14, 61, 14);
		contentPane.add(operateur);
		
		JLabel secondNumber = new JLabel("2nd nombre :");
		secondNumber.setBounds(273, 14, 74, 14);
		contentPane.add(secondNumber);
		
		
	}
}
