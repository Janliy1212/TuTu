/*
 * Copyright (c) 2013 Byron Sanchez (hackbytes.com)
 * www.chompix.com
 *
 * This file is part of "Coloring Book for Android."
 *
 * "Coloring Book for Android" is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, version 2 of the
 * license.
 *
 * "Coloring Book for Android" is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with "Coloring Book for Android."  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package net.globide.coloring_book;

/**
 * Defines the class that will store a row from the category table in the
 * database.
 */
/**
 * Defines the class that will store a row from the category table in the
 * database.
 */
public class Category {

    // The current row's category id.
    public int id;
    // The current category name.
    public String category;
    // The category description.
    public String description;
    // Whether or not the category is enabled.
    public int isAvailable;
    // The SKU id of the current coloring book
    public String sku;

    /**
     * Constructs the CategoryModel object.
     */
    public Category(int id, String category, String description, int isAvailable, String sku) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.isAvailable = isAvailable;
        this.sku = sku;
    }

    /**
     * Constructs the CategoryModel object.
     */
    public Category() {
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
    //挂失
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