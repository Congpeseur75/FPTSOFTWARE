package fa.training.entities;

public class MyManagerSale {
    public static void main(String[] args) {
        Sale sale = new Sale("Huy", 20,"Huế",25000.0,230);
        Sale sale1 = new Sale("Đạt", 20,"Huế",23000.0,230);
        Sale sale2 = new Sale("Quý", 20,"Huế",24000.0,230);

        System.out.println("thông tin của tất cả sale: ");
        sale.printInfo();
        sale1.printInfo();
        sale2.printInfo();

        System.out.println("tiền thưởng của tất cả sale là: ");
        sale.getBonus();
        sale1.getBonus();
        sale2.getBonus();

    }
}
