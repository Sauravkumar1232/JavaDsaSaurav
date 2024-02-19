class Employee{
   
       int empId;
       String name;
       Double salary;
       String department;
    
       public void takeInput(int empId,String name,double salary,String department){
        this.name=name;
        this.department=department;
        this.empId=empId;
        this.salary=salary;   //thos referece to curent object
       }
       public void showEmp(){
        System.out.println("Id: "+ this.empId);
        System.out.println("NAme: "+ this.name);
        System.out.println("Salary: "+ this.salary);
        System.out.println("Dep: "+ this.department);

       }

    public static void main(String[] args) {
        Employee ram = new Employee();
        ram.takeInput(101,"Ram",45000,"IT");
        ram.showEmp();
        Employee sham = new Employee();
        sham.takeInput(102, "Saam", 50000, "IT");
sham.showEmp();
}
}