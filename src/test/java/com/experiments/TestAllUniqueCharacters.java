package com.experiments;

import org.junit.Test;

public class TestAllUniqueCharacters {

    @Test
    public void testUnique(){
        String s = "abcdefghijklmnopqrstuvwxyz";
        try {
            assert(AllUniqueCharacters.isAllCharactersUnique(s) == true);
        }
        catch(Exception e){
            assert(false);
        }
    }

    @Test
    public void nonUnique(){
        String s = "abcdefghijklmanopqrstuvwxyz";
        try {
            assert(AllUniqueCharacters.isAllCharactersUnique(s) == false);
        }
        catch(Exception e){
            assert(false);
        }
    }

    @Test
    public void emptyString(){
        String s = "";
        try {
            AllUniqueCharacters.isAllCharactersUnique(s);
        }
        catch(Exception e){
            assert(true);
            assert(e.getMessage().equals("invalid param"));
            return;
        }
        assert(false);
    }

    @Test
    public void nullString(){
        String s = null;
        try {
            AllUniqueCharacters.isAllCharactersUnique(s);
        }
        catch(Exception e){
            assert(true);
            assert(e.getMessage().equals("invalid param"));
            return;
        }
        assert(false);
    }
}

