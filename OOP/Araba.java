public class Araba {

    private String model;
    private String renk;
    private int yil;

    public Araba(String model, String renk, int yil) {
        this.model = model;
        this.renk = renk;
        this.yil = yil;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }


    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
            this.yil = yil;

    }

    void yazdir (){
        System.out.println("Model: "+model);
        System.out.println("Renk: "+renk);
        System.out.println("Üretim yılı: "+yil);
    }





}

