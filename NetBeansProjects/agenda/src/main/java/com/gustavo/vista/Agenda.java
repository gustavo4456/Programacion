package com.gustavo.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class Agenda extends javax.swing.JFrame implements CambiarPanelListener {

    private int xMouse, yMouse;

    public Agenda() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        fondoMenu = new javax.swing.JPanel();
        lblTituloMenuPrincipal = new javax.swing.JLabel();
        btnMenuContactos = new javax.swing.JLabel();
        btnMenuMiAgenda = new javax.swing.JLabel();
        btnMenuEventos = new javax.swing.JLabel();
        btnMenuLocaciones = new javax.swing.JLabel();
        barraVentana = new javax.swing.JPanel();
        btnCerrarVentana = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoMenu.setBackground(new java.awt.Color(0, 102, 255));

        lblTituloMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloMenuPrincipal.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblTituloMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMenuPrincipal.setText("AGENDA");

        btnMenuContactos.setBackground(new java.awt.Color(51, 102, 255));
        btnMenuContactos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMenuContactos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuContactos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenuContactos.setText("Contactos");
        btnMenuContactos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuContactos.setOpaque(true);
        btnMenuContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuContactosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuContactosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuContactosMouseExited(evt);
            }
        });

        btnMenuMiAgenda.setBackground(new java.awt.Color(51, 102, 255));
        btnMenuMiAgenda.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMenuMiAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuMiAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenuMiAgenda.setText("Mi agenda");
        btnMenuMiAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuMiAgenda.setOpaque(true);
        btnMenuMiAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMiAgendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMiAgendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuMiAgendaMouseExited(evt);
            }
        });

        btnMenuEventos.setBackground(new java.awt.Color(51, 102, 255));
        btnMenuEventos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMenuEventos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuEventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenuEventos.setText("Eventos");
        btnMenuEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuEventos.setOpaque(true);
        btnMenuEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuEventosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuEventosMouseExited(evt);
            }
        });

        btnMenuLocaciones.setBackground(new java.awt.Color(51, 102, 255));
        btnMenuLocaciones.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMenuLocaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuLocaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenuLocaciones.setText("Locaciones");
        btnMenuLocaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuLocaciones.setOpaque(true);
        btnMenuLocaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuLocacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuLocacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuLocacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoMenuLayout = new javax.swing.GroupLayout(fondoMenu);
        fondoMenu.setLayout(fondoMenuLayout);
        fondoMenuLayout.setHorizontalGroup(
            fondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnMenuMiAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuContactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuLocaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoMenuLayout.setVerticalGroup(
            fondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuMiAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuLocaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        bg.add(fondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 520));

        barraVentana.setBackground(new java.awt.Color(255, 255, 255));
        barraVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraVentanaMouseDragged(evt);
            }
        });
        barraVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraVentanaMousePressed(evt);
            }
        });

        btnCerrarVentana.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarVentana.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btnCerrarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarVentana.setText("X");
        btnCerrarVentana.setOpaque(true);
        btnCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarVentanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarVentanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarVentanaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout barraVentanaLayout = new javax.swing.GroupLayout(barraVentana);
        barraVentana.setLayout(barraVentanaLayout);
        barraVentanaLayout.setHorizontalGroup(
            barraVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraVentanaLayout.createSequentialGroup()
                .addGap(0, 824, Short.MAX_VALUE)
                .addComponent(btnCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraVentanaLayout.setVerticalGroup(
            barraVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(barraVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        bg.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 550, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraVentanaMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraVentanaMousePressed

    private void barraVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraVentanaMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraVentanaMouseDragged

    private void btnCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVentanaMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarVentanaMouseClicked

    private void btnCerrarVentanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVentanaMouseEntered
        // TODO add your handling code here:
        btnCerrarVentana.setBackground(Color.red);
        btnCerrarVentana.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarVentanaMouseEntered

    private void btnCerrarVentanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVentanaMouseExited
        // TODO add your handling code here:
        btnCerrarVentana.setBackground(Color.white);
        btnCerrarVentana.setForeground(Color.black);
    }//GEN-LAST:event_btnCerrarVentanaMouseExited

    private void btnMenuMiAgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMiAgendaMouseEntered
        // TODO add your handling code here:
        btnMenuMiAgenda.setBackground(new Color(9, 146, 247));
    }//GEN-LAST:event_btnMenuMiAgendaMouseEntered

    private void btnMenuMiAgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMiAgendaMouseExited
        // TODO add your handling code here:
        btnMenuMiAgenda.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_btnMenuMiAgendaMouseExited

    private void btnMenuContactosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuContactosMouseEntered
        // TODO add your handling code here:
        btnMenuContactos.setBackground(new Color(9, 146, 247));
    }//GEN-LAST:event_btnMenuContactosMouseEntered

    private void btnMenuContactosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuContactosMouseExited
        // TODO add your handling code here:
        btnMenuContactos.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_btnMenuContactosMouseExited

    private void btnMenuEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuEventosMouseEntered
        // TODO add your handling code here:
        btnMenuEventos.setBackground(new Color(9, 146, 247));
    }//GEN-LAST:event_btnMenuEventosMouseEntered

    private void btnMenuEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuEventosMouseExited
        // TODO add your handling code here:
        btnMenuEventos.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_btnMenuEventosMouseExited

    private void btnMenuLocacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuLocacionesMouseEntered
        // TODO add your handling code here:
        btnMenuLocaciones.setBackground(new Color(9, 146, 247));
    }//GEN-LAST:event_btnMenuLocacionesMouseEntered

    private void btnMenuLocacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuLocacionesMouseExited
        // TODO add your handling code here:
        btnMenuLocaciones.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_btnMenuLocacionesMouseExited

    private void btnMenuLocacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuLocacionesMouseClicked
        // TODO add your handling code here:
        Locaciones loc = new Locaciones();

        cambiarPanel(loc);
    }//GEN-LAST:event_btnMenuLocacionesMouseClicked

    private void btnMenuEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuEventosMouseClicked
        // TODO add your handling code here:
        Eventos ev = new Eventos();

        cambiarPanel(ev);
    }//GEN-LAST:event_btnMenuEventosMouseClicked

    private void btnMenuContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuContactosMouseClicked
        // TODO add your handling code here:
        Contacto anf = new Contacto();

        cambiarPanel(anf);
    }//GEN-LAST:event_btnMenuContactosMouseClicked

    private void btnMenuMiAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMiAgendaMouseClicked
        // TODO add your handling code here:
        MiAgenda miAgen = new MiAgenda();

        cambiarPanel(miAgen);
    }//GEN-LAST:event_btnMenuMiAgendaMouseClicked

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraVentana;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnCerrarVentana;
    private javax.swing.JLabel btnMenuContactos;
    private javax.swing.JLabel btnMenuEventos;
    private javax.swing.JLabel btnMenuLocaciones;
    private javax.swing.JLabel btnMenuMiAgenda;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondoMenu;
    private javax.swing.JLabel lblTituloMenuPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambiarPanel(JPanel panel) {
        panel.setSize(550, 490);
        panel.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
}
