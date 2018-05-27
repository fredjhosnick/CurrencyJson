public class Main {
    public static void main(String[] args) {
        WorWithJSON.ToJSON(WorWithJSON.fromJSON
                (WorWithJSON.read("https://api.privatbank.ua/p24api/pubinfo?json")));


    }
}
