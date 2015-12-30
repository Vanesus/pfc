//SimAS  /  Simulador
//Nueva Simulacion Descendente

package es.uco.simas.simulador;

import com.itextpdf.text.DocumentException;
import es.uco.simas.editor.Editor;
import es.uco.simas.editor.FuncionError;
import es.uco.simas.editor.TablaPredictiva;
import es.uco.simas.util.gramatica.Gramatica;
import es.uco.simas.util.gramatica.Simbolo;
import es.uco.simas.util.gramatica.Terminal;
import java.io.File;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author Vanesa
 */
public class NuevaSimulacionDesc extends javax.swing.JFrame {

    public Gramatica gramatica;
    public Simulador ventanaPadre;
    private DefaultTableModel tabla = new DefaultTableModel();    
    Stack<String> pila = new Stack<String>();    
    Stack<String> entrada = new Stack<String>();
    private String accion = "";
    private ArrayList<Simbolo> consec;
    
    public NuevaSimulacionDesc(Gramatica gramatica, Simulador ventanaPadre) {
        initComponents();
        
        this.gramatica = gramatica;
        this.ventanaPadre = ventanaPadre;
        this.jButton6.setEnabled(false);
        if(this.ventanaPadre.getCadenaEntrada() != null){
            iniciarSimulacion();            
        }
        this.jTableSim.setDefaultRenderer (Object.class, new MiRender());
        this.jTableSim.setModel(this.tabla);  
        
        this.jButton2.setEnabled(false);
        this.jButton4.setEnabled(false);
        this.jButton5.setEnabled(false);
        this.jButton3.setEnabled(false);        
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSim = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulación Descendente");

        jPanel1.setBackground(new java.awt.Color(233, 242, 242));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Simulación Descendente");

        jTableSim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSim);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/siguiente.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/anterior.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/ultimo.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uco/simas/resources/primero.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Informe de la Simulación");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cadena de Entrada:");

        jTextField1.setEditable(false);

        jButton7.setText("Editar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void actualizarVisualizacion(){
        String cadena ="";
        this.pila.removeAllElements();
        this.entrada.removeAllElements(); 
        this.tabla = new DefaultTableModel();
        this.jTableSim.setModel(this.tabla); 
        
        ArrayList<Terminal> cadenaEntrada = this.ventanaPadre.getCadenaEntrada();
        int i = 0;
        while (i < cadenaEntrada.size()){
            cadena = cadena+cadenaEntrada.get(i).getNombre()+" ";
            i++;
        }
        this.jTextField1.setText(cadena);   
        if(!cadena.equals("")){            
            this.iniciarSimulacion();
        }
        this.jButton2.setEnabled(true);
        this.jButton4.setEnabled(true);
        this.jButton5.setEnabled(false);
        this.jButton3.setEnabled(false);
    }
    
    private void iniciarSimulacion(){          //Con piLA        
        this.tabla.addColumn("Pila");
        this.tabla.addColumn("Entrada");
        this.tabla.addColumn("Acción");       
                        
        ArrayList<Terminal> cadEntrada = this.ventanaPadre.getCadenaEntrada();        
        this.pila.push("$");
        this.pila.push(this.gramatica.getSimbInicial());
               
        int i=0;
                
        this.entrada.push("$");
        i = cadEntrada.size()-1;
        while(i >= 0){            
            this.entrada.push(cadEntrada.get(i).getNombre());
            i--;
        }            
                
        String accion = buscarTabla(this.pila.peek().toString(),this.entrada.peek().toString());
        if(accion.equals("Error")){
            this.jButton2.setEnabled(false);
            this.jButton4.setEnabled(false);
            this.jButton5.setEnabled(true);
            this.jButton3.setEnabled(true);
        }
                
        Object []  linea = new Object[]  {
            mostrarPila(this.pila),
            mostrarEntrada(this.entrada),
            accion,
            };
                
        this.tabla.addRow(linea);          
        this.accion = accion; 
        this.jButton5.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.jButton2.setEnabled(true);
        this.jButton5.setEnabled(true);
        this.jButton6.setEnabled(true);
        
    }
    
    private String buscarTabla(String fila, String columna){        
        DefaultTableModel tabla = this.gramatica.getTPredictiva().getTabla();
        TablaPredictiva tpredictiva = this.gramatica.getTPredictiva();
        int i=0;
        int fil = -1;
        int col = -1;
        Object celda = "";
        
        while(i < tabla.getRowCount()){            
            if(fila.equals(tpredictiva.getCeldaPredictiva(i, 0))){
                fil = i;                
                break;
            }else{
                i++;
            }
        }
        i = 1;
        while(i < tabla.getColumnCount()){            
            if(columna.equals(tabla.getColumnName(i))){
                col = i;
                break;
            }else{
                i++;
            }
        }
        if(fil != -1 && col != -1){            
            celda = tpredictiva.getCeldaPredictiva(fil, col);
        }
        if(celda == null  || celda == ""){
            return "Error";            
        }else{            
            if(celda.toString().startsWith("E") && !celda.toString().equals("Emparejar") ){
                return celda.toString();            
            }else{                                
                String prod = buscarProduccion(Integer.parseInt(celda.toString()));
                return (celda+") "+prod);
            }
        }
    }
    
    private String mostrarPila(Stack pila){        
        int i = 0;
        String str = "";
        while(i < pila.size()){
            str = str + " "+pila.get(i);
            i++;
        }        
        return str;
    }
    
    private String mostrarEntrada(Stack pila){        
        int i = pila.size()-1;
        String str = "";
        while(i >= 0){
            str = str + " "+pila.get(i);
            i--;
        }        
        return str;
    }
    
    private String buscarProduccion(int numero){
        DefaultListModel prod = this.gramatica.getProducciones();
        this.consec = this.gramatica.getPr().get(numero-1).getConsec();
        
        return prod.getElementAt(numero-1).toString();        
    }
  
    private void siguientePaso(){
        if(this.accion.equals("Aceptar") || this.accion.equals("Error") || this.accion.equals("Fin")){         
            this.jButton2.setEnabled(false);            
            this.jButton4.setEnabled(false); 
            this.jButton3.setEnabled(true); 
            this.jButton5.setEnabled(true); 
        }else{  
            if(this.accion.equals("Emparejar")){
                    this.pila.pop();
                    this.entrada.pop();
            }else{
                if(this.accion.startsWith("E")){
                        funError();
            
                }else{
                    if(this.consec.get(0).getNombre().equals("\u03b5")){
                        this.pila.pop();
                    }else{
                        int i=this.consec.size()-1;
                        this.pila.pop();
                        while(i >= 0){
                            this.pila.push(consec.get(i).getNombre());
                            i--;
                        }     
                    }
                }
            }
            if(this.pila.peek().equals("$") && this.entrada.peek().equals("$")){
                this.accion = "Aceptar";
            }else{
                if(this.pila.peek().equals(this.entrada.peek())){
                    this.accion = "Emparejar";
                }else{
                    this.accion = buscarTabla(this.pila.peek().toString(),this.entrada.peek().toString());
                }
            }            

            Object []  linea = new Object[]  {
                mostrarPila(this.pila),
                mostrarEntrada(this.entrada),
                this.accion,
                };

            this.tabla.addRow(linea); 
        }                        
    }
    
    private void funError(){
        ArrayList<FuncionError> funError = this.gramatica.getTPredictiva().getFunError();
        FuncionError fun = new FuncionError();
        int i = 0;
        int num = Integer.parseInt(this.accion.substring(1));
        
        while(i < funError.size()){
            if(funError.get(i).getIdentificador() == num){
                fun = funError.get(i);
                break;                
            }else
                i++;
        }
        
        if(fun.getAccion()==1){
            this.entrada.push(fun.getSimbolo().getNombre());
        }
        if(fun.getAccion()==2){
            this.entrada.pop();
        }
        if(fun.getAccion()==3){
            this.entrada.pop();
            this.entrada.push(fun.getSimbolo().getNombre());
        }
        if(fun.getAccion()==4){
            this.pila.push(fun.getSimbolo().getNombre());
        }
        if(fun.getAccion()==5){
            this.pila.pop();
        }
        if(fun.getAccion()==6){
            this.pila.pop();
            this.pila.push(fun.getSimbolo().getNombre());
        }
        if(fun.getAccion()==7){
            this.accion = "Fin";
        }        
    }
    
    public DefaultTableModel getTabla(){
        this.jButton4ActionPerformed(null);
        return this.tabla;
    }
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int conf = JOptionPane.showConfirmDialog(null, "¿ Desea salir ?", "Salir",JOptionPane.YES_NO_OPTION);

        if(conf==0)
          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        siguientePaso();
        this.jButton5.setEnabled(true);
        this.jButton3.setEnabled(true);
        this.jButton2.setEnabled(true);
        this.jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel tabla2 = new DefaultTableModel();  
        this.tabla = tabla2;
        this.jTableSim.setModel(this.tabla);
        this.pila.removeAllElements();
        this.entrada.removeAllElements();
        this.accion = "";
        this.iniciarSimulacion();
        this.jButton5.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.jButton2.setEnabled(true);
        this.jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(this.jTableSim.getRowCount()<2){
            this.jButton3.setEnabled(false);
        }else{
            this.jButton5.setEnabled(true);
            this.jButton3.setEnabled(true);
            this.jButton2.setEnabled(true);
            this.jButton4.setEnabled(true);
            String pila = this.tabla.getValueAt(this.jTableSim.getRowCount()-2, 0).toString();
            String entrada = this.tabla.getValueAt(this.jTableSim.getRowCount()-2, 1).toString();        
            this.tabla.removeRow(this.jTableSim.getRowCount()-1);        

            String[] p = pila.split(" ");
            String[] e = entrada.split(" ");
            int i = 1;
            this.pila.removeAllElements();
            while(i < p.length ){
                this.pila.push(p[i]);
                i++;
            }
            i=e.length-1;
            this.entrada.removeAllElements();
            while(i > 0 ){
                this.entrada.push(e[i]);
                i--;
            }

            if(this.pila.peek().equals("$") && this.entrada.peek().equals("$")){
                this.accion = "Aceptar";
            }else{
                if(this.pila.peek().equals(this.entrada.peek())){
                    this.accion = "Emparejar";
                }else{
                    this.accion = buscarTabla(this.pila.peek().toString(),this.entrada.peek().toString());
                }
            }                
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i=0;
        while(i < 500){
            if(!this.accion.equals("Aceptar") || !this.accion.equals("Error") || !this.accion.equals("Fin")){
                this.siguientePaso();
                i++;
            }else
                break;
        }
        this.jButton3.setEnabled(true);
        this.jButton5.setEnabled(true);
        this.jButton2.setEnabled(false);
        this.jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Boolean resultado= null;
        FileNameExtensionFilter filtro= null;
        JFileChooser selector= null;

        JFileChooser chooser = new JFileChooser();
        selector=chooser;
        FileNameExtensionFilter extension = new FileNameExtensionFilter("Informe de simulacion Descendente (.pdf)",new String[]
            {"pdf"});    
        filtro=extension;
        selector.setFileFilter(filtro);
        File fichero = new File("informeSimulacionDesc.pdf");
        selector.setSelectedFile(fichero);
        if(selector.showSaveDialog(null)==0)  {
            try {           
                resultado = this.ventanaPadre.generarInforme(selector.getSelectedFile().toString());
            } catch (DocumentException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(resultado.booleanValue())  {
                StringBuilder JdecGenerated80 = new StringBuilder();           
            }  else  {
                JOptionPane.showConfirmDialog(null,"El informe de la gramática no se puede generar hasta que la gramática esté validada.", "Informe de la gramática", JOptionPane.DEFAULT_OPTION);          
 
            }
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CadEntrada ent = new CadEntrada(this);
        ent.setVisible(true);
        ent.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSim;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
