/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package credencialine;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @Given
 */
public class Crear extends JFrame {

    private JPanel panel;
    private JTextField nombre;
    private JTextField apellidopaterno;
    private JTextField apellidomaterno;
    private JTextField colonia;
    private JTextField calle;
    private JTextField municipio;
    private JTextField curp;
    private JTextField fecha;
    private JTextField sexo;
    private JTextField emision;
    private JTextField estado;
    private JTextField localidad;
    
    private JButton boton;

    public Crear() {

        this.setSize(650, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<<<<PDF>>>>");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {

        Panel();
        Etiquetas();
        Texto();
        BotonCrear();
        BotonAbrir();
        BotonSalir();
    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.cyan);
        this.getContentPane().add(panel);
        
    }

    private void Etiquetas() {

        JLabel etiqueta0 = new JLabel("Ingresa todos lo datos que se te piden:");//texto etiqueta
        panel.add(etiqueta0);//agregamos un panel a la etiqueta
        etiqueta0.setBounds(90, 0, 500, 100);//dimension de la etiqueta x,y,ancho,alto
        etiqueta0.setForeground(Color.pink);//color del texto
        etiqueta0.setFont(new Font("serif", Font.BOLD, 25));//tipo de fuente y tamaño de la letra

        // Etiqueta para el Apellido Paterno //
        JLabel etiqueta = new JLabel("Apellido Parterno: ");
        panel.add(etiqueta);
        etiqueta.setBounds(60, 50, 200, 80);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para el Apellido Materno //
        JLabel etiqueta1 = new JLabel("Apellido Materno: ");
        panel.add(etiqueta1);
        etiqueta1.setBounds(60, 90, 200, 80);
        etiqueta1.setForeground(Color.black);
        etiqueta1.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para el Nombre(s) //
        JLabel etiqueta2 = new JLabel("Nombre(s): ");
        panel.add(etiqueta2);
        etiqueta2.setBounds(120, 130, 200, 80);
        etiqueta2.setForeground(Color.black);
        etiqueta2.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para la Calle y el Numero //
        JLabel etiqueta3 = new JLabel("Calle y No.: ");
        panel.add(etiqueta3);
        etiqueta3.setBounds(110, 170, 200, 80);
        etiqueta3.setForeground(Color.black);
        etiqueta3.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para la Colonia y el Codigo Postal //
        JLabel etiqueta4 = new JLabel("Colonia y C.P.: ");
        panel.add(etiqueta4);
        etiqueta4.setBounds(80, 210, 220, 80);
        etiqueta4.setForeground(Color.black);
        etiqueta4.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para el Municipio //
        JLabel etiqueta5 = new JLabel("Municipio: ");
        panel.add(etiqueta5);
        etiqueta5.setBounds(120, 250, 200, 80);
        etiqueta5.setForeground(Color.black);
        etiqueta5.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para la CURP //
        JLabel etiqueta6 = new JLabel("CURP: ");
        panel.add(etiqueta6);
        etiqueta6.setBounds(160, 290, 200, 80);
        etiqueta6.setForeground(Color.black);
        etiqueta6.setFont(new Font("serif", Font.ITALIC, 22));

        // Etiqueta para la Fecha de Nacimiento //
        JLabel etiqueta7 = new JLabel("Fecha de Nacimiento: ");
        panel.add(etiqueta7);
        etiqueta7.setBounds(60, 330, 200, 80);
        etiqueta7.setForeground(Color.black);
        etiqueta7.setFont(new Font("serif", Font.ITALIC, 20));

        // Etiqueta para el Sexo //
        JLabel etiqueta8 = new JLabel("Sexo: ");
        panel.add(etiqueta8);
        etiqueta8.setBounds(175, 370, 200, 80);
        etiqueta8.setForeground(Color.black);//color del texto
        etiqueta8.setFont(new Font("serif", Font.ITALIC, 22));
        
       // Etiqueta para el Emision //
        JLabel etiqueta9 = new JLabel("Emision: ");
        panel.add(etiqueta9);
        etiqueta9.setBounds(140, 410, 200, 80);
        etiqueta9.setForeground(Color.black);//color del texto
        etiqueta9.setFont(new Font("serif", Font.ITALIC, 22));
      
        
         // Etiqueta para el Estado //
        JLabel etiqueta11 = new JLabel("Estado: ");
        panel.add(etiqueta11);
        etiqueta11.setBounds(160, 450, 200, 80);
        etiqueta11.setForeground(Color.black);//color del texto
        etiqueta11.setFont(new Font("serif", Font.ITALIC, 22));
        
         // Etiqueta para el Localidad //
        JLabel etiqueta12 = new JLabel("Localidad: ");
        panel.add(etiqueta12);
        etiqueta12.setBounds(130, 490, 200, 80);
        etiqueta12.setForeground(Color.black);//color del texto
        etiqueta12.setFont(new Font("serif", Font.ITALIC, 22));
        
         ImageIcon imagen = new ImageIcon("INE.jpg");
         JLabel etiquetaImagen = new JLabel();
         etiquetaImagen.setBounds(350, 450, 218, 108);
         etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(etiquetaImagen);

    }

    private void Texto() {

        // Apellido Paterno //
        apellidopaterno = new JTextField();
        apellidopaterno.setBounds(230, 75, 300, 35);
        panel.add(apellidopaterno);

        // Apellido Materno //
        apellidomaterno = new JTextField();
        apellidomaterno.setBounds(230, 115, 300, 35);
        panel.add(apellidomaterno);

        // Nombre //
        nombre = new JTextField();
        nombre.setBounds(230, 155, 300, 35);
        panel.add(nombre);

        // Calle //  
        calle = new JTextField();
        calle.setBounds(230, 195, 300, 35);
        panel.add(calle);

        // Colonia y Codigo Postal //
        colonia = new JTextField();
        colonia.setBounds(230, 235, 300, 35);
        panel.add(colonia);

        // Municipio //
        municipio = new JTextField();
        municipio.setBounds(230, 275, 50, 35);
        panel.add(municipio);

        // CURP //
        curp = new JTextField();
        curp.setBounds(230, 315, 300, 35);
        panel.add(curp);

        // Fecha de Nacimiento //
        fecha = new JTextField();
        fecha.setBounds(250, 355, 150, 35);
        panel.add(fecha);

        // Sexo //
        sexo = new JTextField();
        sexo.setBounds(230, 395, 30, 35);
        panel.add(sexo);
        
        // vigencia //
        emision = new JTextField();
        emision.setBounds(230, 435, 50, 35);
        panel.add(emision);
        
        // estado //
        estado = new JTextField();
        estado.setBounds(240, 475, 50, 35);
        panel.add(estado);
        
        // localidad //
        localidad = new JTextField();
        localidad.setBounds(230, 515, 50, 35);
        panel.add(localidad);
    }

    private void BotonCrear() {
        boton = new JButton("Crear PDF");
        boton.setBounds(100, 640, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setBackground(Color.pink);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String imagen = "C:\\Users\\given\\OneDrive\\Escritorio\\INE\\INE.jpeg";
                try {
                    PDDocument documento = new PDDocument();
                    PDRectangle mypage = new PDRectangle(650, 500);
                    PDPage pagina = new PDPage(mypage);
                    documento.addPage(pagina);

                    PDImageXObject image = PDImageXObject.createFromFile(imagen, documento);
                    PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

                 
                    contenido.drawImage(image, 40, 40, 600, 450);
                   
                    
                    /*****************************PATERNO*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(420, pagina.getMediaBox().getHeight() - 82);
                    contenido.showText(apellidopaterno.getText());
                    contenido.endText();
                    
                    /*****************************PATERNO 2*********************************************/                    
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 16);
                    contenido.newLineAtOffset(80, pagina.getMediaBox().getHeight() - 432);
                    contenido.showText(apellidopaterno.getText());
                    contenido.endText();

                    /*****************************MATERNO*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(490, pagina.getMediaBox().getHeight() - 82);
                    contenido.showText(apellidomaterno.getText());
                    contenido.endText();
                    
                    /*****************************MATERNO 2*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 16);
                    contenido.newLineAtOffset(200, pagina.getMediaBox().getHeight() - 432);
                    contenido.showText(apellidomaterno.getText());
                    contenido.endText();

                    /*****************************NOMBRE*********************************************/ 
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(310, pagina.getMediaBox().getHeight() - 82);
                    contenido.showText(nombre.getText());
                    contenido.endText();

                    /*****************************NOMBRE 2*********************************************/ 
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 16);
                    contenido.newLineAtOffset(385, pagina.getMediaBox().getHeight() - 432);
                    contenido.showText(nombre.getText());
                    contenido.endText();
                    
                    /*****************************CALLE*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(322, pagina.getMediaBox().getHeight() - 105);
                    contenido.showText(calle.getText());
                    contenido.endText();

                   /*****************************COLONIA Y CP*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(322, pagina.getMediaBox().getHeight() - 120);
                    contenido.showText(colonia.getText());
                    contenido.endText();

                    /*****************************MUNICIPIO*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    contenido.newLineAtOffset(435, pagina.getMediaBox().getHeight() - 180);
                    contenido.showText(municipio.getText());
                    contenido.endText();

                    /*****************************CURP*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    contenido.newLineAtOffset(293, pagina.getMediaBox().getHeight() - 158);
                    contenido.showText(curp.getText());
                    contenido.endText();

                    /*****************************FECHA DE N*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(530, pagina.getMediaBox().getHeight() - 102);
                    contenido.showText(fecha.getText());
                    contenido.endText();
                    
                    /*****************************SEXO*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    contenido.newLineAtOffset(578, pagina.getMediaBox().getHeight() - 113);                   
                    contenido.showText(sexo.getText()); 
                    contenido.endText();
                    
                    /*****************************EMISION*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    contenido.newLineAtOffset(420, pagina.getMediaBox().getHeight() - 201); 
                    contenido.showText(emision.getText()); 
                    contenido.endText();
                    
                    /*****************************VIGENCIA*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    contenido.newLineAtOffset(523, pagina.getMediaBox().getHeight() - 201);                   
                    contenido.showText("2027"); 
                    contenido.endText();

                   /*****************************ESTADO*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    contenido.newLineAtOffset(306, pagina.getMediaBox().getHeight() - 180);  
                    contenido.showText(estado.getText()); 
                    contenido.endText();
                    
                    /*****************************LOCALIDAD*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                  //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(326, pagina.getMediaBox().getHeight() - 201);                   
                    contenido.showText(localidad.getText()); 
                    contenido.endText();
                    
                    /*****************************CLAVE DE L*********************************************/
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                  //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(380, pagina.getMediaBox().getHeight() - 138);                   
                    contenido.showText("AJSTEPKDJHJWKDOM"); 
                    contenido.endText();
                    
                    
                    contenido.close();

                    documento.save("C:\\Users\\given\\OneDrive\\Escritorio\\INE\\credencial.pdf");

                } catch (Exception x) {
                    System.out.println("Error: " + x.getMessage().toString());
                }

            }
        });

    }

    private void BotonAbrir() {

        boton = new JButton("Abrir PDF");
        boton.setBounds(405, 640, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setBackground(Color.pink);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                try {
                    File path = new File("C:\\Users\\given\\OneDrive\\Escritorio\\INE\\credencial.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }

    private void BotonSalir() {
        boton = new JButton("Salir");
        boton.setBounds(574, 0, 60, 40);
        boton.setBackground(Color.pink);
        boton.setForeground(java.awt.Color.BLACK);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 11));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                System.exit(0);

            }
        });
    }

}
