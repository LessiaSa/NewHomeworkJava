//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int eaters = 5;
        int water = 3000;
        int potatoes = 5;
        int chicken = 6;
        int spices = 10;

        System.out.println("Сварили суп.На одного человека вышло:");
        System.out.println((water / eaters) + "миллилитров воды");
        System.out.println((potatoes / eaters) + "картофелин(а/ы)");
        System.out.println((chicken / eaters) + "куриных(о/е) бёдер(ро)");
        System.out.println ((spices / eaters) + "ложек(ки/ка) специй");
    }
}