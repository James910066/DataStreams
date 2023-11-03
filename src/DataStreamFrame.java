import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class DataStreamFrame extends JFrame
{
    JPanel mainPnl;
    JPanel controlPnl;
    JPanel displayPnl;
    JTextArea originalTA; //goes in left pane of the main panel
    JTextArea filteredTA; //goes in right pane of the main panel
    JTextField searchField; //Goes right above the buttons in control panel
    JScrollPane scroller;
    JButton quitBtn;
    JButton loadBtn;
    JButton searchBtn;


    public DataStreamFrame()
    {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        add(mainPnl);
        setTitle("Data Streamer");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        createControlPanel();
        mainPnl.add(controlPnl, BorderLayout.SOUTH);

        createDisplayPanel();
        mainPnl.add(displayPnl, BorderLayout.CENTER);

        setVisible(true);

    }
    private void createControlPanel()
    {
        controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1, 3));
        quitBtn = new JButton("Quit");
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));
        loadBtn = new JButton("Load");
        searchBtn = new JButton("Search");

        loadBtn.addActionListener((ActionEvent ae) ->
        {

        });

        searchBtn.addActionListener((ActionEvent ae) ->
        {

        });
        controlPnl.add(quitBtn);
        controlPnl.add(loadBtn);
        controlPnl.add(searchBtn);

    }
    private void createDisplayPanel()
    {
        displayPnl = new JPanel();
        originalTA = new JTextArea(60,60);
        originalTA.setEditable(false);
        filteredTA = new JTextArea(60,60);
        filteredTA.setEditable(false);
        scroller = new JScrollPane(originalTA);
        scroller = new JScrollPane(filteredTA);
        displayPnl.add(scroller);
    }

}
