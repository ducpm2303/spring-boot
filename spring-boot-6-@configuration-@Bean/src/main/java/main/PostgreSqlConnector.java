package main;

public class PostgreSqlConnector extends DatabaseConnector{
    /**
     * Hàm này có nhiệm vụ Connect tới một Database bất kỳ
     */
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Postgresql: " + getUrl());
    }
}
