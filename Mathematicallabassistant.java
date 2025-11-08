import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class Maths extends JFrame {

    private JRadioButton addBtn, subBtn, mulBtn, divBtn, fibBtn;
    private JTextField num1Field, num2Field, nField;
    private JButton calcBtn, drawBtn, clearBtn;
    private JLabel resultLabel, nLabel, selectLbl, num1Lbl, num2Lbl;
    private AnimatedMathPanel mainPanel;

    public Maths() {
        setTitle("Mathematical Lab Assistant");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new AnimatedMathPanel();
        mainPanel.setLayout(null);
        add(mainPanel);

        Font titleFont = new Font("Times New Roman", Font.BOLD, 36);
        Font labelFont = new Font("Times New Roman", Font.PLAIN, 24);
        Font buttonFont = new Font("Times New Roman", Font.BOLD, 22);

        JLabel title = new JLabel("Mathematical Lab Assistant", SwingConstants.CENTER);
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);
        title.setBounds(0, 0, screenSize.width, 80);
        mainPanel.add(title);

        int panelWidth = 900;  
        int panelHeight = 430;
        int cx = screenSize.width/2 - panelWidth/2;
        int cy = screenSize.height/2 - panelHeight/2;

        selectLbl = new JLabel("Choose an Operation:");
        selectLbl.setFont(labelFont);
        selectLbl.setBounds(cx, cy, 300, 35);
        mainPanel.add(selectLbl);

        addBtn = createRadioButton("Addition", cx + 30, cy + 50, labelFont);
        subBtn = createRadioButton("Subtraction", cx + 30, cy + 90, labelFont);
        mulBtn = createRadioButton("Multiplication", cx + 30, cy + 130, labelFont);
        divBtn = createRadioButton("Division", cx + 30, cy + 170, labelFont);
        fibBtn = createRadioButton("Fibonacci Curve", cx + 30, cy + 210, labelFont);

        nLabel = new JLabel("Enter number of terms (N):");
        nLabel.setFont(labelFont);
        nLabel.setBounds(cx + 30, cy + 250, 350, 35);
        nLabel.setVisible(false);
        mainPanel.add(nLabel);

        nField = new JTextField("7");
        nField.setFont(labelFont);
        nField.setBounds(cx + 30, cy + 290, 160, 35);
        nField.setVisible(false);
        mainPanel.add(nField);

        ButtonGroup group = new ButtonGroup();
        JRadioButton[] buttons = {addBtn, subBtn, mulBtn, divBtn, fibBtn};
        for (JRadioButton btn : buttons) {
            group.add(btn);
            mainPanel.add(btn);
        }

        num1Lbl = new JLabel("Enter First Number:");
        num1Lbl.setFont(labelFont);
        num1Lbl.setBounds(cx + 420, cy + 50, 260, 35);
        mainPanel.add(num1Lbl);

        num1Field = new JTextField();
        num1Field.setFont(labelFont);
        num1Field.setBounds(cx + 690, cy + 50, 150, 35);
        mainPanel.add(num1Field);

        num2Lbl = new JLabel("Enter Second Number:");
        num2Lbl.setFont(labelFont);
        num2Lbl.setBounds(cx + 420, cy + 100, 260, 35);
        mainPanel.add(num2Lbl);

        num2Field = new JTextField();
        num2Field.setFont(labelFont);
        num2Field.setBounds(cx + 690, cy + 100, 150, 35);
        mainPanel.add(num2Field);

        calcBtn = createButton("Calculate", cx + 130, cy + 360, new Color(255, 105, 180), buttonFont);
        drawBtn = createButton("Draw Curve", cx + 350, cy + 360, new Color(255, 182, 193), buttonFont);
        clearBtn = createButton("Clear", cx + 570, cy + 360, new Color(230, 80, 80), buttonFont);

        mainPanel.add(calcBtn);
        mainPanel.add(drawBtn);
        mainPanel.add(clearBtn);

        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
        resultLabel.setBounds(cx + 80, cy + 330, 700, 35);
        resultLabel.setForeground(Color.DARK_GRAY);
        mainPanel.add(resultLabel);

        calcBtn.addActionListener(e -> performCalculation());
        drawBtn.addActionListener(e -> {
            if (fibBtn.isSelected()) {
                drawFibonacciCurve();
            } else {
                drawCurve();
            }
        });
        clearBtn.addActionListener(e -> {
            num1Field.setText("");
            num2Field.setText("");
            nField.setText("7");
            resultLabel.setText("");
            group.clearSelection();
            nLabel.setVisible(false);
            nField.setVisible(false);
        });

        fibBtn.addActionListener(e -> setNVisible(true));
        addBtn.addActionListener(e -> setNVisible(false));
        subBtn.addActionListener(e -> setNVisible(false));
        mulBtn.addActionListener(e -> setNVisible(false));
        divBtn.addActionListener(e -> setNVisible(false));
    }

    private void setNVisible(boolean show) {
        nLabel.setVisible(show);
        nField.setVisible(show);
    }

    private JRadioButton createRadioButton(String text, int x, int y, Font font) {
        JRadioButton btn = new JRadioButton(text);
        btn.setFont(font);
        btn.setBounds(x, y, 320, 35);
        btn.setOpaque(false);
        return btn;
    }

    private JButton createButton(String text, int x, int y, Color bg, Font font) {
        JButton btn = new JButton(text);
        btn.setFont(font);
        btn.setBounds(x, y, 180, 50);
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(7, 14, 7, 14));
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { btn.setBackground(bg.darker()); }
            public void mouseExited(MouseEvent evt) { btn.setBackground(bg); }
        });
        return btn;
    }

    private void performCalculation() {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result;
            if (addBtn.isSelected()) result = a + b;
            else if (subBtn.isSelected()) result = a - b;
            else if (mulBtn.isSelected()) result = a * b;
            else if (divBtn.isSelected()) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return;
                }
                result = a / b;
            } else {
                JOptionPane.showMessageDialog(this, "Please select an operation!");
                return;
            }
            resultLabel.setText("Result: " + String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }

    private void drawCurve() {
        JFrame frame = new JFrame("Mathematical Curve");
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.add(new CurvePanel());
        frame.setVisible(true);
    }

    private void drawFibonacciCurve() {
        try {
            int n = Integer.parseInt(nField.getText());
            JFrame frame = new JFrame("Fibonacci Curve");
            frame.setSize(1200, 900);
            frame.setLocationRelativeTo(null);
            frame.add(new FibonacciPanel(n));
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid integer to control the curve!");
        }
    }

    static class CurvePanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.WHITE);
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Serif", Font.BOLD, 42));
            g2.drawString("General curve panel", 180, 180);
        }
    }

    
    static class FibonacciPanel extends JPanel {
        int n;
        FibonacciPanel(int n) { this.n = Math.max(3, n); setBackground(Color.WHITE); }
        // Calculate Fibonacci sequence
        private int[] fibonacci(int count) {
            int[] fibs = new int[count];
            fibs[0] = fibs[1] = 1;
            for (int i = 2; i < count; i++)
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            return fibs;
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth(), height = getHeight();
            int padL = 90, padR = 60, padT = 100, padB = 110;
            int plotW = width - padL - padR;
            int plotH = height - padT - padB;

           
            g2.setColor(Color.WHITE);
            g2.fillRect(padL, padT, plotW, plotH);
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(2));
            g2.drawRect(padL, padT, plotW, plotH);

            g2.setColor(new Color(200, 200, 200));
            g2.setStroke(new BasicStroke(1));
            int nxTicks = 8, nyTicks = 8;
            for (int i = 1; i < nxTicks; i++) {
                int x = padL + i * plotW / nxTicks;
                g2.drawLine(x, padT, x, padT + plotH);
            }
            for (int i = 1; i < nyTicks; i++) {
                int y = padT + i * plotH / nyTicks;
                g2.drawLine(padL, y, padL + plotW, y);
            }

            g2.setFont(new Font("SansSerif", Font.BOLD, 32));
            g2.setColor(Color.BLACK);
            String xLabel = "X-axis (one unit)";
            String yLabel = "Y-axis (one unit)";
            FontMetrics fm = g2.getFontMetrics();
            g2.drawString(xLabel, padL + plotW / 2 - fm.stringWidth(xLabel) / 2, height - padB / 2);

            AffineTransform orig = g2.getTransform();
            g2.rotate(-Math.PI / 2);
            g2.drawString(yLabel, -padT - plotH / 2 - fm.stringWidth(yLabel) / 2, 50);
            g2.setTransform(orig);

            g2.setFont(new Font("SansSerif", Font.BOLD, 38));
            String title = "Fibonacci Curve";
            int tw = g2.getFontMetrics().stringWidth(title);
            g2.drawString(title, padL + plotW / 2 - tw / 2, padT - 28);

            
            int[] fibs = fibonacci(n);
            double startX = padL + plotW / 2.0;
            double startY = padT + plotH / 2.0;

            double maxR = fibs[n - 1] + fibs[n - 2];
            double scale = Math.min(plotW, plotH) / (2.1 * maxR);

            double tStep = Math.PI / 180;
            g2.setColor(new Color(20, 30, 150));
            g2.setStroke(new BasicStroke(4));
            Path2D.Double spiral = new Path2D.Double();

           
            for (int k = 0; k < n - 1; k++) {
                double rStart = fibs[k] * scale;
                double rEnd = fibs[k + 1] * scale;
                double thetaStart = k * Math.PI / 2;
                double thetaEnd = (k + 1) * Math.PI / 2;
                int steps = Math.max(20, (int) ((thetaEnd - thetaStart) / tStep));
                for (int i = 0; i <= steps; i++) {
                    double thetaCur = thetaStart + (thetaEnd - thetaStart) * i / steps;
                    // Interpolate radius between rStart and rEnd to make continuous
                    double r = rStart + ((rEnd - rStart) * (i / (double) steps));
                    double x = startX + r * Math.cos(thetaCur);
                    double y = startY + r * Math.sin(thetaCur);
                    if (k == 0 && i == 0) spiral.moveTo(x, y);
                    else spiral.lineTo(x, y);
                }
            }
            g2.draw(spiral);
        }
    }

    static class AnimatedMathPanel extends JPanel {
        private final String[] symbols = {"+", "-", "×", "÷", "π", "√", "∑", "∞"};
        private final Point[] points = new Point[30];
        private final double[] dx = new double[30];
        private final double[] dy = new double[30];
        private final Random rand = new Random();
        public AnimatedMathPanel() {
            for (int i = 0; i < points.length; i++) {
                points[i] = new Point(rand.nextInt(1800), rand.nextInt(1000));
                dx[i] = rand.nextDouble() * 1.0 - 0.5;
                dy[i] = rand.nextDouble() * 1.0 - 0.5;
            }
            new Timer(50, e -> {
                for (int i = 0; i < points.length; i++) {
                    points[i].x += dx[i];
                    points[i].y += dy[i];
                    if (points[i].x < 0 || points[i].x > getWidth()) dx[i] = -dx[i];
                    if (points[i].y < 80 || points[i].y > getHeight()) dy[i] = -dy[i];
                }
                repaint();
            }).start();
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Color c1 = new Color(255, 228, 235);
            Color c2 = new Color(255, 182, 193);
            GradientPaint gp = new GradientPaint(0, 60, c1, getWidth(), getHeight(), c2);
            g2.setPaint(gp);
            g2.fillRect(0, 80, getWidth(), getHeight());
            g2.setFont(new Font("Times New Roman", Font.BOLD, 44));
            g2.setColor(Color.WHITE);
            for (int i = 0; i < points.length; i++) {
                g2.drawString(symbols[i % symbols.length],
                              points[i].x % getWidth(),
                              points[i].y % getHeight());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Maths().setVisible(true));
    }
}
