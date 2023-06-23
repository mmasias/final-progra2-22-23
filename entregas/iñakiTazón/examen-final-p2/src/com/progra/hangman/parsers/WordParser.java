package com.progra.hangman.parsers;

public class WordParser implements Parser{
    String regex; 
    final int ELEMENT_COUNT = 3; 

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {
		
    	String[] values = tokens.split(regex);
        int id = Integer.parseInt(values[0]);
        String word = values[1];
        if(values[2].equals("CORTA")==true) {
        	return (new ShortWord(id,word));
        }else if(values[2].equals("MEDIANA")==true) {
        	return (new MediumWord(id,word));
        }else if(values[2].equals("LARGA")==true) {
        	return (new LargeWord(id,word));
        }
      
    	return null;
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
}
