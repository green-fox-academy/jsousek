public class Anagram {



    public String inputA;
    public String inputB;

    public Anagram(String inputA, String inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
    }
    public Anagram(){
        this.inputA = inputA;
        this.inputB = inputB;
    }

    public Anagram anaWithoutBlanks (Anagram anaWithSpaces){
        Anagram cleanAnag = new Anagram();
        cleanAnag.inputA = anaWithSpaces.inputA.replaceAll("\\s", "").replaceAll("\\s+", "").toLowerCase();
        cleanAnag.inputB = anaWithSpaces.inputB.replaceAll("\\s", "").replaceAll("\\s+", "").toLowerCase();
        return cleanAnag;
    }

    public boolean lenghtEquals (Anagram someAna){
        if (someAna.inputA.length() != someAna.inputB.length()){
            return false;
        }


    }
}
