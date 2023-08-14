public class Order {
    int orderId;
    String orderName;
    int noOfItems;
    float cost;
    //    public Order(int id,String name,int items,float c){
//        orderId = id;
//        orderName = name;
//        items = noOfItems;
//        cost = c;
//    }
     public Order(int orderId, String orderName, int noOfItems, float cost) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.noOfItems = noOfItems;
        this.cost = cost;
    }
    public static void main(String[] args) {
        Order o1=new Order(100,"swiggy",4,500);
        Order o2=new Order(101,"Zomoto",6,1500);
        Order o3=new Order(102,"uber",7,670);
        Order o4=new Order(103,"dominos",5,2300);
        int[] scores=new int[6];//
        String[] cities=new String[5];//
        Order[] orderList=new Order[4];
        orderList[0]=o1;
        orderList[1]=o2;
        orderList[2]=o3;
        orderList[3]=o4;



        OrderDetails od=new OrderDetails();
        od.printOrder(o1.orderId,o1.orderName,o1.noOfItems,o1.cost);// pass by value
        od.printOrder1(o1); // pass by reference
    }
}
