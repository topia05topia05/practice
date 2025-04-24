public abstract class TangibleAsset{
  private String name;
  private int price;
  private String coloe;
  public TangibleAsset(String name,int price,String coloe){
    this.name = name;
    this.price = price;
    this.coloe = coloe;
   }
   public String getName(){return this.name;}
   public int getprice(){return this.price;}
   public String getcoloe(){return this.coloe;}

}
