package ocp;

public class Character {
    private CharacterClass characterClass;

    public Character(String nomeClass) {
        Class aClass = null;
        Object aObject = null;
        try {
            aClass = Class.forName("ocp." + nomeClass);
            aObject = aClass.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            this.characterClass = null;
        }
        if (!(aObject instanceof CharacterClass)) {
            this.characterClass = null;
        }
        this.characterClass = (CharacterClass) aObject;
    }

    public void attack(){
        this.characterClass.attack();
    }
}
