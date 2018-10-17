
package hitblow;

import java.util.Scanner;   //キーボードから入力するために必要なScannerクラスを使用する宣言


public class HitBlow {

    public static void main(String[] args) {

        //４つの数字を配列に入れておく（正解）
        int seikai[] = new int[4]; 
        seikai[0] = 1;
        seikai[1] = 2;
        seikai[2] = 3;
        seikai[3] = 4;

        //解答用配列
        int kaitou[] = new int[4];
        
        int inputNum = 0;   //作業用変数
        int hit = 0;    //ヒットの数
        int blow = 0;   //ブローの数

        //hitが４でない間、繰りかえす
        while ( hit != 4 ) {

            hit = 0;
            blow = 0;
            
            //プレイヤーが４つの数字を入力する
            Scanner sc = new Scanner(System.in);
            inputNum = sc.nextInt();

            //1000の位を計算
            kaitou[0] = inputNum / 1000;
            inputNum = inputNum - (kaitou[0] * 1000);

            //100に位を計算
            kaitou[1] = inputNum / 100;
            inputNum = inputNum - (kaitou[1] * 100);

            //10の位を計算
            kaitou[2] = inputNum / 10;
            inputNum = inputNum - (kaitou[2] * 10);

            //1の位
            kaitou[3] = inputNum;

            //ヒットの判定をする（１桁目）
            if (seikai[0] == kaitou[0]) {
                hit++;
            }
            //ヒットの判定をする（２桁目）
            if (seikai[1] == kaitou[1]) {
                hit++;
            }
            //ヒットの判定をする（３桁目）
            if (seikai[2] == kaitou[2]) {
                hit++;
            }
            //ヒットの判定をする（４桁目）
            if (seikai[3] == kaitou[3]) {
                hit++;
            }

            //ブローの判定をする（１桁目）
            if (seikai[0] == kaitou[1]) {
                blow++;
            }
            if (seikai[0] == kaitou[2]) {
                blow++;
            }
            if (seikai[0] == kaitou[3]) {
                blow++;
            }

            //ブローの判定をする（２桁目）
            if (seikai[1] == kaitou[0]) {
                blow++;
            }
            if (seikai[1] == kaitou[2]) {
                blow++;
            }
            if (seikai[1] == kaitou[3]) {
                blow++;
            }

            //ブローの判定をする（３桁目）
            if (seikai[2] == kaitou[0]) {
                blow++;
            }
            if (seikai[2] == kaitou[1]) {
                blow++;
            }
            if (seikai[2] == kaitou[3]) {
                blow++;
            }

            //ブローの判定をする（４桁目）
            if (seikai[3] == kaitou[0]) {
                blow++;
            }
            if (seikai[3] == kaitou[1]) {
                blow++;
            }
            if (seikai[3] == kaitou[2]) {
                blow++;
            }

            //ヒットとブローの数を表示する
            System.out.println("ヒット:" + hit + "  ブロー：" + blow);


            //全部正解したら繰り返し終了
        }

    }

}
