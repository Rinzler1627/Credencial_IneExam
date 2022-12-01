/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Ine extends JFrame{
    JTextField jtNombre,
               jtDomicilio,
               jtClaveEstandar,
               jtAñodeRegistro,
               jtEstado,
               jtLocalidad,
               jtMunicipio,
               jtVision,
               jtSeccion,
               jtVigencia;

        JButton jbGenerar;

    public Ine(){
        super("Creador de Credenciales INE");
        setSize(600,600); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        crearGUI();

setVisible(true);
}

public void crearGUI(){
JLabel jlLibre= new JLabel ("Ingrese su Nombre Completo: "); 
jlLibre.setBounds(30,30,250,25);
add(jlLibre);

jtNombre = new JTextField();
//               columna,fila,ancho
jtNombre.setBounds(250,30,250,20);
add(jtNombre);

JLabel jlDomicilio = new JLabel ("Ingrese su domicilio: "); 
jlDomicilio.setBounds(30,65,250,25);
add(jlDomicilio);

 jtDomicilio= new JTextField();
jtDomicilio.setBounds(250,65,250,25);
add(jtDomicilio);

JLabel jlClaveEstandar= new JLabel ("Ingrese su Clave de Lector: "); 
jlClaveEstandar.setBounds(30,95,250,25);
add(jlClaveEstandar);

jtClaveEstandar = new JTextField();
jtClaveEstandar.setBounds(250,95,250,25);
add(jtClaveEstandar);

JLabel jlAñodeRegistro= new JLabel("Ingrese año de registro: ");
jlAñodeRegistro.setBounds(30,125,250,35);
add(jlAñodeRegistro);

jtAñodeRegistro= new JTextField();
jtAñodeRegistro.setBounds(250,125,150,25);
add(jtAñodeRegistro);

JLabel jlEstado= new JLabel("Estado en la que vive: ");
jlEstado.setBounds(30,155,250,35);
add(jlEstado);

jtEstado= new JTextField();
jtEstado.setBounds(250,155,150,25);
add(jtEstado);

JLabel jlLocalidad= new JLabel("Localidad en la que vive: ");
jlLocalidad.setBounds(30,185,250,35);
add(jlLocalidad);

jtLocalidad= new JTextField();
jtLocalidad.setBounds(250,185,150,25);
add(jtLocalidad);

JLabel jlMunicipio= new JLabel("Municipio en la que vive: ");
jlMunicipio.setBounds(30,215,250,35);
add(jlMunicipio);

jtMunicipio= new JTextField();
jtMunicipio.setBounds(250,215,150,25);
add(jtMunicipio);

JLabel jlVision= new JLabel("Vision:");
jlVision.setBounds(30,245,190,35);
add(jlVision);

jtVision= new JTextField();
jtVision.setBounds(250,245,150,25);
add(jtVision);

JLabel jlSeccion= new JLabel("Seccion:");
jlSeccion.setBounds(30,275,200,35);
add(jlSeccion);

jtSeccion= new JTextField();
jtSeccion.setBounds(250,275,150,25);
add(jtSeccion);

JLabel jlVigencia= new JLabel("Vigencia:");
jlVigencia.setBounds(30,305,220,35);
add(jlVigencia);

jtVigencia= new JTextField();
jtVigencia.setBounds(250,305,150,25);
add(jtVigencia);

jbGenerar = new JButton("Generar INE");
jbGenerar.setBounds((500-150)/2,450,150,30);
jbGenerar.setMnemonic('G');
jbGenerar.addActionListener(new ActionListener() {
    private Object jLabelRutaFoto;

public void evento_jButtonAbrir() {
        try {
            JFileChooser filechooser = new JFileChooser();
            if (JFileChooser.APPROVE_OPTION == filechooser.showDialog(null, "seleccionar")) {
                File file = filechooser.getSelectedFile();
                String photopath = file.getAbsolutePath();
                jLabelRutaFoto.(photopath);
                
                jLabelFoto.setIcon(new ImageIcon(photopath));
                System.out.println(photopath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

@Override
public void actionPerformed(ActionEvent e){
evento_jbGenerar();
}
});
add(jbGenerar);
}
public void evento_jbGenerar(){
            String libre =jtNombre.getText();
            String libre1=jtDomicilio.getText();
            String libre2 =jtClaveEstandar.getText();
            String libre3  =jtAñodeRegistro.getText();
            String libre4  =jtEstado.getText();
            String libre5  =jtLocalidad.getText();
            String libre6 =jtMunicipio.getText();
            String libre7 =jtVision.getText();
            String libre8 =jtSeccion.getText();
            String libre9 =jtVigencia.getText();
JOptionPane.showConfirmDialog(this,libre +"\n"+
libre1+"\n"+
libre2+"\n"+
libre3+"\n"+
libre4+"\n"+
libre5+"\n"+
libre6+"\n"+
libre7+"\n"+
libre8+"\n"+
libre9+"\n");

 
}

    public static void main(String[] args) {
         Ine et = new Ine();
    }
}

