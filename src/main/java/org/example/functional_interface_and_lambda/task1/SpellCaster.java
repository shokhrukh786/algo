package org.example.functional_interface_and_lambda.task1;

public class SpellCaster {
    public void cast(String spellName, SpellAction spellAction){
        System.out.println(spellName + " " + spellAction.castSpell(spellName));
    }
}

class SpellCasterTest{
    public static void main(String[] args) {
        SpellCaster spellCaster = new SpellCaster();
        String alohomora = "Alohomora";
        String lumos = "Lumos";
        String expelliarmus = "Expelliarmus";

        spellCaster.cast(alohomora, (spellName) -> "The door is unlocked by " + spellName);
        spellCaster.cast(lumos, (spellName) -> "The opponent is disarmed by " + spellName);
    }
}