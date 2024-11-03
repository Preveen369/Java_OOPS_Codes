class SmartPhone {
    String model;
    int price;
    String processor;

    // public String toString() {
    //     return model + " : " + price + " : " + processor;
    // }

    
    public String toString() {
        return "SmartPhone [model=" + model + ", price=" + price + ", processor=" + processor + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        result = prime * result + ((processor == null) ? 0 : processor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SmartPhone other = (SmartPhone) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        if (processor == null) {
            if (other.processor != null)
                return false;
        } else if (!processor.equals(other.processor))
            return false;
        return true;
    }

    // public boolean equals(SmartPhone that){
    //     return (this.model.equals(that.model) && (this.price == that.price) && this.processor.equals(that.processor));  
    // }

    
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        SmartPhone obj1 = new SmartPhone();
        obj1.model = "Galaxy Note 10";
        obj1.price = 80_000;
        obj1.processor = "MediaTek Helio";
        // System.out.println(obj1.toString());

        SmartPhone obj2 = new SmartPhone();
        obj2.model = "Galaxy Note 10";
        obj2.price = 80_000;
        obj2.processor = "MediaTek Helio";

        boolean result = obj1.equals(obj2);
        System.out.println(result);

    }


}
