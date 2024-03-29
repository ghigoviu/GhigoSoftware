/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package maquinaexpendedora;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo R
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    private Entrega entrega;
    
    public Main() {
        initComponents();
        entrega = new Entrega();
        System.out.println("Estado 1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cinco = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paletaElote = new javax.swing.JButton();
        agua = new javax.swing.JButton();
        aguaMineral = new javax.swing.JButton();
        paletaMango = new javax.swing.JButton();
        doritos = new javax.swing.JButton();
        chetos = new javax.swing.JButton();
        choConejo = new javax.swing.JButton();
        cokita = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);
        jPanel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("Insert coin");

        cinco.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        cinco.setText("$5");
        cinco.setActionCommand("cinco");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        diez.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        diez.setText("$10");
        diez.setActionCommand("diez");
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });

        uno.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        uno.setText("$1");
        uno.setActionCommand("uno");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dos1.setText("$2");
        dos1.setActionCommand("dos");
        dos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTextField1.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(dos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(diez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cinco)
                .addGap(18, 18, 18)
                .addComponent(dos1)
                .addGap(18, 18, 18)
                .addComponent(uno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jPanel2.setEnabled(false);
        jPanel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Selecciona producto");

        paletaElote.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        paletaElote.setText("Paleta de elotito");
        paletaElote.setActionCommand("");
        paletaElote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paletaElote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paletaEloteActionPerformed(evt);
            }
        });

        agua.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        agua.setText("Agua embotellada");
        agua.setActionCommand("");
        agua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaActionPerformed(evt);
            }
        });

        aguaMineral.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        aguaMineral.setText("Agua mineral");
        aguaMineral.setActionCommand("");
        aguaMineral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aguaMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaMineralActionPerformed(evt);
            }
        });

        paletaMango.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        paletaMango.setText("Paleta de manguito");
        paletaMango.setActionCommand("");
        paletaMango.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paletaMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paletaMangoActionPerformed(evt);
            }
        });

        doritos.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        doritos.setText("Doritos");
        doritos.setActionCommand("");
        doritos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doritosActionPerformed(evt);
            }
        });

        chetos.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        chetos.setText("Cheetos normales");
        chetos.setActionCommand("");
        chetos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chetosActionPerformed(evt);
            }
        });

        choConejo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        choConejo.setText("Chocolate de conejito");
        choConejo.setActionCommand("");
        choConejo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        choConejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choConejoActionPerformed(evt);
            }
        });

        cokita.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cokita.setText("Cokita");
        cokita.setActionCommand("");
        cokita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cokita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokitaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("$3.00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setText("$4.00");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setText("$10.00");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setText("$7.00");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setText("$9.00");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel12.setText("$12.00");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setText("$8.00");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("$11.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aguaMineral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choConejo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(paletaElote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paletaMango, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paletaElote, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paletaMango, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokita, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aguaMineral, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doritos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chetos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Welcome. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        int suma = Integer.parseInt(jTextField1.getText());
            suma += 5;
        jTextField1.setText(Integer.toString(suma));
        System.out.println("Transición A");
    }                                     

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {                                     
        int suma = Integer.parseInt(jTextField1.getText());
        suma += 10;
        jTextField1.setText(Integer.toString(suma));
        System.out.println("Transición A");
    }                                    

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        int suma = Integer.parseInt(jTextField1.getText());
        suma += 1;
        jTextField1.setText(Integer.toString(suma));
        System.out.println("Transición A");
    }                                   

    private void dos1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        int suma = Integer.parseInt(jTextField1.getText());
        suma += 2;
        jTextField1.setText(Integer.toString(suma));
        System.out.println("Transición A");
    }                                    

    private void paletaEloteActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int costo = 3;
        int cambio = -3;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido la paleta de elotito");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Paleta de elotito";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
            
        }
    }                                           

    private void aguaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        int costo = 7;
        int cambio = -costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido el agua embotellada");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Agua embotellada";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                    

    private void aguaMineralActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int costo = 8;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido el agua mineral");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Agua mineral";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                           

    private void paletaMangoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int costo = 4;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido la paleta de mango");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Paleta de mango";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                           

    private void doritosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int costo = 12;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido unos doritos");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Doritos";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                       

    private void chetosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int costo = 11;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido unos chetos");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Chetos";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                      

    private void choConejoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int costo = 10;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido un chocolate de conejito");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Chocolate de conejito";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
    }                                         

    private void cokitaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int costo = 9;
        int cambio = 0-costo;
        if (Integer.parseInt(jTextField1.getText()) < costo){
            System.out.println("Transición B");
            System.out.println("Estado 2");
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, inserte " + costo + " pesos", 
                   "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Transición C");
            System.out.println("Estado 1");
        }
        else{
            cambio += Integer.parseInt(jTextField1.getText());
            System.out.println("Ha elegido una coca");
            System.out.println("El cambio es de " + cambio + " pesos");
            entrega.producto = "Coca cola de lata";
            entrega.cambio = cambio;
            entrega.setVisible(true);
            this.setVisible(false);
            System.out.println("Transición B");
            System.out.println("Estado 2");
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton agua;
    private javax.swing.JButton aguaMineral;
    private javax.swing.JButton chetos;
    private javax.swing.JButton choConejo;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cokita;
    private javax.swing.JButton diez;
    private javax.swing.JButton doritos;
    private javax.swing.JButton dos1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton paletaElote;
    private javax.swing.JButton paletaMango;
    private javax.swing.JButton uno;
    // End of variables declaration                   
}
