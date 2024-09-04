// OOPS concepts  --04 Sept 2024
class EMP_Table{
    String emp_fname;
    String emp_lname;
    int emp_salary;
    public void printinfo(){
        System.out.println(this.emp_fname+" "+this.emp_lname+" "+this.emp_salary);
    }
}
public class tabish {
    public static void main(String[] args) {
        EMP_Table e1 = new EMP_Table();
        EMP_Table e2 = new EMP_Table();
        e1.emp_fname = "Tabish";
        e1.emp_lname = "Ansari";
        e1.emp_salary = 50000;

        e2.emp_fname = "Fatima";
        e2.emp_lname = "Momin";
        e2.emp_salary = 40000;

        e1.printinfo();
        e2.printinfo();
    }
}
