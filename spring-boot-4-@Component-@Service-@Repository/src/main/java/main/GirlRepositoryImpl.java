package main;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository{

    /**
     * Tìm kiếm một cô gái trong database theo tên
     *
     * @param name
     * @return
     */
    @Override
    public Girl getGirlByName(String name) {
        return new Girl(name);
    }
}
