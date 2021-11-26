package main;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary //  là annotation đánh dấu trên một Bean, giúp nó luôn được ưu tiên lựa chọn trong trường hợp có nhiều Bean cùng loại trong Context.
public class Naked implements Outfit{

    @Override
    public void wear() {
        System.out.println("Ko mac gi");
    }
}
