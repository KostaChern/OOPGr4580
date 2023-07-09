package Domen;

public class HotDrink extends Bottle {
 // Поля
    private float hotDrinkVolume;

 // Свойства
    public float getHotDrink() {
        return hotDrinkVolume;
    }

    public void setHotDrink(float hotDrink) {
      this.hotDrinkVolume = hotDrinkVolume;
    }

    // конструкторы
    public  HotDrink(int price, int place, String name, int tempereture, long id){
      super(price,place,name,id);
      this.hotDrinkVolume = 0f;
    }
    public HotDrink (int price, int place, String name, long id, float hotDrinkVolume){
      super(price,place,name,id);
      this.hotDrinkVolume = hotDrinkVolume;
    }


    @Override
    public String toString() {
         return super.toString() + "\nvolume=" + hotDrinkVolume;
    }

}
