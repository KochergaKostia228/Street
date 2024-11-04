package src.com.company.server.shop.print;

import src.com.company.model.Shop;

public class PrintShop implements PrintShopInterface{
    @Override
    public void printShop(Shop shop) {
        System.out.println("--------------------Shop-------------------------");
        System.out.println("Adress: " + shop.getAdress());
        System.out.print("Works: [ ");
        for(int i = 0; i < shop.getDepartments().length; i++){
            System.out.print(shop.getDepartments()[i]);
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
