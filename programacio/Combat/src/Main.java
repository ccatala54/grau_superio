import java.util.Scanner;

public class Main {
    enum TStrategy{
        ATAC, DEFENSA, ENGANY, MANIOBRA
    }

    public static void fight(Warrior player, Warrior computer) {
        TStrategy strategy1 = askStrategy(player);
        TStrategy strategy2 = chooseRandomStratrgy();
        int grauDexit1 = calculaGrauExit (player, strategy1);
        int grauDexit2 = calculaGrauExit (computer, strategy2);

        if (strategy1 == TStrategy.ATAC && strategy2 == TStrategy.ATAC){
            player.damage(grauDexit2);
            computer.damage(grauDexit1);
        }
    }

    private static int calculaGrauExit (Warrior warrior, TStrategy strategy){
        if ((strategy == TStrategy.ATAC) || (strategy == TStrategy.ENGANY)){
        int attack = warrior.attack;
        return (int) (Math.random()*attack);
        }
        int defense = warrior.defense;
        return (int) (Math.random()*defense);
    }


    private static TStrategy chooseRandomStratrgy{

    }



    public static void main(String[] args) {
        Warrior player = askUser();
        Warrior computer = randomWarrior();

        System.out.println(player.toString());
        System.out.println(computer.toString());

        fight (player, computer);
        TStrategy strategy1 = askStrategy(player);

    }

    private static TStrategy askStrategy(Warrior player) {
        System.out.printf("%s, Choose strategy ATAC, DEFENSA, ENGANY, MANIOBRA", player.name);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        TStrategy strategy;
        if (userInput.equalsIgnoreCase("A")){
            strategy = TStrategy.ATAC;
        } else if (userInput.equalsIgnoreCase("D")){
            strategy = TStrategy.DEFENSA;
        }else if (userInput.equalsIgnoreCase("E")){
            strategy = TStrategy.ENGANY;
        }else {
            strategy = TStrategy.MANIOBRA;
        }
        return strategy;
    }


    private static TStrategy fight(Warrior player, Warrior computer) {
        System.out.printf("%s, Choose strategy ATAC, DEFENSA, ENGANY, MANIOBRA", player.name);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        TStrategy strategy;
        if (userInput.equalsIgnoreCase("A")){
            strategy = TStrategy.ATAC;
        } else if (userInput.equalsIgnoreCase("D")){
            strategy = TStrategy.DEFENSA;
        }else if (userInput.equalsIgnoreCase("E")){
            strategy = TStrategy.ENGANY;
        }else {
            strategy = TStrategy.MANIOBRA;
        }
        return strategy;
    }

    public static Warrior askUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name? ");
        String name = scanner.nextLine();

        System.out.println("Chose warrior type: ");

        Warrior.TWarrior[] types = Warrior.TWarrior.values();
        for (int i = 0; i < types.length; i++) {
            System.out.printf("%d - %s\n", i+1, types[i].toString());
        }
        int number = Integer.parseInt(scanner.nextLine());
        Warrior.TWarrior type = types[number-1];
        Warrior warrior = new Warrior();
        warrior.name = name;
        warrior.warriorType = type;
        warrior.setup();
        return warrior;

    }

    public static Warrior randomWarrior(){
        Warrior warrior = new Warrior();
        warrior.name = "skynet";
        Warrior.TWarrior[] types = Warrior.TWarrior.values();
        int random = (int) (Math.random()* types.length);
        warrior.warriorType = types[random];
        warrior.setup();
        return warrior;

    }

}
