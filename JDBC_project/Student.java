public class Student {
    public String Fname,Lname,Address,email,departement,sex;
    public int sid;
    public int dormitory;
    public Student(){}
    public Student(String fname,String lname,String address, int id, String email,String dep,String sex,int dorm){
        this.Fname = fname;
        this.Lname = lname;
        this.Address = address;
        this.sid = id;
        this.email = email;
        this.departement = dep;
        this.dormitory = dorm;
        this.sex = sex;


    }

    public String getAddress() {
        return Address;
    }

    public int getDormitory() {
        return dormitory;
    }

    public String getDepartement() {
        return departement;
    }

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getSex() {
        return sex;
    }

    public int getSid() {
        return sid;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setDormitory(int dormitory) {
        this.dormitory = dormitory;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

}
