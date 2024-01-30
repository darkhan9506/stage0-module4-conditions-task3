package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
//        char[] engLayout = {'r', 'R', 'a', 'A'};
//
//        for (char c : engLayout) {
//            if (symbol == c) {
//                System.out.println("English");
//            }
//        }

        if (symbol == 'r' || symbol == 'R') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
