package baseball;

public class BaseBallTeam {
    //フィールド
    private String name; //チーム名
    private int win; //勝利
    private int lose; //敗北
    private int draw; //引分

    //引数なし
    public BaseBallTeam() {

    }

    //引数あり
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率を求める
    public double getRate() {
        double rate = ((double)this.win / (this.win + this.lose));
          return rate;
    }


    //勝敗情報の表示
    public void report () {
        System.out.println(this.name + "の2022年の成績は　" +this.win + "勝" + "　" + this.lose + "敗" + "　" + this.draw + "分、勝率は　" + getRate() );
    }


    public String getName() {
        return name;
    }
     public void setName(String name) {
         this.name = name;
     }

     public int getWin() {
         return win;
     }
      public void setWin(int win) {
          this.win = win;
}

      public int getLose() {
          return lose;
      }
       public void setLose(int lose) {
           this.lose = lose;
 }

       public int getDraw() {
           return draw;
       }
        public void setDraw(int draw) {
            this.draw = draw;

        }
}