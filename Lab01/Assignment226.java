import javax.swing.JOptionPane;

public class Assignment226 {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));

        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm");
            else
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm x = " + x);
        }

        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a1:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Nhập b1:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Nhập c1:"));

        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a2:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập b2:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập c2:"));

        double D  = a1 * b2 - a2 * b1;
        double D1 = c1 * b2 - c2 * b1;
        double D2 = a1 * c2 - a2 * c1;

        if (D != 0) {
            double x = D1 / D;
            double y = D2 / D;
            JOptionPane.showMessageDialog(null, "Hệ có nghiệm:\nx = " + x + "\ny = " + y);
        } else {
            if (D1 == 0 && D2 == 0)
                JOptionPane.showMessageDialog(null, "Hệ có vô số nghiệm");
            else
                JOptionPane.showMessageDialog(null, "Hệ vô nghiệm");
        }

        double a_q = Double.parseDouble(JOptionPane.showInputDialog("Nhập a (bậc 2):"));
        double b_q = Double.parseDouble(JOptionPane.showInputDialog("Nhập b (bậc 2):"));
        double c_q = Double.parseDouble(JOptionPane.showInputDialog("Nhập c:"));

        if (a_q == 0) {
            if (b_q == 0) {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
            } else {
                double x = -c_q / b_q;
                JOptionPane.showMessageDialog(null, "Phương trình bậc 1 có nghiệm x = " + x);
            }
        } else {
            double delta = b_q * b_q - 4 * a_q * c_q;

            if (delta > 0) {
                double x1 = (-b_q + Math.sqrt(delta)) / (2 * a_q);
                double x2 = (-b_q - Math.sqrt(delta)) / (2 * a_q);
                JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm:\nx1 = " + x1 + "\nx2 = " + x2);
            } else if (delta == 0) {
                double x = -b_q / (2 * a_q);
                JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm (không có nghiệm thực)");
            }
        }

        System.exit(0);
    }
}