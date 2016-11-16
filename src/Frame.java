import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {
    private int count = 0;

    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaThree = new JLabel("");

    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object button = e.getSource();

            if (button instanceof JButton) {
                count++;
                metkaThree.setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, " + fio.getText() + "!");
            }
        }
    }

    public Frame(String title) {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno() {

        JButton button1 = new JButton(" Нажми меня! ");
        button1.setBounds(65, 60, 150, 40);
        button1.addActionListener(new PushingListener());

        JButton button2 = new JButton(" Изменить размер! ");
        button2.setBounds(220, 60, 150, 40);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(500, 500);
            }
        });

        metka.setBounds(15, 15, 95, 30);
        metkaDva.setBounds(15, 115, 200, 30);
        metkaThree.setBounds(15, 150, 200, 30);

        fio.setBounds(120, 15, 100, 30);

        getContentPane().setLayout(null);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaThree);
        getContentPane().add(fio);

        setLocationRelativeTo(null);
    }
}