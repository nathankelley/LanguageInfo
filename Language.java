import java.util.ArrayList;

class Language{

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: "+ this.wordOrder + ".");
  }

  public static void main(String[] args){
    // languages class declarations
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    Language ixil = new Mayan("Ixil", 83600);
    Language sino = new SinoTibetan("Mandarin Chinese", 500000000);
    Language sinoNotChinese = new SinoTibetan("Burmese", 10000000);
    
    // loop through list of Language objects, print using getInfo
    ArrayList<Language> languages = new ArrayList<Language>();
    languages.add(spanish);
    languages.add(ixil);
    languages.add(sino);
    languages.add(sinoNotChinese);

    for (Language lang : languages){
      lang.getInfo();
      System.out.println();
    }
  }
}
