/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_hanoi;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author pablo
 */
public class Torres3 extends javax.swing.JFrame {
    
    private int NumContMov;
    private Pilas pilaTorreA;
    private Pilas pilaTorreB;
    private Pilas pilaTorreC;
    DefaultTableModel modelTA, modelTB, modelTC;
    
    int objetivo;
    double NumMinMov;
    
    boolean stop = false;
    /**
     * Creates new form Torres
     */
    public Torres3() {
        initComponents();
        
        modelTA = (DefaultTableModel) TorreA.getModel();
        modelTA.setRowCount(10);
        
        modelTB = (DefaultTableModel) TorreB.getModel();
        modelTB.setRowCount(10);
        
        modelTC = (DefaultTableModel) TorreC.getModel();
        modelTC.setRowCount(10);
        
        DefaultTableCellRenderer renderA = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreA.getColumnModel().getColumn(0).setCellRenderer(renderA);
        
        DefaultTableCellRenderer renderB = new DefaultTableCellRenderer();
        renderB.setHorizontalAlignment(SwingConstants.CENTER);
        TorreB.getColumnModel().getColumn(0).setCellRenderer(renderB);
        
        DefaultTableCellRenderer renderC = new DefaultTableCellRenderer();
        renderC.setHorizontalAlignment(SwingConstants.CENTER);
        TorreC.getColumnModel().getColumn(0).setCellRenderer(renderC);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TorreC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TorreA = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TorreB = new javax.swing.JTable();
        CtoA = new javax.swing.JButton();
        AtoB = new javax.swing.JButton();
        AtoC = new javax.swing.JButton();
        BtoA = new javax.swing.JButton();
        BtoC = new javax.swing.JButton();
        CtoB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CantDisco = new javax.swing.JComboBox<>();
        BtmReiniciar = new javax.swing.JButton();
        BtmResolver = new javax.swing.JButton();
        BtmIniciar = new javax.swing.JButton();
        MaxMov = new javax.swing.JLabel();
        minimoMov = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TorreC.setBackground(new java.awt.Color(0, 0, 0));
        TorreC.setForeground(new java.awt.Color(255, 255, 255));
        TorreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "C"
            }
        ));
        TorreC.setAutoscrolls(false);
        TorreC.setFocusable(false);
        TorreC.setRowSelectionAllowed(false);
        TorreC.setShowHorizontalLines(false);
        TorreC.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TorreC);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 200));

        TorreA.setBackground(new java.awt.Color(0, 0, 0));
        TorreA.setForeground(new java.awt.Color(255, 255, 255));
        TorreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "A"
            }
        ));
        TorreA.setAutoscrolls(false);
        TorreA.setFocusable(false);
        TorreA.setRowSelectionAllowed(false);
        TorreA.setShowHorizontalLines(false);
        TorreA.setShowVerticalLines(false);
        jScrollPane2.setViewportView(TorreA);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 200));

        TorreB.setBackground(new java.awt.Color(0, 0, 0));
        TorreB.setForeground(new java.awt.Color(255, 255, 255));
        TorreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "B"
            }
        ));
        TorreB.setAutoscrolls(false);
        TorreB.setFocusable(false);
        TorreB.setRowSelectionAllowed(false);
        TorreB.setShowHorizontalLines(false);
        TorreB.setShowVerticalLines(false);
        jScrollPane3.setViewportView(TorreB);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, 200));

        CtoA.setText("A");
        CtoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtoAActionPerformed(evt);
            }
        });
        jPanel1.add(CtoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 60, -1));

        AtoB.setText("B");
        AtoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtoBActionPerformed(evt);
            }
        });
        jPanel1.add(AtoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, -1));

        AtoC.setText("C");
        AtoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtoCActionPerformed(evt);
            }
        });
        jPanel1.add(AtoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 60, -1));

        BtoA.setText("A");
        BtoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAActionPerformed(evt);
            }
        });
        jPanel1.add(BtoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 60, -1));

        BtoC.setText("C");
        BtoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoCActionPerformed(evt);
            }
        });
        jPanel1.add(BtoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 60, -1));

        CtoB.setText("B");
        CtoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtoBActionPerformed(evt);
            }
        });
        jPanel1.add(CtoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 60, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("numero de discos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 180, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de movimientos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 180, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero minimo de movimientos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 200, 40));

        CantDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(CantDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 170, -1));

        BtmReiniciar.setBackground(new java.awt.Color(51, 153, 255));
        BtmReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        BtmReiniciar.setText("reiniciar");
        BtmReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BtmReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 510, 130, -1));

        BtmResolver.setBackground(new java.awt.Color(255, 51, 51));
        BtmResolver.setForeground(new java.awt.Color(0, 0, 0));
        BtmResolver.setText("resolver");
        BtmResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmResolverActionPerformed(evt);
            }
        });
        jPanel1.add(BtmResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 120, -1));

        BtmIniciar.setBackground(new java.awt.Color(51, 255, 0));
        BtmIniciar.setForeground(new java.awt.Color(0, 0, 0));
        BtmIniciar.setText("iniciar");
        BtmIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BtmIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 120, -1));

        MaxMov.setForeground(new java.awt.Color(0, 51, 255));
        MaxMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(MaxMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 170, 20));

        minimoMov.setForeground(new java.awt.Color(255, 0, 0));
        minimoMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(minimoMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("objetivo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 290, 130, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cambiar a 4");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BtmIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmIniciarActionPerformed
        iniciar();
    }//GEN-LAST:event_BtmIniciarActionPerformed

    private void BtmReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_BtmReiniciarActionPerformed

    private void MoveAtoB(){
        try {
            if (pilaTorreA.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreA.peek());
                
                if (pilaTorreB.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreB.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreA.pop();
                pilaTorreB.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
        
    }
    private void AtoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtoBActionPerformed
        MoveAtoB();
    }//GEN-LAST:event_AtoBActionPerformed

    private void MoveAtoC(){
        try {
            if (pilaTorreA.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreA.peek());      //obtenemos la cima de la torre
                
                if (pilaTorreC.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreC.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreA.pop();
                pilaTorreC.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
                
                if (pilaTorreC.getContadorN() == objetivo && NumContMov == NumMinMov) {
                    
                    JOptionPane.showMessageDialog(null, "!Has conseguido completar el juego con en minimo de movimietnos¡\n\n Intenta con otro nivel de dificultad","Felicitaciones", JOptionPane.WARNING_MESSAGE);
                } else if(pilaTorreC.getContadorN() == objetivo && NumContMov != NumMinMov){
                    JOptionPane.showMessageDialog(null, "!Has conseguido completar el juego¡\n\n intenta completar con el minimo de movimientos requeridos\n\n Intenta con otro nivel de dificultad","Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
        
    private void AtoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtoCActionPerformed
        MoveAtoC();
    }//GEN-LAST:event_AtoCActionPerformed

    private void MoveBtoA(){
        try {
            if (pilaTorreB.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreB.peek());
                
                if (pilaTorreA.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreA.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreB.pop();
                pilaTorreA.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    
    private void BtoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAActionPerformed
        MoveBtoA();
    }//GEN-LAST:event_BtoAActionPerformed

    private void MoveBtoC(){
        try {
            if (pilaTorreB.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreB.peek());      //obtenemos la cima de la torre
                
                if (pilaTorreC.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreC.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreB.pop();
                pilaTorreC.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
                
                if (pilaTorreC.getContadorN() == objetivo && NumContMov == NumMinMov) {
                    
                    JOptionPane.showMessageDialog(null, "!Has conseguido completar el juego con en minimo de movimietnos¡\n\n Intenta con otro nivel de dificultad","Felicitaciones", JOptionPane.WARNING_MESSAGE);
                } else if(pilaTorreC.getContadorN() == objetivo && NumContMov != NumMinMov){
                    JOptionPane.showMessageDialog(null, "!Has conseguido completar el juego¡\n\n intenta completar con el minimo de movimientos requeridos\n\n Intenta con otro nivel de dificultad","Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    
    private void BtoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCActionPerformed
        MoveBtoC();
    }//GEN-LAST:event_BtoCActionPerformed

    private void MoveCtoB(){
        try {
            if (pilaTorreC.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreC.peek());
                
                if (pilaTorreB.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreB.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreC.pop();
                pilaTorreB.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    
    private void CtoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtoBActionPerformed
        MoveCtoB();
    }//GEN-LAST:event_CtoBActionPerformed
    
    private void MoveCtoA(){
        try {
            if (pilaTorreC.getContadorN() > 0) {
                Nodo plataforma = new Nodo();
                
                plataforma.setElemento(pilaTorreC.peek());
                
                if (pilaTorreA.getContadorN() > 0) {
                    
                    if (plataforma.getElemento().compareTo(pilaTorreA.peek()) > 0) {
                    return;
                        
                    }
                }
                pilaTorreC.pop();
                pilaTorreA.push(plataforma);
                
                presentarA();
                presentarB();
                presentarC();
                
                PresentarNumMov();
            }
            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    
    private void CtoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtoAActionPerformed
        MoveCtoA();
    }//GEN-LAST:event_CtoAActionPerformed

    private void BtmResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmResolverActionPerformed
        if (!minimoMov.getText().equals("") && pilaTorreC.getContadorN() != objetivo) {
            reiniciar();
            stop = false;
            
            resolverHanoi(objetivo, pilaTorreA, pilaTorreB, pilaTorreC);
        }
    }//GEN-LAST:event_BtmResolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame Torres4 = new Torres4();
        Torres4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void moverPlataforma(Pilas origen, Pilas destino){
        if (stop  == false) {
            
            Nodo plataforma = new Nodo();
            
            plataforma.setElemento(origen.peek());
            
            origen.pop();
            
            
            destino.push(plataforma);
            
            presentarA();
            presentarB();
            presentarC();
            PresentarNumMov();
            
            JOptionPane panel = new JOptionPane("Paso # "+ MaxMov.getText()+" \n\n¿Desea continuar?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
            
            JDialog dialogo = panel.createDialog("Numero de pasos");
            
            dialogo.setLocation(600,400);
            dialogo.setVisible(true);
            
            int opt = (int) panel.getValue();
            if (opt == JOptionPane.NO_OPTION) {
                stop = true;
            }
        }
    }
    
    private void resolverHanoi(int size, Pilas origen, Pilas auxiliar, Pilas destino){
        if (size == 1) {
            moverPlataforma(origen, destino);
            
        } else{
            resolverHanoi(size - 1, origen, destino, auxiliar);
            
            moverPlataforma(origen, destino);
            
            resolverHanoi(size -1, auxiliar, origen, destino);
    }
    
    }
    private void limpiar(){
       NumContMov = 0;
       NumMinMov = 0;
       
       CantDisco.setSelectedItem(String.valueOf(objetivo));
    }
    
    private void PresentarNumMov(){
        NumContMov++;
        MaxMov.setText(String.valueOf(NumContMov));
    }
    
    private void iniciar(){
        try {
        pilaTorreA = new Pilas();
        pilaTorreB = new Pilas();
        pilaTorreC = new Pilas();
        
        objetivo = Integer.parseInt(CantDisco.getSelectedItem().toString());
        
        NumMinMov = Math.pow(2, objetivo) - 1;
        
        MaxMov.setText(String.valueOf(NumContMov));
        minimoMov.setText(String.valueOf(String.format("%.0f", NumMinMov)));
        
        for (int i = objetivo; i >= 1; i--) {
            Nodo plataforma = new Nodo();
            String Disco = "";
            
            for (int j = i; j > 0; j--) {
                Disco+= "#";
            }
            plataforma.setElemento(Disco);
            
            pilaTorreA.push(plataforma);
        }
        
        presentarA();
        presentarB();
        presentarC();
        } catch (NumberFormatException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
    
    private void reiniciar(){
        try {
            if (!minimoMov.getText().equals("")) {
                limpiar();
                iniciar();
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }
    
    private void presentarA(){
        ((DefaultTableModel)TorreA.getModel()).setRowCount(0);
        
        modelTA.setRowCount(10);
        
        Nodo Z;
        int filaDisco = (10 - pilaTorreA.getContadorN());
        
        if (pilaTorreA.getContadorN() > 0) {
            
        
        for (Z = pilaTorreA.getCabeza(); Z.getAnterior() != null; Z = Z.getAnterior()) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTA.insertRow(filaDisco, VectorDisco);
            
            filaDisco++;
        }
        if (Z.getAnterior() == null) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTA.insertRow(filaDisco, VectorDisco); 
        }
        
        }
        TorreA.setModel(modelTA);
        modelTA.setRowCount(10);
        
    }
    
    private void presentarB(){
        ((DefaultTableModel)TorreB.getModel()).setRowCount(0);
        
        modelTB.setRowCount(10);
        
        Nodo Z;
        int filaDisco = (10 - pilaTorreB.getContadorN());
        
        if (pilaTorreB.getContadorN() > 0) {
            
        
        for (Z = pilaTorreB.getCabeza(); Z.getAnterior() != null; Z = Z.getAnterior()) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTB.insertRow(filaDisco, VectorDisco);
            
            filaDisco++;
        }
        if (Z.getAnterior() == null) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTB.insertRow(filaDisco, VectorDisco); 
        }
        
        }
        TorreB.setModel(modelTB);
        modelTB.setRowCount(10);
        
    }
    
    private void presentarC(){
        ((DefaultTableModel)TorreC.getModel()).setRowCount(0);
        
        modelTC.setRowCount(10);
        
        Nodo Z;
        int filaDisco = (10 - pilaTorreC.getContadorN());
        
        if (pilaTorreC.getContadorN() > 0) {
            
        
        for (Z = pilaTorreC.getCabeza(); Z.getAnterior() != null; Z = Z.getAnterior()) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTC.insertRow(filaDisco, VectorDisco);
            
            filaDisco++;
        }
        if (Z.getAnterior() == null) {
            String[] VectorDisco = {Z.getElemento()};
            
            modelTC.insertRow(filaDisco, VectorDisco); 
        }
        
        }
        TorreC.setModel(modelTC);
        modelTC.setRowCount(10);
        
    }
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
            java.util.logging.Logger.getLogger(Torres3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Torres3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Torres3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Torres3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Torres3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtoB;
    private javax.swing.JButton AtoC;
    private javax.swing.JButton BtmIniciar;
    private javax.swing.JButton BtmReiniciar;
    private javax.swing.JButton BtmResolver;
    private javax.swing.JButton BtoA;
    private javax.swing.JButton BtoC;
    private javax.swing.JComboBox<String> CantDisco;
    private javax.swing.JButton CtoA;
    private javax.swing.JButton CtoB;
    private javax.swing.JLabel MaxMov;
    private javax.swing.JTable TorreA;
    private javax.swing.JTable TorreB;
    private javax.swing.JTable TorreC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel minimoMov;
    // End of variables declaration//GEN-END:variables
}