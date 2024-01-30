package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        switch (character) {
            case 'o':
                System.out.println("Vowel");
                break;
            case 'B':
                System.out.println("Consonant");
                break;
            default:
                System.out.println("wrong alphabet!");
                break;
        }
    }
}
