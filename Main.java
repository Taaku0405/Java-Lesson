class Main {
  public static void main(String[] args) {
    // Javaの基本を覚えるための練習
    System.out.println("Hello Java");

    // 数値と文字列の違いを学ぶ
    // 数値の17を出力
    System.out.println(17);

    // 5に3を足した値を出力
    System.out.println(5 + 3);

    // [5 + 3]を文字列で出力
    System.out.println("5 + 3");

    // 12を3で割った値を出力
    System.out.println(12 / 3);

    // 3に6を掛けた値を出力
    System.out.println(3 * 6);

    // 8を3で割った時の余りの値を出力
    System.out.println(8 % 3);

    // "こんにちは"と"世界"を連結して出力
    System.out.println("こんにちは" + "世界");

    // "38"と"19"を連結して出力
    System.out.println("38" + "19");

    // 38と19を足して出力
    System.out.println(38 + 19);

    // int型の変数にnumberを定義して３を代入して出力
    int number;
    number = 3;
    System.out.println(number);

    // String型の変にnameを定義して"Wanko"を代入して出力
    String name;
    name = "Wanko";
    System.out.println(name);

    // 変数発展編
    int number1 = 3;
    int number2 = 7;
    System.out.println(number1 + 5);
    System.out.println(number1 * number2);

    String text = "Javaを勉強中";
    System.out.println("楽しく" + text);

    // 変数の値を更新
    number1 = 5;
    text = "Java学習";
    System.out.println(number1);
    System.out.println(text);

    // 変数number3の値に7を足して変数numberを上書きして出力
    int number3 = 3;
    System.out.println(number3);
    number3 = number3 + 7;
    System.out.println(number3);

  }
}