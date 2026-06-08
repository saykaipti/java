public class LaptopTester {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        System.out.println("1************");
        l1.printInfo();
        System.out.println("2************");
        Laptop l2 = new Laptop(123456, "Asus", 2);
        System.out.println("3************");
        l2.printInfo();
        System.out.println("4************");
        l2.addFeature("8GB RAM");
        l2.addFeature("1TB Storage");
        System.out.println("5************");
        l2.printInfo();
        System.out.println("6************");
        l2.addFeature("WiFi 6");
        System.out.println("7************");
        Laptop l3 = new Laptop(789012, "Dell", 4);
        System.out.println("8************");
        l3.addFeature("16GB RAM");
        System.out.println("9************");
        l3.printInfo();
        System.out.println("10************");
        l3.addFeature(new String[]{"512GB SSD", "4K Display", "Bluetooth 5.0", "AI"});
        System.out.println("11************");
        l3.printInfo();
    }
}

