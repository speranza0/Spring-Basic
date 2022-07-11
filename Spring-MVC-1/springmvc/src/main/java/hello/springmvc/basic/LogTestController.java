package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        //올바른 로그 사용법
        //현재 출력 레벨은 debug
        log.trace("trace my log=" + name); // 출력이 안되도 더하기 연산이 일어난다 리소스 소비
        log.trace("trace log={}", name); // 출력이 안되니 연산을 하지 않는다
        //
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        return "OK";
    }
}
