public class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  Language(String langName, int langSpeakers, String langRegions, String langOrders){
    this.name = langName;
    this.numSpeakers = langSpeakers;
    this.regionsSpoken = langRegions;
    this.wordOrder = langOrders;
  }

  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args) {
    Language newLang = new Language("Glorpian", 90000, "Glorpland", "subject-verb-object");
    newLang.getInfo();

    Mayan kiche = new Mayan("Ki'che'", 1000000);
    kiche.getInfo();

    SinoTibetan chinese = new SinoTibetan("Chinese Mandarin", 9999999);
    SinoTibetan nonchinese = new SinoTibetan("Burmese", 1000000);
    chinese.getInfo();
    nonchinese.getInfo();
  }
}