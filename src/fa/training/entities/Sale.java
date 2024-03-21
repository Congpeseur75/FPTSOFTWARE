package fa.training.entities;
import java.util.Scanner;
public class Sale {
    private String Name;
    private int age;
    private String address;
    private double salary;
    private int  sumTimeWork;
    private static int saleCount = 0;
    public Sale(){

    }
    public Sale(String name, int age, String address, double salary, int sumTimeWork) {
        Name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.sumTimeWork = sumTimeWork;
        saleCount ++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSumTimeWork() {
        return sumTimeWork;
    }

    public void setSumTimeWork(int sumTimeWork) {
        this.sumTimeWork = sumTimeWork;
    }

    public static int getSaleCount() {
        return saleCount;
    }

    public static void setSaleCount(int saleCount) {
        Sale.saleCount = saleCount;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin cho nhân viên: ");
        System.out.println("nhập tên nhân viên: ");
        this.Name = sc.nextLine();
        System.out.println("nhập tuổi nhân viên: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập địa chỉ nhân viên: ");
        this.address = sc.nextLine();
        System.out.println("nhập lương nhân viên: ");
        this.salary = Double.parseDouble(sc.nextLine());
        System.out.println("nhập tổng thời gian làm của nhân viên: ");
        this.sumTimeWork = Integer.parseInt(sc.nextLine());
        saleCount++;
    }
    public void  printInfo(){
        System.out.println("thông tin nhân viên");
        System.out.print("tên nhân viên là: " + Name);
        System.out.print(" tuổi nhân viên là: " + age);
        System.out.print(" địa chỉ nhân viên là: " + address);
        System.out.print(" lương nhân viên là: " + salary);
        System.out.println(" tổng số giờ làm là: " + sumTimeWork);
    }
    public double  getBonus(){
        if(this.sumTimeWork >= 200){
            return this.salary * 0.2;
        }
        else if (this.sumTimeWork >= 100){
            return this.salary * 0.1;
        }
        else {
            return 0;
        }
    }
}
