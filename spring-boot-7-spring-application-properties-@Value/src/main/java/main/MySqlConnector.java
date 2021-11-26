package main;

public class MySqlConnector extends DatabaseConnector{
    /**
     * Hàm này có nhiệm vụ Connect tới một Database bất kỳ
     */
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Mysql: " + getUrl());
    }
}
