package src.com.company.model;

public abstract class House implements HouseInterface {
    protected String adress;

    public House(String adress) {
        this.adress = adress;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
