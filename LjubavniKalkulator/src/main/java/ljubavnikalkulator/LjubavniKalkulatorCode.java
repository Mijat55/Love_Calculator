/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ljubavnikalkulator;

import java.util.Arrays;
import java.util.Scanner;
import static ljubavnikalkulator.LjubavniKalkulator.ljubav;
import static ljubavnikalkulator.LjubavniKalkulator.rasclaniBroj;

/**
 *
 * @author Marko
 */
public class LjubavniKalkulatorCode extends javax.swing.JFrame {

    /**
     * Creates new form LjubavniKalkulatorCode
     */
    public LjubavniKalkulatorCode() {
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

        btnIme1 = new javax.swing.JButton();
        btnIme2 = new javax.swing.JButton();
        lblime2 = new javax.swing.JLabel();
        btnIzracun = new javax.swing.JButton();
        lblIspisIzracuna = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lblIme1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txtIspis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        setForeground(java.awt.Color.red);

        btnIme1.setBackground(new java.awt.Color(255, 0, 0));
        btnIme1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        btnIme1.setText("Unesi prvo ime");
        btnIme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIme1ActionPerformed(evt);
            }
        });

        btnIme2.setBackground(new java.awt.Color(255, 0, 0));
        btnIme2.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        btnIme2.setText("Unesi drugo ime");
        btnIme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIme2ActionPerformed(evt);
            }
        });

        btnIzracun.setBackground(new java.awt.Color(0, 0, 0));
        btnIzracun.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnIzracun.setForeground(new java.awt.Color(255, 0, 0));
        btnIzracun.setText("% Ljubav %");
        btnIzracun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzracunActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(51, 51, 255));
        txt1.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N

        txt2.setBackground(new java.awt.Color(255, 153, 153));
        txt2.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N

        txtIspis.setBackground(new java.awt.Color(255, 0, 0));
        txtIspis.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(lblIspisIzracuna, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt2)
                            .addComponent(btnIme2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIme1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblime2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lblIme1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzracun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIspis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIme1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIme1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIme2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIzracun, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIspis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161)))
                .addComponent(lblIspisIzracuna, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
    
    
 
    private void btnIme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIme1ActionPerformed
     lblIme1.setText(txt1.getText());
    }//GEN-LAST:event_btnIme1ActionPerformed

    private void btnIme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIme2ActionPerformed
       lblime2.setText(txt2.getText());
    }//GEN-LAST:event_btnIme2ActionPerformed

    private void btnIzracunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzracunActionPerformed
  btnIme1.setText(btnIzracun.getText());
 String ime1=txt1.getText();
    String Ime2=txt2.getText();
    String ljubavniPostotak = txtIspis.getText();
		for (int i : ljubav(brojevi(ime1, Ime2))) {
			ljubavniPostotak += i;
                       txtIspis.setText(  ljubavniPostotak + "%");
		}
       }
private static int[] brojevi(String ime1, String ime2) {

		String skupa = ime1.toLowerCase() + ime2.toLowerCase();
		int brojac = 0;
		int[] brojevi = new int[skupa.length()];
		char[] imena = (skupa.toCharArray());

		for (int i = 0; i < skupa.length(); i++) {
			brojac = 0;
			for (int j = 0; j < skupa.length(); j++) {
				if (skupa.charAt(i) == skupa.charAt(j)) {

					brojac++;
				}
			}
			brojevi[i] = brojac;
		}
                brojevi = podijeliBroj(brojevi);

		if (ime1.length() >= ime2.length()) {
			int[] srednjiNiz = new int[ime1.length()];
			for (int i = 0; i < ime1.length(); i++) {
				if (i >= ime2.length()) {
					srednjiNiz[i] = brojevi[brojevi.length - (i + 1)];
				} else {
					srednjiNiz[i] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}

			return podijeliBroj(srednjiNiz);
		} else {
			int[] srednjiNiz = new int[ime2.length()];
			for (int i = 0; i < ime2.length(); i++) {
				if (i >= ime1.length()) {
					srednjiNiz[i] = brojevi[brojevi.length - (1 + i)];
				} else {
					srednjiNiz[i] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}
			return podijeliBroj(srednjiNiz);
                }
}

	public static int[] ljubav(int[] niz) {

		if (niz.length <= 2) {
			return niz;
		} else {
			if (niz.length % 2 == 0) {
				int[] dodatniNiz = new int[niz.length / 2];
				for (int i = 0; i < dodatniNiz.length; i++) {
					dodatniNiz[i] = niz[i] + niz[niz.length - (1 + i)];
				}
				dodatniNiz = podijeliBroj(dodatniNiz);

				if (dodatniNiz.length > 2) {
					return ljubav(dodatniNiz);
				} else {
					return ljubav(dodatniNiz);
				}
			} else {
				int[] dodatniNiz = new int[(niz.length / 2) + 1];
				for (int i = 0; i < dodatniNiz.length; i++) {
					if (i == dodatniNiz.length - 1) {
						dodatniNiz[i] = 0 + niz[niz.length - (1 + i)];
					} else {
						dodatniNiz[i] = niz[i] + niz[niz.length - (1 + i)];
					}
				}

				if (dodatniNiz.length > 2) {
					return ljubav(podijeliBroj(dodatniNiz));
				} else {
					return ljubav(podijeliBroj(dodatniNiz));
				}
			}
		}

	}

	public static int[] podijeliBroj(int[] niz) {
		int brojac = 0;
		for (int i : niz) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] dodatniNiz = new int[niz.length + brojac];

		for (int i = 0, j = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				dodatniNiz[j++] = niz[i];
			} else {
				dodatniNiz[j++] = (niz[i] / 10);
				dodatniNiz[j++] = (niz[i] % 10);
			}
                        
                       
		}

   
            
            

                
return dodatniNiz;



         


			
	

   
		
    }//GEN-LAST:event_btnIzracunActionPerformed

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
            java.util.logging.Logger.getLogger(LjubavniKalkulatorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LjubavniKalkulatorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LjubavniKalkulatorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LjubavniKalkulatorCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LjubavniKalkulatorCode().setVisible(true);
            }
        });
        
    }
// dodati sliku

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIme1;
    private javax.swing.JButton btnIme2;
    private javax.swing.JButton btnIzracun;
    private javax.swing.JLabel lblIme1;
    private javax.swing.JLabel lblIspisIzracuna;
    private javax.swing.JLabel lblime2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtIspis;
    // End of variables declaration//GEN-END:variables
}

