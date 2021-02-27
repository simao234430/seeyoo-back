package cloud.seeyoo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"cloud.seeyoo"})
@MapperScan("cloud.seeyoo")
@EnableSwagger2
public class YooApplication {

    private static final Logger logger = LoggerFactory.getLogger(YooApplication.class);
    public static void main(String[] args) {
        new SpringApplicationBuilder(YooApplication.class)
                .run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  圆圈圈启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}
