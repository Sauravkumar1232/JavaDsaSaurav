import javax.sql.rowset.spi.SyncResolver;

class Parent {
int sal=500;
void printSal(){
      System.out.println(sal);
}
}

class child extends Parent {
    void printBon(){
        System.out.println("500");
    }

}

public class Single {
    public static void main(String[] args) {
        child c = new child();  // object child class 
        Parent p = new Parent();
        p.printBon();
        p.printSal();
    }

}
