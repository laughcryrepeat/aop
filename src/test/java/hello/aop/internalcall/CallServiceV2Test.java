package hello.aop.internalcall;

import hello.aop.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(CallLogAspect.class)
// Springboot 버전 업하면서 순환참조 금지되어서 허용으로 config 설정해줌
@SpringBootTest(properties = "spring.main.allow-circular-references=true")
class CallServiceV2Test {

    @Autowired
    CallServiceV2 callServiceV2;

    @Test
    void external() {
        callServiceV2.external();
    }

    @Test
    void internal() {
        callServiceV2.internal();
    }

}