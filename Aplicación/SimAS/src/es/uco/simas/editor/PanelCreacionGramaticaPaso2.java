//SimAS / Editor
// Panel Creacion Gramatica Paso 2

package es.uco.simas.editor;

import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 * @author vanesa
 */
public class PanelCreacionGramaticaPaso2 extends javax.swing.JPanel {

    private VentanaCreacionGramatica ventanaPadre ;
    
    public PanelCreacionGramaticaPaso2(VentanaCreacionGramatica ventanaPadre) {
        initComponents();
        this.ventanaPadre =ventanaPadre;   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSiguiente = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonNoTerminales = new javax.swing.JButton();
        jButtonTerminales = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListNoTerminales = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListTerminales = new javax.swing.JList();
        jButtonUltimo = new javax.swing.JButton();
        jButtonPrimero = new javax.swing.JButton();

        setBackground(new java.awt.Color(233, 244, 244));

        jButtonSiguiente.setForeground(new java.awt.Color(33, 77, 72));
        jButtonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/siguiente.png"))); // NOI18N
        jButtonSiguiente.setToolTipText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonAnterior.setForeground(new java.awt.Color(33, 77, 72));
        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/anterior.png"))); // NOI18N
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonCancelar.setForeground(new java.awt.Color(33, 77, 72));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 77, 72));
        jLabel1.setText("Vocabulario de la gramática");

        jLabel2.setText("Símbolos No Terminales");

        jLabel3.setText("Símbolos Terminales");

        jButtonNoTerminales.setText("Modificar No Terminales");
        jButtonNoTerminales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoTerminalesActionPerformed(evt);
            }
        });

        jButtonTerminales.setText("Modificar Terminales");
        jButtonTerminales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminalesActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListNoTerminales);

        jScrollPane4.setViewportView(jListTerminales);

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/ultimo.png"))); // NOI18N
        jButtonUltimo.setToolTipText("Último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/primero.png"))); // NOI18N
        jButtonPrimero.setToolTipText("Primero");
        jButtonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrimero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButtonNoTerminales)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonTerminales)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addContainerGap(58, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonNoTerminales)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTerminales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAnterior)
                            .addComponent(jButtonSiguiente)
                            .addComponent(jButtonPrimero)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonUltimo))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
            this.ventanaPadre.cambiarPaso(3);       
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int conf = JOptionPane.showConfirmDialog(null, "¿Desea salir de la edición de la gramática?", "Salir",JOptionPane.YES_NO_OPTION);

        if(conf==0){
            this.ventanaPadre.finalizarAsistente();
        }          
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        this.ventanaPadre.cambiarPaso(1);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonNoTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoTerminalesActionPerformed
        VentanaSimbolosNoTerminales noTerminal = new VentanaSimbolosNoTerminales(this.jListNoTerminales.getModel(), this.jListNoTerminales.getModel(), this, null);
        noTerminal.setVisible(true);
        noTerminal.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonNoTerminalesActionPerformed

    private void jButtonTerminalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminalesActionPerformed
        VentanaSimbolosTerminales terminal = new VentanaSimbolosTerminales(this.jListTerminales.getModel(),this.jListTerminales.getModel(),this); 
         terminal.setVisible(true);
         terminal.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonTerminalesActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        this.ventanaPadre.cambiarPaso(4);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        this.ventanaPadre.cambiarPaso(1);
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    public DefaultListModel getSimbolosTerminales( )     {
        if(this.jListTerminales.getModel().getSize()!=0)  {
            return (DefaultListModel)this.jListTerminales.getModel();
        }
        return null;
    }

    public    DefaultListModel getSimbolosNoTerminales( )  {      
        if(this.jListNoTerminales.getModel().getSize()!=0) {
            return (DefaultListModel)this.jListNoTerminales.getModel();
        }
        return null;
    }

    public    void asignarListaSimbolosTerminales(DefaultListModel modelo)  {
        if(modelo !=null)
            this.jListTerminales.setModel(modelo);
        else
            this.jListTerminales = null;
    }

    public    void asignarListaSimbolosNoTerminales(  DefaultListModel modelo) {
        if(modelo != null)
            this.jListNoTerminales.setModel(modelo);
        else
            this.jListNoTerminales = null;
    }
 
    public DefaultListModel getProducciones(){
        return this.ventanaPadre.getProducciones();
    }
    
    public void setProducciones(DefaultListModel pr){
        this.ventanaPadre.setProducciones(pr);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNoTerminales;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonTerminales;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListNoTerminales;
    private javax.swing.JList jListTerminales;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}