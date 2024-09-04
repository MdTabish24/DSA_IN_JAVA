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

//Constructors
// 1) Non Parameterized Constructor
// EMP_Table() is a Constructor this are called in class EMP_Table. Java build this constructor automatically if we didnt create it.
class nonparaconstructor{
    String name;
    int id;
    public void print(){
        System.out.println(this.name+" "+this.id);
    }

    nonparaconstructor() {
        System.out.println("This will get printed after creating an object in main function. This is Non Parameterized constructor");
    }
}
public class tabish {
    public static void main(String[] args) {
        nonparaconstructor student1 = new nonparaconstructor(), student2 = new nonparaconstructor();
        student1.name="TabishAnsari";
        student1.id=4619606;
        student2.name="Fatima";
        student2.id=4496998;
        
        student1.print();
        student2.print();
    }
}

//2) Parameterized constructor
class paraconstructor{
    String name;
    int id;
    public void print(){
        System.out.println(this.name+" "+this.id);
    }

    paraconstructor(String name,int id) {
        this.name = name;
        this.id = id;
    }
}
public class tabish {
    public static void main(String[] args) {
        paraconstructor student1 = new paraconstructor("Tabish",04);
        student1.print();
    }
}
