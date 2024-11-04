package src.com.company.model;

import com.company.server.shop.print.PrintShopInterface;

public class Shop extends House{
    private String[] departments;
    private PrintShopInterface print;


    public Shop(String adress, String[] departments) {
        super(adress);
        this.departments = departments;
    }

    public Shop(String adress, String[] departments, PrintShopInterface print) {
        this(adress, departments);
        this.print = print;
    }

    @Override
    public void print() {
        print.printShop(this);
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public PrintShopInterface getPrint() {
        return print;
    }

    public void setPrint(PrintShopInterface print) {
        this.print = print;
    }
}
