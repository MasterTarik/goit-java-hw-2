class NameEncoderDecoder {
  
  public String encode(String name){
    String code[] = {"NOTFORYOU", "YESNOTFORYOU"};
    return code[0] + name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5") + code[1];
  }
  
 public String decode(String name){
    String code[] = {"NOTFORYOU", "YESNOTFORYOU"};
    return name.replace(code[1], "").replace(code[0], "").replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
  }
 
  public satatic void main(String[] args) {
    
  }
}
