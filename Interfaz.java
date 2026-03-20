package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz extends JFrame {


	    public Interfaz() {
	        setTitle("Login y Registro");
	        setSize(1000, 700);
	        setLayout(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        router("login");
	        registro();

	        setVisible(true);
	    }
	    
	    public void router(String target) {
	    	this.getContentPane().removeAll();
	    	
	    	if (target.equals("login")){
	    	this.login();
	    }
	    if (target.equals("registro")) {
	        this.registro();
}
         this.repaint();
         this.revalidate();
	    
	    
	    	
	    }

	    public void login() {

	        ImageIcon background = new ImageIcon(getClass().getResource("/imagen/fondo.jpg"));

	        JLabel login_container = new JLabel(background);
	        login_container.setSize(400, 550);
	        login_container.setLocation(50, 50);
	        login_container.setLayout(null);
	        login_container.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 3, true));
	        this.add(login_container);

	        JLabel tag_title = new JLabel("Iniciar sesión");
	        tag_title.setBounds(50, 60, 300, 40);
	        tag_title.setFont(new Font("Forte", Font.PLAIN, 35));
	        tag_title.setForeground(Color.white);
	        tag_title.setHorizontalAlignment(JLabel.CENTER);
	        login_container.add(tag_title);

	        JLabel tag_email = new JLabel("Email");
	        tag_email.setBounds(50, 130, 150, 30);
	        tag_email.setForeground(Color.white);
	        login_container.add(tag_email);

	        JLabel tag_password = new JLabel("Contraseña");
	        tag_password.setBounds(50, 200, 150, 30);
	        tag_password.setForeground(Color.white);
	        login_container.add(tag_password);

	        JTextField email_input = new JTextField();
	        email_input.setBounds(50, 160, 300, 30);
	        login_container.add(email_input);

	        JPasswordField password_input = new JPasswordField();
	        password_input.setBounds(50, 230, 300, 30);
	        login_container.add(password_input);
	        

	        JButton access_btn = new JButton("Acceder");
	        access_btn.setBounds(100, 300, 200, 40);
	        login_container.add(access_btn);
	        
	        JButton btnIrRegistro = new JButton("Ir a registro");
	        btnIrRegistro.setBounds(100, 360, 200, 40);
	        login_container.add(btnIrRegistro);

	        btnIrRegistro.addActionListener(e -> {
	            router("registro");
	        });

	        access_btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {

	                boolean valido = true;
	                
	                String email_valido = "admin@uabcs.mx";
	                		String password_valida = "12345";

	                String email = email_input.getText();
	                String password = new String(password_input.getPassword());

	                if (email.equals(email_valido) && password.equals(password_valida)) {

	                    JOptionPane.showMessageDialog(
	                            null,
	                            "Bienvenido al sistema",
	                            "Acceso correcto",
	                            JOptionPane.INFORMATION_MESSAGE
	                    );

	                } else {

	                    JOptionPane.showMessageDialog(
	                            null,
	                            "Correo o contraseña incorrectos",
	                            "Error",
	                            JOptionPane.ERROR_MESSAGE
	                    );
	                }
	            }
	        
	        });
	    }

	    public void registro() {

	        JPanel rgs_container = new JPanel();
	        rgs_container.setBounds(500, 50, 400, 550);
	        rgs_container.setBackground(Color.decode("#7F9C96"));
	        rgs_container.setLayout(null);
	        rgs_container.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 4, true));
	        this.add(rgs_container);

	        JLabel tag_register = new JLabel("Registro");
	        tag_register.setBounds(50, 35, 300, 40);
	        tag_register.setFont(new Font("Forte", Font.PLAIN, 35));
	        tag_register.setHorizontalAlignment(JLabel.CENTER);
	        rgs_container.add(tag_register);

	        JLabel name_tag = new JLabel("Nombre de usuario:");
	        name_tag.setBounds(50, 90, 300, 25);
	        name_tag.setHorizontalAlignment(JLabel.CENTER);
	        rgs_container.add(name_tag);

	        JTextField name_text = new JTextField();
	        name_text.setBounds(50, 120, 300, 30);
	        rgs_container.add(name_text);

	        JLabel bio_tag = new JLabel("BIO");
	        bio_tag.setBounds(50, 160, 300, 25);
	        bio_tag.setHorizontalAlignment(JLabel.CENTER);
	        rgs_container.add(bio_tag);

	        JTextArea bio_text = new JTextArea();
	        bio_text.setBounds(50, 190, 300, 80);
	        rgs_container.add(bio_text);

	        JLabel preferences_tag = new JLabel("Preferencias");
	        preferences_tag.setBounds(50, 280, 300, 25);
	        preferences_tag.setHorizontalAlignment(JLabel.CENTER);
	        rgs_container.add(preferences_tag);

	        JCheckBox opt_sweet = new JCheckBox("Dulce");
	        opt_sweet.setBounds(50, 310, 100, 30);
	        opt_sweet.setOpaque(false);
	        rgs_container.add(opt_sweet);

	        JCheckBox opt_salty = new JCheckBox("Salado");
	        opt_salty.setBounds(150, 310, 100, 30);
	        opt_salty.setOpaque(false);
	        rgs_container.add(opt_salty);

	        JCheckBox opt_healty = new JCheckBox("Saludable");
	        opt_healty.setBounds(250, 310, 100, 30);
	        opt_healty.setOpaque(false);
	        rgs_container.add(opt_healty);

	        JLabel terms_tag = new JLabel("Términos");
	        terms_tag.setBounds(50, 350, 300, 25);
	        terms_tag.setHorizontalAlignment(JLabel.CENTER);
	        rgs_container.add(terms_tag);

	        JRadioButton accept_terms = new JRadioButton("Acepto");
	        accept_terms.setBounds(50, 380, 100, 30);
	        accept_terms.setOpaque(false);

	        JRadioButton reject_terms = new JRadioButton("Rechazo");
	        reject_terms.setBounds(150, 380, 100, 30);
	        reject_terms.setOpaque(false);

	        ButtonGroup terms = new ButtonGroup();
	        terms.add(accept_terms);
	        terms.add(reject_terms);

	        rgs_container.add(accept_terms);
	        rgs_container.add(reject_terms);

	        JButton register_btn = new JButton("Crear cuenta");
	        register_btn.setBounds(50, 430, 300, 50);
	        rgs_container.add(register_btn);
	        JButton btnIrLogin = new JButton("Ir a login");
	        btnIrLogin.setBounds(50, 490, 300, 40);
	        rgs_container.add(btnIrLogin);

	        // 🔥 EVENTO
	        btnIrLogin.addActionListener(e -> {
	            router("login");
	        });

	        register_btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {

	                boolean valido = true;

	                String name = name_text.getText();
	                String bio = bio_text.getText();

	                // NOMBRE
	                if (name.equals("") || name.contains(" ")) {
	                    name_text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
	                    valido = false;
	                } else {
	                    name_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
	                }

	                // BIO
	                if (!bio.equals("") && bio.length() < 5) {
	                    bio_text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
	                    valido = false;
	                } else {
	                    bio_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
	                }

	                // PREFERENCIAS
	                if (!opt_sweet.isSelected() && !opt_salty.isSelected() && !opt_healty.isSelected()) {
	                    preferences_tag.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
	                    valido = false;
	                } else {
	                    preferences_tag.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
	                }

	                // TÉRMINOS
	                if (!accept_terms.isSelected()) {
	                    terms_tag.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
	                    valido = false;
	                } else {
	                    terms_tag.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
	                }

	                if (valido) {
	                    JOptionPane.showMessageDialog(null, "Registro exitoso");
	                } else {
	                    JOptionPane.showMessageDialog(null, "Corrige los errores");
	                }
	            }
	        });
	    }

	    public static void main(String[] args) {
	        new Interfaz();
	    }
	}
	

