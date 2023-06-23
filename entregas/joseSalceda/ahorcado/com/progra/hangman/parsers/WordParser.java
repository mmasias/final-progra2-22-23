package entregas.joseSalceda.ahorcado.com.progra.hangman.parsers;

import entregas.joseSalceda.ahorcado.com.progra.hangman.base.LargeWord;
import entregas.joseSalceda.ahorcado.com.progra.hangman.base.MediumWord;
import entregas.joseSalceda.ahorcado.com.progra.hangman.base.ShortWord;
import entregas.joseSalceda.ahorcado.com.progra.hangman.base.Word;
import entregas.joseSalceda.ahorcado.com.progra.hangman.exceptions.InvalidIdException;
import entregas.joseSalceda.ahorcado.com.progra.hangman.exceptions.InvalidWordException;

public class WordParser implements Parser {


    String regex; 
    final int ELEMENT_COUNT = 3; 

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {

        if(!validCommas(tokens)) throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");
        String[] allTokens = tokens.split(",");
        int id = Integer.parseInt(allTokens[0]);
        String word = allTokens[1];
        String type = allTokens[2];

        if(type.equals("LARGA")) return new LargeWord(id, word);
        else if(type.equals("MEDIANA")) return new MediumWord(id, word);
        else return new ShortWord(id, word);



    }

    private boolean validCommas(String tokens) {
        int counter = 0;
        for(int i = 0; i < tokens.length(); i++){
            if(tokens.charAt(i) == ',') counter++;
        }
        if(counter == 2) return true;
        else return false;
    }

    private int idValidator(String id) throws InvalidIdException {
        int idInt;

        try{
            idInt = Integer.parseInt(id);
        }catch(Exception e){
            throw new InvalidIdException(e.getMessage());
        }

        return idInt;
    }

    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}
