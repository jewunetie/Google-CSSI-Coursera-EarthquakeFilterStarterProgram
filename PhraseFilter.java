import java.util.*;

/**
 * Write a description of PhaseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {
    private String where;
    private String phrase;
    public PhraseFilter(String stringLoc, String stringPhrase){
        where = stringLoc;
        phrase = stringPhrase;
    }
    
    public boolean satisfies(QuakeEntry qe){
        if(where.equals("start")){
            return qe.getInfo().startsWith(phrase);
        } else if (where.equals("end")){
            return qe.getInfo().endsWith(phrase);
        } else if (where.equals("any")){
            return qe.getInfo().contains(phrase);
        } else {
            return false;
        }
    }
    
    public String getName(){
        return "Phrase ";
    }

}
