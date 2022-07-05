//Taiyakiクラスを作成
class Taiyaki {

    //コンストラクタ
    constructor(anko,krim,tizu) {
        this.anko = anko;
        this.krim = krim;
        this.tizu = tizu;
    }

    //メソッド（関数）作成
    nakami() {
        console.log(`中身は${this.anko}です`);
    }
    nakami1() {
        console.log(`中身は${this.krim}です`);
    }
    nakami2() {
        console.log(`中身は${this.tizu}です`);
    }
}
//オブジェクト作成
let yamada = new Taiyaki('あんこ','クリーム','チーズ');
yamada.nakami();
yamada.nakami1();
yamada.nakami2();