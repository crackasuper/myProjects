import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Manage extends JFrame implements ActionListener {
    static JButton add,displaye,search,update,delete,sort;
    public String user = "root";
    public String password = "me@sd";
    Manage() {
        add = new JButton("1.ADD");
        JLabel lbl1 = new JLabel("wel come to student management system menu".toUpperCase());
        displaye = new JButton("2.Displaye".toUpperCase());
         search = new JButton("3.SEARCH");
         update = new JButton("4.UPDATE");
         delete = new JButton("5.DELETE");
         sort = new JButton("6. SORT");
        JButton Exit = new JButton("Exit");
        JFrame frame = new JFrame("Student management system".toUpperCase());


        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);


        lbl1.setBounds(60, 30, 320, 25);
        add.setBounds(20, 70, 220, 25);
        displaye.setBounds(20, 110, 220, 25);
        search.setBounds(20, 150, 220, 25);
        update.setBounds(270, 70, 220, 25);
        delete.setBounds(270, 110, 220, 25);
        sort.setBounds(270, 150, 220, 25);
        Exit.setBounds(100, 280, 130, 20);

        //adding labels to content pane

        frame.getContentPane().add(lbl1);
        frame.getContentPane().add(add);
        frame.getContentPane().add(displaye);
        frame.getContentPane().add(search);
        frame.getContentPane().add(update);
        frame.getContentPane().add(delete);
        frame.getContentPane().add(Exit);
        frame.getContentPane().add(sort);


        Exit.addActionListener((sd) -> {
            JOptionPane.showMessageDialog(null,"THANK YOU");
            System.exit(0);
        });


    }

    public static void main(String[] args) {
        List<Student> list = null;
        String user = "root";
        String password = "me@sd";

        //new add().setVisible(true);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student_data");
            ResultSet resultSet2 = statement.executeQuery("select * from courses");
            while(resultSet.next()){
                System.out.println("Fname"+resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       // new Manage().setVisible(true);
       /* add.addActionListener((ae)->{
            //new addStudent().setVisible(true);

        });
       displaye.addActionListener((sd)->{
            try {
                new displayInformation().setVisible(true);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });*/

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class addStudent extends Manage {
    JButton submit;
    JButton clear;
    JButton exit;

    public addStudent() {
        // try {


        //  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc_project", user, password);
        ;
        // Statement stmt;
        /*
        System.out.print("Please enter the student number to be added:");
        int number = s.nextInt();
        System.out.print("Please enter the name you want to add:");
        String name = s.next();
        System.out.print("Please enter the grade you want to add:");
        int grade = s.nextInt();


         */
        //  }catch (SQLException e){
        //    JOptionPane.showMessageDialog(null,"connection denied");
        //   }
        AtomicReference<JLabel> Fname = new AtomicReference<>(new JLabel("Fname"));
        JLabel Lname = new JLabel("Lname");
        JLabel Address = new JLabel("Address");
        JLabel sid = new JLabel("ID");
        JLabel email = new JLabel("email");
        JLabel departement = new JLabel("departement");
        JLabel sex = new JLabel("sex");
        JLabel dormitory = new JLabel("dormitory");
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        exit = new JButton("Exit");

        String sql = "insert into student_data values(?,?,?,?,?,?,?,?)";

        JTextField txtfname = new JTextField();
        JTextField txtlname = new JTextField();
        JTextField txtaddress = new JTextField();
        JTextField txtid = new JTextField();
        JTextField txtemail = new JTextField();
        JTextField txtdep = new JTextField();
        JTextField txtsex = new JTextField();
        JTextField txtdorm = new JTextField();

        JFrame data = new JFrame("add student in to data base".toUpperCase());
        data.setLayout(null);
        data.setVisible(true);
        data.setDefaultCloseOperation(EXIT_ON_CLOSE);
        data.setSize(300, 200);

        Fname.get().setBounds(50, 40, 140, 25);
        Lname.setBounds(50, 80, 140, 25);
        Address.setBounds(50, 120, 140, 25);
        sid.setBounds(50, 160, 140, 25);
        email.setBounds(50, 200, 140, 25);
        departement.setBounds(50, 240, 140, 25);
        sex.setBounds(50, 280, 140, 25);
        dormitory.setBounds(50, 320, 140, 25);
        submit.setBounds(50, 360, 140, 25);
        clear.setBounds(200, 360, 140, 25);
        exit.setBounds(350, 360, 140, 25);

        txtfname.setBounds(150, 40, 130, 25);
        txtlname.setBounds(150, 80, 130, 25);
        txtaddress.setBounds(150, 120, 130, 25);
        txtid.setBounds(150, 160, 130, 25);
        txtemail.setBounds(150, 200, 130, 25);
        txtdep.setBounds(150, 240, 130, 25);
        txtsex.setBounds(150, 280, 130, 25);
        txtdorm.setBounds(150, 320, 130, 25);

        data.getContentPane().add(Fname.get());
        data.getContentPane().add(Lname);
        data.getContentPane().add(Address);
        data.getContentPane().add(sid);
        data.getContentPane().add(email);
        data.getContentPane().add(departement);
        data.getContentPane().add(sex);
        data.getContentPane().add(dormitory);

        data.getContentPane().add(txtfname);
        data.getContentPane().add(txtlname);
        data.getContentPane().add(txtaddress);
        data.getContentPane().add(txtemail);
        data.getContentPane().add(txtdep);
        data.getContentPane().add(txtsex);
        data.getContentPane().add(txtdorm);
        data.getContentPane().add(txtid);
        data.getContentPane().add(sex);
        data.getContentPane().add(clear);
        data.getContentPane().add(exit);
        data.getContentPane().add(submit);
        exit.addActionListener((ar) -> {
            System.exit(0);
        });
        submit.addActionListener((ae)->{
           int id = Integer.parseInt(txtid.getText());
           String fname = txtfname.getText();
           String lname = txtlname.getText();
           String address = txtaddress.getText();
           String Email = txtemail.getText();
           String Departement = txtdep.getText();
           String gender = txtsex.getText();
           int dorm = Integer.parseInt(txtdorm.getText());

        });
        clear.addActionListener((ae)->{
            txtfname.setText("");
            txtaddress.setText("");
            txtdep.setText("");
            txtlname.setText("");
            txtemail.setText("");
            txtdorm.setText("");
            txtid.setText("");
            txtsex.setText("");
        });


        //Since number is the primary key, there is no need to check the duplicate
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", user, password);
            try {
                //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc_project", user, password);
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(txtid.getText()));
                pstmt.setString(2, txtfname.getText());
                pstmt.setString(3, txtlname.getText());
                pstmt.setString(4, txtaddress.getText());
                pstmt.setString(5, txtemail.getText());
                pstmt.setString(6, txtdep.getText());
                pstmt.setString(7, txtsex.getText());
                pstmt.setInt(8, Integer.parseInt(txtdorm.getText()));
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    //Cannot use executeQuery() method
                    JOptionPane.showMessageDialog(null, "Added successfully");
                }
                pstmt.close();
            } catch (SQLException throwables) {
                //throwables.printStackTrace();
                JOptionPane.showMessageDialog(null, "Insertion error, please check whether the student id is the same");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        public static void main(String[] args) {
        new Manage().setVisible(true);
        add.addActionListener((ae)->{
            new addStudent().setVisible(true);
        });
        displaye.addActionListener((ac)->{
            new displayInformation().setVisible(true);
        });
    }
}
class displayInformation extends Manage{

        public displayInformation() {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", user, password);
                List<Student> list;
                Statement stmt;
                ResultSet res;
                String sql = "select * from student_data";
                stmt = connection.createStatement();
                res = stmt.executeQuery(sql);
                //Create a List collection to encapsulate the Student object
                list = new ArrayList<Student>();
                Student student = null;
                JFrame frame = new JFrame("student information display");
                frame.setSize(300, 200);
                frame.setLayout(new FlowLayout());
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setVisible(true);
                int id = 0;
                while (res.next()) {
                   // id = res.getInt("ID");
                    String Lname = res.getString("Lname");
                    String Fname = res.getString("Fname");
                    String Address = res.getString("Address");
                    String sid = res.getString("id");
                    String email = res.getString("email");
                    String departement = res.getString("departement");
                    String sex = res.getString("sex");
                    int dormitory = res.getInt("dormitory");

                    student = new Student();
                    student.setFname(Fname);
                    student.setLname(Lname);
                    student.setAddress(Address);
                    student.setAddress(Address);
                    student.setSid(student.sid);
                    student.setEmail(email);
                    student.setDepartement(departement);
                    student.setSex(sex);
                    student.setDormitory(dormitory);

                    list.add(student);
                }
                JLabel label1 = new JLabel("sfdghgjhkjshdjhkfj");
                JLabel label2 = null;
                JLabel label3 = null;
                JLabel label4 = null;
                JLabel label5 = null;
                JLabel label6 = null;
                JLabel label7 = null;
                JLabel label8 = null;
                JLabel label9 = null;
                if (list != null) {
                    for (Student s : list) {
                        label1 = new JLabel("Student first name :" + s.getFname());
                        label2 = new JLabel(" last name:" + s.getLname());
                        label3 = new JLabel(" address :" + s.getAddress());
                        label4 = new JLabel("id_number : " + s.getSid());
                        label5 = new JLabel("email : " + s.getEmail());
                        label6 = new JLabel("departement : " + s.getDepartement());
                        label7 = new JLabel("sex : " + s.getSex());
                        label8 = new JLabel("dormitory : " + s.getDormitory());
                    }
                }
               // label9 = new JLabel("database was empty");
                frame.getContentPane().add(label1);
                frame.getContentPane().add(label2);
                frame.getContentPane().add(label3);
                frame.getContentPane().add(label4);
                frame.getContentPane().add(label5);
                frame.getContentPane().add(label6);
                frame.getContentPane().add(label7);
                frame.getContentPane().add(label8);
               // frame.getContentPane().add(label9);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
class sortStudent extends Manage{


}

