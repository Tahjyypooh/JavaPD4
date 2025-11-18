class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  String creditCardType(string card)
    if(card.subString(0,1).equals ("4")){
  
     return "Visa";
    }
  else if (card.substring(0,2).equals("34")) || (card.substring(0,2).equals("37")){
    return "American Express";
  }
  else if (card.substring(0,3).equals("36")){
    return "Diner Club";
  }
  else if (card.substring(0,4).equals("55")) || (card.substring(0,4).equals("55")){
    return "Master Card";
  }
  else if (card.substring(0,5).equals("6011")) || (card.substring(0,5).equals("65")){
    return "Discovery";
  }
}

String pigLatin(String word){

return word.substring(1) + word.substring(0,1)+ "ay";
}




