package kosta_java.ex1003.jdbcMVC.model.util;
/**
 * DB 관련 설정 정보 상수 필드 interface
 */
public interface DbProperty {
    public static final String DRIVER_NAME ="oracle.jdbc.driver.OracleDriver";
    public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USER_NAME ="scott";
    public static final String USER_PASS ="tiger";
}
