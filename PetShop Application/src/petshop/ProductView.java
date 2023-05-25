package petshop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductView extends JFrame {
    private JTable productTable;
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    
    public ProductView() {
        setTitle("PetShop Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600, 400));
        getContentPane().setBackground(new Color(240, 240, 240)); // Set background color
        
        // Panel input produk
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setBackground(new Color(220, 220, 220)); // Set panel background color
        
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(5);
        idLabel.setLabelFor(idField);
        inputPanel.add(idLabel);
        inputPanel.add(idField);

        JLabel nameLabel = new JLabel("Name Produk:");
        nameField = new JTextField(20);
        nameLabel.setLabelFor(nameField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        
        JLabel priceLabel = new JLabel("Harga:");
        priceField = new JTextField(10);
        priceLabel.setLabelFor(priceField);
        inputPanel.add(priceLabel);
        inputPanel.add(priceField);
        
        JLabel quantityLabel = new JLabel("Stok:");
        quantityField = new JTextField(5);
        quantityLabel.setLabelFor(quantityField);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityField);

        add(inputPanel, BorderLayout.NORTH);

        // Tabel produk
        productTable = new JTable();
        productTable.setBackground(Color.blue); // Set table background color
        JScrollPane scrollPane = new JScrollPane(productTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // Panel tombol CRUD
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(220, 220, 220)); // Set panel background color
        
        addButton = new JButton("Add");
        addButton.setBackground(new Color(0, 153, 51)); // Set button background color
        addButton.setForeground(Color.white); // Set button text color
        addButton.setFont(new Font("Arial", Font.BOLD, 12)); // Set button font
        buttonPanel.add(addButton);
        
        updateButton = new JButton("Update");
        updateButton.setBackground(new Color(51, 102, 255)); // Set button background color
        updateButton.setForeground(Color.white); // Set button text color
        updateButton.setFont(new Font("Arial", Font.BOLD, 12)); // Set button font
        buttonPanel.add(updateButton);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBackground(new Color(204, 0, 0)); // Set button background color
        deleteButton.setForeground(Color.white); // Set button text color
        deleteButton.setFont(new Font("Arial", Font.BOLD, 12)); // Set button font
        buttonPanel.add(deleteButton);
        
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }
    
    public int getProductId() {
    String idText = idField.getText();
    if (idText.isEmpty()) {
        throw new IllegalArgumentException("ID ftabel kosong");
    } else {
        return Integer.parseInt(idText);
    }
}

    
    public String getProductName() {
        return nameField.getText();
    }
    
    public double getProductPrice() {
        String priceText = priceField.getText();
        return Double.parseDouble(priceText);
    }
    
    public int getProductQuantity() {
        String quantityText = quantityField.getText();
        return Integer.parseInt(quantityText);
    }
    
    public void setProductList(List<Product> products) {
        ProductTableModel model = new ProductTableModel(products);
        productTable.setModel(model);
    }
    
    public void addProductButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    
    public void addUpdateButtonListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
    
    public void addDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
    
    public void displayErrorMessage(String errorMessage) {
    JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
}

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
