public class Encap {
   private String name;
   private int id;

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }
}

class Main{
    public static void main(String aa[]){
        Encap en = new Encap();
        en.setName("Ayush");
        en.setId(101);
        System.out.println(en.getName());
        System.out.println(en.getId());
    }
}
