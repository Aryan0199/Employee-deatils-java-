package cls;

public class Classes {
    public static class Employee{
        String name;
        int year;
        String address;

    }
    public static void main(String[] args){
        Employee obj1=new Employee(); //Creating object(obj1) for storing Employee-1 details
        obj1.name="Robert";
        obj1.year=1994;
        obj1.address="64C-WallsStreet";
        Employee obj2=new Employee();  //Creating object(obj2) for storing Employee-2 details
        obj2.name="Sam";
        obj2.year=2000;
        obj2.address="68D-WallsStreet";
        Employee obj3=new Employee();  //Creating object(obj3) for storing Employee-3 details
        obj3.name="John";
        obj3.year=1999;
        obj3.address="26B-WallsStreet";
        System.out.println("Name\t\t"+"Year of joining\t\t"+"Address");
        System.out.println(obj1.name+"\t\t"+obj1.year+"\t\t\t\t"+obj1.address);
        System.out.println(obj2.name+"\t\t\t"+obj2.year+"\t\t\t\t"+obj2.address);
        System.out.println(obj3.name+"\t\t"+obj3.year+"\t\t\t\t"+obj3.address);
    }
}
