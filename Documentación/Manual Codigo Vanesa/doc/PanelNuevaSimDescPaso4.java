//SimAS  /  Simulador
//Panel nueva simulacion descendente paso 4

package es.uco.simas.simulador;

import es.uco.simas.editor.FuncionError;
import es.uco.simas.util.gramatica.Gramatica;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author vanesa
 */
public class PanelNuevaSimDescPaso4 extends javax.swing.JPanel {

    Gramatica gramatica;
    VentanaSimuladorDesc ventanaPadre;
    private int funError=0;
    
    public PanelNuevaSimDescPaso4(VentanaSimuladorDesc ventanaPadre) {
        initComponents();        
        this.ventanaPadre = ventanaPadre;
        this.gramatica = ventanaPadre.getGramatica();
        
        if(this.gramatica.getTPredictiva().getFunError().size() != 0){            
            funcionError();
            this.funError = 1;
        }
        if(funError ==0){
            this.jButtonFinalizar.setVisible(true);
            this.jButtonUltimo.setVisible(false);
            this.jButtonSiguiente.setEnabled(false);
            this.jButtonEliminar.setEnabled(false);
        }
    }
    
    public void funcionError(){
        DefaultListModel lista = new DefaultListModel();        
        ArrayList<FuncionError> funError = this.gramatica.getTPredictiva().getFunError();
        StringBuilder string = new StringBuilder();
        int i=0;
        
        while(i < funError.size()){
            string = new StringBuilder();
            int accion;
            string = string.append(funError.get(i).getIdentificador());
            string = string.append(" - ");
            accion = funError.get(i).getAccion();
            if(accion == 1)
                string.append("Insertar un Símbolo en la Entrada: ");
            if(accion == 2)
                string.append("Borrar un Símbolo de la Entrada");
            if(accion == 3)
                string.append("Modificar un Símbolo de la Entrada: ");
            if(accion == 4)
                string.append("Insertar un Símbolo de la Pila: ");
            if(accion == 5)
                string.append("Borrar un Símbolo de la Pila");
            if(accion == 6)
                string.append("Modificar un Símbolo de la Pila: ");
            if(accion == 7)
                string.append("Terminar el análisis");
            if(accion == 1 || accion ==3 || accion ==4 || accion ==6)
                string.append(funError.get(i).getSimbolo().getNombre());
                
            lista.add(i, string);
            i++;            
                        
        }
        this.jList1.setModel(lista);
        
        if(this.jList1.getModel().getSize()!=0){
            this.jButtonFinalizar.setVisible(false);
            
            this.jButtonSiguiente.setEnabled(true);
            this.jButtonNueva.setEnabled(true);
            this.jButtonEliminar.setEnabled(true);
        }else{
            this.jButtonNueva.setEnabled(true);
            this.jButtonEliminar.setEnabled(false);
            this.jButtonFinalizar.setVisible(true);
            
            this.jButtonSiguiente.setEnabled(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonNueva = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(233, 244, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Funciones de Error");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/ultimo.png"))); // NOI18N
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/siguiente.png"))); // NOI18N
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/anterior.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/primero.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jCheckBox1.setText("No utilizar Funciones de error");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButtonNueva.setText("Nueva Funcion Error  ");
        jButtonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar Funcion Error");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonFinalizar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizar)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButtonNueva))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButtonNueva)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonEliminar)
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFinalizar)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButton3)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButton4)
                    .addComponent(jButtonSiguiente))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaActionPerformed
        NuevaFuncionError error = new NuevaFuncionError(this.gramatica, this);
        error.setLocationRelativeTo(null);
        error.setVisible(true);
    }//GEN-LAST:event_jButtonNuevaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int conf = JOptionPane.showConfirmDialog(null, "¿Desea salir del asistente de la simulacion de la gramática?", "Salir",JOptionPane.YES_NO_OPTION);

        if(conf==0)
          this.ventanaPadre.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(this.jCheckBox1.isSelected()){
            this.jButtonNueva.setEnabled(false);
            this.jButtonEliminar.setEnabled(false);
            this.jButtonFinalizar.setVisible(true);
            this.jButtonUltimo.setVisible(false);
            this.jButtonSiguiente.setEnabled(false);
        }else{                        
            if(this.jList1.getModel().getSize()!=0){
                this.jButtonFinalizar.setVisible(false);
                this.jButtonUltimo.setVisible(true);
                this.jButtonSiguiente.setEnabled(true);
                this.jButtonNueva.setEnabled(true);
                this.jButtonEliminar.setEnabled(true);
            }else{
                this.jButtonNueva.setEnabled(true);
                this.jButtonEliminar.setEnabled(false);
                this.jButtonFinalizar.setVisible(true);
                this.jButtonUltimo.setVisible(false);
                this.jButtonSiguiente.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        DefaultListModel modelo= null;   
        int seleccion= this.jList1.getSelectedIndex();  
        String funcion = this.jList1.getModel().getElementAt(seleccion).toString();
        ArrayList<FuncionError> funError = this.gramatica.getTPredictiva().getFunError();
        String id = funcion.substring(0, 1);        
        int num = Integer.parseInt(id);        
        int i=0;                        
        
        if(seleccion != -1) {           
            modelo=(DefaultListModel)this.jList1.getModel();
            modelo.remove(seleccion);  
            
            while(i < funError.size()){
                if(funError.get(i).getIdentificador() == num){                   
                    funError.remove(i);
                }else        
                    i++;                                    
            }
            this.gramatica.getTPredictiva().setFunError(funError);
            this.ventanaPadre.setGramatica(this.gramatica);
        }
        
        if(this.jList1.getModel().getSize()!=0){
                this.jButtonFinalizar.setVisible(false);
                this.jButtonUltimo.setVisible(true);
                this.jButtonSiguiente.setEnabled(true);
                this.jButtonNueva.setEnabled(true);
                this.jButtonEliminar.setEnabled(true);
            }else{
                this.jButtonNueva.setEnabled(true);
                this.jButtonEliminar.setEnabled(false);
                this.jButtonFinalizar.setVisible(true);
                this.jButtonUltimo.setVisible(false);
                this.jButtonSiguiente.setEnabled(false);
            }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        this.ventanaPadre.cambiarPaso(5);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.ventanaPadre.cambiarPaso(3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.ventanaPadre.cambiarPaso(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        this.ventanaPadre.finalizarAsistente();        
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        this.ventanaPadre.cambiarPaso(5);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
         int conf = JOptionPane.showConfirmDialog(null, "¿Desea salir del asistente de la simulacion de la gramática?", "Salir",JOptionPane.YES_NO_OPTION);

        if(conf==0)
          this.ventanaPadre.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.ventanaPadre.cambiarPaso(1);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonNueva;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
