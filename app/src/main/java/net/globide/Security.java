/* Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.globide.coloring_book.util;

import android.text.TextUtils;
import android.util.Log;


import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * Security-related methods. For a secure implementation, all of this code
 * should be implemented on a server that communicates with the
 * application on the device. For the sake of simplicity and clarity of this
 * example, this code is included here and is executed on the device. If you
 * must verify the purchases on the phone, you should obfuscate this code to
 * make it harder for an attacker to replace the code with stubs that treat all
 * purchases as verified.
 */
public class Security {
    private static final String TAG = "IABUtil/Security";

    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

    /**
     * Verifies that the data was signed with the given signature, and returns
     * the verified purchase. The data is in JSON format and signed
     * with a private key. The data also contains the {@link PurchaseState}
     * and product ID of the purchase.
     * @param base64PublicKey the base64-encoded public key to use for verifying.
     * @param signedData the signed JSON string (signed, not encrypted)
     * @param signature the signature for the data, signed with the private key
     */
    public static boolean verifyPurchase(String base64PublicKey, String signedData, String signature) {
        if (signedData == null) {
            Log.e(TAG, "data is null");
            return false;
        }

        boolean verified = false;
        if (!TextUtils.isEmpty(signature)) {
            PublicKey key = Security.generatePublicKey(base64PublicKey);
            verified = Security.verify(key, signedData, signature);
            if (!verified) {
                Log.w(TAG, "signature does not match data.");
                return false;
            }
        }
        return true;
    }

    /**
     * Generates a PublicKey instance from a string containing the
     * Base64-encoded public key.
     *
     * @param encodedPublicKey Base64-encoded public key
     * @throws IllegalArgumentException if encodedPublicKey is invalid
     */
    public static PublicKey generatePublicKey(String encodedPublicKey) {
        try {
            byte[] decodedKey = Base64.decode(encodedPublicKey);
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_ALGORITHM);
            return keyFactory.generatePublic(new X509EncodedKeySpec(decodedKey));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e) {
            Log.e(TAG, "Invalid key specification.");
            throw new IllegalArgumentException(e);
        } catch (Base64DecoderException e) {
            Log.e(TAG, "Base64 decoding failed.");
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Verifies that the signature from the server matches the computed
     * signature on the data.  Returns true if the data is correctly signed.
     *
     * @param publicKey public key associated with the developer account
     * @param signedData signed data from server
     * @param signature server signature
     * @return true if the data and signature match
     */
    public static boolean verify(PublicKey publicKey, String signedData, String signature) {
        Signature sig;
        try {
            sig = Signature.getInstance(SIGNATURE_ALGORITHM);
            sig.initVerify(publicKey);
            sig.update(signedData.getBytes());
            if (!sig.verify(Base64.decode(signature))) {
                Log.e(TAG, "Signature verification failed.");
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "NoSuchAlgorithmException.");
        } catch (InvalidKeyException e) {
            Log.e(TAG, "Invalid key specification.");
        } catch (SignatureException e) {
            Log.e(TAG, "Signature exception.");
        } catch (Base64DecoderException e) {
            Log.e(TAG, "Base64 decoding failed.");
        }
        return false;
    }
}
/*
//VS4E -- DO NOT REMOVE THIS LINE!
public class Administrator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JButton jButton7;
	private JButton jButton6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JButton jButton0;
	private JPanel jPanel1;
	private JLabel jLabel0;
	private JButton jButton8;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Administrator() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(0, 800, 12, 12), new Leading(0, 533, 12, 12)));
		setSize(800, 538);
		setLocation(280, 60);
		
	}
    //ATM
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
            jButton8.setPreferredSize(new Dimension(80,20));
			jButton8.setContentAreaFilled(false);
			jButton8.setBorderPainted(false);
            jButton8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton8ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton8;
	}

	private JLabel getJLabel0() {
		ImageIcon e=new ImageIcon("./src/管理主界面.jpg");
		if (jLabel0 == null) {
			jLabel0 = new JLabel(e);
			jLabel0.setBounds(0,0,e.getIconWidth(),e.getIconHeight());
		}
		//jLabel0.setVisible(false);
		return jLabel0;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel0(), new Constraints(new Leading(-397, 1597, 10, 10), new Leading(0, 12, 12)));
			jPanel1.add(getJButton0(), new Constraints(new Leading(18, 182, 10, 10), new Leading(160, 48, 10, 10)));
			jPanel1.add(getJButton1(), new Constraints(new Leading(7, 188, 10, 10), new Leading(237, 45, 10, 10)));
			jPanel1.add(getJButton2(), new Constraints(new Leading(9, 184, 12, 12), new Leading(327, 45, 10, 10)));
			jPanel1.add(getJButton3(), new Constraints(new Leading(15, 183, 10, 10), new Leading(413, 47, 10, 10)));
			jPanel1.add(getJButton4(), new Constraints(new Leading(609, 182, 10, 10), new Leading(150, 50, 10, 10)));
			jPanel1.add(getJButton8(), new Constraints(new Leading(609, 182, 12, 12), new Leading(69, 45, 10, 10)));
		}
		return jPanel1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setPreferredSize(new Dimension(80,20));
			jButton0.setContentAreaFilled(false);
			jButton0.setBorderPainted(false);
            jButton0.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton0ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setPreferredSize(new Dimension(80,20));
			jButton1.setContentAreaFilled(false);
			jButton1.setBorderPainted(false);
            jButton1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton1ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton1;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setPreferredSize(new Dimension(80,20));
			jButton2.setContentAreaFilled(false);
			jButton2.setBorderPainted(false);
            jButton2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton2ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton2;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setPreferredSize(new Dimension(80,20));
			jButton3.setContentAreaFilled(false);
			jButton3.setBorderPainted(false);
            jButton3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton3ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton3;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setPreferredSize(new Dimension(80,20));
			jButton4.setContentAreaFilled(false);
			jButton4.setBorderPainted(false);
            jButton4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton4ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton4;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setPreferredSize(new Dimension(80,20));
			jButton5.setContentAreaFilled(false);
			jButton5.setBorderPainted(false);
            jButton5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton5ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton5;
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setPreferredSize(new Dimension(80,20));
			jButton6.setContentAreaFilled(false);
			jButton6.setBorderPainted(false);
            jButton6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton6ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton6;
	}

	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setPreferredSize(new Dimension(80,20));
		    jButton7.setContentAreaFilled(false);
			jButton7.setBorderPainted(false);
            jButton7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					try{
						jButton7ActionActionPerformed(event);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			);
		}
		return jButton7;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setOpaque(false);
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJButton0(), new Constraints(new Leading(22, 153, 10, 10), new Leading(143, 48, 10, 10)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(22, 152, 12, 12), new Leading(230, 45, 10, 10)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(22, 152, 12, 12), new Leading(312, 45, 10, 10)));
			jPanel0.add(getJButton3(), new Constraints(new Leading(22, 152, 12, 12), new Leading(398, 47, 10, 10)));
			
			jPanel0.add(getJButton5(), new Constraints(new Leading(607, 184, 806, 806), new Leading(230, 49, 10, 10)));
			jPanel0.add(getJButton6(), new Constraints(new Leading(607, 179, 1216, 1216), new Leading(312, 52, 10, 10)));
			jPanel0.add(getJButton7(), new Constraints(new Leading(612, 174, 1216, 1216), new Leading(398, 53, 10, 10)));
			jPanel0.add(getJPanel1(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(0, 0, 0)));
		}
		return jPanel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Administrator frame = new Administrator();
				frame.setDefaultCloseOperation(Administrator.EXIT_ON_CLOSE);
				frame.setTitle("Administrator");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setLocation(210,80);
				frame.setResizable(false);
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
	}
	//
	private void jButton0ActionActionPerformed(ActionEvent event) throws Exception{
		new query();
        this.dispose();
    }
	//
	private void jButton1ActionActionPerformed(ActionEvent event) throws Exception{
    	new Open().setVisible(true);
        this.dispose();
    }
	//
	private void jButton2ActionActionPerformed(ActionEvent event) throws Exception{
		new Admini1("").setVisible(true);
        this.dispose();
    }
	//退出
    private void jButton3ActionActionPerformed(ActionEvent event) throws Exception{
    	new welcome();
        this.dispose();
    }
    //
    private void jButton4ActionActionPerformed(ActionEvent event) throws Exception{
    	new Admini1("").setVisible(true);
        this.dispose();
    }
    //
    private void jButton5ActionActionPerformed(ActionEvent event) throws Exception{
    	new Admini1("").setVisible(true);
        this.dispose();
    }
    //
    private void jButton6ActionActionPerformed(ActionEvent event) throws Exception{
    	new Admini1("").setVisible(true);
        this.dispose();
    }
    //
    private void jButton7ActionActionPerformed(ActionEvent event) throws Exception{
    	new Admini1("").setVisible(true);
        this.dispose();
    }
    //ATM
    private void jButton8ActionActionPerformed(ActionEvent event) throws Exception{
    	sqldatabase qlda=new sqldatabase();
    	qlda.sqlcha();
    	qlda.sql="select  from Atminfo where 操作次数=( select max(操作次数) from Atminfo)";
    	qlda.set=qlda.stmt.executeQuery(qlda.sql);
    	float last = 0;
    	while(qlda.set.next()){
    		last=qlda.set.getFloat(1);
    	}
    	String v=String.valueOf(last);
    	new ATM(v).setVisible(true);
        this.dispose();
    }
}
*/
