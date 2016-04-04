/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaacadémica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        this.setTitle("Planificador de Carga Académica");
        jComboBoxEstudiantes.removeAllItems();
        File path = null;
        _maestros = new ArrayList<>();
        _estudiantes = new ArrayList<>();
        modeloTabla = (DefaultTableModel) jTableClases.getModel();
        modeloMatricula = (DefaultTableModel) jTableMatricula.getModel();
        modeloListaDeClases = new DefaultListModel();
        lista = new ArrayList<>();
        Resultado = new String();
        satisfacción_promedio = new ArrayList<>();

        CargarEstudiantes(path);
        CargarClases(path);
        CargarMaestros(path);
        Cargar_jComboBoxEstudiantes();

    }

    private void CargarClases(File path) {
        try {
            String everything
                    = "Algebra,Sociologia,Filosofia,Introduccion a la computadora,Discreta_"
                    + "Algebra Lineal,Anatomia,Filosofia,Español,Historia de Honduras_"
                    + "Programacion I,Algebra Lineal,Discreta,Anatomia,Filosofia_"
                    + "Educción Fisica,Relgión,Economia,Ingles I,Ambiental_"
                    + "Algebra Lineal,Anatomia,Filosofia,Ambiental,Historia de Honduras_"
                    + "Algebra,Sociologia,Filosofia,Música,Discreta_"
                    + "Música,Anatomia,Filosofia,Español,Historia de Honduras_"
                    + "Filosofia,Ingles II,Ambietal,Español,Sociologia";
            String[] clases = everything.split("_");
            for (int i = 0; i < clases.length; i++) {
                String[] unitClase = clases[i].split(",");
                _estudiantes.get(i).setClases(unitClase);
            }
        } catch (Exception ex) {
            System.err.println("Error Clases");
        }
    }

    private void CargarEstudiantes(File path) {
        try {
            String everything = "HENRY ACOSTA,"
                    + "MIGUEL TORRES,"
                    + "SAMUEL SIMON,"
                    + "AMEY MCCRORY,"
                    + "JUNA LIDDELL,"
                    + "FELECIA STEADMAN,"
                    + "STACEY LYNN,"
                    + "FRANCESCA MADDOX";
            String[] estudiantes = everything.split(",");
            for (int i = 0; i < estudiantes.length; i++) {
                _estudiantes.add(new Estudiantes(1, estudiantes[i]));
            }
        } catch (Exception ex) {
            System.err.println("Error Estudiantes");
        }
    }

    void CargarMaestros(File selectedFile) {
        try {
            String all = "Jorge Castellanos,Historia de Honduras_Sociologia,10:00am_8:30am#"
                    + "Angelo Moreno,Filosofia,8:30am 10:00am 1:00pm#"
                    + "Ana Peralta,Algebra,7:00am 10:00am#"
                    + "Andrea Nicole Acosta,Anatomia,8:30am 1:00pm 2:30pm#"
                    + "Hector Migual Lopez,Algebra Lineal_Discreta,7:00am 10:00am 2:30pm_8:30am 11:30am#"
                    + "Ricardo Almada,Español,8:30am 11:30am#"
                    + "Alejandro Rayos,Programacion I,8:30am 10:00am#"
                    + "Simba Valiente,Introduccion a la computadora,10:00am#"
                    + "Joana Juleite,Economia_Administracion,2:30pm 10:00am_11:30am 7:00am#"
                    + "Pedro Juan,Educción Fisica_Música,4:00pm_1:00pm#"
                    + "Felipe Jose,Ambiental,2:30pm 5:30pm#"
                    + "Juan Pablo II,Relgión_Teoligía,7:00am 5:30am_8:30am,1:00pm#"
                    + "Marco Florencio,Ingles I_Ingles II,10:00am 1:00pm_4:00pm 5:30pm";
            String Maestros[] = all.split("#");
            for (int i = 0; i < Maestros.length; i++) {
                String maestro[] = Maestros[i].split(",");
                String _clase[] = maestro[1].split("_");
                String _Hora[] = maestro[2].split("_");
                _maestros.add(new Maestros(maestro[0].trim(), _clase, _Hora));
            }

        } catch (Exception ex) {
            System.err.println("Error Maestros");
        }
    }

    private void Cargar_jComboBoxEstudiantes() {
        try {
            jComboBoxEstudiantes.removeAllItems();
            modeloListaDeClases.removeAllElements();
            for (int i = 0; i < _estudiantes.size(); i++) {
                jComboBoxEstudiantes.addItem(_estudiantes.get(i).getNombre());
            }
        } catch (Exception e) {
            System.err.println("Error Cargar_JComboBoxEstudiatnes");
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

        jComboBoxEstudiantes = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDeClases = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClases = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMatricula = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxEstudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEstudiantes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEstudiantesItemStateChanged(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jListDeClases.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListDeClases);

        jLabel2.setText("Clases del Trimestre ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel2)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clases del Trimestre", jPanel2);

        jTableClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maestro", "Materia", "Horario", "Aula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableClases);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Clases", jPanel1);

        jTableMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Hora", "Maestros", "Aula"
            }
        ));
        jScrollPane3.setViewportView(jTableMatricula);

        jButton1.setText("Ver clases para Matricular");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("satisfacción promedio");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("satisfacción promedio Matricula", jPanel3);

        jLabel1.setText("Estudiante ->");

        jMenu1.setText("Archivo");

        About.setText("Resultado");
        jMenu1.add(About);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxEstudiantes)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEstudiantesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEstudiantesItemStateChanged
        // TODO add your handling code here:
        try {
            modeloListaDeClases.removeAllElements();

            for (int i = 0; i < _estudiantes.size(); i++) {
                for (int j = 0; j < _estudiantes.get(i).getClases().length; j++) {
                    if (_estudiantes.get(i).getNombre().equals(jComboBoxEstudiantes.getSelectedItem())) {
                        modeloListaDeClases.addElement(_estudiantes.get(i).getClases()[j]);
                    }
                }
            }
            jListDeClases.setModel(modeloListaDeClases);
        } catch (Exception e) {
            //System.err.println("Error jComboBoxEstudiantesItemStateChanged");
        }
    }//GEN-LAST:event_jComboBoxEstudiantesItemStateChanged

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        //update Tabla
        //modeloTabla.removeRow(ERROR);
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableClases.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            jTableClases.setModel(modelo);
            if (!_maestros.isEmpty()) {
                int aula = 1;
                for (int i = 0; i < _maestros.size(); i++) {
                    String Clases[] = _maestros.get(i).getClases();
                    String horas[] = _maestros.get(i).getHorarios();
                    for (int j = 0; j < horas.length; j++) {
                        String hora[] = horas[j].split(" ");
                        for (int k = 0; k < hora.length; k++) {
                            String string = hora[k];
                            Object[] data = {_maestros.get(i).getNombre(), Clases[j], string, aula};
                            modeloTabla.addRow(data);
                            aula++;
                        }
                    }
                }
            }
            jTableClases.setModel(modeloTabla);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        lista.removeAll(lista);
        DefaultTableModel modelo = (DefaultTableModel) jTableMatricula.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        jTableMatricula.setModel(modelo);
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            Object clase = modeloTabla.getValueAt(i, 1);
            int index = jComboBoxEstudiantes.getSelectedIndex();
            for (int j = 0; j < _estudiantes.get(index).getClases().length; j++) {
                if (_estudiantes.get(index).getClases()[j].equals((String) clase)) {
                    Object hora = modeloTabla.getValueAt(i, 2);
                    if ("7:00am".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 1));
                    } else if ("8:30am".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 2));
                    } else if ("10:00am".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 3));
                    } else if ("11:30am".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 4));
                    } else if ("1:00pm".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 5));
                    } else if ("2:30pm".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 6));
                    } else if ("4:00pm".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 7));
                    } else if ("5:30pm".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 8));
                    } else if ("7:00pm".equals((String) hora)) {
                        lista.add(new Clases((String) modeloTabla.getValueAt(i, 1), (String) modeloTabla.getValueAt(i, 2), (String) modeloTabla.getValueAt(i, 0), (Integer) modeloTabla.getValueAt(i, 3), 9));
                    }
                }
            }
        }

        //sort();
        Object[] elem = lista.toArray();

        int r = elem.length;
        int n = 5;
        Resultado = "";
        Perm2(elem, "", n, r);
        System.out.println("Finalizado");
        String[] el = Resultado.split(",");
        if (el.length > 1) {
            for (int i = 0; i < el.length; i++) {
                Object[] rowData = el[i].split("_");
                modeloMatricula.addRow(rowData);
            }
        } else {
            DefaultTableModel modelo1 = (DefaultTableModel) jTableMatricula.getModel();
            while (modelo1.getRowCount() > 0) {
                modelo1.removeRow(0);
            }
            jTableMatricula.setModel(modelo);
        }
        jTableMatricula.setModel(modeloMatricula);
    }//GEN-LAST:event_jButton1MouseClicked

    private void Perm2(Object[] elem, String act, int n, int r) {
        if (n == 0) {
            this.Resultado = act + "\n";
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(((Clases) elem[i]).getHora()) && !act.contains(((Clases) elem[i]).getMateria())) { // Controla que no haya repeticiones
                    Perm2(elem, act + elem[i] + "," + " ", n - 1, r);
                }
            }
        }
    }


    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if (satisfacción_promedio.isEmpty()) {
            for (int i = 0; i < modeloMatricula.getRowCount(); i++) {
                if (null != (String) modeloMatricula.getValueAt(i, 1)) {
                    switch ((String) modeloMatricula.getValueAt(i, 1)) {
                        case "7:00am":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 1));
                            break;
                        case "8:30am":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 2));
                            break;
                        case "10:00am":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 3));
                            break;
                        case "11:30am":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 4));
                            break;
                        case "1:00pm":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 5));
                            break;
                        case "2:30pm":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 6));
                            break;
                        case "4:00pm":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 7));
                            break;
                        case "5:30pm":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 8));
                            break;
                        case "7:00pm":
                            satisfacción_promedio.add(new Clases((String) modeloMatricula.getValueAt(i, 0), (String) modeloMatricula.getValueAt(i, 1), 9));
                            break;
                        default:
                            break;
                    }
                }

            }
            int suma = 1;
            sort();
            for (int i = 0; i < satisfacción_promedio.size() - 1; i++) {

                if (satisfacción_promedio.get(i).No == 1 && satisfacción_promedio.get(i + 1).No == 2) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 2 && satisfacción_promedio.get(i + 1).No == 3) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 3 && satisfacción_promedio.get(i + 1).No == 4) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 4 && satisfacción_promedio.get(i + 1).No == 5) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 5 && satisfacción_promedio.get(i + 1).No == 6) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 6 && satisfacción_promedio.get(i + 1).No == 7) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 7 && satisfacción_promedio.get(i + 1).No == 8) {
                    suma++;
                }
                if (satisfacción_promedio.get(i).No == 8 && satisfacción_promedio.get(i + 1).No == 9) {
                    suma++;
                }
            }
            String rest = "";
            if (!satisfacción_promedio.isEmpty()) {
                for (int i = 0; i < satisfacción_promedio.size(); i++) {
                    rest += satisfacción_promedio.get(i).getMateria() + "\t\t" + satisfacción_promedio.get(i).getHora() + "\t\t" + satisfacción_promedio.get(i).getNo() + "\n";
                }

                rest += "Promedio de Satisfacción: " + suma;
            }

            JOptionPane.showMessageDialog(this, rest, "Lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < satisfacción_promedio.size(); i++) {
                satisfacción_promedio.remove(i);
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    public void sort() {
        for (int i = 0; i < satisfacción_promedio.size(); i++) {
            for (int j = 0; j < satisfacción_promedio.size(); j++) {

                if (satisfacción_promedio.get(i).No < satisfacción_promedio.get(j).No) {
                    Clases temp1 = satisfacción_promedio.get(i);
                    Clases temp2 = satisfacción_promedio.get(j);
                    satisfacción_promedio.set(i, temp2);
                    satisfacción_promedio.set(j, temp1);

                }
            }
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
                if ("MacLookAndFeel".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListDeClases;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClases;
    private javax.swing.JTable jTableMatricula;
    // End of variables declaration//GEN-END:variables
    ArrayList<Estudiantes> _estudiantes;
    ArrayList<Maestros> _maestros;
    DefaultTableModel modeloTabla;
    DefaultTableModel modeloMatricula;
    DefaultListModel modeloListaDeClases;
    ArrayList<Clases> lista;
    ArrayList<Clases> satisfacción_promedio;
    String Resultado;

}
