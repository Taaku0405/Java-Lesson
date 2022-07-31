class Lesson {
  public static void main(String[] args) {
    // 自己代入の省略の練習
    int number = 8;
    number *= 7;
    System.out.println(number);
    number++;
    System.out.println(number);

    // 変数の応用編
    int length = 6;
    int height = 8;
    // 変数rectangleAreaに四角形の面積を代入して出力
    int rectangleArea = length * height;
    System.out.println(rectangleArea);
    // 変数triangleAreaに三角形の面積を代入して出力
    int triangleArea = length * height / 2;
    System.out.println(triangleArea);

    // 小数のデータ型doubleを使った練習
    double number1 = 8.5;
    double number2 = 3.4;
    System.out.println(number1 + number2);
    System.out.println(number1 - number2);

    // 自動型変換の練習
    int month = 12;
    int date = 31;
    // 12月31日を変数と文字列を連結して出力
    System.out.println(month + "月" + date + "日");
    // 計算を使ったパターン
    System.out.println(7 / 2);
    System.out.println(7.0 / 2.0);
    System.out.println(7 / 2.0);

    // 強制型変換の練習(doubleを使って計算結果を正確に出力させる)
    int number3 = 7;
    int number4 = 2;
    System.out.println(number3 / number4);
    System.out.println((double)number3 / number4);
    
  }
}
