package petshop;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            ProductView view = new ProductView();
            ProductController controller = new ProductController(view);
            view.setVisible(true);
        }
    });
}
}
