//Taiyakiクラスを作成
class Taiyaki {

    //コンストラクタ
    constructor(nakami) {
        this.nakami = nakami;
    }

    //メソッド（関数）作成
    nakami1() {
        console.log(`中身は${this.nakami}です`);
    }
}
//オブジェクト作成
let yamada = new Taiyaki('あんこ');
yamada.nakami1();
let tanaka = new Taiyaki('クリーム');
tanaka.nakami1();
let saito = new Taiyaki('チーズ');
saito.nakami1();