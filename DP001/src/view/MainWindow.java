package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 5129441458924872546L;
	
    private JButton jButtonConnect;
    private JButton jButtonExportTxt;
    private JButton jButtonImport;
    private JButton jButtonSalir;
    private JButton jButtonDelete;
    private JButton jButtonGet;
    private JButton jButtonRegister;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JScrollPane jScrollPane1;
    private JTable jTable;
    
	public MainWindow() {
        initComponents();
    }

    private void initComponents() {

        jButtonConnect = new JButton();
        jButtonRegister = new JButton();
        jButtonGet = new JButton();
        jButtonDelete = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable = new JTable();
        jButtonExportTxt = new JButton();
        jButtonImport = new JButton();
        jButtonSalir = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButtonConnect.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonConnect.setIcon(new ImageIcon(getClass().getResource("/Iconos/BaseDatos.png"))); // NOI18N
        jButtonConnect.setText("Conexión Lawson");
 
        jButtonRegister.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonRegister.setText("Entrar OF");
        jButtonRegister.setEnabled(false);

        jButtonGet.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonGet.setText("Obtener Registros");
        jButtonGet.setEnabled(false);

        jButtonDelete.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonDelete.setText("Borrar OF");
        jButtonDelete.setEnabled(false);

        jTable.setModel(new DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ) {
				private static final long serialVersionUID = 1L;
				boolean[] canEdit = new boolean [] {
                    true, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        jScrollPane1.setViewportView(jTable);

        jButtonExportTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonExportTxt.setIcon(new ImageIcon(getClass().getResource("/Iconos/ExportTxt.png"))); // NOI18N
        jButtonExportTxt.setText("Exportar");
        jButtonExportTxt.setHorizontalAlignment(SwingConstants.LEFT);


        jButtonImport.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonImport.setIcon(new ImageIcon(getClass().getResource("/Iconos/ImportExcel.png"))); // NOI18N
        jButtonImport.setText("Importar");
        jButtonImport.setHorizontalAlignment(SwingConstants.LEFT);


        jButtonSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSalir.setIcon(new ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setHorizontalAlignment(SwingConstants.RIGHT);


        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalir, GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDelete, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGet, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegister, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExportTxt, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImport, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConnect, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConnect)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImport)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExportTxt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegister)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGet)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public JButton getjButtonExport() {
		return jButtonExportTxt;
	}

	public JButton getjButtonImport() {
		return jButtonImport;
	}
	
	public JButton getButtonExit(){
		return jButtonSalir;
	}

	public JTable getJTable(){
		return jTable;
	}
	
    public JButton getjButtonConnect() {
		return jButtonConnect;
	}

	public JButton getjButtonExportTxt() {
		return jButtonExportTxt;
	}

	public JButton getjButtonSalir() {
		return jButtonSalir;
	}

	public JButton getjButtonDelete() {
		return jButtonDelete;
	}

	public JButton getjButtonGet() {
		return jButtonGet;
	}
	
	public JButton getjButtonRegister() {
		return jButtonRegister;
	}

	public JMenu getjMenu1() {
		return jMenu1;
	}

	public JMenu getjMenu2() {
		return jMenu2;
	}

	public JMenuBar getjMenuBar1() {
		return jMenuBar1;
	}

	public JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public JTable getjTable() {
		return jTable;
	}

}
