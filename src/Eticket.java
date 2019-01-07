public class Eticket {

    private String genre;          //Είδος εισιτηρίου
    private String type;               //Τύπος εισιτηρίου
    private String duration;           //Διάρκεια εισιτηρίου
    private byte quantityDestinations;           //Ποσότητα εισιτηρίου
    private float price;              //Τιμή εισιτηρίου


    //An einai meiomeno h miniaio tote theleis kai onomateponima kodiko kai hmeromhnia liksis

    private String name;            //Ονοματεπώνυμο κατόχου
    private String code;            //Κωδικός εισιτηρίου
    private String expireDate;      //ημορομηνία λήξης

    //CONSTRUCTORRRR??/


    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType(){
        return type;
    }

    public void  setType(String type){
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }

    public byte getQuantityDestinations() {
        return quantityDestinations;
    }

    public void setQuantityDestinations(byte quantityDestinations) {
        this.quantityDestinations = quantityDestinations;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate){
        this.expireDate = expireDate;
    }
}
