package com.org.choicehotels;


import com.org.choicehotels.web.HotelController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.org.choicehotels")
public class ChoiceHotelsRestApp {

    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ChoiceHotelsRestApp.class);

        HotelController controller = ctx.getBean(HotelController.class);
        System.out.println(controller.getSampleResponse());
    }

}
