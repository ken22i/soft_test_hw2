public class Currency {
  int amount;
  String symbol;

  public Currency(int a, String s) {
    this.amount = a;
    this.symbol = s;
  }

  public Currency add(Currency other) {
    if (this.symbol.equals("NT") && other.symbol.equals("US")) {
      // 台幣加美金，回傳台幣
      return new Currency(this.amount + (other.amount * 30), this.symbol);
    } else if (this.symbol.equals("US") && other.symbol.equals("NT")) {
      // 美金加台幣，回傳美金
      return new Currency(this.amount + (other.amount / 30), this.symbol);
    } else {
      // 兩個相同幣值相加，回傳相同幣值
      return new Currency(this.amount + other.amount, this.symbol);
    }
  }
}

