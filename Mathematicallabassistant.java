import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Random;

// Main class extending JFrame – the program’s window
public class Maths extends JFrame {

    // Declare all UI components
    private JRadioButton addBtn, subBtn, mulBtn, divBtn, fibBtn;
    private JTextField num1Field, num2Field, nField;
    private JButton calcBtn, drawBtn, clearBtn;
    private JLabel resultLabel, nLabel, selectLbl, num1Lbl, num2Lbl;
    private AnimatedMathPanel mainPanel; // Custom animated panel background

    // ---------------- CONSTRUCTOR ----------------
    public Maths() {
        // Set up frame
        setTitle("Mathematical Lab Assistant");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add custom animated background panel
        mainPanel = new AnimatedMathPanel();
        mainPanel.setLayout(null);
        add(mainPanel);

        // Fonts used for title, labels, and buttons
        Font titleFont = new Font("Times New Roman", Font.BOLD, 36);
        Font labelFont = new Font("Times New Roman", Font.PLAIN, 24);
        Font buttonFont = new Font("Times New Roman", Font.BOLD, 22);

        // Create and style the main title label
        JLabel title = new JLabel("Mathematical Lab Assistant", SwingConstants.CENTER);
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);
        title.setBounds(0, 0, screenSize.width, 80);
        mainPanel.add(title);

        // Central alignment and layout
        int panelWidth = 900;
        int panelHeight = 430;
        int cx = screenSize.width/2 - panelWidth/2;
        int cy = screenSize.height/2 - panelHeight/2;

        // Label for operation selection
        selectLbl = new JLabel("Choose an Operation:");
        selectLbl.setFont(labelFont);
        selectLbl.setBounds(cx, cy, 300, 35);
        mainPanel.add(selectLbl);

        // Create operation radio buttons
        addBtn = createRadioButton("Addition", cx + 30, cy + 50, labelFont);
        subBtn = createRadioButton("Subtraction", cx + 30, cy + 90, labelFont);
        mulBtn = createRadioButton("Multiplication", cx + 30, cy + 130, labelFont);
        divBtn = createRadioButton("Division", cx + 30, cy + 170, labelFont);
        fibBtn = createRadioButton("Fibonacci Curve", cx + 30, cy + 210, labelFont);

        // N field (used only for Fibonacci curve)
        nLabel = new JLabel("Enter number of terms (N):");
        nLabel.setFont(labelFont);
        nLabel.setBounds(cx + 30, cy + 250, 350, 35);
        nLabel.setVisible(false); // hidden initially
        mainPanel.add(nLabel);

        nField = new JTextField("10");
        nField.setFont(labelFont);
        nField.setBounds(cx + 30, cy + 290, 160, 35);
        nField.setVisible(false); // hidden initially
        mainPanel.add(nField);

        // Group radio buttons (so only one can be selected)
        ButtonGroup group = new ButtonGroup();
        JRadioButton[] buttons = {addBtn, subBtn, mulBtn, divBtn, fibBtn};
        for (JRadioButton btn : buttons) {
            group.add(btn);
            mainPanel.add(btn);
        }

        // Labels and text fields for arithmetic input
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

        // Buttons: Calculate, Draw Curve, Clear
        calcBtn = createButton("Calculate", cx + 130, cy + 360, new Color(255, 105, 180), buttonFont);
        drawBtn = createButton("Draw Curve", cx + 350, cy + 360, new Color(255, 182, 193), buttonFont);
        clearBtn = createButton("Clear", cx + 570, cy + 360, new Color(230, 80, 80), buttonFont);

        mainPanel.add(calcBtn);
        mainPanel.add(drawBtn);
        mainPanel.add(clearBtn);

        // Label to display calculation results
        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
        resultLabel.setBounds(cx + 80, cy + 330, 700, 35);
        resultLabel.setForeground(Color.DARK_GRAY);
        mainPanel.add(resultLabel);

        // Button Actions (event listeners)
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
            nField.setText("10");
            resultLabel.setText("");
            group.clearSelection();
            nLabel.setVisible(false);
            nField.setVisible(false);
        });

        // Visibility toggle for N field
        fibBtn.addActionListener(e -> setNVisible(true));
        addBtn.addActionListener(e -> setNVisible(false));
        subBtn.addActionListener(e -> setNVisible(false));
        mulBtn.addActionListener(e -> setNVisible(false));
        divBtn.addActionListener(e -> setNVisible(false));
    }

    // -------- Helper to show/hide N input field --------
    private void setNVisible(boolean show) {
        nLabel.setVisible(show);
        nField.setVisible(show);
    }

    // -------- Helper to create styled radio buttons --------
    private JRadioButton createRadioButton(String text, int x, int y, Font font) {
        JRadioButton btn = new JRadioButton(text);
        btn.setFont(font);
        btn.setBounds(x, y, 320, 35);
        btn.setOpaque(false);
        return btn;
    }

    // -------- Helper to create styled buttons with hover effect --------
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

    // -------- Performs arithmetic operations --------
    private void performCalculation() {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result;

            // Detect which operation is selected
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

            // Display formatted result
            resultLabel.setText("Result: " + String.format("%.2f", result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }

    // -------- Opens a new frame to draw a general curve --------
    private void drawCurve() {
        JFrame frame = new JFrame("Mathematical Curve");
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.add(new CurvePanel());  // placeholder panel
        frame.setVisible(true);
    }

    // -------- Opens a new frame to draw Fibonacci curve --------
    private void drawFibonacciCurve() {
        try {
            int n = Integer.parseInt(nField.getText());
            JFrame frame = new JFrame("Fibonacci Curve");
            frame.setSize(1200, 900);
            frame.setLocationRelativeTo(null);
            frame.add(new FibonacciPanel(n));  // panel for Fibonacci spiral
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid integer to control the curve!");
        }
    }

    // ---------------- Panel for generic curve (placeholder) ----------------
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

    // ---------------- Fibonacci Panel (REPLACED) ----------------
    // Uses standard orientation: RIGHT -> UP -> LEFT -> DOWN (repeats)
    // All drawing in black; axes and legend positioned as in your examples.
    static class FibonacciPanel extends JPanel {
        int n;

        FibonacciPanel(int n) {
            this.n = Math.max(3, n);
            setBackground(Color.WHITE);
        }

        // generate fibonacci starting 0,1,1,2,3,...
        private int[] fibonacci(int count) {
            int[] fibs = new int[count];
            if (count > 0) fibs[0] = 0;
            if (count > 1) fibs[1] = 1;
            for (int i = 2; i < count; i++) fibs[i] = fibs[i - 1] + fibs[i - 2];
            return fibs;
        }

        @Override
        protected void paintComponent(Graphics g0) {
            super.paintComponent(g0);
            Graphics2D g2 = (Graphics2D) g0;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();

            // Plot padding
            int padL = 120, padR = 80, padT = 80, padB = 110;
            int plotW = width - padL - padR;
            int plotH = height - padT - padB;

            // Draw white plotting area and faint grid
            g2.setColor(Color.WHITE);
            g2.fillRect(padL, padT, plotW, plotH);
            g2.setColor(new Color(230, 230, 230));
            g2.setStroke(new BasicStroke(1));
            int nx = 12, ny = 12;
            for (int i = 1; i < nx; i++) {
                int x = padL + i * plotW / nx;
                g2.drawLine(x, padT, x, padT + plotH);
            }
            for (int i = 1; i < ny; i++) {
                int y = padT + i * plotH / ny;
                g2.drawLine(padL, y, padL + plotW, y);
            }

            // Title (black)
            g2.setFont(new Font("SansSerif", Font.BOLD, 18));
            g2.setColor(Color.BLACK);
            String title = "Fibonacci Curve (N=" + n + ")";
            g2.drawString(title, padL + plotW / 2 - g2.getFontMetrics().stringWidth(title) / 2, padT - 28);

            // Compute Fibonacci numbers
            int[] fibs = fibonacci(n);

            // Determine scale so largest pieces fit comfortably
            int last = Math.max(1, n - 1);
            double outer = fibs[last] + ((last - 1 >= 0) ? fibs[last - 1] : 0);
            double scale = Math.max(1.0, Math.min(plotW, plotH) / (2.2 * Math.max(1.0, outer)));

            // Choose origin (axes crossing) - tweak to match your layout.
            // oxOffset fraction across plotW (0=left,1=right), oyOffset fraction down (0=top,1=bottom)
            double oxOffset = 0.12; // keep axes more to left like your screenshot
            double oyOffset = 0.42; // vertical placement similar to your example
            double originX = padL + plotW * oxOffset;
            double originY = padT + plotH * oyOffset;

            // Draw axes lines (black), thicker stroke
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(3));
            // vertical axis at originX
            g2.drawLine((int) originX, padT, (int) originX, padT + plotH);
            // horizontal axis at originY
            g2.drawLine(padL, (int) originY, padL + plotW, (int) originY);

            // Axis labels (small)
            g2.setFont(new Font("SansSerif", Font.PLAIN, 12));
            g2.drawString("Y", (int) originX + 4, padT + 14);
            g2.drawString("X", padL + plotW - 18, (int) originY - 6);

            // Draw quarter-arcs in BLACK with standard orientation: RIGHT -> UP -> LEFT -> DOWN ...
            double baseAngle = 0.0; // start to the RIGHT
            double px = originX;
            double py = originY;

            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

            for (int k = 1; k < n; k++) {
                double r = fibs[k] * scale;
                double thetaStart = baseAngle + (k - 1) * Math.PI / 2.0;
                double thetaEnd = baseAngle + k * Math.PI / 2.0;

                // compute center so the arc starts exactly at previous point (px,py)
                double cxk = px - r * Math.cos(thetaStart);
                double cyk = py - r * Math.sin(thetaStart);

                // sample arc for smoothness
                int steps = Math.max(24, (int) Math.ceil((thetaEnd - thetaStart) / (Math.PI / 720.0)));
                Path2D.Double seg = new Path2D.Double();
                for (int i = 0; i <= steps; i++) {
                    double frac = i / (double) steps;
                    double theta = thetaStart + (thetaEnd - thetaStart) * frac;
                    double x = cxk + r * Math.cos(theta);
                    double y = cyk + r * Math.sin(theta);
                    if (i == 0) seg.moveTo(x, y);
                    else seg.lineTo(x, y);
                    if (i == steps) {
                        px = x; py = y; // update for next arc
                    }
                }
                g2.draw(seg);
            }

            // Draw small black markers at joints (to show continuity)
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(1));
            px = originX; py = originY;
            g2.fill(new Ellipse2D.Double(px - 3, py - 3, 6, 6));
            for (int k = 1; k < n; k++) {
                double r = fibs[k] * scale;
                double thetaStart = baseAngle + (k - 1) * Math.PI / 2.0;
                double thetaEnd = baseAngle + k * Math.PI / 2.0;
                double cxk = px - r * Math.cos(thetaStart);
                double cyk = py - r * Math.sin(thetaStart);
                double ex = cxk + r * Math.cos(thetaEnd);
                double ey = cyk + r * Math.sin(thetaEnd);
                g2.fill(new Ellipse2D.Double(ex - 3, ey - 3, 6, 6));
                px = ex; py = ey;
            }

            // Legend: top-left near the plotting area - all text in black
            g2.setFont(new Font("SansSerif", Font.PLAIN, 12));
            int lx = padL - 110; // position left of plotting area
            int ly = padT + 6;
            g2.setColor(Color.BLACK);
            g2.drawString("Curve Lengths:", lx, ly + 2);

            // Show curve radii (units). Present entries for k=1..(n-1).
            for (int k = 1; k < n; k++) {
                // small swatch (black)
                g2.fillRect(lx - 8, ly + 12 + (k - 1) * 14, 9, 9);
                String txt = "Curve " + k + " : " + fibs[k] + " units";
                g2.drawString(txt, lx + 12, ly + 22 + (k - 1) * 14);
                // limit legend vertical overflow
                if (ly + 22 + (k - 1) * 14 > padT + 160) break;
            }

            // Footer showing scale factor (in black)
            g2.setFont(new Font("SansSerif", Font.PLAIN, 11));
            String scaleTxt = String.format("Scale = %.3f px/unit", scale);
            g2.drawString(scaleTxt, padL + 6, padT + plotH + 24);
        }
    }

    // ---------------- Animated Background Panel ----------------
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

        // Draw gradient background and floating white math symbols
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
                g2.drawString(symbols[i % symbols.length], points[i].x % Math.max(1, getWidth()), points[i].y % Math.max(1, getHeight()));
            }
        }
    }

    // ---------------- MAIN FUNCTION ----------------
    public static void main(String[] args) {
        // Launch the GUI safely in Swing’s event thread
        SwingUtilities.invokeLater(() -> new Maths().setVisible(true));
    }
}
