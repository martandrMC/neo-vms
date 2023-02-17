package martandr.neovms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TestGUI {

	private JFrame frame;
	private JTextField txtA;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtA_1;
	private JTextField txtJmpRA;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 945, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel registers = new JPanel();
		registers.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		registers.setBounds(10, 10, 170, 285);
		frame.getContentPane().add(registers);
		registers.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALU Registers");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 170, 40);
		registers.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setText("45");
		txtA.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtA.setBounds(10, 40, 30, 25);
		registers.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("r0");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(50, 40, 30, 25);
		registers.add(lblNewLabel_1);
		
		JLabel lblR = new JLabel("r1");
		lblR.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR.setBounds(50, 70, 30, 25);
		registers.add(lblR);
		
		textField = new JTextField();
		textField.setText("45");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(10, 70, 30, 25);
		registers.add(textField);
		
		JLabel lblR_1 = new JLabel("r2");
		lblR_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_1.setBounds(50, 100, 30, 25);
		registers.add(lblR_1);
		
		textField_1 = new JTextField();
		textField_1.setText("45");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 100, 30, 25);
		registers.add(textField_1);
		
		JLabel lblR_2 = new JLabel("r3");
		lblR_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_2.setBounds(50, 130, 30, 25);
		registers.add(lblR_2);
		
		textField_2 = new JTextField();
		textField_2.setText("45");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 130, 30, 25);
		registers.add(textField_2);
		
		JLabel lblR_3 = new JLabel("r4");
		lblR_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_3.setBounds(50, 160, 30, 25);
		registers.add(lblR_3);
		
		textField_3 = new JTextField();
		textField_3.setText("45");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(10, 160, 30, 25);
		registers.add(textField_3);
		
		JLabel lblR_4 = new JLabel("r5");
		lblR_4.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_4.setBounds(50, 190, 30, 25);
		registers.add(lblR_4);
		
		textField_4 = new JTextField();
		textField_4.setText("45");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 190, 30, 25);
		registers.add(textField_4);
		
		JLabel lblR_5 = new JLabel("r6");
		lblR_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_5.setBounds(50, 220, 30, 25);
		registers.add(lblR_5);
		
		textField_5 = new JTextField();
		textField_5.setText("45");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(10, 220, 30, 25);
		registers.add(textField_5);
		
		JLabel lblR_6 = new JLabel("r7");
		lblR_6.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_6.setBounds(50, 250, 30, 25);
		registers.add(lblR_6);
		
		textField_6 = new JTextField();
		textField_6.setText("45");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(10, 250, 30, 25);
		registers.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("45");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(90, 40, 30, 25);
		registers.add(textField_7);
		
		JLabel lblR_7 = new JLabel("r8");
		lblR_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_7.setBounds(130, 40, 30, 25);
		registers.add(lblR_7);
		
		textField_8 = new JTextField();
		textField_8.setText("45");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(90, 70, 30, 25);
		registers.add(textField_8);
		
		JLabel lblR_8 = new JLabel("r9");
		lblR_8.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_8.setBounds(130, 70, 30, 25);
		registers.add(lblR_8);
		
		textField_9 = new JTextField();
		textField_9.setText("45");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(90, 100, 30, 25);
		registers.add(textField_9);
		
		JLabel lblR_9 = new JLabel("r10");
		lblR_9.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_9.setBounds(130, 100, 30, 25);
		registers.add(lblR_9);
		
		textField_10 = new JTextField();
		textField_10.setText("45");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(90, 130, 30, 25);
		registers.add(textField_10);
		
		JLabel lblR_10 = new JLabel("r11");
		lblR_10.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_10.setBounds(130, 130, 30, 25);
		registers.add(lblR_10);
		
		textField_11 = new JTextField();
		textField_11.setText("45");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(90, 160, 30, 25);
		registers.add(textField_11);
		
		JLabel lblR_11 = new JLabel("r12");
		lblR_11.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_11.setBounds(130, 160, 30, 25);
		registers.add(lblR_11);
		
		textField_12 = new JTextField();
		textField_12.setText("45");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(90, 190, 30, 25);
		registers.add(textField_12);
		
		JLabel lblR_12 = new JLabel("r13");
		lblR_12.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_12.setBounds(130, 190, 30, 25);
		registers.add(lblR_12);
		
		textField_13 = new JTextField();
		textField_13.setText("45");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(90, 220, 30, 25);
		registers.add(textField_13);
		
		JLabel lblR_13 = new JLabel("r14");
		lblR_13.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_13.setBounds(130, 220, 30, 25);
		registers.add(lblR_13);
		
		textField_14 = new JTextField();
		textField_14.setText("45");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(90, 250, 30, 25);
		registers.add(textField_14);
		
		JLabel lblR_14 = new JLabel("r15");
		lblR_14.setFont(new Font("Dialog", Font.BOLD, 12));
		lblR_14.setBounds(130, 250, 30, 25);
		registers.add(lblR_14);
		
		JPanel control = new JPanel();
		control.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		control.setBounds(10, 305, 200, 160);
		frame.getContentPane().add(control);
		control.setLayout(null);
		
		JLabel lblSpecials = new JLabel("Control Unit");
		lblSpecials.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecials.setFont(new Font("Arial", Font.BOLD, 20));
		lblSpecials.setBounds(0, 0, 200, 40);
		control.add(lblSpecials);
		
		textField_15 = new JTextField();
		textField_15.setText("45");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBounds(10, 40, 30, 25);
		control.add(textField_15);
		
		JLabel lblProgramCounter = new JLabel("Program Counter");
		lblProgramCounter.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProgramCounter.setBounds(50, 40, 120, 25);
		control.add(lblProgramCounter);
		
		txtA_1 = new JTextField();
		txtA_1.setText("A455");
		txtA_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtA_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtA_1.setColumns(10);
		txtA_1.setBounds(10, 70, 50, 25);
		control.add(txtA_1);
		
		JLabel lblInstructionRegister = new JLabel("Instruction Register");
		lblInstructionRegister.setFont(new Font("Dialog", Font.BOLD, 12));
		lblInstructionRegister.setBounds(70, 70, 120, 25);
		control.add(lblInstructionRegister);
		
		txtJmpRA = new JTextField();
		txtJmpRA.setText("ADD r10 r10 r10");
		txtJmpRA.setHorizontalAlignment(SwingConstants.CENTER);
		txtJmpRA.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtJmpRA.setColumns(10);
		txtJmpRA.setBounds(10, 125, 180, 25);
		control.add(txtJmpRA);
		
		JLabel lblDecodedInstruction = new JLabel("Decoded Instruction");
		lblDecodedInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecodedInstruction.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDecodedInstruction.setBounds(10, 100, 180, 25);
		control.add(lblDecodedInstruction);
		
		JPanel memory = new JPanel();
		memory.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		memory.setBounds(190, 10, 270, 285);
		frame.getContentPane().add(memory);
		memory.setLayout(null);
		
		JLabel lblMemory = new JLabel("Memory Contents");
		lblMemory.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemory.setFont(new Font("Arial", Font.BOLD, 20));
		lblMemory.setBounds(0, 0, 270, 40);
		memory.add(lblMemory);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 250, 235);
		memory.add(scrollPane);
		
		
		String[][] elems = new String[32][8];
		table = new JTable(new TableModel() {
			@Override
			public void setValueAt(Object val, int row, int col) {
				if(!(val instanceof String)) return;
				elems[row][col-1] = (String) val;
			}
			
			@Override
			public void removeTableModelListener(TableModelListener l) {}
			
			@Override
			public boolean isCellEditable(int row, int col) {
				return col != 0;
			}
			
			@Override
			public Object getValueAt(int row, int col) {
				return col == 0 ? new String[] {
					"00x", "08x", "10x", "18x", "20x", "28x", "30x", "38x",
					"40x", "48x", "50x", "58x", "60x", "68x", "70x", "78x",
					"80x", "88x", "90x", "98x", "A0x", "A8x", "B0x", "B8x", 
					"C0x", "C8x", "D0x", "D8x", "E0x", "E8x", "F0x", "F8x"
				}[row] : elems[row][col-1];
			}
			
			@Override
			public int getRowCount() {
				return 32;
			}
			
			@Override
			public String getColumnName(int col) {
				return new String[] {"", "x0", "x1", "x2", "x3", "x4", "x5", "x6", "x7"}[col];
			}
			
			@Override
			public int getColumnCount() {
				return 9;
			}
			
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return String.class;
			}
			
			@Override
			public void addTableModelListener(TableModelListener l) {}
		});
		scrollPane.setViewportView(table);
		
		JPanel clock = new JPanel();
		clock.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		clock.setBounds(220, 305, 240, 160);
		frame.getContentPane().add(clock);
		clock.setLayout(null);
		
		JLabel lblClockControl = new JLabel("Clock Control");
		lblClockControl.setHorizontalAlignment(SwingConstants.CENTER);
		lblClockControl.setFont(new Font("Arial", Font.BOLD, 20));
		lblClockControl.setBounds(0, 0, 240, 40);
		clock.add(lblClockControl);
	}
}
