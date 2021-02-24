package cloud.seeyoo.admin.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IndexController {
//    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        log.error("111");
        return "helloword!";
    }

//    @RequestMapping(value = "/testResult")
//    @ResponseBody
//    public Result<JSONObject> test() {
//        Result<JSONObject> result = new Result<JSONObject>();
//        return result.error500("3337766");
//    }
}