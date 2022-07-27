package example.springboot.rest.classes;

public class Info {
   private String name;
   private int id;

   public Info(String name, int id) {
      this.name = name;
      this.id = id;
   }

   public Info() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

}
