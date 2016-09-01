package view;

import javax.swing.*;

public class RegisterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9057542191560429570L;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton jButtonCancel;
	private JButton jButtonRegister;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JTextField jTextFieldCantidad;
	private JTextField jTextFieldOC;
	private JTextField jTextFieldOF;
	private JTextField jTextFieldReferencia;
	// End of variables declaration//GEN-END:variables

	public RegisterWindow() {
		initComponents();

	}

	private void initComponents() {

		jLabel2 = new JLabel();
		jTextFieldOF = new JTextField();
		jTextFieldCantidad = new JTextField();
		jTextFieldReferencia = new JTextField();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel7 = new JLabel();
		jButtonRegister = new JButton();
		jButtonCancel = new JButton();
		jTextFieldOC = new JTextField();

		jLabel2.setText("jLabel2");

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Registro de Usuario");
		setResizable(false);

		jTextFieldOF.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

		jTextFieldCantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

		jTextFieldReferencia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

		jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jLabel3.setText("OF:");

		jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jLabel4.setText("OC:");

		jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jLabel5.setText("Referencia:");

		jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jLabel7.setText("Cantidad:");

		jButtonRegister.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jButtonRegister.setText("Registrar");

		jButtonCancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jButtonCancel.setText("Cancelar");

		jTextFieldOC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel7)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextFieldCantidad)
										.addGap(123, 123, 123))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel5)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jButtonRegister, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
														.addGap(18, 18, 18)
														.addComponent(jButtonCancel)))
										.addContainerGap())
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
												.addComponent(jTextFieldReferencia, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
												.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jLabel3)
																.addComponent(jLabel4))
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
																.addComponent(jTextFieldOC, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
																.addComponent(jTextFieldOF))))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jTextFieldOF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jTextFieldOC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jTextFieldReferencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(jTextFieldCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonRegister)
								.addComponent(jButtonCancel))
						.addContainerGap(13, Short.MAX_VALUE))
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public JButton getjButtonCancel() {
		return jButtonCancel;
	}

	public JButton getjButtonRegister() {
		return jButtonRegister;
	}

	public JLabel getjLabel2() {
		return jLabel2;
	}

	public JLabel getjLabel3() {
		return jLabel3;
	}

	public JLabel getjLabel4() {
		return jLabel4;
	}

	public JLabel getjLabel5() {
		return jLabel5;
	}

	public JLabel getjLabel7() {
		return jLabel7;
	}

	public JTextField getjTextFieldCantidad() {
		return jTextFieldCantidad;
	}

	public JTextField getjTextFieldOC() {
		return jTextFieldOC;
	}

	public JTextField getjTextFieldOF() {
		return jTextFieldOF;
	}

	public JTextField getjTextFieldReferencia() {
		return jTextFieldReferencia;
	}




}
