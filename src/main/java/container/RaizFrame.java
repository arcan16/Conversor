package main.java.container;

import main.java.container.modulos.botones.BtnMenu;
import main.java.container.modulos.botones.CierreBtn;
import main.java.container.panel.conenidos.*;
import main.java.container.panel.leftPanel;
import main.java.container.panel.rightPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaizFrame extends JFrame {

    private leftPanel panelIzquierdo;
    private rightPanel panelDerecha;
    private JPanel main;
    private CierreBtn btnCerrar;
    private rightPanel header;
    private rightPanel contenedorMain;

    private BtnMenu btnHome;
    private BtnMenu btnDivisas;
    private BtnMenu btnLongitud;
    private BtnMenu btnTemperatura;
    private BtnMenu btnMasa;

    private CierreDeAplicacion cierreDeAplicacion=new CierreDeAplicacion();

    public RaizFrame() throws HeadlessException {
        setSize(1020,640);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();

//      cargarContenedor(new ContentPanel());
        cargarContenedor(new HomeContent());
    }

    public void iniciarComponentes(){
//      Contenedor raiz para todos los Paneles
        main = new JPanel();
        main.setLayout(new BorderLayout());

//      Panel izquierdo
        panelIzquierdo= new leftPanel();
        panelIzquierdo.setPreferredSize(new Dimension(200,640));
        panelIzquierdo.setLayout(null);

//      Definiendo botones del panel izquierdo

        //Boton Home
        btnHome= new BtnMenu();
        btnHome.setText("Home");
        btnHome.setSize(180,50);
        btnHome.setLocation(10,150);
        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarContenedor(new HomeContent());
            }
        });

        //Boton de Divisas
        btnDivisas = new BtnMenu();
        btnDivisas.setText("Divisas");
        btnDivisas.setSize(180,50);
        btnDivisas.setLocation(10,200);
        btnDivisas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarContenedor(new DivisaContent());
            }
        });

        //Boton de Longitud
        btnLongitud = new BtnMenu();
        btnLongitud.setText("Longitud");
        btnLongitud.setSize(180,50);
        btnLongitud.setLocation(10,250);
        btnLongitud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarContenedor(new LongitudContent());
            }
        });

        //Boton de Temperatura
        btnTemperatura = new BtnMenu();
        btnTemperatura.setText("Temperatura");
        btnTemperatura.setSize(180,50);
        btnTemperatura.setLocation(10,300);
        btnTemperatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarContenedor(new TemperaturaContent());
            }
        });
        //Boton de Masa
        btnMasa = new BtnMenu();
        btnMasa.setText("Masa");
        btnMasa.setSize(180,50);
        btnMasa.setLocation(10,350);
        btnMasa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarContenedor(new MasaContent());
            }
        });

//      Agregando botones al panel izquierdo
        panelIzquierdo.add(btnHome);
        panelIzquierdo.add(btnDivisas);
        panelIzquierdo.add(btnLongitud);
        panelIzquierdo.add(btnTemperatura);
        panelIzquierdo.add(btnMasa);

//      Panel de la derecha, contendra al "header" y al "contenedorMain"
        panelDerecha = new rightPanel();
        panelDerecha.setPreferredSize(new Dimension(820, 590));
        panelDerecha.setLayout(new BorderLayout());
//      Panel header para colocar la X de cierre
        header = new rightPanel();
        header.setLayout(null);
        header.setPreferredSize(new Dimension(820,50));
//      Contenedor del material cambiante en panel derecho
        contenedorMain = new rightPanel();
        contenedorMain.setPreferredSize(new Dimension(820,590));
        contenedorMain.setLocation(0,0);
        contenedorMain.setBackground(Color.GRAY);
        contenedorMain.setLayout(null);

//      Definiendo botones del panel derecho
        //Boton de cierre de aplicacion
        btnCerrar = new CierreBtn();
        btnCerrar.setText("X");
        btnCerrar.setBounds(770,0,50,50);
        btnCerrar.addActionListener(cierreDeAplicacion);
//      Agregando elementos y contenedores a otros contenedores
        header.add(btnCerrar);
        panelDerecha.add(header,BorderLayout.NORTH);
        panelDerecha.add(contenedorMain,BorderLayout.CENTER);
//      Agregando elementos al panel principal
        main.add(panelIzquierdo,BorderLayout.WEST);
        main.add(panelDerecha,BorderLayout.EAST);
        setContentPane(main);
        pack();
    }
    private void cargarContenedor(JPanel panel){

        contenedorMain.removeAll();
        contenedorMain.add(panel,BorderLayout.CENTER);
        contenedorMain.validate();
        contenedorMain.repaint();
    }

    private class CierreDeAplicacion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int respuestaCierre=JOptionPane.showConfirmDialog(null,"Desea cerrar la aplicacion?",
                    "Cerrar aplicacion",JOptionPane.YES_NO_OPTION);
            if(respuestaCierre==0){
                dispose();
            }
        }
    }
}