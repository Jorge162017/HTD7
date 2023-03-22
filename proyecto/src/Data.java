public class Data {
    private String word;
    private String english;
    private String spanish;
    private String french;


    public Data(String word, String english, String spanish, String french) {
        super();
        this.word = word;
        this.english = english;
        this.french = french;
        this.spanish = spanish;
    }

    /**
     * @return the palabra
     */
    public String getWord() {
        return word;
    }



    /**
     * @param word the palabra to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the ingles
     */
    public String getEnglish() {
        return english;
    }

    /**
     * @param english the ingles to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * @return the frances
     */
    public String getFrench() {
        return french;
    }

    /**
     * @param french the frances to set
     */
    public void setFrench(String french) {
        this.french = french;
    }

    /**
     * @return the esp
     */
    public String getSpanish() {
        return spanish;
    }

    /**
     * @param spanish the esp to set
     */
    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

}
