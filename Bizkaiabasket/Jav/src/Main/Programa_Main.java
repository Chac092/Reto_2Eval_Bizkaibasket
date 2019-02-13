package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.copy.Erabiltzailea;

import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Programa_Main extends JFrame implements ActionListener {
	
	/*Botones de taldeak*/
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_24;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_19;
	private JButton button_18;
	private JButton button_21;
	private JButton button_20;
	private JButton button_22;
	private JButton button_23;
	/*Orain jtextfield guztiak declaratuko ditugu*/
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField;

	/*Declararemos el passwordfield para controlar la contraseña*/
	private JPasswordField passwordField;
	/*Declararemos todos los paneles */
	private JPanel contentPane;
	private JPanel Igresar_usuario;
	private JPanel Taldeak;
	private JPanel Partidak;
	private JPanel Sailkapena;
	private JPanel Admin_1;
	private JPanel Borratu_Taldeak;
	private JPanel Borratu_Jokalariak;
	private JPanel Borratu_Erabiltzailea;
	private JPanel Mod_Jokalari;
	private JPanel Mod_Taldea_1;
	private JPanel Mod_Erabiltzaile;
	private JPanel Sortu_jokalari;
	private JPanel Sortu_Talde;
	private JPanel Sortu_erabiltzaile;
	private JPanel Selekzio_Administrador;
	private JPanel Taldeak_jokalariak;
	private JPanel Jokalari_Informazioa;
	/*Aqui declararemos todos los botones del programa*/
		/*Tenemos los botones del administrador*/
	private JButton btnSortu;
	private JButton button_28;
	private JButton btnAldatu;
	private JButton btnBorratu;
	private JButton button_36;
	private JButton button_42;
	private JButton button_45;
	private JButton button_29; 
	/*Los botones de la interfraz Principal*/
	private JButton button_1;
	private JButton button;
	private JButton button_2;
	private JButton btnNewButton;
		/*Botones Ir hacia atras */
	private JButton Partidak_Atras;
	private JButton Taldeak_Atras;
	private JButton Sailkapena_Atras;
	private JButton Admin_Atras;
	private JButton Jokalari_Informazio_Atras;
		/*Botones ir hacia aldelante */
	private JButton Partidak_Adelante;
	private JButton Taldeak_Adelante;
	private JButton Sailkapena_Adelante;
	private JButton Admin_Adelante;
		/*Botones de taldea*/
	private JButton button_5;
	private JButton button_6;
	/*Aqui declararemos todas las variables que necesitemos */
	public String Idioma;
	public String profila;
	/*Aqui declararemos todos los labels*/
	/*Labels pagina de inicio*/
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
		/*Labels de taldeak*/
	private JLabel label_3; 
	private JLabel label_4;
		/*Labels de sailkapenak*/
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
		/*Label de borrar equipo*/
	private JLabel label_76;
		/*Label de borrar jugador*/
	private JLabel label_80;
	private JLabel label_79;
	/*Boton para rtocar Jugador*/
	private JButton button_41; 
		/*Label para borrar usuario*/
	private JLabel label_78;
	private JLabel label_77;
		/*Labels de mod_jugador*/
	private JLabel label_70;
	private JLabel label_71;
	private JLabel label_72;
	private JLabel label_73;
	private JLabel label_74;
	private JLabel label_75;
		/*Labels de mod_equipo*/
	private JLabel label_64;
	private JLabel label_65;
	private JLabel label_66;
	private JLabel label_67;
	private JLabel label_68;
	private JLabel label_69;
		/*labels de mod_usuario*/
	private JLabel label_56;
	private JLabel label_57;
	private JLabel label_58;
	private JLabel label_59;
	private JLabel label_60;
		/*Labls de crear jugador*/
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_54;
	private JLabel label_55;
		/*Labels de crear equipo*/
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JLabel label_51;
		/*Labels de sortu_erabiltzailea*/
	private JLabel label_61;
	private JLabel label_62;
	private JLabel label_63;
		/*Label de selekzio administrador*/
	private JLabel label_46; 
		/*Labels de taldeak jokalariak*/
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	/*Labels de jokalari informazioa*/
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	/*Aqui declararemos los arrailist y el usuario */
	static ArrayList <Erabiltzailea> Erabiltzaile = new ArrayList<Erabiltzailea>();
	static Erabiltzailea Admin = new Erabiltzailea("Admin", "Admin", "Admin");
	static ArrayList <clases.copy.Taldeak> Taldea = new ArrayList<clases.copy.Taldeak>();
	/*String del programa*/
	private String Opcion;
	private String Opcion_1;
	private int i;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa_Main frame = new Programa_Main();
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
	public Programa_Main() {
		
		Erabiltzaile.add(Admin);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Taldeak = new JPanel();
		Taldeak.setVisible(false);
		Taldeak.setBackground(new Color(102, 153, 255));
		Taldeak.setBounds(0, 0, 304, 501);
		contentPane.add(Taldeak);
		Taldeak.setVisible(false);
		Taldeak.setLayout(null);
		
		Taldeak_Atras = new JButton("");
		Taldeak_Atras.addActionListener(this);
		Taldeak_Atras.setForeground(new Color(102, 153, 255));
		Taldeak_Atras.setBackground(new Color(102, 153, 255));
		Taldeak_Atras.setBounds(10, 11, 53, 44);
		Taldeak.add(Taldeak_Atras);
		
		Taldeak_Adelante = new JButton("");
		Taldeak_Adelante.addActionListener(this);
		Taldeak_Adelante.setForeground(new Color(102, 153, 255));
		Taldeak_Adelante.setBackground(new Color(102, 153, 255));
		Taldeak_Adelante.setBounds(220, 11, 53, 44);
		Taldeak.add(Taldeak_Adelante);
		
		button_5 = new JButton("Talde 1");
		button_5.addActionListener(this);
		button_5.setEnabled(false);
		button_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(29, 83, 78, 44);
		Taldeak.add(button_5);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(287, 139, 17, 362);
		Taldeak.add(scrollBar);
		
		label_3 = new JLabel("Taldeak");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_3.setBounds(93, 12, 117, 43);
		Taldeak.add(label_3);
		
		button_6 = new JButton("Talde 2");
		button_6.addActionListener(this);
		button_6.setEnabled(false);
		button_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(171, 83, 78, 44);
		Taldeak.add(button_6);
		
		button_7 = new JButton("Talde 3");
		button_7.addActionListener(this);
		button_7.setEnabled(false);
		button_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(29, 153, 78, 44);
		Taldeak.add(button_7);
		
		button_8 = new JButton("Talde 4");
		button_8.addActionListener(this);
		button_8.setEnabled(false);
		button_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(171, 153, 78, 44);
		Taldeak.add(button_8);
		
		button_9 = new JButton("Talde 5");
		button_9.addActionListener(this);
		button_9.setEnabled(false);
		button_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(29, 222, 78, 44);
		Taldeak.add(button_9);
		
		button_10 = new JButton("Talde 6");
		button_10.addActionListener(this);
		button_10.setEnabled(false);
		button_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(171, 222, 78, 44);
		Taldeak.add(button_10);
		
		button_11 = new JButton("Talde 7");
		button_11.addActionListener(this);
		button_11.setEnabled(false);
		button_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(29, 293, 78, 44);
		Taldeak.add(button_11);
		
		button_12 = new JButton("Talde 9");
		button_12.addActionListener(this);
		button_12.setEnabled(false);
		button_12.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(29, 361, 78, 44);
		Taldeak.add(button_12);
		
		button_13 = new JButton("Talde 10");
		button_13.addActionListener(this);
		button_13.setEnabled(false);
		button_13.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(171, 361, 78, 44);
		Taldeak.add(button_13);
		
		button_14 = new JButton("Talde 11");
		button_14.addActionListener(this);
		button_14.setEnabled(false);
		button_14.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_14.setBackground(Color.WHITE);
		button_14.setBounds(29, 429, 78, 44);
		Taldeak.add(button_14);
		
		button_15 = new JButton("Talde 12");
		button_15.addActionListener(this);
		button_15.setEnabled(false);
		button_15.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(171, 429, 78, 44);
		Taldeak.add(button_15);
		
		button_16 = new JButton("Talde 14");
		button_16.addActionListener(this);
		button_16.setEnabled(false);
		button_16.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_16.setBackground(Color.WHITE);
		button_16.setBounds(171, 497, 78, 44);
		Taldeak.add(button_16);
		
		button_17 = new JButton("Talde 13");
		button_17.addActionListener(this);
		button_17.setEnabled(false);
		button_17.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(29, 497, 78, 44);
		Taldeak.add(button_17);
		
		button_18 = new JButton("Talde 16");
		button_18.setEnabled(false);
		button_18.addActionListener(this);
		button_18.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(171, 567, 78, 44);
		Taldeak.add(button_18);
		
		button_19 = new JButton("Talde 15");
		button_19.setEnabled(false);
		button_19.addActionListener(this);
		button_19.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_19.setBackground(Color.WHITE);
		button_19.setBounds(29, 567, 78, 44);
		Taldeak.add(button_19);
		
		button_20 = new JButton("Talde 18");
		button_20.addActionListener(this);
		button_20.setEnabled(false);
		button_20.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_20.setBackground(Color.WHITE);
		button_20.setBounds(171, 634, 78, 44);
		Taldeak.add(button_20);
		
		button_21 = new JButton("Talde 17");
		button_21.addActionListener(this);
		button_21.setEnabled(false);
		button_21.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_21.setBackground(Color.WHITE);
		button_21.setBounds(29, 634, 78, 44);
		Taldeak.add(button_21);
		
		button_22 = new JButton("Talde 19");
		button_22.addActionListener(this);
		button_22.setEnabled(false);
		button_22.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_22.setBackground(Color.WHITE);
		button_22.setBounds(29, 703, 78, 44);
		Taldeak.add(button_22);
		
		button_23 = new JButton("Talde 20");
		button_23.addActionListener(this);
		button_23.setEnabled(false);
		button_23.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_23.setBackground(Color.WHITE);
		button_23.setBounds(171, 703, 78, 44);
		Taldeak.add(button_23);
		
		button_24 = new JButton("Talde 8");
		button_24.addActionListener(this);
		button_24.setEnabled(false);
		button_24.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		button_24.setBackground(Color.WHITE);
		button_24.setBounds(171, 293, 78, 44);
		Taldeak.add(button_24);
		
		Igresar_usuario = new JPanel();
		Igresar_usuario.setBackground(new Color(102, 153, 255));
		Igresar_usuario.setBounds(0, 0, 304, 501);
		contentPane.add(Igresar_usuario);
		Igresar_usuario.setLayout(null);
		
		label = new JLabel("ERABILTZAILEA");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		label.setBounds(34, 11, 280, 68);
		Igresar_usuario.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(34, 75, 189, 37);
		Igresar_usuario.add(textField);
		
		label_1 = new JLabel("PASAHITZA");
		label_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		label_1.setBounds(34, 116, 280, 68);
		Igresar_usuario.add(label_1);
		
		button = new JButton("");
		button.addActionListener(this);
		button.setIcon(new ImageIcon("H:\\euskad cami.png"));
		button.setBackground(new Color(102, 153, 255));
		button.setBounds(177, 261, 91, 115);
		Igresar_usuario.add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(this);
		button_1.setIcon(new ImageIcon("H:\\spa.png"));
		button_1.setMinimumSize(new Dimension(30, 70));
		button_1.setMaximumSize(new Dimension(30, 70));
		button_1.setBackground(new Color(102, 153, 255));
		button_1.setBounds(34, 261, 91, 115);
		Igresar_usuario.add(button_1);
		
		button_2 = new JButton("Sartu");
		button_2.addActionListener(this);
		button_2.setBounds(165, 441, 103, 38);
		Igresar_usuario.add(button_2);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('■');
		passwordField.setBounds(34, 177, 189, 37);
		Igresar_usuario.add(passwordField);
		
		label_2 = new JLabel("");
		label_2.setBounds(46, 387, 164, 22);
		Igresar_usuario.add(label_2);
		
		btnNewButton = new JButton("Ikuslea Naiz");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(15, 441, 110, 38);
		Igresar_usuario.add(btnNewButton);
		
		Taldeak_jokalariak = new JPanel();
		Taldeak_jokalariak.setBackground(new Color(102, 153, 255));
		Taldeak_jokalariak.setBounds(0, 0, 304, 501);
		contentPane.add(Taldeak_jokalariak);
		Taldeak_jokalariak.setVisible(false);
		Taldeak_jokalariak.setLayout(null);
		
		label_30 = new JLabel("Taldearen Izena");
		label_30.setForeground(Color.WHITE);
		label_30.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_30.setBounds(28, 11, 285, 43);
		Taldeak_jokalariak.add(label_30);
		
		label_31 = new JLabel("Jokalariak");
		label_31.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 25));
		label_31.setBounds(89, 98, 138, 33);
		Taldeak_jokalariak.add(label_31);
		
		label_42 = new JLabel("Herrialdea");
		label_42.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 25));
		label_42.setBounds(10, 65, 138, 33);
		Taldeak_jokalariak.add(label_42);
		
		label_43 = new JLabel("Zelaia");
		label_43.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 25));
		label_43.setBounds(223, 65, 90, 33);
		Taldeak_jokalariak.add(label_43);
		
		label_44 = new JLabel("Posta");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_44.setBounds(122, 450, 72, 28);
		Taldeak_jokalariak.add(label_44);
		
		JButton btnJokalari = new JButton("Jojalari 1");
		btnJokalari.setEnabled(false);
		btnJokalari.setBounds(28, 170, 89, 23);
		Taldeak_jokalariak.add(btnJokalari);
		
		JButton btnJokalari_1 = new JButton("Jokalari 2");
		btnJokalari_1.setEnabled(false);
		btnJokalari_1.setBounds(187, 170, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_1);
		
		JButton btnJokalari_2 = new JButton("Jokalari 3");
		btnJokalari_2.setEnabled(false);
		btnJokalari_2.setBounds(28, 204, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_2);
		
		JButton btnJokalari_3 = new JButton("Jokalari 4");
		btnJokalari_3.setEnabled(false);
		btnJokalari_3.setBounds(187, 204, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_3);
		
		JButton btnJokalari_4 = new JButton("Jokalari 5");
		btnJokalari_4.setEnabled(false);
		btnJokalari_4.setBounds(28, 238, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_4);
		
		JButton btnJokalari_5 = new JButton("Jokalari 6");
		btnJokalari_5.setEnabled(false);
		btnJokalari_5.setBounds(187, 238, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_5);
		
		JButton btnJokalari_6 = new JButton("Jokalari 7");
		btnJokalari_6.setEnabled(false);
		btnJokalari_6.setBounds(28, 272, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_6);
		
		JButton btnJokalari_7 = new JButton("Jokalari 8");
		btnJokalari_7.setEnabled(false);
		btnJokalari_7.setBounds(187, 272, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_7);
		
		JButton btnJokalari_8 = new JButton("Jokalari 9");
		btnJokalari_8.setEnabled(false);
		btnJokalari_8.setBounds(28, 306, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_8);
		
		JButton btnJokalari_9 = new JButton("Jokalari 10");
		btnJokalari_9.setEnabled(false);
		btnJokalari_9.setBounds(187, 306, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_9);
		
		JButton btnJokalari_10 = new JButton("Jokalari 11");
		btnJokalari_10.setEnabled(false);
		btnJokalari_10.setBounds(28, 340, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_10);
		
		JButton btnJokalari_11 = new JButton("Jokalari 12");
		btnJokalari_11.setEnabled(false);
		btnJokalari_11.setBounds(187, 340, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_11);
		
		JButton btnJokalari_12 = new JButton("Jokalari 13");
		btnJokalari_12.setEnabled(false);
		btnJokalari_12.setBounds(28, 374, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_12);
		
		JButton btnJokalari_13 = new JButton("Jokalari 14");
		btnJokalari_13.setEnabled(false);
		btnJokalari_13.setBounds(187, 374, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_13);
		
		JButton btnJokalari_14 = new JButton("Jokalari 15");
		btnJokalari_14.setEnabled(false);
		btnJokalari_14.setBounds(105, 416, 89, 23);
		Taldeak_jokalariak.add(btnJokalari_14);
		
		Borratu_Jokalariak = new JPanel();
		Borratu_Jokalariak.setLayout(null);
		Borratu_Jokalariak.setBackground(new Color(102, 153, 255));
		Borratu_Jokalariak.setBounds(0, 0, 313, 501);
		Borratu_Jokalariak.setVisible(false);
		
		Borratu_Taldeak = new JPanel();
		Borratu_Taldeak.setLayout(null);
		Borratu_Taldeak.setBackground(new Color(102, 153, 255));
		Borratu_Taldeak.setBounds(0, 0, 313, 501);
		Borratu_Taldeak.setVisible(false);
		
		Mod_Taldea_1 = new JPanel();
		Mod_Taldea_1.setBackground(new Color(102, 153, 255));
		Mod_Taldea_1.setBounds(0, 0, 304, 500);
		contentPane.add(Mod_Taldea_1);
		Mod_Taldea_1.setVisible(false);
		Mod_Taldea_1.setLayout(null);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(86, 57, 138, 35);
		Mod_Taldea_1.add(textField_22);
		
		label_64 = new JLabel("Izena");
		label_64.setForeground(Color.WHITE);
		label_64.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_64.setBounds(133, 11, 59, 35);
		Mod_Taldea_1.add(label_64);
		
		button_41 = new JButton("Bilatu");
		button_41.addActionListener(this);
		button_41.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_41.setBounds(110, 120, 89, 23);
		Mod_Taldea_1.add(button_41);
		
		label_65 = new JLabel("Kod Taldea");
		label_65.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_65.setBounds(10, 169, 117, 28);
		Mod_Taldea_1.add(label_65);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(144, 169, 146, 26);
		Mod_Taldea_1.add(textField_23);
		
		label_66 = new JLabel("Izena");
		label_66.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_66.setBounds(10, 219, 117, 28);
		Mod_Taldea_1.add(label_66);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(144, 221, 146, 26);
		Mod_Taldea_1.add(textField_24);
		
		label_67 = new JLabel("Udalerri");
		label_67.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_67.setBounds(10, 271, 117, 28);
		Mod_Taldea_1.add(label_67);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(144, 273, 146, 26);
		Mod_Taldea_1.add(textField_25);
		
		label_68 = new JLabel("Posta");
		label_68.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_68.setBounds(10, 320, 117, 28);
		Mod_Taldea_1.add(label_68);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(144, 322, 146, 26);
		Mod_Taldea_1.add(textField_26);
		
		label_69 = new JLabel("Zelaia");
		label_69.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_69.setBounds(10, 374, 117, 28);
		Mod_Taldea_1.add(label_69);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(144, 376, 146, 26);
		Mod_Taldea_1.add(textField_27);
		
		button_42 = new JButton("Aldatu");
		button_42.addActionListener(this);
		button_42.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		button_42.setBounds(95, 428, 117, 50);
		Mod_Taldea_1.add(button_42);
		
		Selekzio_Administrador = new JPanel();
		Selekzio_Administrador.setBackground(new Color(102, 153, 255));
		Selekzio_Administrador.setBounds(0, 0, 304, 501);
		contentPane.add(Selekzio_Administrador);
		Selekzio_Administrador.setVisible(false);
		Selekzio_Administrador.setLayout(null);
		
		label_46 = new JLabel("Administrazioa");
		label_46.setForeground(Color.WHITE);
		label_46.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_46.setBounds(68, 38, 222, 43);
		Selekzio_Administrador.add(label_46);
		
		btnSortu = new JButton("Sortu");
		btnSortu.addActionListener(this);
		btnSortu.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		btnSortu.setBackground(Color.WHITE);
		btnSortu.setBounds(59, 142, 194, 62);
		Selekzio_Administrador.add(btnSortu);
		
		btnAldatu = new JButton("Aldatu");
		btnAldatu.addActionListener(this);
		btnAldatu.setEnabled(false);
		btnAldatu.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		btnAldatu.setBackground(Color.WHITE);
		btnAldatu.setBounds(59, 241, 194, 57);
		Selekzio_Administrador.add(btnAldatu);
		
		Admin_Atras = new JButton("");
		Admin_Atras.addActionListener(this);
		Admin_Atras.setForeground(new Color(255, 51, 0));
		Admin_Atras.setBackground(new Color(255, 51, 51));
		Admin_Atras.setBounds(10, 37, 53, 44);
		Selekzio_Administrador.add(Admin_Atras);
		
		Admin_Adelante = new JButton("");
		Admin_Adelante.addActionListener(this);
		Admin_Adelante.setForeground(new Color(204, 255, 51));
		Admin_Adelante.setBackground(new Color(153, 255, 51));
		Admin_Adelante.setBounds(250, 37, 53, 44);
		Selekzio_Administrador.add(Admin_Adelante);
		
		btnBorratu = new JButton("Borratu");
		btnBorratu.addActionListener(this);
		btnBorratu.setEnabled(false);
		btnBorratu.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		btnBorratu.setBackground(Color.WHITE);
		btnBorratu.setBounds(59, 338, 194, 57);
		Selekzio_Administrador.add(btnBorratu);
		
		Admin_1 = new JPanel();
		Admin_1.setBackground(new Color(102, 153, 255));
		Admin_1.setBounds(0, 0, 304, 500);
		contentPane.add(Admin_1);
		Admin_1.setVisible(false);
		Admin_1.setLayout(null);
		
		button_28 = new JButton("Taldeak");
		button_28.addActionListener(this);
		button_28.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		button_28.setBackground(Color.WHITE);
		button_28.setBounds(58, 91, 194, 117);
		Admin_1.add(button_28);
		
		button_29 = new JButton("jjjj");
		button_29.setEnabled(false);
		System.out.println("henen");
		button_29.addActionListener(this);
		button_29.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		button_29.setBackground(Color.WHITE);
		button_29.setBounds(58, 272, 194, 117);
		Admin_1.add(button_29);
		
		Partidak = new JPanel();
		Partidak.setBackground(new Color(102, 153, 255));
		Partidak.setBounds(0, 0, 304, 501);
		contentPane.add(Partidak);
		Partidak.setVisible(false);
		Partidak.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Verdana", Font.BOLD, 13));
		comboBox.setBounds(83, 84, 125, 20);
		Partidak.add(comboBox);
		
		Partidak_Adelante = new JButton("");
		Partidak_Adelante.addActionListener(this);
		Partidak_Adelante.setBackground(new Color(102, 153, 255));
		Partidak_Adelante.setBounds(228, 20, 53, 44);
		Partidak.add(Partidak_Adelante);
		
		label_4 = new JLabel("Partidak");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_4.setBounds(94, 20, 112, 44);
		Partidak.add(label_4);
		
		Partidak_Atras = new JButton("");
		Partidak_Atras.addActionListener(this);
		Partidak_Atras.setBackground(new Color(102, 153, 255));
		Partidak_Atras.setBounds(18, 20, 53, 44);
		Partidak.add(Partidak_Atras);
		
		JLabel label_5 = new JLabel("Talde 1");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(18, 115, 64, 32);
		Partidak.add(label_5);
		
		JLabel label_6 = new JLabel("Talde 2");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(18, 158, 64, 32);
		Partidak.add(label_6);
		
		JLabel label_7 = new JLabel("Talde 3");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(18, 223, 64, 32);
		Partidak.add(label_7);
		
		JLabel label_8 = new JLabel("Talde 4");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_8.setBounds(18, 266, 64, 32);
		Partidak.add(label_8);
		
		JLabel label_9 = new JLabel("Talde 5");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_9.setBounds(18, 325, 64, 32);
		Partidak.add(label_9);
		
		JLabel label_10 = new JLabel("Talde 6");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_10.setBounds(18, 368, 64, 32);
		Partidak.add(label_10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 124, 47, 20);
		Partidak.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 167, 47, 20);
		Partidak.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(223, 232, 47, 20);
		Partidak.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(223, 275, 47, 20);
		Partidak.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(223, 334, 47, 20);
		Partidak.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(223, 377, 47, 20);
		Partidak.add(textField_6);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(3, 209, 281, 28);
		Partidak.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 315, 281, 28);
		Partidak.add(separator_1);
		
		JLabel label_11 = new JLabel("Talde 8");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_11.setBounds(18, 468, 64, 32);
		Partidak.add(label_11);
		
		JLabel label_12 = new JLabel("Talde 7");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_12.setBounds(18, 425, 64, 32);
		Partidak.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(223, 434, 47, 20);
		Partidak.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(223, 477, 47, 20);
		Partidak.add(textField_8);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 415, 281, 28);
		Partidak.add(separator_2);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(287, 158, 17, 345);
		Partidak.add(scrollBar_1);
		
		Sailkapena = new JPanel();
		Sailkapena.setBackground(new Color(102, 153, 255));
		Sailkapena.setBounds(0, 0, 304, 501);
		contentPane.add(Sailkapena);
		Sailkapena.setVisible(false);
		Sailkapena.setLayout(null);
		
		label_13 = new JLabel("Sailkapena");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_13.setBounds(54, 44, 196, 43);
		Sailkapena.add(label_13);
		
		label_14 = new JLabel("1. Talde 1");
		label_14.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_14.setBounds(10, 170, 84, 20);
		Sailkapena.add(label_14);
		
		label_15 = new JLabel("2. Talde 2");
		label_15.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_15.setBounds(10, 201, 84, 20);
		Sailkapena.add(label_15);
		
		label_16 = new JLabel("3. Talde 5");
		label_16.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_16.setBounds(10, 232, 84, 20);
		Sailkapena.add(label_16);
		
		label_17 = new JLabel("4. Talde 3");
		label_17.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_17.setBounds(10, 263, 84, 20);
		Sailkapena.add(label_17);
		
		label_18 = new JLabel("5. Talde 9");
		label_18.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_18.setBounds(10, 294, 84, 20);
		Sailkapena.add(label_18);
		
		label_19 = new JLabel("6. Talde 4");
		label_19.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_19.setBounds(10, 325, 84, 20);
		Sailkapena.add(label_19);
		
		label_20 = new JLabel("7. Talde 6");
		label_20.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_20.setBounds(10, 356, 84, 20);
		Sailkapena.add(label_20);
		
		label_21 = new JLabel("8. Talde 8");
		label_21.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_21.setBounds(10, 387, 84, 20);
		Sailkapena.add(label_21);
		
		label_22 = new JLabel("9. Talde 7");
		label_22.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_22.setBounds(10, 416, 84, 20);
		Sailkapena.add(label_22);
		
		label_23 = new JLabel("10. Talde 10");
		label_23.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		label_23.setBounds(10, 447, 98, 20);
		Sailkapena.add(label_23);
		
		label_24 = new JLabel("Partidak");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_24.setBounds(153, 143, 69, 20);
		Sailkapena.add(label_24);
		
		label_25 = new JLabel("Puntuak");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_25.setBounds(232, 146, 57, 14);
		Sailkapena.add(label_25);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(218, 143, 2, 336);
		Sailkapena.add(separator_3);
		
		Sailkapena_Atras = new JButton("");
		Sailkapena_Atras.addActionListener(this);
		Sailkapena_Atras.setForeground(new Color(102, 153, 255));
		Sailkapena_Atras.setBackground(new Color(102, 153, 255));
		Sailkapena_Atras.setBounds(0, 43, 53, 44);
		Sailkapena.add(Sailkapena_Atras);
		
		Sailkapena_Adelante = new JButton("");
		Sailkapena_Adelante.addActionListener(this);
		Sailkapena_Adelante.setForeground(new Color(102, 153, 255));
		Sailkapena_Adelante.setBackground(new Color(102, 153, 255));
		Sailkapena_Adelante.setBounds(251, 44, 53, 44);
		Sailkapena.add(Sailkapena_Adelante);
		contentPane.add(Borratu_Taldeak);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(76, 191, 138, 35);
		Borratu_Taldeak.add(textField_34);
		
		label_76 = new JLabel("Izena");
		label_76.setForeground(Color.WHITE);
		label_76.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_76.setBounds(122, 146, 55, 35);
		Borratu_Taldeak.add(label_76);
		
		button_45 = new JButton("Bilatu eta borratu");
		button_45.addActionListener(this);
		button_45.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_45.setBounds(64, 254, 169, 23);
		Borratu_Taldeak.add(button_45);
		contentPane.add(Borratu_Jokalariak);
		
		label_79 = new JLabel("Taldea");
		label_79.setForeground(Color.WHITE);
		label_79.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_79.setBounds(31, 169, 96, 35);
		Borratu_Jokalariak.add(label_79);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(10, 215, 117, 35);
		Borratu_Jokalariak.add(textField_36);
		
		label_80 = new JLabel("Izena");
		label_80.setForeground(Color.WHITE);
		label_80.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_80.setBounds(217, 169, 96, 35);
		Borratu_Jokalariak.add(label_80);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(186, 215, 117, 35);
		Borratu_Jokalariak.add(textField_37);
		
		JButton button_47 = new JButton("Bilatu eta borratu");
		button_47.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_47.setBounds(85, 276, 155, 23);
		Borratu_Jokalariak.add(button_47);
		
		Borratu_Erabiltzailea = new JPanel();
		Borratu_Erabiltzailea.setLayout(null);
		Borratu_Erabiltzailea.setBackground(new Color(102, 153, 255));
		Borratu_Erabiltzailea.setBounds(0, 0, 313, 501);
		Borratu_Erabiltzailea.setVisible(false);
		contentPane.add(Borratu_Erabiltzailea);
		
		label_77 = new JLabel("Izena");
		label_77.setForeground(Color.WHITE);
		label_77.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_77.setBounds(43, 184, 57, 35);
		Borratu_Erabiltzailea.add(label_77);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(10, 230, 117, 35);
		Borratu_Erabiltzailea.add(textField_35);
		
		label_78 = new JLabel("Profila");
		label_78.setForeground(Color.WHITE);
		label_78.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_78.setBounds(195, 184, 75, 35);
		Borratu_Erabiltzailea.add(label_78);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		comboBox_5.setBackground(Color.BLACK);
		comboBox_5.setBounds(151, 231, 152, 34);
		Borratu_Erabiltzailea.add(comboBox_5);
		
		JButton button_46 = new JButton("Bilatu eta borratu");
		button_46.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_46.setBounds(66, 287, 165, 23);
		Borratu_Erabiltzailea.add(button_46);
		
		Mod_Jokalari = new JPanel();
		Mod_Jokalari.setBackground(new Color(102, 153, 255));
		Mod_Jokalari.setBounds(0, 0, 304, 500);
		contentPane.add(Mod_Jokalari);
		Mod_Jokalari.setVisible(false);
		Mod_Jokalari.setLayout(null);
		
		label_70 = new JLabel("Taldea");
		label_70.setForeground(Color.WHITE);
		label_70.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_70.setBounds(31, 23, 96, 35);
		Mod_Jokalari.add(label_70);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(10, 69, 117, 35);
		Mod_Jokalari.add(textField_28);
		
		label_71 = new JLabel("Izena");
		label_71.setForeground(Color.WHITE);
		label_71.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_71.setBounds(217, 23, 96, 35);
		Mod_Jokalari.add(label_71);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(186, 69, 117, 35);
		Mod_Jokalari.add(textField_29);
		
		JButton button_43 = new JButton("Bilatu");
		button_43.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_43.setBounds(109, 129, 89, 23);
		Mod_Jokalari.add(button_43);
		
		label_72 = new JLabel("Dni jokalaria");
		label_72.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_72.setBounds(10, 194, 117, 28);
		Mod_Jokalari.add(label_72);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(144, 194, 146, 26);
		Mod_Jokalari.add(textField_30);
		
		label_73 = new JLabel("Izena");
		label_73.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_73.setBounds(10, 244, 117, 28);
		Mod_Jokalari.add(label_73);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(144, 246, 146, 26);
		Mod_Jokalari.add(textField_31);
		
		label_74 = new JLabel("Abizena");
		label_74.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_74.setBounds(10, 296, 117, 28);
		Mod_Jokalari.add(label_74);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(144, 298, 146, 26);
		Mod_Jokalari.add(textField_32);
		
		label_75 = new JLabel("Taldea");
		label_75.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_75.setBounds(10, 345, 117, 28);
		Mod_Jokalari.add(label_75);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(144, 347, 146, 26);
		Mod_Jokalari.add(textField_33);
		
		JButton button_44 = new JButton("Aldatu");
		button_44.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		button_44.setBounds(94, 418, 117, 50);
		Mod_Jokalari.add(button_44);
		
		Mod_Erabiltzaile = new JPanel();
		Mod_Erabiltzaile.setBackground(new Color(102, 153, 255));
		Mod_Erabiltzaile.setBounds(0, 0, 304, 500);
		contentPane.add(Mod_Erabiltzaile);
		Mod_Erabiltzaile.setVisible(false);
		Mod_Erabiltzaile.setLayout(null);
		
		label_56 = new JLabel("Izena");
		label_56.setForeground(Color.WHITE);
		label_56.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_56.setBounds(43, 27, 57, 35);
		Mod_Erabiltzaile.add(label_56);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 73, 117, 35);
		Mod_Erabiltzaile.add(textField_17);
		
		label_57 = new JLabel("Profila");
		label_57.setForeground(Color.WHITE);
		label_57.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		label_57.setBounds(195, 27, 75, 35);
		Mod_Erabiltzaile.add(label_57);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		comboBox_2.setBackground(Color.BLACK);
		comboBox_2.setBounds(151, 74, 152, 34);
		Mod_Erabiltzaile.add(comboBox_2);
		
		JButton button_38 = new JButton("Bilatu");
		button_38.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		button_38.setBounds(106, 129, 89, 23);
		Mod_Erabiltzaile.add(button_38);
		
		label_58 = new JLabel("Erabiltzaile");
		label_58.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_58.setBounds(10, 209, 146, 28);
		Mod_Erabiltzaile.add(label_58);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(144, 211, 146, 26);
		Mod_Erabiltzaile.add(textField_18);
		
		label_59 = new JLabel("Pasahitza");
		label_59.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_59.setBounds(10, 261, 117, 28);
		Mod_Erabiltzaile.add(label_59);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(144, 266, 146, 26);
		Mod_Erabiltzaile.add(textField_19);
		
		label_60 = new JLabel("Profila");
		label_60.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		label_60.setBounds(32, 310, 117, 28);
		Mod_Erabiltzaile.add(label_60);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		comboBox_3.setBackground(Color.BLACK);
		comboBox_3.setBounds(117, 315, 153, 23);
		Mod_Erabiltzaile.add(comboBox_3);
		
		JButton button_39 = new JButton("Aldatu");
		button_39.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		button_39.setBounds(95, 401, 117, 50);
		Mod_Erabiltzaile.add(button_39);
		
		Sortu_jokalari = new JPanel();
		Sortu_jokalari.setBackground(new Color(102, 153, 255));
		Sortu_jokalari.setBounds(0, 0, 304, 500);
		contentPane.add(Sortu_jokalari);
		Sortu_jokalari.setVisible(false);
		Sortu_jokalari.setLayout(null);
		
		label_52 = new JLabel("Sartu izena:");
		label_52.setForeground(Color.WHITE);
		label_52.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_52.setBounds(10, 107, 162, 40);
		Sortu_jokalari.add(label_52);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(20, 158, 179, 34);
		Sortu_jokalari.add(textField_14);
		
		JButton button_37 = new JButton("Sartu");
		button_37.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		button_37.setBounds(165, 425, 127, 61);
		Sortu_jokalari.add(button_37);
		
		label_53 = new JLabel("Kod_jokalari");
		label_53.setForeground(Color.WHITE);
		label_53.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_53.setBounds(10, 11, 189, 40);
		Sortu_jokalari.add(label_53);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(20, 62, 179, 34);
		Sortu_jokalari.add(textField_15);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(20, 350, 179, 40);
		Sortu_jokalari.add(comboBox_1);
		
		label_54 = new JLabel("Taldea");
		label_54.setForeground(Color.WHITE);
		label_54.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_54.setBounds(10, 299, 189, 40);
		Sortu_jokalari.add(label_54);
		
		label_55 = new JLabel("Sartu Abizena:");
		label_55.setForeground(Color.WHITE);
		label_55.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_55.setBounds(10, 203, 222, 40);
		Sortu_jokalari.add(label_55);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(20, 254, 179, 34);
		Sortu_jokalari.add(textField_16);
		
		Sortu_Talde = new JPanel();
		Sortu_Talde.setBackground(new Color(102, 153, 255));
		Sortu_Talde.setBounds(0, 0, 304, 500);
		contentPane.add(Sortu_Talde);
		Sortu_Talde.setVisible(false);
		Sortu_Talde.setLayout(null);
		
		label_47 = new JLabel("Sartu izena:");
		label_47.setForeground(Color.WHITE);
		label_47.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_47.setBounds(16, 107, 162, 40);
		Sortu_Talde.add(label_47);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(26, 158, 179, 34);
		Sortu_Talde.add(textField_9);
		
		label_48 = new JLabel("Kod_Taldea");
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_48.setBounds(16, 11, 189, 40);
		Sortu_Talde.add(label_48);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(26, 62, 179, 34);
		Sortu_Talde.add(textField_10);
		
		label_49 = new JLabel("Udalerria");
		label_49.setForeground(Color.WHITE);
		label_49.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_49.setBounds(16, 203, 189, 40);
		Sortu_Talde.add(label_49);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(26, 254, 179, 34);
		Sortu_Talde.add(textField_11);
		
		label_50 = new JLabel("Posta elektronikoa");
		label_50.setForeground(Color.WHITE);
		label_50.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_50.setBounds(16, 299, 257, 40);
		Sortu_Talde.add(label_50);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(26, 350, 179, 34);
		Sortu_Talde.add(textField_12);
		
		label_51 = new JLabel("Zelaia");
		label_51.setForeground(Color.WHITE);
		label_51.setFont(new Font("Dialog", Font.PLAIN, 31));
		label_51.setBounds(16, 395, 257, 40);
		Sortu_Talde.add(label_51);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(26, 446, 179, 34);
		Sortu_Talde.add(textField_13);
		
		button_36 = new JButton("Sartu");
		button_36.addActionListener(this);
		button_36.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_36.setBounds(215, 467, 89, 23);
		Sortu_Talde.add(button_36);
		
		Sortu_erabiltzaile = new JPanel();
		Sortu_erabiltzaile.setBackground(new Color(102, 153, 255));
		Sortu_erabiltzaile.setBounds(0, 0, 304, 500);
		contentPane.add(Sortu_erabiltzaile);
		Sortu_erabiltzaile.setVisible(false);
		Sortu_erabiltzaile.setLayout(null);
		
		label_61 = new JLabel("Erabiltzaile Pasahitza");
		label_61.setForeground(Color.WHITE);
		label_61.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_61.setBounds(10, 143, 293, 40);
		Sortu_erabiltzaile.add(label_61);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(20, 194, 179, 34);
		Sortu_erabiltzaile.add(textField_20);
		
		label_62 = new JLabel("Erabiltzaile izena");
		label_62.setForeground(Color.WHITE);
		label_62.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_62.setBounds(10, 47, 231, 40);
		Sortu_erabiltzaile.add(label_62);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(20, 98, 179, 34);
		Sortu_erabiltzaile.add(textField_21);
		
		label_63 = new JLabel("Profila");
		label_63.setForeground(Color.WHITE);
		label_63.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		label_63.setBounds(10, 239, 189, 40);
		Sortu_erabiltzaile.add(label_63);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		comboBox_4.setBounds(20, 290, 179, 40);
		Sortu_erabiltzaile.add(comboBox_4);
		
		JButton button_40 = new JButton("Sartu");
		button_40.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		button_40.setBounds(176, 362, 127, 61);
		Sortu_erabiltzaile.add(button_40);
		
		Jokalari_Informazioa = new JPanel();
		Jokalari_Informazioa.setBackground(new Color(102, 153, 255));
		Jokalari_Informazioa.setBounds(0, 0, 304, 501);
		contentPane.add(Jokalari_Informazioa);
		Jokalari_Informazioa.setVisible(false);
		Jokalari_Informazioa.setLayout(null);
		
		JLabel label_26 = new JLabel("Izena");
		label_26.setForeground(Color.WHITE);
		label_26.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_26.setBounds(10, 138, 126, 43);
		Jokalari_Informazioa.add(label_26);
		
		label_27 = new JLabel("Abizena");
		label_27.setForeground(Color.WHITE);
		label_27.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_27.setBounds(10, 211, 142, 43);
		Jokalari_Informazioa.add(label_27);
		
		label_28 = new JLabel("Altuera");
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_28.setBounds(10, 286, 126, 43);
		Jokalari_Informazioa.add(label_28);
		
		label_29 = new JLabel("Taldea");
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 39));
		label_29.setBounds(10, 361, 126, 43);
		Jokalari_Informazioa.add(label_29);
		
		Jokalari_Informazio_Atras = new JButton("");
		Jokalari_Informazio_Atras.addActionListener(this);
		Jokalari_Informazio_Atras.setBounds(56, 30, 196, 69);
		Jokalari_Informazioa.add(Jokalari_Informazio_Atras);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object Botones = e.getSource();
		System.out.println("2");
		if(Botones == btnNewButton) {
			Igresar_usuario.setVisible(false);
			Taldeak.setVisible(true);
		}
		if (Botones == button_1) {
			button_1.setBackground(new Color (208,208,208));
			button.setBackground(new Color (102, 153, 255));
			Idioma = "Castellano";
			label.setText("USUARIO");
			label_1.setText("CONTRASEÑA");			
			button_2.setText("Entrar");
		}
		else if (Botones == button) {
			button.setBackground(new Color(208,208,208));
			button_1.setBackground(new Color(102, 153, 255));
			Idioma = "Euskera";
			label.setText("ERABILTZAILEA");
			label_1.setText("PASAHITZA");
			button_2.setText("Sartu");
		}
		else if (Botones == button_2) {
			usuarioycontrseña();
		}
		else if (Botones == Partidak_Atras) {
			Partidak.setVisible(false);
			Sailkapena.setVisible(true);
			}
		else if (Botones == Sailkapena_Atras) {
			Sailkapena.setVisible(false);
			Taldeak.setVisible(true);
		}
		else if (Botones == Taldeak_Atras) {
			if (profila == "Admin") {
				Taldeak.setVisible(false);
				Selekzio_Administrador.setVisible(true);
			}
			else {
				Taldeak.setVisible(false);
				Partidak.setVisible(true);
			}
		}
		else if (Botones == Admin_Atras) {
			Selekzio_Administrador.setVisible(false);
			Partidak.setVisible(true);
		}
		else if (Botones == Jokalari_Informazio_Atras) {
			
		}
		else if (Botones == Partidak_Adelante) {
			if (profila == "Admin") {
				Partidak.setVisible(false);
				Selekzio_Administrador.setVisible(true);
			}
			else {
				Partidak.setVisible(false);
				Taldeak.setVisible(true);
			}
		}
		else if (Botones == Taldeak_Adelante) {
			Taldeak.setVisible(false);
			Sailkapena.setVisible(true);
		}
		else if (Botones == Sailkapena_Adelante) {
			Sailkapena.setVisible(false);
			Partidak.setVisible(true);
		}
		else if (Botones == Admin_Adelante) {
			Selekzio_Administrador.setVisible(false);
			Taldeak.setVisible(true);
		}
		else if (Botones == btnSortu) {
			Opcion = "Sortu";
			Selekzio_Administrador.setVisible(false);
			Admin_1.setVisible(true);
		}
		else if (Botones == btnAldatu) {
			Opcion = "Aldatu";
			Selekzio_Administrador.setVisible(false);
			Admin_1.setVisible(true);
		}
		else if (Botones == btnBorratu) {
			Opcion = "Borratu";
			Selekzio_Administrador.setVisible(false);
			Admin_1.setVisible(true);
		}
		else if (Botones == button_28) {
			Taldeak_Opsioak();
		}
		else if (Botones == button_29) {
			Jokalariak_Opsioak();
		}
		
		if (Botones == button_36) {
			AñadirTaldea();
		}
		if (Botones == button_41) {
			
			String Buscador;
			Buscador = textField_22.getText();
			boolean Encontrado = false;
			for (i=0; Taldea.size()>i &&!Encontrado == true;i++) {
				if (Taldea.get(i).getIzena() == Buscador) {
					Encontrado = true;
				}
			}
			System.out.println(i--);
			textField_23.setText(Taldea.get(i).getKod_taldea());
			textField_24.setText(Taldea.get(i).getIzena());
			textField_25.setText(Taldea.get(i).getUdalerri());
			textField_26.setText(Taldea.get(i).getPosta());
			textField_27.setText(Taldea.get(i).getZelaia());
		}
		if (Botones == button_42 ) {
			Taldea.get(i).setKod_taldea(textField_23.getText());
			Taldea.get(i).setIzena(textField_24.getText());
			Taldea.get(i).setUdalerri(textField_25.getText());
			Taldea.get(i).setPosta(textField_26.getText());
			Taldea.get(i).setPosta(textField_27.getText());
			Mod_Taldea_1.setVisible(false);
			Selekzio_Administrador.setVisible(true);
			actualizar();
		}
		if (Botones == button_45) {
			String Buscador;
			Buscador = textField_22.getText();
			boolean Encontrado = false;
			for (i=0; Taldea.size()>i && Encontrado == true;i++) {
				if (Taldea.get(i--).getIzena() == Buscador) {
					Encontrado = true;
				}
			}
			Taldea.remove(i);
			Borratu_Taldeak.setVisible(false);
			Selekzio_Administrador.setVisible(true);
			actualizar();
		}
		
		}
	public void usuarioycontrseña() {
		boolean Busqueda = false;
		for(int i = 0 ; i< Erabiltzaile.size() && Busqueda != true;i++) {
			if (textField.getText().equals(Erabiltzaile.get(i).getUsuario())) {
				if (passwordField.getText().equals(Erabiltzaile.get(i).getPass())) {
					Busqueda = true;
					profila = Erabiltzaile.get(i).getProfila();
					Igresar_usuario.setVisible(false);
					Taldeak.setVisible(true);
				}
				else {
					switch (Idioma) {
					case "Castellano":
						label_2.setText("Contraseña erronea, intentalo de nuevo");
						break;
					case "Euskera":
						label_2.setText("Pasahitza txarto Saiatu berriro");
						break;	
					}
				}
			}
			else {
				switch (Idioma) {
				case "Castellano":
					label_2.setText("Usuario erroneo, intentalo de nuevo");
					break;
				case "Euskera":
					label_2.setText("Erabiltzailea txarto Saiatu berriro");
					break;	
				}	
			}
		}
	}
	public void Taldeak_Opsioak() {
		Opcion= Opcion + " Taldeak";
		 switch (Opcion)  {
			 case "Sortu Taldeak":
				 Admin_1.setVisible(false);
				 Sortu_Talde.setVisible(true);
				 break;
			 case "Aldatu Taldeak":
				 Admin_1.setVisible(false);
				 Mod_Taldea_1.setVisible(true);
				 break;
			 case "Borratu Taldeak":
				 Admin_1.setVisible(false);
				 Borratu_Taldeak.setVisible(true);
		 }
	}
	public void Jokalariak_Opsioak() {
		Opcion = Opcion + " Jokalariak";
		System.out.println(Opcion);
		switch (Opcion) {
			case "Sortu Jokalariak":
				Admin_1.setVisible(false);
				Sortu_jokalari.setVisible(true);
				break;
			case "Aldatu Jokalariak":
				Admin_1.setVisible(false);
				Mod_Jokalari.setVisible(true);
				break;
			case "Borratu Jokalariak":
				Admin_1.setVisible(false);
				Borratu_Jokalariak.setVisible(true);
				break;
		}
		
	}
	public void actualizar() {
		int Espacio;
		Espacio=Taldea.size();
		switch (Espacio) {
			case 1:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setEnabled(false);
			button_6.setText("Talde2");
			button_7.setEnabled(false);
			button_7.setText("Talde3");
			button_8.setEnabled(false);
			button_8.setText("Talde4");
			button_9.setEnabled(false);
			button_9.setText("Talde5");
			button_10.setEnabled(false);
			button_10.setText("Talde6");
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 2:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setEnabled(false);
			button_7.setText("Talde3");
			button_8.setEnabled(false);
			button_8.setText("Talde4");
			button_9.setEnabled(false);
			button_9.setText("Talde5");
			button_10.setEnabled(false);
			button_10.setText("Talde6");
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 3:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setEnabled(false);
			button_8.setText("Talde4");
			button_9.setEnabled(false);
			button_9.setText("Talde5");
			button_10.setEnabled(false);
			button_10.setText("Talde6");
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 4:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setEnabled(false);
			button_9.setText("Talde5");
			button_10.setEnabled(false);
			button_10.setText("Talde6");
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 5:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setEnabled(false);
			button_10.setText("Talde6");
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 6 :
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setEnabled(false);
			button_11.setText("Talde7");
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 7:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setEnabled(false);
			button_24.setText("Talde8");
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 8:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setEnabled(false);
			button_12.setText("Talde9");
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 9:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setEnabled(false);
			button_13.setText("Talde10");
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 10:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setEnabled(false);
			button_14.setText("Talde11");
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 11:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setEnabled(false);
			button_15.setText("Talde12");
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 12:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setEnabled(false);
			button_17.setText("Talde13");
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 13:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setEnabled(false);
			button_16.setText("Talde14");
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 14:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 15:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_19.setEnabled(false);
			button_19.setText("Talde15");
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 16:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_18.setText(Taldea.get(15).getIzena());
			button_18.setEnabled(false);
			button_18.setText("talde16");
			button_21.setEnabled(false);
			button_21.setText("Talde17");
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 17:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_18.setText(Taldea.get(15).getIzena());
			button_21.setText(Taldea.get(16).getIzena());
			button_20.setEnabled(false);
			button_20.setText("Talde18");
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 18:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_18.setText(Taldea.get(15).getIzena());
			button_21.setText(Taldea.get(16).getIzena());
			button_20.setText(Taldea.get(17).getIzena());
			button_22.setEnabled(false);
			button_22.setText("Talde19");
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 19:
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_18.setText(Taldea.get(15).getIzena());
			button_21.setText(Taldea.get(16).getIzena());
			button_20.setText(Taldea.get(17).getIzena());
			button_22.setText(Taldea.get(18).getIzena());
			button_23.setText(Taldea.get(19).getIzena());
			button_23.setEnabled(false);
			button_23.setText("Talde20");
			break;
		case 20 : 
			button_5.setText(Taldea.get(0).getIzena());
			button_6.setText(Taldea.get(1).getIzena());
			button_7.setText(Taldea.get(2).getIzena());
			button_8.setText(Taldea.get(3).getIzena());
			button_9.setText(Taldea.get(4).getIzena());
			button_10.setText(Taldea.get(5).getIzena());
			button_11.setText(Taldea.get(6).getIzena());
			button_24.setText(Taldea.get(7).getIzena());
			button_12.setText(Taldea.get(8).getIzena());
			button_13.setText(Taldea.get(9).getIzena());
			button_14.setText(Taldea.get(10).getIzena());
			button_15.setText(Taldea.get(11).getIzena());
			button_17.setText(Taldea.get(12).getIzena());
			button_16.setText(Taldea.get(13).getIzena());
			button_19.setText(Taldea.get(14).getIzena());
			button_18.setText(Taldea.get(15).getIzena());
			button_21.setText(Taldea.get(16).getIzena());
			button_20.setText(Taldea.get(17).getIzena());
			button_22.setText(Taldea.get(18).getIzena());
			button_23.setText(Taldea.get(19).getIzena());
			button_23.setText(Taldea.get(20).getIzena());
			break;
		}
		}
	public void AñadirTaldea() {
			clases.copy.Taldeak Equipo = new clases.copy.Taldeak(textField_10.getText(),textField_9.getText(), textField_11.getText(),textField_12.getText(),textField_13.getText());
			Taldea.add(Equipo);
			int Cantidad;
			Cantidad = Taldea.size();
			switch (Cantidad) {
			case 1: 
				button_5.setText(Taldea.get(0).getIzena());
				button_5.setEnabled(true);
				Taldeak.setEnabled(true);
				btnAldatu.setEnabled(true);
				btnBorratu.setEnabled(true);
				button_29.setEnabled(true);
				break;
			case 2:
				button_6.setText(Taldea.get(1).getIzena());
				button_6.setEnabled(true);
				break;
			case 3:
				button_7.setText(Taldea.get(2).getIzena());
				button_7.setEnabled(true);
				break;
				
				//Taldea4
			case 4:
				button_8.setText(Taldea.get(3).getIzena());
				button_8.setEnabled(true);
				break;
				
				//Taldea5
			case 5:
				button_9.setText(Taldea.get(4).getIzena());
				button_9.setEnabled(true);
				break;
				
				//taldea6
			case 6:
				button_10.setText(Taldea.get(5).getIzena());
				button_10.setEnabled(true);
				break;
				
				//taldea7
			case 7:
				button_11.setText(Taldea.get(6).getIzena());
				button_11.setEnabled(true);
				break;
				
				//taldea8
			case 8:
				button_24.setText(Taldea.get(7).getIzena());
				button_24.setEnabled(true);
				break;
				
				//taldea9
			case 9:
				button_12.setText(Taldea.get(8).getIzena());
				button_12.setEnabled(true);
				break;
				
				//taldea10
			case 10:
				button_13.setText(Taldea.get(9).getIzena());
				button_13.setEnabled(true);
				break;
				
				//taldea11
			case 11:
				button_14.setText(Taldea.get(10).getIzena());
				button_14.setEnabled(true);
				break;
				
				//taldea12
			case 12:
				button_15.setText(Taldea.get(11).getIzena());
				button_15.setEnabled(true);
				break;
				
				//taldea13
			case 13:
				button_17.setText(Taldea.get(12).getIzena());
				button_17.setEnabled(true);
				break;
				
			
				//taldea14
			case 14:
				button_16.setText(Taldea.get(13).getIzena());
				button_16.setEnabled(true);
				break;
				
				//taldea15
			case 15:
				button_19.setText(Taldea.get(14).getIzena());
				button_19.setEnabled(true);
				break;
				
				//taldea16
			case 16:
				button_18.setText(Taldea.get(15).getIzena());
				button_18.setEnabled(true);
				break;
				
				//taldea17
			case 17:
				button_21.setText(Taldea.get(16).getIzena());
				button_21.setEnabled(true);
				break;
				
				//taldea18
			case 18:
				button_20.setText(Taldea.get(17).getIzena());
				button_20.setEnabled(true);
				break;
				
				//taldea19
			case 19:
				button_22.setText(Taldea.get(18).getIzena());
				button_22.setEnabled(true);
				break;
				
				//taldea20
			case 20:
				button_23.setText(Taldea.get(19).getIzena());
				button_23.setEnabled(true);
				break;
				}
			
			
			textField_10.setText("");
			textField_9.setText("");
			textField_11.setText("");
			textField_12.setText("");
			textField_13.setText("");
			Sortu_Talde.setVisible(false);
			Selekzio_Administrador.setVisible(true);
		}
			
		
			
	}
	
	

