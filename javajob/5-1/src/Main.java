import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        {
//      問① 下記例の配列をString型しか格納できないように修正してください。
//      現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
            List<String> array = new ArrayList<String>();
//      また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//      <以下記述>
            array.add("hoge");
            array.add("pos");
            array.add("foo");
//      問② arrayの二つ目の要素を"bar"にしましょう。
//  　<以下記述>
            array.set(1,"bar");
//      問③ fooが格納されているインデックスを出力してください。
//  　<以下記述>
            System.out.println("fooのインデックス:" + array.indexOf("foo"));
        }

        {
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
        Map<String, Object> map = new HashMap<>();
//  　<以下記述>
        map.put("address","//////");
        map.put("name","Kosuke");
        map.put("age","29");
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//      <以下記述>
        for (String key : map.keySet()) {
            System.out.println("key:" + key);
        }
//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//      <以下記述>
        for(Object val : map.values()){
            System.out.println("value:" + val);
        }
        }
        {
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();          
           int[] arrayDate = {cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1,cal.get(Calendar.DATE)};
//      <以下記述>
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
//      <以下記述>
           List<Integer> list = new ArrayList<>();         
           for (int i : arrayDate) {
               list.add(i);
           }
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//      <以下記述>
           for (int i = 0; i < list.size(); i++) {
               System.out.println(list.get(i));
           }
        }
    }

}