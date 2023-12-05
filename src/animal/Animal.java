package animal;

public class Animal {

    private String aniName;
    private int aniAge;


    public Animal() {
}

    public Animal(String aniName, int aniAge) {
        this.aniName = aniName;
        this.aniAge = aniAge;

    }

    public int getAniAge() {
        return aniAge;
    }

    public void setAniAge(int aniAge) {
        this.aniAge = aniAge;
    }

    public String getAniName() {
        return aniName;
    }

    public void setAniName(String aniName) {
        this.aniName = aniName;
    }



    public void say() {
        System.out.println(this.aniName + "です。" + this.aniAge + "歳です。");
    }

    }
