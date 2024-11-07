package com.mycompany.estudiantes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


/**
 * Ventana donde se agregan a los alumnos
 * @author hiram, michell, jorge
 */
/**
    Clase Agregar
    Esta clase se encarga de agregar a los alumnos a la tabla
    y de guardar los datos en un archivo de texto
 */
public class Agregar extends javax.swing.JFrame implements ActionListener {
    private String nombre,matricula,fecha,edadS;
    private int dia,mes,año,edad;
    Queue<Alumno> colaAlumnos = new LinkedList<>();
    Queue<Alumno> aux = new LinkedList<>();
    
    /*
        Creacion del modelo de la tabla
    */
    String[] titulo = new String[]{"Matricula","Nombre","Edad"};
    DefaultTableModel dtm = new DefaultTableModel(titulo, 0) {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        }
    };
    /**
     * Creates new form GUI
     */
    public Agregar() {
        initComponents();
        dtm.setColumnIdentifiers(titulo);
        datos.setModel(dtm);
        setIconImage(new ImageIcon("sus.jpg").getImage());
        colaAlumnos = leerArchivo();
        llenarTabla();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        matriculaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaText = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(732, 765));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(17, 23, 30));
        jPanel1.setMinimumSize(new java.awt.Dimension(728, 765));

        jPanel2.setBackground(new java.awt.Color(22, 26, 33));

        error.setBackground(new java.awt.Color(191, 50, 8));
        error.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(191, 50, 8));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oye.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oye.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estudiantes");

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datos);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricula:");

        matriculaText.setBackground(new java.awt.Color(0, 0, 0));
        matriculaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        matriculaText.setForeground(new java.awt.Color(255, 255, 255));
        matriculaText.setBorder(null);
        matriculaText.setCaretColor(new java.awt.Color(255, 255, 255));
        matriculaText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        matriculaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaTextActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        nombreText.setBackground(new java.awt.Color(0, 0, 0));
        nombreText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreText.setForeground(new java.awt.Color(255, 255, 255));
        nombreText.setBorder(null);
        nombreText.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de nacimiento dd/mm/aaaa:");

        fechaText.setBackground(new java.awt.Color(0, 0, 0));
        fechaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaText.setForeground(new java.awt.Color(255, 255, 255));
        fechaText.setBorder(null);
        fechaText.setCaretColor(new java.awt.Color(255, 255, 255));
        fechaText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        fechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(35, 135, 55));
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar Alumno");
        agregar.addActionListener(this);

        home.setBackground(new java.awt.Color(13, 17, 23));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        home.setBorder(null);
        home.setMaximumSize(new java.awt.Dimension(67, 67));
        home.setMinimumSize(new java.awt.Dimension(67, 67));
        home.setPreferredSize(new java.awt.Dimension(67, 67));
        home.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregar)
                                .addGap(120, 120, 120))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 732, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaTextActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void fechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTable datos;
    private javax.swing.JLabel error;
    private javax.swing.JTextField fechaText;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matriculaText;
    private javax.swing.JTextField nombreText;
    // End of variables declaration//GEN-END:variables
    
    /**
     *Metodo validar_formato
     *@param fecha de tipo String
     *Corta la fecha en el formato dd / mm / aaaa
     *y a cada uno lo asigna a un Integer
     * @return true si es dia es valido, si no, false
     * @exception NumberFormatException si los dias no son numeros
     */
    public boolean fechaValida(String fecha){
        try {
            String[] f = fecha.split("/");
            if (f.length != 3) {
                return false;
            }
            dia = Integer.parseInt(f[0]);
            mes = Integer.parseInt(f[1]);
            año = Integer.parseInt(f[2]);
            return dias_validos(dia, mes, año);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * Metodo dia_formato
     * @param fecha
     * obtiene el dia en forma numero que fue introducido por el usuario
     * @return dia
     */
    public int dia_formato(String fecha){
        String[] f = fecha.split("/");
        return Integer.parseInt(f[0]);
    }

    /**
     * Metodo mes_formato
     * @param fecha
     * obtiene el mes que fue introducido por el usuario
     * @return mes
     */
    public int mes_formato(String fecha){
        String[] f = fecha.split("/");
        return Integer.parseInt(f[1]);
    }

    /**
     * Metodo año_formato
     * @param fecha
     * obtiene el año que fue introducido por el usuario
     * @return año
     */
    public int año_formato(String fecha){
        String[] f = fecha.split("/");
        return Integer.parseInt(f[2]);
    }

    /**
     *Metodo dias_validos
     *@param dia de tipo integer
     *@param mes de tipo integer
     *@param año de tipo integer
     *Checa si los dias coinciden con su mes
     *Maneja un caso febrero por los años biciestos
     *@return true si es valido el dia, si no, false
     */
    public boolean dias_validos(int dia, int mes, int año){
        boolean bandera = false;
        if(dia <= 31 && mes == 1 || mes == 3 || mes == 5
           || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            bandera = true;
        }
        else if (dia <= 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11){
            bandera = true;
        }
        else if(dia <= 28 && mes == 2 ){
            bandera = true;
        } else {
            if (febrero(dia,mes,año)){
                bandera = true;
            } else {
                bandera = false;
            }
        }
        return bandera;
    }

    /**
     *Metodo bisiesto
     *@param año de tipo Integer
     *con la operacion mod checa si es año es biciesto
     *@return true si lo es, si no, false
     */
    public boolean bisiesto(int año){
        return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
    }

    /**
     *Metodo febrero
     *@param dia de tipo Integer
     *@param mes de tipo Integer
     *@param año de tipo Integer
     *Checa si se trata de un febrero bisiesto
     *@return true si lo es, si no, false
     */
    public boolean febrero(int dia, int mes, int año) {
        if (bisiesto(año)) {
            return dia == 29 && mes == 2;
        }
        return false;
    }

    /**
     *Metodo obtener_edad
     *@param dia de tipo Integer
     *@param mes de tipo Integer
     *@param año de tipo Integer
     *Calcula la edad haciendo uso de la fecha de hoy
     *Si la edad esta en un rango de 12 a 126
     *@return la edad, si no, regresa una edad invalida
     */
    public int obtenerEdad(int dia, int mes, int año) {
        Calendar fecha = Calendar.getInstance();
        int dia_actual = fecha.get(Calendar.DAY_OF_MONTH);
        int mes_actual = fecha.get(Calendar.MONTH) + 1;
        int año_actual = fecha.get(Calendar.YEAR);
        edad = año_actual - año;
        if (mes > mes_actual || (mes == mes_actual && dia > dia_actual)) {
            edad--;
        }
        if (edad < 12) {
            error.setText("Edad invalida, la edad debe ser mayor a 12");
            return -1;
        }
        if(edad > 126){
            error.setText("Edad invalida, la edad debe ser menor a 126");
            return -1;
        }
        return edad;
    }
    
    /**
    * Guarda un historico de las acciones realizadas por el usuario
     * @param accion de tipo String
    */
    public void historico(String accion){
        try{
            BufferedWriter datos = new BufferedWriter(new FileWriter("Historico.txt",true));
            datos.write(accion + "\n");
            datos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar historico");
        }
    }
    
    /**
     * Guarda los datos de alumnos en un archivo "RegistroAlumnos.txt", de no
     * existir el archivo lo crea, y si existe lo remplaza con información nueva
     * @throws java.io.IOException
     */
    public void guardarArchivo() {
        int filas = dtm.getRowCount(); 
        try (BufferedWriter datos = new BufferedWriter(new FileWriter("RegistroAlumnos.txt"))) {
            for (int i = 0; i < filas; i++) {
                String matricula = (String) dtm.getValueAt(i, 0);
                String nombre = (String) dtm.getValueAt(i, 1);
                Object edadObj = dtm.getValueAt(i, 2);

                String edadS = (edadObj instanceof Integer) ? edadObj.toString() : (String) edadObj;         
                datos.write(matricula + "," + nombre + "," + edadS + "\n");
            }
        System.out.println("Datos guardados en RegistroAlumnos.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }    
    }
    
    /**
     * Lee los datos de un archivo RegistroAlumnos.txt y convierte los datos en 
     * objetos alumno,los cuales se regresan como una cola, el .txt debe tener 
     * cada alumno guardado en una linea diferente con el siguiente formato: 
     * "nombre,matriucula de 5 diticos, fecha de nacimiento en formato dd/mm/aaaa", 
     * de no existir la lectura no se realizara y lanzara un mensaje de error pero
     * el programa continuara
     * @return Queue o cola conformada por objetos Alumno
     */
    public static Queue<Alumno> leerArchivo() {
        Queue<Alumno> colaAlumnos = new LinkedList<Alumno>();
        try (BufferedReader reader = new BufferedReader(new FileReader("RegistroAlumnos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    Alumno alumno = new Alumno(partes[0], partes[1], Integer.parseInt(partes[2]));
                    colaAlumnos.add(alumno);
                }
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo: RegistroAlumnos.txt");
        }
        return colaAlumnos;
    }

    /**
     * Llena la tabla con los datos de los alumnos
     */
    public void llenarTabla() {
        while (!colaAlumnos.isEmpty()) {
            Alumno a = colaAlumnos.poll();
            String matricula = a.getMatricula();
            String nombre = a.getNombre();
            int edad = a.getEdad();
            dtm.addRow(new Object[]{matricula, nombre, edad});
            aux.add(a);
        }
        while(!aux.isEmpty()){
            colaAlumnos.add(aux.poll());
        }
    }

    /**
     * Metodo matriculaRepetida
     * @param matricula
     * checa si la matricula repetida se encuentra en la cola de alumnos
     * @return true si la matricula se repite, si no, false
     */
    public boolean matriculaRepetida(String matricula) {
        for (Alumno alumno : colaAlumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
        }

    /**
     * Metodo tamaño_matricula
     * @param matricula
     * checa si la matricula tiene 5 digitos
     * @return true si la matricula tiene 5 digitos, si no, false
     */
    public boolean tamaño_matricula(String matricula){
        if(matricula.length() == 5 ){
            try {
                Integer.parseInt(matricula);
                return true;
            } catch (NumberFormatException e) {
                error.setText("La matrícula debe ser numerica");
                return false;
            }
        } else {
            error.setText("Ingresa una matricula de 5 digitos");
            return false;
        }
    }

    /**
     * Metodo matriculaValida
     * @param matricula
     * checa si la matricula es valida
     * @return true si la matricula es valida, si no, false
     */
    public boolean matriculaValida(String matricula) {
        if (tamaño_matricula(matricula) && !matriculaRepetida(matricula)) {
            return true;
        } else {
            error.setText("La matrícula no es válida!");
            return false;
        }
   }

    /**
     * Metodo guardarAlumno
     * guarda los datos del alumno en la tabla
     */
    public void guardarAlumno(){
        fecha = fechaText.getText();
        //comprobar si la fecha es valida
        if(fechaValida(fecha)){
            dia = dia_formato(fecha);
            mes = mes_formato(fecha);
            año = año_formato(fecha);
            edad = obtenerEdad(dia,mes,año);
            if(edad == -1){error.setText("Edad invalida, la edad debe ser menor a 126"); return;}
            }
        else {error.setText("Introduce una fecha valida!"); return; }
        
        //checa si la matricula es unica
        matricula = matriculaText.getText();
        if(!matriculaValida(matricula)){
            error.setText("La matricula no es valida!");
            return;
        }
        
        edadS = Integer.toString(edad);

        nombre = nombreText.getText(); 
        dtm.addRow(new Object[]{matricula,nombre,edadS});
        historico("El usuario guardo a un nuevo alumno con el nombre de " + nombre);
        
        Alumno a = new Alumno(matricula, nombre, edad);
        System.out.println(edad);
        colaAlumnos.add(a);
        guardarArchivo();
        System.out.println("Guarde");
    }

    /**
     * Metodo actionPerformed
     * @param evt el evento que se realizo
     * Maneja los eventos de los botones
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == agregar){
            guardarAlumno();
        }
        else if(evt.getSource() == home){
            this.dispose();
            Principal principal = new Principal();
            principal.setVisible(true);
        }
    }
}
