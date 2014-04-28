package oms.controller;

import oms.model.Order;
import oms.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
    @RequestMapping(value="/orders",  method= RequestMethod.GET)
    @ResponseBody
    public String getOrders() {
    	return "teste";
    }

    @RequestMapping(value="/orders",  method= RequestMethod.POST)
    @ResponseBody
    public Order purchase(Order order) {
    	return orderService.purchase(order); 
    }
    
    @RequestMapping(value="/orders",  method= RequestMethod.PUT)
    @ResponseBody
    public Order update(Order order) {
    	return orderService.update(order); 
    }
    
    @RequestMapping(value="/orders",  method= RequestMethod.DELETE)
    @ResponseBody
    public void delete(Long orderId) {
    	orderService.delete(orderId);
    }
    
    @RequestMapping(value="/orders/{orderId}/cancel",  method= RequestMethod.PUT)
    @ResponseBody
    public Order cancel(@PathVariable("orderId") Long orderId) {
    	return orderService.cancel(orderId);
    }
    
}
