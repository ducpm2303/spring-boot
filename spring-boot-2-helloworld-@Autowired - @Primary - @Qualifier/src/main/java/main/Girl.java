package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {

//    @Qualifier("bikini")  // xác định tên của một Bean mà bạn muốn chỉ định inject.
    @Autowired
    Outfit outfit;
}
