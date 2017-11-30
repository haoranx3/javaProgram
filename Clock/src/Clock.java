import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Clock {
    private JFrame frame;
    private JLabel label;
    private ClockDisplay clock;
    private boolean clockRunning = false;
    private TimerThread timerThread;

    public Clock() {
        makeFrame();
        clock = new ClockDisplay();
    }

    private void start()
    {
        clockRunning = true;
        timerThread = new TimerThread();
        timerThread.start();
    }
    private void stop()
    {
        clockRunning = false;
    }
    private void step()
    {
        clock.timeTick();
        label.setText(clock.getTime());
    }
    private void showAbout()
    {
        JOptionPane.showMessageDialog (frame,
                "Clock Version 1.0\n" +
                        "A simple interface for the 'Objects First' clock display project",
                "About Clock",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private void quit()
    {
        System.exit(0);
    }
    private void makeFrame()
    {
        frame = new JFrame("Clock");
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setBorder(new EmptyBorder(1, 60, 1, 60));

        makeMenuBar(frame);

        // Specify the layout manager with nice spacing
        contentPane.setLayout(new BorderLayout(12, 12));

        // Create the image pane in the center
        label = new JLabel("00:00", SwingConstants.CENTER);
        Font displayFont = label.getFont().deriveFont(96.0f);
        label.setFont(displayFont);
        //imagePanel.setBorder(new EtchedBorder());
        contentPane.add(label, BorderLayout.CENTER);

        // Create the toolbar with the buttons
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new GridLayout(1, 0));

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> start());
        toolbar.add(startButton);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> stop());
        toolbar.add(stopButton);

        JButton stepButton = new JButton("Step");
        stepButton.addActionListener(e -> step());
        toolbar.add(stepButton);

        // Add toolbar into panel with flow layout for spacing
        JPanel flow = new JPanel();
        flow.add(toolbar);

        contentPane.add(flow, BorderLayout.SOUTH);

        // building is done - arrange the components
        frame.pack();

        // place the frame at the center of the screen and show
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width/2 - frame.getWidth()/2, d.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
    }
    private void makeMenuBar(JFrame frame)
    {
        final int SHORTCUT_MASK =
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu menu;
        JMenuItem item;

        // create the File menu
        menu = new JMenu("File");
        menubar.add(menu);

        item = new JMenuItem("About Clock...");
        item.addActionListener(e -> showAbout());
        menu.add(item);

        menu.addSeparator();

        item = new JMenuItem("Quit");
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
        item.addActionListener(e -> quit());
        menu.add(item);
    }
    class TimerThread extends Thread
    {
        public void run()
        {
            while (clockRunning) {
                step();
                pause();
            }
        }
        private void pause()
        {
            try {
                Thread.sleep(300);   // pause for 300 milliseconds
            }
            catch (InterruptedException exc) {
            }
        }
    }
}
