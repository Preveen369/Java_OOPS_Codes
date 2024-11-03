enum Status {
    // special container (class) to store all named constants (objects)
    Running, Failed, Pending, Success;
}

enum SmartPhone{
    Redmi(8, 32), Galaxy(16, 64), Iphone, OnePlus(8, 64), Nothing(16, 128);

    private int ram;
    private int storage;

    private SmartPhone(){
        this.ram = 16;
        this.storage = 32;
    }

    private SmartPhone(int ram, int storage){
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

}


public class Enum_Class {
    public static void main(String[] args) {
        // Creating an object for Status enum
        // Status -> also refers to class type
        Status s = Status.Success;
    
        // enum extends the enum class in java, print the superclass of status enum
        System.out.println(s.getClass().getSuperclass());
    
        // SmartPhone phone = SmartPhone.Galaxy;
        System.out.println("\nAll phones model specifications:");
        for (SmartPhone phone : SmartPhone.values()) {
            System.out.println(phone + " : " + phone.getRam() + "GB RAM : " + phone.getStorage() + " GB storage");
        }
       

    }
}
