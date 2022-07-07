//問1
let numbers = [2, 5, 12, 13, 15, 18, 22];

function isEven(num) {
    console.log(num + 'は偶数です');
}

for (let i = 0; i < numbers.length; i++) {
    if(numbers[i] % 2 ===0){
        //let Even = isEven(numbers[i]);
        isEven(numbers[i]);
    }
}

//問２
//クラスを作成
class car {

    //コンストラクタ
    constructor(gas,num) {
        this.gas = gas;
        this.num = num;
    }
    //メソッド（関数）作成
    getNumGas() {
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}
//オブジェクト作成
let NumGas = new car('〇〇','△△');
NumGas.getNumGas();