/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Services;

import Controller.OrderController;
import Models.Orders;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author A V I A N
 */
@WebService(serviceName = "OrderService")
public class OrderService {

    @WebMethod(operationName = "customerOrder")
    public boolean Customer_ord(@WebParam(name="order")Orders order) {
        OrderController ord_controller = new OrderController();
        return ord_controller.customerOrder(order);  
    }
    
    @WebMethod(operationName = "updateOrders")
    public boolean updateOrders(@WebParam(name="order")Orders order) {
    OrderController cus_update = new OrderController();
    return cus_update.orderUpdate(order);
    }
    
     @WebMethod(operationName = "deleteOrder")
    public boolean deleteOrder(@WebParam(name="id") String id){
    OrderController ord_controller = new OrderController();
    return ord_controller.deleteOrder(id);
    }
}
