class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setId(24);
        emp.setName("Anshu");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
