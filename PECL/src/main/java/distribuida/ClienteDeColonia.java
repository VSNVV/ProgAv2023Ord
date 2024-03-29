/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package distribuida;

import javax.swing.*;
import java.rmi.Naming;

/**
 *
 * @author victorsanavia
 */
public class ClienteDeColonia extends javax.swing.JFrame {

    /**
     * Creates new form ClienteDeColonia
     */
    public ClienteDeColonia() {
        initComponents();
    }

    public void actualizaJTextFields(){
        try{
            InterfazColonia objetoRemoto = (InterfazColonia) Naming.lookup("//localhost/ObjetoColonia");
            getjTextFieldNumHormigasObrerasExteriorColonia().setText(objetoRemoto.numHormigasObrerasExteriorColonia());
            getjTextFieldNumHormigasObrerasInteriorColonia().setText(objetoRemoto.numHormigasObrerasInteriorColonia());
            getjTextFieldNumHormigasSoldadoInstruccion().setText(objetoRemoto.numHormigasSoldadoInstruccion());
            getjTextFieldNumHormigasSoldadoInvasion().setText(objetoRemoto.numHormigasSoldadoInvasion());
            getjTextFieldNumHomrigasCriaZonaComer().setText(objetoRemoto.numHormigasCriaZonaComer());
            getjTextFieldNumHomrigasCriaRefugio().setText(objetoRemoto.numHormigasCriaRefugio());
        }catch (Exception ignored){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNumHomrigasObrerasExteriorColonia = new javax.swing.JPanel();
        labelNumHormigasObrerasExteriorColonia = new javax.swing.JLabel();
        jTextFieldNumHormigasObrerasExteriorColonia = new javax.swing.JTextField();
        panelNumHomrigasObrerasInteriorColonia = new javax.swing.JPanel();
        labelNumHormigasObrerasInteriorColonia = new javax.swing.JLabel();
        jTextFieldNumHormigasObrerasInteriorColonia = new javax.swing.JTextField();
        panelNumHomrigasSoldadoInstruccion = new javax.swing.JPanel();
        labelNumHormigasSoldadoInstruccion = new javax.swing.JLabel();
        jTextFieldNumHormigasSoldadoInstruccion = new javax.swing.JTextField();
        panelNumHomrigasSoldadoInvasion = new javax.swing.JPanel();
        labelNumHormigasSoldadoInvasion = new javax.swing.JLabel();
        jTextFieldNumHormigasSoldadoInvasion = new javax.swing.JTextField();
        panelNumHomrigasCriaZonaComer = new javax.swing.JPanel();
        labelNumHomrigasCriaZonaComer = new javax.swing.JLabel();
        jTextFieldNumHomrigasCriaZonaComer = new javax.swing.JTextField();
        panelNumHomrigasCriaRefugio = new javax.swing.JPanel();
        labelNumHomrigasCriaRefugio = new javax.swing.JLabel();
        jTextFieldNumHomrigasCriaRefugio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonGeneraInvasion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNumHomrigasObrerasExteriorColonia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHormigasObrerasExteriorColonia.setText("Numero de hormigas obreras en el exterior de la colonia");
        panelNumHomrigasObrerasExteriorColonia.add(labelNumHormigasObrerasExteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 310, -1));

        jTextFieldNumHormigasObrerasExteriorColonia.setText("0");
        panelNumHomrigasObrerasExteriorColonia.add(jTextFieldNumHormigasObrerasExteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasObrerasExteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 100));

        panelNumHomrigasObrerasInteriorColonia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHormigasObrerasInteriorColonia.setText("Numero de hormigas obreras en el interior de la colonia");
        panelNumHomrigasObrerasInteriorColonia.add(labelNumHormigasObrerasInteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 310, -1));

        jTextFieldNumHormigasObrerasInteriorColonia.setText("0");
        panelNumHomrigasObrerasInteriorColonia.add(jTextFieldNumHormigasObrerasInteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasObrerasInteriorColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 510, 100));

        panelNumHomrigasSoldadoInstruccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHormigasSoldadoInstruccion.setText("Numero de hormigas soldado haciendo instruccion");
        panelNumHomrigasSoldadoInstruccion.add(labelNumHormigasSoldadoInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, -1));

        jTextFieldNumHormigasSoldadoInstruccion.setText("0");
        panelNumHomrigasSoldadoInstruccion.add(jTextFieldNumHormigasSoldadoInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasSoldadoInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 510, 100));

        panelNumHomrigasSoldadoInvasion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHormigasSoldadoInvasion.setText("Numero de hormigas soldado repeliendo una invasion");
        panelNumHomrigasSoldadoInvasion.add(labelNumHormigasSoldadoInvasion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 290, -1));

        jTextFieldNumHormigasSoldadoInvasion.setText("0");
        panelNumHomrigasSoldadoInvasion.add(jTextFieldNumHormigasSoldadoInvasion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasSoldadoInvasion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 510, 100));

        panelNumHomrigasCriaZonaComer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHomrigasCriaZonaComer.setText("Numero de hormigas cria en la ZONA PARA COMER");
        panelNumHomrigasCriaZonaComer.add(labelNumHomrigasCriaZonaComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, -1));

        jTextFieldNumHomrigasCriaZonaComer.setText("0");
        panelNumHomrigasCriaZonaComer.add(jTextFieldNumHomrigasCriaZonaComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasCriaZonaComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 510, 100));

        panelNumHomrigasCriaRefugio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumHomrigasCriaRefugio.setText("Numero de hormigas cria en el REFUGIO");
        panelNumHomrigasCriaRefugio.add(labelNumHomrigasCriaRefugio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, -1));

        jTextFieldNumHomrigasCriaRefugio.setText("0");
        panelNumHomrigasCriaRefugio.add(jTextFieldNumHomrigasCriaRefugio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, 30));

        jPanel1.add(panelNumHomrigasCriaRefugio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 510, 100));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGeneraInvasion.setText("Generar Amenaza Insecto Invasor");
        jButtonGeneraInvasion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGeneraInvasion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeneraInvasionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGeneraInvasion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 430, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 1050, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGeneraInvasionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeneraInvasionActionPerformed
        // TODO add your handling code here:
        try{
            InterfazColonia objetoRemoto = (InterfazColonia) Naming.lookup("//localhost/ObjetoColonia");
            objetoRemoto.generaInvasion();
        }catch (Exception ignored){}
    }//GEN-LAST:event_jButtonGeneraInvasionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteDeColonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDeColonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDeColonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDeColonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ClienteDeColonia mainDistribuida = new ClienteDeColonia();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainDistribuida.setVisible(true);
            }
        });
        while(true){
            mainDistribuida.actualizaJTextFields();
            try{
                Thread.sleep(1500);
            }catch(InterruptedException ignored){}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGeneraInvasion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldNumHomrigasCriaRefugio;
    private javax.swing.JTextField jTextFieldNumHomrigasCriaZonaComer;
    private javax.swing.JTextField jTextFieldNumHormigasObrerasExteriorColonia;
    private javax.swing.JTextField jTextFieldNumHormigasObrerasInteriorColonia;
    private javax.swing.JTextField jTextFieldNumHormigasSoldadoInstruccion;
    private javax.swing.JTextField jTextFieldNumHormigasSoldadoInvasion;
    private javax.swing.JLabel labelNumHomrigasCriaRefugio;
    private javax.swing.JLabel labelNumHomrigasCriaZonaComer;
    private javax.swing.JLabel labelNumHormigasObrerasExteriorColonia;
    private javax.swing.JLabel labelNumHormigasObrerasInteriorColonia;
    private javax.swing.JLabel labelNumHormigasSoldadoInstruccion;
    private javax.swing.JLabel labelNumHormigasSoldadoInvasion;
    private javax.swing.JPanel panelNumHomrigasCriaRefugio;
    private javax.swing.JPanel panelNumHomrigasCriaZonaComer;
    private javax.swing.JPanel panelNumHomrigasObrerasExteriorColonia;
    private javax.swing.JPanel panelNumHomrigasObrerasInteriorColonia;
    private javax.swing.JPanel panelNumHomrigasSoldadoInstruccion;
    private javax.swing.JPanel panelNumHomrigasSoldadoInvasion;
    // End of variables declaration//GEN-END:variables

    //Métodos get de los JTextField

    public JTextField getjTextFieldNumHomrigasCriaRefugio() {
        return jTextFieldNumHomrigasCriaRefugio;
    }

    public JTextField getjTextFieldNumHomrigasCriaZonaComer() {
        return jTextFieldNumHomrigasCriaZonaComer;
    }

    public JTextField getjTextFieldNumHormigasObrerasExteriorColonia() {
        return jTextFieldNumHormigasObrerasExteriorColonia;
    }

    public JTextField getjTextFieldNumHormigasObrerasInteriorColonia() {
        return jTextFieldNumHormigasObrerasInteriorColonia;
    }

    public JTextField getjTextFieldNumHormigasSoldadoInstruccion() {
        return jTextFieldNumHormigasSoldadoInstruccion;
    }

    public JTextField getjTextFieldNumHormigasSoldadoInvasion() {
        return jTextFieldNumHormigasSoldadoInvasion;
    }
}
