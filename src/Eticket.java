public class Eticket {

    private String genre;          //Είδος εισιτηρίου
    private String type;               //Τύπος εισιτηρίου
    private String duration;           //Διάρκεια εισιτηρίου
    private String quantityDestinations;           //Πλήθος διαδρομών
    private double  price;              //Τιμή εισιτηρίου


    //An einai meiomeno h miniaio tote theleis kai onomateponima kodiko kai hmeromhnia liksis

    private String name;            //Ονοματεπώνυμο κατόχου
    private String code;            //Κωδικός εισιτηρίου
    private String expireDate;      //ημορομηνία λήξης

    //CONSTRUCTORRRR??/

    public Eticket(){

    }


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

    public String getQuantityDestinations() {
        return quantityDestinations;
    }

    public void setQuantityDestinations(String quantityDestinations) {
        this.quantityDestinations = quantityDestinations;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
