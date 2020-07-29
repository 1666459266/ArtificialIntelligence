package cn.zptc.ai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
public class BCryptTest {
    @Test
    public void testBCrypt(){
        String result = BCrypt.hashpw("123456", BCrypt.gensalt());
        System.out.println(result);
    }
}
