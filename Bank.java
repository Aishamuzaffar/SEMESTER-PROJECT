import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class Bank extends JFrame  implements ActionListener


{
    String Account_no;
    String Account_Holder= "";
    int Amount;
    String  Account_type="";
    int P;

    JTable table;
    JScrollPane scroll;
    DefaultTableModel model;
    JFrame f,f1,f2,atm,Reg,list,exit,dep,update,main,Menu,ATm,atm2,about;
    Clip clip;
    JButton b1;
    JLabel lbl,login;
    JLabel pic;
    JLabel pic2;
    JLabel pic3;
    JLabel pic4;
    JLabel pic5,pic7;
    JLabel name,User;
    JLabel menu;
    JLabel pin;
    JLabel tk;
    JLabel username;
    JLabel fname;
    JLabel phone;
    JLabel cnic;
    JLabel date;
    JLabel gen;
    JLabel type;
    JLabel age;
    JLabel f3;
    JLabel AC,Username;
    JLabel Am;
    JLabel acc;

    JLabel pic6,m;
    JLabel UPDATE,l1,l2,l5,ACCOUNTNUM;



    JButton reg,Dep,EX,ATM,Submit, en,upd,Ex,ent,ent1,ent4, ent5,x,done,ex,DONE,admin,Ext,Exit,user,Atm,ent6,WD,Aboutus,submit,reset,enter,Lst,Upd,Reset,OK,Back,Check;
    JRadioButton male, female;
    JComboBox  dat,month, year, Age,Type,combo;
    JTextField T,usert,fnamet,phonet,nict,pint,AC_no,AMOUNT,acct,UserName,T2,T1,T3,T4,T5,t1,t2,ACCOUNTNUMT;

    JPasswordField pass,password;
    String[] ty={"S","C"};
    String[] cage={"18-25","25-40","40-50","50-60"};
    String[] DATE={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
            "19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] Month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Spet","Oct","Nov","Dec"};
    String[] Year={"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990",
            "1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002",};



    public ImageIcon SetImageSize(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\bank.jfif");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\AI.jfif");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSizeA(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\A.png");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(m.getWidth(), m.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSize3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\D.jpeg");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(pic3.getWidth(), pic3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSize4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\C2.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic4.getWidth(), pic4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }

    public ImageIcon SetImageSize5(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\TK.PNG");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(tk.getWidth(), tk.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSize6(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\C2.JPG");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(f3.getWidth(), f3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSize7(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\exit.jfif");
        Image img2 = icon.getImage();
        Image newImg = img2.getScaledInstance(Exit.getWidth(), Exit.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg);

        return newImc2;
    }
    public ImageIcon SetImageSize8(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\Admin.JPG");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(admin.getWidth(), admin.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize9(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\USER.PNG");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(user.getWidth(), user.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize10(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\ATM.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(Atm.getWidth(), Atm.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize11(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\A2.jfif");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic6.getWidth(), pic6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize12(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\C2.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic7.getWidth(), pic7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize13(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\C2.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize14(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\check.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(Check.getWidth(), Check.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize15(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\wd.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(Atm.getWidth(), Atm.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }
    public ImageIcon SetImageSize16(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Sakhi Computer\\Downloads\\C2.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic5.getWidth(), pic5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);

        return newImc;
    }

    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "");
    Statement stmt = connect.createStatement( );
    public Bank() throws SQLException {
        try { Class.forName("com.mysql.jdbc.Driver");
            System.out.println("ok");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "");
            if (connect != null)
                System.out.println("connected");
            Statement stm = connect.createStatement();}
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


                                           //AI BANK

        f1=new JFrame("AI BANK");
        f1.setBackground(Color.BLACK);
        f1.setSize(500,700);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        pic2 = new JLabel();
        pic2.setSize( 65, 65);
        pic2.setLocation(70,50);
        ImageIcon image2 = SetImageSize2();

        pic2.setIcon(image2);
        pic=new JLabel();
        pic.setSize( 500, 700);
        ImageIcon image = SetImageSize();
        pic.setIcon(image);
        f1.add(pic);
        pic.add(pic2);
        pic.setLayout(null);
        lbl= new JLabel("WELCOME TO AI BANK");
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Elephant",Font.BOLD,19));
        lbl.setBounds(150,60,280,50);
        lbl.setBackground(Color.RED);
        pic.add(lbl);
        b1=new JButton("Click to Proceed");
        b1.setForeground(Color.WHITE);
        b1.setBounds(150,600,200,32);
        b1.setFont(new Font("Elephant", Font.BOLD, 18));
        b1.setBackground(Color.GRAY);
        pic.add(b1);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f1.setResizable(false);
        b1.addActionListener(this);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);



    }
    public static void main(String[] args) throws SQLException {
        Bank bank = new Bank();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.dispose();
            f = new JFrame("main");
            f.setVisible(true);
            f.setResizable(false);
            f.setSize(500, 650);
            f.setLayout(null);
            f.setLocationRelativeTo(null);
            pic6 = new JLabel();
            pic6.setSize(500, 700);
            ImageIcon image4 = SetImageSize11();
            pic6.setIcon(image4);
            f.add(pic6);
            admin = new JButton();
            admin.setSize(150, 150);
            admin.setLocation(50, 120);
            ImageIcon image = SetImageSize8();
            admin.setIcon(image);
            pic6.add(admin);
            user = new JButton();
            user.setSize(150, 150);
            user.setLocation(300, 120);
            ImageIcon image2 = SetImageSize9();
            user.setIcon(image2);
            pic6.add(user);
            Atm = new JButton();
            Atm.setSize(150, 150);
            Atm.setLocation(175, 350);
            Exit=new JButton();

            Exit.setSize(100,32);
            Ext=new JButton();
            Ext.setSize(100,32);
            Ext.setLocation(200, 580);
            ImageIcon image6=SetImageSize7();
            Ext.setIcon(image6);
            ImageIcon image3 = SetImageSize10();
            Atm.setIcon(image3);
            pic6.add(Atm);
            pic6.add(Ext);
            user.addActionListener(this);
            admin.addActionListener(this);
            Atm.addActionListener(this);
            Ext.addActionListener(this);

        }
        if (e.getSource() == admin) {
            f.dispose();
            main = new JFrame("LOGIN");
            main.setSize(400, 400);
            main.setVisible(true);
            main.setResizable(false);
            main.setLayout(null);
            main.setLocationRelativeTo(null);
            login = new JLabel(" ADMIN LOGIN");
            login.setLocation(125, 80);
            login.setSize(150, 22);
            Username = new JLabel("UserName");
            User = new JLabel("Password");
            UserName = new JTextField();
            password = new JPasswordField();
            Username.setSize(100, 22);
            password.setSize(100, 22);
            UserName.setSize(100, 22);
            User.setSize(100, 22);
            Username.setLocation(95, 150);
            UserName.setLocation(195, 150);
            User.setLocation(95, 190);
            password.setLocation(195, 190);
            enter = new JButton(" ENTER");
            enter.setSize(150, 22);
            enter.setLocation(125, 280);
            enter.setOpaque(false);
            enter.setContentAreaFilled(false);
            enter.setBorderPainted(true);
            main.add(enter);
            enter.setFont(new Font("Elephant", Font.PLAIN, 14));
            UserName.setFont(new Font("Elephant", Font.PLAIN, 14));
            Username.setFont(new Font("Elephant", Font.PLAIN, 14));
            User.setFont(new Font("Elephant", Font.PLAIN, 14));
            password.setFont(new Font("Elephant", Font.PLAIN, 14));
            login.setFont(new Font("Elephant", Font.PLAIN, 14));
            pic7 = new JLabel();
            pic7.setSize(400, 400);
            ImageIcon image4 = SetImageSize12();
            pic7.setIcon(image4);
            enter.addActionListener(this);
            main.add(pic7);
            pic7.add(password);
            pic7.add(Username);
            pic7.add(UserName);
            pic7.add(User);
            pic7.add(login);
        }
        if (e.getSource() == enter) {

            String PASS = password.getText();
            String UN = UserName.getText();
            if (UN.equals("Admin") && PASS.equals("admin123")) {
                main.dispose();
                Menu = new JFrame("ADMIN Menu");
                Menu.setSize(400, 600);
                Menu.setLocationRelativeTo(null);
                Menu.setResizable(false);
                Menu.setVisible(true);
                Menu.setLayout(null);
                menu = new JLabel("      MENU");
                menu.setLocation(150, 170);
                menu.setSize(100, 22);
                Lst = new JButton("LIST");
                Lst.setSize(100, 22);
                Lst.setLocation(150, 250);
                Upd = new JButton("UPDATE");
                Upd.setSize(150, 22);
                Upd.setLocation(125, 290);
                Back = new JButton("BACK");
                Back.setSize(100, 22);
                Back.setLocation(150, 330);
                Lst.setOpaque(false);
                Lst.setContentAreaFilled(false);
                Lst.setBorderPainted(false);
                Upd.setOpaque(false);
                Upd.setContentAreaFilled(false);
                Upd.setBorderPainted(false);
                Back.setOpaque(false);
                Back.setContentAreaFilled(false);
                Back.setBorderPainted(false);
                Lst.addActionListener(this);
                Upd.addActionListener(this);
                Upd.setFont(new Font("Elephant", Font.PLAIN, 14));
                Lst.setFont(new Font("Elephant", Font.PLAIN, 14));
                menu.setFont(new Font("Elephant", Font.PLAIN, 14));
                Back.setFont(new Font("Elephant", Font.PLAIN, 14));
                pic3 = new JLabel();
                pic3.setSize(400, 600);
                ImageIcon image4 = SetImageSize3();
                pic3.setIcon(image4);
                Menu.add(pic3);
                pic3.add(Lst);
                pic3.add(menu);
                pic3.add(Upd);
                pic3.add(Back);
                Back.addActionListener(this);
            } else {
                JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }                                  //* LIST *\\
        if (e.getSource() == Lst) {
            Menu.dispose();
            list = new JFrame("List of Accounts");
            list.setSize(700, 700);
            list.setLocationRelativeTo(null);
            list.setVisible(true);

            list.setResizable(false);
            list.setLayout(new BorderLayout());


            String[] clms = {"ACC:NO", "ACC:HOLDER", "TO:AMOUNT", "ACC:TYPE", "ATM PIN"};
            model = new DefaultTableModel();
            model.setColumnIdentifiers(clms);
            table = new JTable();
            table.setModel(model);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.setFillsViewportHeight(true);
            JTableHeader header = table.getTableHeader();
            header.setBackground(Color.WHITE);
            header.setForeground(Color.BLACK);
            scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            try {
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Account_data");
                while (rs.next()) {
                    Account_no = rs.getString("Account_no");
                    Account_Holder = rs.getString("Name");
                    Amount = rs.getInt("Amount");
                    Account_type = rs.getString("Account_type");
                    P = rs.getInt("Pin");
                    model.addRow(new Object[]{Account_no, Account_Holder, Amount, Account_type, P});
                }
            } catch (Exception m) {
                System.out.println("not ok" + m);
            }
            list.add(scroll);
            table.setBackground(Color.pink);
            x = new JButton("Back");
            x.setSize(100, 32);
            list.add(scroll);
            list.add(x, BorderLayout.SOUTH);
            x.setOpaque(false);
            x.setContentAreaFilled(false);
            x.setBorderPainted(false);
            x.addActionListener(this);
        }
        if (e.getSource() == x) {
            list.dispose();
            Menu.setVisible(true);
        }// list close
        if (e.getSource() == Upd) {
            Menu.dispose();
            update = new JFrame("UPDATE INFO");
            update.setSize(400, 400);
            update.setLocationRelativeTo(null);
            update.setVisible(true);
            update.setResizable(false);
            update.setLayout(null);
            UPDATE = new JLabel("UPDATE ACCOUNT");
            UPDATE.setBounds(80, 30, 230, 30);
            update.add(UPDATE);
            UPDATE.setFont(new Font("Elephant", Font.PLAIN, 20));

            String[] city = {"S", "C"};
            l1 = new JLabel("NAME         ");
            l1.setBounds(90, 70, 80, 20);


            l2 = new JLabel("PIN           ");
            l2.setBounds(90, 100, 80, 20);


            t1 = new JTextField();
            t1.setBounds(160, 70, 90, 20);

            pass = new JPasswordField();
            pass.setBounds(160, 100, 90, 20);
            update.add(pass);

            ACCOUNTNUM = new JLabel("Old Acc NO");
            ACCOUNTNUM.setBounds(90, 140, 100, 20);
            update.add(ACCOUNTNUM);

            ACCOUNTNUMT = new JTextField();
            ACCOUNTNUMT.setBounds(160, 140, 90, 20);
            update.add(ACCOUNTNUMT);

            l5 = new JLabel("TYPE    ");
            l5.setBounds(90, 170, 80, 20);


            combo = new JComboBox(city);
            combo.setBounds(160, 170, 50, 20);


            Submit = new JButton("Save");
            Submit.setFont(new Font("Arial", Font.PLAIN, 15));
            Submit.setBounds(80, 200, 80, 20);
            Submit.addActionListener(this);


            Reset = new JButton("Reset");
            Reset.setFont(new Font("Arial", Font.PLAIN, 15));
            Reset.setBounds(170, 200, 90, 20);
            Reset.addActionListener(this);

            pic7 = new JLabel();
            pic7.setSize(400, 400);
            ImageIcon image4 = SetImageSize12();
            pic7.setIcon(image4);
            update.add(pic7);
            pic7.add(Reset);
            pic7.add(Submit);
            pic7.add(combo);
            pic7.add(l5);
            pic7.add(ACCOUNTNUM);
            pic7.add(ACCOUNTNUMT);
            pic7.add(l1);
            pic7.add(l2);
            pic7.add(t1);

           
            Submit.setOpaque(false);
            Submit.setBorderPainted(true);
            Submit.setContentAreaFilled(false);
            Reset.setOpaque(false);
            Reset.setBorderPainted(true);
            Reset.setContentAreaFilled(false);
        }
        if (e.getSource() == Submit) {
            update.setVisible(false);
            Menu.setVisible(true);

            try {

                String val1 = t1.getText();
                String val2 = pass.getText();
                String val3 = (String) combo.getSelectedItem();
                String val4 = ACCOUNTNUMT.getText();
                String sql = "UPDATE account_data set Account_no='" + val4 + "', Name='" + val1 + "',Account_Type='" + val3 + "',Pin='" + val2 + "' where Account_no='" + ACCOUNTNUMT.getText() + "'";
                PreparedStatement pst;
                pst = connect.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Updated");


            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E);
            }
        }
        if (e.getSource() == Reset) {
            String def = "";
            t1.setText(def);
            t2.setText(def);
            ACCOUNTNUMT.setText(def);
            Type.setSelectedIndex(0);
        }
        if (e.getSource() == Back) {
            f.setVisible(true);
            Menu.dispose();
        }


        //////******USER******//////
        //MAIN MENU(user)
        if (e.getSource() == user) {
            f.dispose();
            f2 = new JFrame("MENU");
            f2.setSize(400, 600);
            f2.setLocationRelativeTo(null);
            f2.setVisible(true);
            f2.setResizable(false);
            f2.setLayout(null);
            pic2 = new JLabel();
            pic2.setSize(65, 65);
            ImageIcon image2 = SetImageSize2();
            pic2.setIcon(image2);
            pic3 = new JLabel();
            pic3.setSize(400, 600);
            ImageIcon image3 = SetImageSize3();
            pic3.setIcon(image3);
            name = new JLabel("AI BANK");
            menu = new JLabel("Menu");
            menu.setFont(new Font("Arial", Font.BOLD, 20));
            name.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 30));
            reg = new JButton("Create Account");
            Dep = new JButton("Deposite");
            Aboutus = new JButton(("About Us"));
            upd = new JButton(("Update Account"));
            WD = new JButton(("WithDraw"));
            Ex = new JButton("EXIT");
            name.setSize(100, 50);
            pic2.setLocation(100, 25);
            name.setLocation(175, 25);
            reg.setFont(new Font("Elephant", Font.PLAIN, 14));
            Aboutus.setFont(new Font("Elephant", Font.PLAIN, 14));
            upd.setFont(new Font("Elephant", Font.PLAIN, 14));
            Dep.setFont(new Font("Elephant", Font.PLAIN, 14));
            WD.setFont(new Font("Elephant", Font.PLAIN, 14));
            Ex.setFont(new Font("Elephant", Font.PLAIN, 14));
            reg.setSize(150, 32);
            menu.setSize(150, 32);
            Ex.setSize(150, 32);
            Dep.setSize(150, 32);
            Aboutus.setSize(150, 32);
            upd.setSize(150, 32);
            WD.setSize(150, 32);
            menu.setLocation(173, 160);
            reg.setLocation(125, 200);
            Dep.setLocation(125, 230);
            upd.setLocation(125, 260);
            WD.setLocation(125, 290);
            Ex.setLocation(125, 320);
            Aboutus.setLocation(125, 350);
            pic3.setLayout(null);
            f2.add(pic3);
            pic3.add(menu);
            pic3.add(reg);
            pic3.add(Dep);
            pic3.add(upd);
            pic3.add(Aboutus);
            pic3.add(WD);
            pic3.add(Ex);
            pic3.add(name);
            pic3.add(pic2);
            reg.setOpaque(false);
            reg.setContentAreaFilled(false);
            reg.setBorderPainted(false);
            Aboutus.setOpaque(false);
            Aboutus.setContentAreaFilled(false);
            Aboutus.setBorderPainted(false);
            upd.setOpaque(false);
            upd.setContentAreaFilled(false);
            upd.setBorderPainted(false);
            Dep.setOpaque(false);
            Dep.setContentAreaFilled(false);
            Dep.setBorderPainted(false);
            Ex.setOpaque(false);
            Ex.setContentAreaFilled(false);
            Ex.setBorderPainted(false);
            WD.setOpaque(false);
            WD.setContentAreaFilled(false);
            WD.setBorderPainted(false);
            reg.addActionListener(this);
            Aboutus.addActionListener(this);
            WD.addActionListener(this);
            Ex.addActionListener(this);
            upd.addActionListener(this);
            Dep.addActionListener(this);

        }//menu close

        //CREATE ACCOUNT(reg)
        if (e.getSource() == reg) {
            f2.dispose();
            Reg = new JFrame("Form");
            Reg.setSize(400, 600);
            Reg.setLocationRelativeTo(null);
            Reg.setVisible(true);
            Reg.setResizable(false);
            f3 = new JLabel();
            f3.setSize(400, 600);
            ImageIcon image3 = SetImageSize6();
            f3.setIcon(image3);
            Reg.add(f3);
            Reg.setLayout(null);

            JLabel ca = new JLabel("   CREATE ACCOUNT");

            ca.setBounds(100, 100, 200, 35);
            f3.add(ca);
            ca.setFont(new Font("Elephant", Font.PLAIN, 15));
            ca.setForeground(Color.WHITE);
            username = new JLabel("Username");
            f3.add(username);
            username.setBounds(75, 150, 100, 20);
            usert = new JTextField();
            usert.setBounds(225, 150, 100, 20);
            f3.add(usert);
            fname = new JLabel("Father Name");
            fname.setBounds(75, 180, 100, 20);
            f3.add(fname);
            fnamet = new JTextField();
            fnamet.setBounds(225, 180, 100, 20);
            f3.add(fnamet);
            phone = new JLabel("Phone no");
            phone.setBounds(75, 210, 100, 20);
            f3.add(phone);
            phonet = new JTextField();
            phonet.setBounds(225, 210, 100, 20);
            f3.add(phonet);
            cnic = new JLabel("CNIC");
            cnic.setBounds(75, 240, 100, 20);
            f3.add(cnic);
            nict = new JTextField();
            nict.setBounds(225, 240, 100, 20);
            f3.add(nict);
            gen = new JLabel("Gender");
            gen.setBounds(75, 270, 100, 20);
            f3.add(gen);
            male = new JRadioButton("MALE");
            male.setBounds(200, 270, 60, 20);
            f3.add(male);
            female = new JRadioButton("FEMALE");
            female.setBounds(260, 270, 100, 20);
            f3.add(female);
            date = new JLabel("Date of Birth");
            date.setBounds(75, 300, 100, 20);
            f3.add(date);
            dat = new JComboBox(DATE);
            dat.setBounds(195, 300, 50, 20);
            f3.add(dat);
            month = new JComboBox(Month);
            month.setBounds(250, 300, 50, 20);
            f3.add(month);
            year = new JComboBox(Year);
            year.setBounds(305, 300, 60, 20);
            f3.add(year);
            age = new JLabel("Age");
            age.setBounds(75, 330, 100, 20);
            f3.add(age);
            Age = new JComboBox(cage);
            Age.setBounds(225, 330, 100, 20);
            f3.add(Age);
            type = new JLabel("Account Type");
            type.setBounds(75, 360, 100, 20);
            f3.add(type);
            Type = new JComboBox(ty);
            Type.setBounds(225, 360, 100, 20);
            f3.add(Type);
            AC = new JLabel("Account No");
            AC.setBounds(75, 390, 100, 20);
            f3.add(AC);
            AC_no = new JTextField();
            AC_no.setBounds(225, 390, 100, 20);
            f3.add(AC_no);
            pin = new JLabel("Pin");
            pin.setBounds(75, 420, 100, 20);
            f3.add(pin);
            pint = new JPasswordField();
            pint.setBounds(225, 420, 100, 20);
            Am = new JLabel("Amount");
            // amount=new JComboBox(am);
            AMOUNT = new JTextField();
            Am.setBounds(75, 450, 100, 20);
            AMOUNT.setBounds(225, 450, 100, 20);
            f3.add(Am);
            f3.add(AMOUNT);
            f3.add(pint);
            done = new JButton("CREATE");
            done.setFont(new Font("Elephant", Font.PLAIN, 15));
            done.setSize(150, 32);
            done.setLocation(125, 500);
            f3.add(done);
            done.addActionListener(this);
            done.setForeground(Color.WHITE);
            done.setOpaque(false);
            done.setContentAreaFilled(false);
            done.setBorderPainted(true);


        }

        if (e.getSource() == done) {

            try {

                String query = " insert into Account_data (Account_no,Name,Amount, Account_type,Pin)"
                        + " values (?,?,?,?,?)";
                PreparedStatement preparedStmt = connect.prepareStatement(query);
                preparedStmt.setString(1, (AC_no.getText()));
                preparedStmt.setString(2, usert.getText());
                preparedStmt.setInt(3, Integer.parseInt(AMOUNT.getText()));
                preparedStmt.setString(4, (String) (Type.getSelectedItem()));
                preparedStmt.setInt(5, Integer.parseInt(pint.getText()));
                preparedStmt.execute();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            Reg.dispose();
            f2.setVisible(true);
        }//reg close


        //  Deposit
        if (e.getSource() == Dep) {
            f2.dispose();
            dep = new JFrame("LOGIN");
            dep.setSize(400, 400);
            dep.setLocationRelativeTo(null);
            dep.setVisible(true);
            dep.setResizable(false);
            dep.setLayout(null);
            pic4=new JLabel();
            pic4.setSize(400,400);
            ImageIcon i=SetImageSize4();
            pic4.setIcon(i);
            dep.add(pic4);
            acc = new JLabel("   Account No");
            acc.setSize(150,32);
            acc.setLocation(125,120);
            pic4.add(acc);
            acct = new JTextField();
            acct.setSize(150,32);
            acct.setLocation(125,170);
            pic4.add(acct);
            DONE = new JButton("Enter");
            DONE.setSize(100,32);
            DONE.setLocation(150,320);
            pic4.add(DONE);
            DONE.addActionListener(this);
            acc.setFont(new Font("Elephant", Font.PLAIN, 16));
            DONE.setOpaque(false);
            DONE.setBorderPainted(true);
            DONE.setContentAreaFilled(false);



        }
        if (e.getSource() == DONE) {
            dep.dispose();
            f2.setVisible(true);
            int num1, num, numd, numf;
            String strc = JOptionPane.showInputDialog(null, "Please enter the amount to be DEPOSITED");
            numd = Integer.parseInt(strc);
            String numb = (acct.getText());
            if (numd <= 0) {
                JOptionPane.showMessageDialog(null, " no NO Amount Deposited");
            } else {
                try {

                    PreparedStatement stm = connect.prepareStatement("SELECT * FROM Account_data where Account_no=?");
                    stm.setString(1, acct.getText().toString());

                    ResultSet rs = stm.executeQuery();
                    rs.next();
                    num1 = Integer.parseInt(rs.getString("Amount"));
                    num1 = num1 + numd;
                    JOptionPane.showMessageDialog(null, "Amount Deposited Successfully , Amount is " + numd);
                    String ss = "UPDATE Account_data SET Amount=" + num1 + " where Account_no=" + numb + "";
                    Statement stm1 = connect.createStatement();
                    stm1.executeUpdate(ss);
                    stm.close();
                    dep.dispose();
                    f2.setVisible(true);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ;
                }
            }
        }//deposite end
        if (e.getSource() == WD) {
            f2.dispose();
            dep = new JFrame("LOGIN");
            dep.setSize(400, 400);
            dep.setLocationRelativeTo(null);
            dep.setVisible(true);
            dep.setResizable(false);
            dep.setLayout(null);
            pic4=new JLabel();
            pic4.setSize(400,400);
            ImageIcon i=SetImageSize4();
            pic4.setIcon(i);
            dep.add(pic4);
            acc = new JLabel("   Account No");
            acc.setSize(150,32);
            acc.setLocation(125,120);
            pic4.add(acc);
            acct = new JTextField();
            acct.setSize(150,32);
            acct.setLocation(125,170);
            pic4.add(acct);
            OK = new JButton("Enter");
            OK.setSize(100,32);
            OK.setLocation(150,320);
            pic4.add(OK);
            OK.addActionListener(this);
            acc.setFont(new Font("Elephant", Font.PLAIN, 16));
            OK.setContentAreaFilled(false);
            OK.setOpaque(false);
            OK.setBorderPainted(true);



        }
        if (e.getSource() == OK) {
            dep.dispose();
            f2.setVisible(true);
            int num1,  numd;

            String strc = JOptionPane.showInputDialog(null, "Please enter the amount to be WithDraw");
            numd = Integer.parseInt(strc);
            String numb = (acct.getText());
            if (numd <= 0) {
                JOptionPane.showMessageDialog(null, "  NO Amount WithDraw");
            } else {
                try {

                    PreparedStatement stm = connect.prepareStatement("SELECT * FROM Account_data where Account_no=?");
                    stm.setString(1, acct.getText().toString());

                    ResultSet rs = stm.executeQuery();
                    rs.next();
                    num1 = Integer.parseInt(rs.getString("Amount"));
                    num1 = num1 - numd;
                    JOptionPane.showMessageDialog(null, "Amount Withdraw Successfully , Amount is " + numd);
                    String ss = "UPDATE Account_data SET Amount=" + num1 + " where Account_no=" + numb + "";
                    Statement stm1 = connect.createStatement();
                    stm1.executeUpdate(ss);
                    stm.close();
                    dep.dispose();
                    f2.setVisible(true);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ;
                }
            }
        }


        if (e.getSource() == upd) {
            f2.dispose();
            update = new JFrame("UPDATE INFO");
            update.setSize(400, 400);
            update.setLocationRelativeTo(null);
            update.setVisible(true);
            update.setResizable(false);
            update.setLayout(null);
            UPDATE = new JLabel("UPDATE ACCOUNT");
            UPDATE.setBounds(80, 30, 230, 30);
            update.add(UPDATE);
            UPDATE.setFont(new Font("Elephant", Font.PLAIN, 20));

            String[] city = {"S", "C"};
            l1 = new JLabel("NAME         ");
            l1.setBounds(90, 70, 80, 20);
            update.getContentPane().add(l1);

            l2 = new JLabel("PIN           ");
            l2.setBounds(90, 100, 80, 20);
            update.getContentPane().add(l2);

            t1 = new JTextField();
            t1.setBounds(160, 70, 90, 20);
            update.add(t1);
            pass = new JPasswordField();
            pass.setBounds(160, 100, 90, 20);
            update.add(pass);

            ACCOUNTNUM = new JLabel("Old Acc NO");
            ACCOUNTNUM.setBounds(90, 140, 100, 20);
            update.add(ACCOUNTNUM);

            ACCOUNTNUMT = new JTextField();
            ACCOUNTNUMT.setBounds(160, 140, 90, 20);
            update.add(ACCOUNTNUMT);

            l5 = new JLabel("TYPE    ");
            l5.setBounds(90, 170, 80, 20);
            update.add(l5);

            combo = new JComboBox(city);
            combo.setBounds(160, 170, 50, 20);
            update.add(combo);

            submit = new JButton("Save");
            submit.setFont(new Font("Arial", Font.PLAIN, 15));
            submit.setBounds(80, 200, 80, 20);
            submit.addActionListener(this);
            update.getContentPane().add(submit);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setBounds(170, 200, 90, 20);
            reset.addActionListener(this);
            update.getContentPane().add(reset);
            pic7 = new JLabel();
            pic7.setSize(400, 400);
            ImageIcon image4 = SetImageSize12();
            pic7.setIcon(image4);
            update.add(pic7);
            submit.setOpaque(false);
            submit.setBorderPainted(true);
            submit.setContentAreaFilled(false);
            reset.setOpaque(false);
            reset.setBorderPainted(true);
            reset.setContentAreaFilled(false);
            pic7.add(reset);
            pic7.add(submit);
            pic7.add(combo);
            pic7.add(l5);
            pic7.add(ACCOUNTNUM);
            pic7.add(ACCOUNTNUMT);
            pic7.add(l1);
            pic7.add(l2);
            pic7.add(t1);

        }
        if (e.getSource() == submit) {

            try {

                String val1 = t1.getText();
                String val2 = pass.getText();
                String val3 = (String) combo.getSelectedItem();
                String val4 = ACCOUNTNUMT.getText();
                String sql = "UPDATE account_data set Account_no='" + val4 + "', Name='" + val1 + "',Account_Type='" + val3 + "',Pin='" + val2 + "' where Account_no='" + ACCOUNTNUMT.getText() + "'";
                PreparedStatement pst;
                pst = connect.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Updated");
                update.setVisible(false);
                f2.setVisible(true);


            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E);
            }
        }
        if (e.getSource() == reset) {
            String def = "";
            t1.setText(def);
            t2.setText(def);
            ACCOUNTNUMT.setText(def);
            Type.setSelectedIndex(0);
        }
        if(e.getSource()==Aboutus){
            f2.dispose();
           about=new JFrame("About us");
           about.setVisible(true);
           about.setSize(400,600);
           about.setResizable(false);
           about.setLocationRelativeTo(null);
           about.setLayout(null);
            m=new JLabel();
           m.setSize(400,600);
           ImageIcon image=SetImageSizeA();
           m.setIcon(image);
           about.add(m);

           EX=new JButton("Back");
           EX.setSize(100,32);
           EX.setOpaque(false);
           EX.setLocation(150,540);
           EX.setContentAreaFilled(false);
           EX.setBorderPainted(false);
           EX.addActionListener(this);
           m.add(EX);
        }
        if(e.getSource()==EX){
            about.dispose();
            f2.setVisible(true);
        }
        if (e.getSource() == Ex) {
            f2.dispose();
            f.setVisible(true);
        }
///user end

        // ****ATM****
        if (e.getSource() == Atm) {
            f.dispose();

            try {
                AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM.wav"));
                clip = AudioSystem.getClip();
                clip.open(input);
                clip.start();
            } catch (UnsupportedAudioFileException m) {
                m.printStackTrace();
            } catch (IOException m) {
                m.printStackTrace();
            } catch (LineUnavailableException m) {
                m.printStackTrace();
            }
            ATm = new JFrame("ATM");
            ATm.setSize(400, 400);
            ATm.setVisible(true);
            ATm.setLayout(null);
            ATm.setResizable(false);
            ATm.setLocationRelativeTo(null);
            pic4 = new JLabel();
            pic4.setSize(400, 400);
            ATM = new JButton();
            ATM.setSize(150, 150);
            ATM.setLocation(35, 75);
            Check = new JButton();
            Check.setLocation(215, 75);
            Check.setSize(150, 150);
            Exit=new JButton();
            Exit.setSize(100,32);
            Exit.setLocation(150, 320);
            ImageIcon image=SetImageSize7();
            Exit.setIcon(image);
            Exit.setSize(100, 32);
            Exit.setBorderPainted(true);
            Exit.setOpaque(false);
            Exit.setContentAreaFilled(false);
            Exit.addActionListener(this);


            ImageIcon image5 = SetImageSize13();
            ImageIcon image7 = SetImageSize14();
            ImageIcon image6 = SetImageSize15();
            ATm.add(pic4);
            pic4.setIcon(image5);
            Check.setIcon(image7);
            ATM.setIcon(image6);
            pic4.add(Check);
            pic4.add(ATM);
            pic4.add(Exit);
            ATM.addActionListener(this);
            Check.addActionListener(this);
            Check.addActionListener(this);


        }


        if (e.getSource() == ATM) {
            ATm.dispose();
            clip.stop();

            try {
                AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM1.wav"));
                clip = AudioSystem.getClip();
                clip.open(input);
                clip.start();
            } catch (UnsupportedAudioFileException m) {
                m.printStackTrace();
            } catch (IOException m) {
                m.printStackTrace();
            } catch (LineUnavailableException m) {
                m.printStackTrace();
            }
            atm = new JFrame("ATM Service");

            pic4 = new JLabel();
            pic4.setSize(400, 400);
            ImageIcon image4 = SetImageSize4();
            pic4.setIcon(image4);
            atm.add(pic4);
            atm.setLayout(null);
            atm.setResizable(false);
            atm.setVisible(true);
            atm.setSize(400, 400);
            atm.setLocationRelativeTo(null);
            pin = new JLabel("ENTER THE ACCOUNT NO");
            pin.setSize(220, 32);
            pin.setLocation(90, 100);
            T = new JTextField();
            T.setSize(150, 32);
            T.setLocation(125, 170);
            ent = new JButton("ENTER");
            ent.setSize(100, 32);
            ent.setLocation(150, 250);
            ent.setFont(new Font("Arial", Font.BOLD, 14));
            T.setFont(new Font("Arial", Font.PLAIN, 14));
            pin.setFont(new Font("Elephant", Font.PLAIN, 14));
            pic4.add(ent);
            pic4.add(pin);
            pic4.add(T);
            ent.setOpaque(false);
            ent.setContentAreaFilled(false);
            ent.setBorderPainted(true);
            T.setOpaque(false);
            T.setIgnoreRepaint(true);
            ent.addActionListener(this);


        }

        if (e.getSource() == ent) {



            String Ac = (T.getText().toString());

            try {

                String a = T.getText().toString();
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Account_data");
                while (rs.next()) {
                    Account_no = rs.getString("Account_no");

                    if (a.equals(Account_no)) {

                        clip.stop();
                        pin.setVisible(false);
                        T.setVisible(false);
                        ent.setVisible(false);
                        pin = new JLabel("   Enter The PIN");
                        pin.setSize(150, 32);
                        pin.setLocation(125, 100);
                        T1 = new JTextField();
                        T1.setSize(50, 32);
                        T1.setLocation(175, 170);
                        ent1 = new JButton("ENTER");
                        ent1.setSize(100, 32);
                        ent1.setLocation(150, 250);
                        ent1.setFont(new Font("Arial", Font.BOLD, 14));
                        T1.setFont(new Font("Arial", Font.PLAIN, 14));
                        pin.setFont(new Font("Elephant", Font.PLAIN, 14));
                        pic4.add(ent1);
                        pic4.add(pin);
                        pic4.add(T1);
                        ent1.setOpaque(false);
                        ent1.setContentAreaFilled(false);
                        ent1.setBorderPainted(true);
                        T1.setOpaque(false);
                        T1.setIgnoreRepaint(true);
                        ent1.addActionListener(this);
                        try {
                            AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM2.wav"));
                            clip = AudioSystem.getClip();
                            clip.open(input);
                            clip.start();
                        } catch (UnsupportedAudioFileException m) {
                            m.printStackTrace();
                        } catch (IOException m) {
                            m.printStackTrace();
                        } catch (LineUnavailableException m) {
                            m.printStackTrace();
                        }
                    }
                }


            } catch (SQLException throwables) {
                JOptionPane.showMessageDialog(null, throwables.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                throwables.printStackTrace();
            }
        }


        if (e.getSource() == ent1) {
            try {

                int y = Integer.parseInt(T1.getText());
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Account_data");
                while (rs.next()) {
                    Account_no = rs.getString("Account_no");
                    Account_Holder = rs.getString("Name");
                    Amount = rs.getInt("Amount");
                    Account_type = rs.getString("Account_type");
                    P = rs.getInt("Pin");
                    if (Objects.equals(y, P)) {
                        clip.stop();
                        pin.setVisible(false);
                        T1.setVisible(false);
                        ent1.setVisible(false);
                        pin = new JLabel("ENTER THE AMOUNT");
                        pin.setSize(150, 32);
                        pin.setLocation(125, 100);
                        T2 = new JTextField();
                        T2.setSize(100, 32);
                        T2.setLocation(150, 170);

                        en = new JButton("ENTER");
                        en.setSize(100, 32);
                        en.setLocation(150, 250);
                        en.setFont(new Font("Arial", Font.BOLD, 14));
                        T2.setFont(new Font("Arial", Font.PLAIN, 14));
                        pin.setFont(new Font("Elephant", Font.PLAIN, 14));
                        pic4.add(en);
                        pic4.add(pin);
                        pic4.add(T2);
                        en.setOpaque(false);
                        en.setContentAreaFilled(false);
                        en.setBorderPainted(true);
                        T2.setOpaque(false);
                        T2.setIgnoreRepaint(true);
                        en.addActionListener(this);
                        try {
                            AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM3.wav"));
                            clip = AudioSystem.getClip();
                            clip.open(input);
                            clip.start();
                        } catch (UnsupportedAudioFileException m) {
                            m.printStackTrace();
                        } catch (IOException m) {
                            m.printStackTrace();
                        } catch (LineUnavailableException m) {
                            m.printStackTrace();
                        }
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (e.getSource() == en) {

            int num1, num, numd, numf;
            numd = Integer.parseInt(T2.getText());
            String numb = (T.getText().toString());

            try {

                PreparedStatement stm = connect.prepareStatement("SELECT * FROM Account_data where Account_no=?");
                stm.setString(1, T.getText().toString());


                ResultSet rs = stm.executeQuery();
                if (numd <= 0 && numd <= rs.getInt("Amount")) {
                    JOptionPane.showMessageDialog(null, " NO Amount Withdraw");
                } else {
                    rs.next();
                    num1 = rs.getInt("Amount");
                    num1 = num1 - numd;
                    JOptionPane.showMessageDialog(null, "Amount WITHDRAW Successfully , Amount is " + numd);
                    String ss = "UPDATE Account_data SET Amount=" + num1 + " where Account_no=" + numb + "";
                    Statement stm1 = connect.createStatement();
                    stm1.executeUpdate(ss);
                    stm1.close();
                    atm.dispose();
                    ATm.setVisible(true);

                }
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (e.getSource() == Check) {
            ATm.dispose();
            clip.stop();

            try {
                AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM1.wav"));
                clip = AudioSystem.getClip();
                clip.open(input);
                clip.start();
            } catch (UnsupportedAudioFileException m) {
                m.printStackTrace();
            } catch (IOException m) {
                m.printStackTrace();
            } catch (LineUnavailableException m) {
                m.printStackTrace();
            }
            atm2 = new JFrame("ATM Service");

            pic5 = new JLabel();
            pic5.setSize(400, 400);
            ImageIcon image4 = SetImageSize16();
            pic5.setIcon(image4);
            atm2.add(pic5);
            atm2.setLayout(null);
            atm2.setResizable(false);
            atm2.setVisible(true);
            atm2.setSize(400, 400);
            atm2.setLocationRelativeTo(null);
            pin = new JLabel("ENTER THE ACCOUNT NO");
            pin.setSize(220, 32);
            pin.setLocation(90, 100);
            T3 = new JTextField();
            T3.setSize(150, 32);
            T3.setLocation(125, 170);
            ent4 = new JButton("ENTER");
            ent4.setSize(100, 32);
            ent4.setLocation(150, 250);
            ent4.setFont(new Font("Arial", Font.BOLD, 14));
            T3.setFont(new Font("Arial", Font.PLAIN, 14));
            pin.setFont(new Font("Elephant", Font.PLAIN, 14));
            pic5.add(ent4);
            pic5.add(pin);
            pic5.add(T3);
            ent4.setOpaque(false);
            ent4.setContentAreaFilled(false);
            ent4.setBorderPainted(true);
            T3.setOpaque(false);
            T3.setIgnoreRepaint(true);
            ent4.addActionListener(this);


        }

        if (e.getSource() == ent4) {


            try {

                String a = T3.getText().toString();
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Account_data");
                while (rs.next()) {
                    Account_no = rs.getString("Account_no");


                    if (a.equals(Account_no)) {

                        clip.stop();
                        pin.setVisible(false);
                        T3.setVisible(false);
                        ent4.setVisible(false);
                        pin = new JLabel("   Enter The PIN");
                        pin.setSize(150, 32);
                        pin.setLocation(125, 100);
                        T4 = new JTextField();
                        T4.setSize(50, 32);
                        T4.setLocation(175, 170);
                        ent5 = new JButton("ENTER");
                        ent5.setSize(100, 32);
                        ent5.setLocation(150, 250);
                        ent5.setFont(new Font("Arial", Font.BOLD, 14));
                        T4.setFont(new Font("Arial", Font.PLAIN, 14));
                        pin.setFont(new Font("Elephant", Font.PLAIN, 14));
                        pic5.add(ent5);
                        pic5.add(pin);
                        pic5.add(T4);
                        ent5.setOpaque(false);
                        ent5.setContentAreaFilled(false);
                        ent5.setBorderPainted(true);
                        T4.setOpaque(false);
                        T4.setIgnoreRepaint(true);
                        ent5.addActionListener(this);
                        try {
                            AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM2.wav"));
                            clip = AudioSystem.getClip();
                            clip.open(input);
                            clip.start();
                        } catch (UnsupportedAudioFileException m) {
                            m.printStackTrace();
                        } catch (IOException m) {
                            m.printStackTrace();
                        } catch (LineUnavailableException m) {
                            m.printStackTrace();
                        }
                    }
                }


            } catch (SQLException throwables) {
                JOptionPane.showMessageDialog(null, throwables.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                throwables.printStackTrace();
            }
        }


        if (e.getSource() == ent5) {
            try {

                int y = Integer.parseInt(T4.getText());
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Account_data");
                while (rs.next()) {
                    P = rs.getInt("Pin");
                    int value= rs.getInt("Amount");
                    if (Objects.equals(y, P)) {

                        clip.stop();
                        pin.setVisible(false);
                        T4.setVisible(false);
                        ent5.setVisible(false);
                        pin = new JLabel("YOUR AMOUNT");
                        pin.setSize(150, 32);
                        pin.setLocation(125, 100);

                        T5 = new JTextField();
                        T5.setSize(100, 32);
                        T5.setLocation(150, 170);
                        T5.setText(String.valueOf(value));

                        ent6 = new JButton("OK");
                        ent6.setSize(100, 32);
                        ent6.setLocation(150, 250);

                        ent6.setFont(new Font("Arial", Font.BOLD, 14));
                        T5.setFont(new Font("Arial", Font.PLAIN, 14));
                        pin.setFont(new Font("Elephant", Font.PLAIN, 14));
                        pic5.add(ent6);
                        pic5.add(pin);
                        pic5.add(T5);
                        ent6.setOpaque(false);
                        ent6.setContentAreaFilled(false);
                        ent6.setBorderPainted(true);
                        T5.setOpaque(false);
                        T5.setIgnoreRepaint(true);
                        ent6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                atm2.dispose();
                                ATm.setVisible(true);



                            }


                        });

                        try {
                            AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM5.wav"));
                            clip = AudioSystem.getClip();
                            clip.open(input);
                            clip.start();
                        } catch (UnsupportedAudioFileException m) {
                            m.printStackTrace();
                        } catch (IOException m) {
                            m.printStackTrace();
                        } catch (LineUnavailableException m) {
                            m.printStackTrace();
                        }

                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        if(e.getSource()==Exit){
            ATm.dispose();
            exit=new JFrame("thank you");
            exit.setVisible(true);
            exit.setLocationRelativeTo(null);
            exit.setSize(400,400);
            exit.setResizable(false);
            tk= new JLabel();
            tk.setSize(400,400);
            ImageIcon image=SetImageSize5();
            tk.setIcon(image);
            exit.add(tk);
            ex=new JButton("exit");
            ex.setSize(100,32);
            ex.setLocation(150,330);
            tk.add(ex);
            ex.addActionListener(this);



            try {
                AudioInputStream input = AudioSystem.getAudioInputStream(new File("C:\\Users\\Sakhi Computer\\Downloads\\ATM4.wav"));
                clip = AudioSystem.getClip();
                clip.open(input);
                clip.start();
            } catch (UnsupportedAudioFileException m) {
                m.printStackTrace();
            } catch (IOException m) {
                m.printStackTrace();
            } catch (LineUnavailableException m) {
                m.printStackTrace();
            }

        }
        if(e.getSource()==ex){
            exit.dispose();
            f.setVisible(true);

        }
      if(e.getSource()==Ext){
          f.dispose();

      }

    }}
       