package main;

import org.springframework.stereotype.Component;
/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/
@Component
//@Scope("prototype") : new istance
public class Sweater implements Outfit{

    @Override
    public void wear() {
        System.out.println("Mac ao len");
    }
}
