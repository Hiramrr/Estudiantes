/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.estudiantes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


/*
Este solo es el diseño del panel del historico
*/

/**
 *
 * @author hiram
 */
public class Historico extends javax.swing.JPanel {
    Stack<String> accionesPila = new Stack<String>();
    /**
     * Creates new form Historico
     */
    public Historico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        jScrollPane1.setMinimumSize(new java.awt.Dimension(604, 449));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(604, 449));

        area.setBackground(new java.awt.Color(13, 17, 23));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        area.setForeground(new java.awt.Color(255, 255, 255));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public void llenarTexto() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("Historico.txt"));
            String linea;
    
            // Lee cada línea del archivo y la almacena en la pila
            while ((linea = lector.readLine()) != null) {
                accionesPila.push(linea + "\n"); // Añade la línea y un salto de línea
            }
    
            // Ahora vamos a extraer desde la pila para mostrarlas en orden inverso
            StringBuilder contenidoInverso = new StringBuilder();
            while (!accionesPila.isEmpty()) { // Mientras la pila no esté vacía
                contenidoInverso.append(accionesPila.pop()); // Extrae desde el tope y agrega al StringBuilder
            }
    
            // Establece el contenido en el área de texto
            area.setText(contenidoInverso.toString());
            lector.close();
    
        } catch (IOException e) {
            area.setText("Error al leer el archivo historico"); // Muestra un error en el TextArea
        }
    }
}