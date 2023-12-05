package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    public Human() {

    }

    public Human(String aniName, int aniAge, String hobby) {
        super.setAniName(aniName);
        super.setAniAge(aniAge);
        this.hobby = hobby;
    }

    public void think() {
        System.out.println("私は" + hobby + "について考えています。");

    }

}
