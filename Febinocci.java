class Febinocci{
   public static void main(String[] args){
      int first = 0, second = 1, third;
      for(int i = 1; i <= 6; i++){
        third = first + second;
        first = second;
        second = third;
        System.out.println(first);
      }
   }
}