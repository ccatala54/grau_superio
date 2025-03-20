public class Warrior {
    String name;

    public void setup(){
        maxlife = 15;
        life = 10;
        switch (warriorType){
            case KNIGHT:
                attack = 8;
                defense = 7;
                break;
            case OGRE:
                attack = 11;
                defense = 4;
                break;
            case WIZARD:
                attack = 15;
                defense = 5;
                break;
            case DRAGON:
                attack = 13;
                defense = 5;
                break;
        }
    }


    enum TWarrior{
        KNIGHT, OGRE, WIZARD, DRAGON
    }

    TWarrior warriorType;

    int level = 1;
    int score = 0;
    int life;
    int maxlife;
    int attack;
    int defense;

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", warriorType=" + warriorType +
                ", level=" + level +
                ", score=" + score +
                ", life=" + life +
                ", maxlife=" + maxlife +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
