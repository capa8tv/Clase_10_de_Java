package graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JPanel implements ActionListener {
    
    private JButton boton1=new JButton("Botón 1");
    private JButton boton2=new JButton("Botón 2");
    private JLabel label;
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g); 
      
    }
    public void addBoton()
    {
        this.label=new JLabel();
        this.label.setBounds(50,00,100,100);
        this.label.setText("Hola desde el Label");
        add(this.label);
        add(this.boton1);
        add(this.boton2);
        boton1.setToolTipText("texto que aparece encima del botón");
        this.boton1.addActionListener((ActionListener) this);
        this.boton2.addActionListener((ActionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Object botonPulsado=e.getSource();
         if(botonPulsado==this.boton1)
         {
             setBackground(Color.red);
             this.label.setText("Se presionó el botón 1");
             Font mifuente=new Font("Arial",Font.BOLD,30);
             this.label.setFont(mifuente);
             this.label.setForeground(Color.WHITE);
             this.boton1.setToolTipText("Nuevo texto de tool tips");
         }
         if(botonPulsado==this.boton2)
         {
             setBackground(Color.green);
             this.label.setText("Se presionó el botón 2");
             Font mifuente=new Font("Verdana",Font.ITALIC,25);
             this.label.setFont(mifuente);
             this.label.setForeground(Color.BLUE);
             this.boton2.setToolTipText("Nuevo texto de tool tips botón 2");
         }
    }
    
    
    
    
    
    
}
