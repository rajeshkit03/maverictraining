public class OrderDetails {
    public void printOrder(int id,String name,int items,float c){

        //logic - print one order details
        System.out.println("Your Order ID is:"+id);
        System.out.println("Your Order Name is:"+name);
        System.out.println("No of Items:"+items);
        System.out.println("Final payment Amount: "+c);
        System.out.println(45);
    }
    public void printOrder1(Order orderInfo){

        //logic - print one order details
        System.out.println("Your Order ID is:"+orderInfo.orderId);
        System.out.println("Your Order Name is:"+orderInfo.orderName);
        System.out.println("No of Items:"+orderInfo.noOfItems);
        System.out.println("Final payment Amount: "+orderInfo.cost);
        System.out.println(45);
    }
}
