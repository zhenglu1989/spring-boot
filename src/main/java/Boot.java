import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buer
 * @since 16/8/9
 */

@RestController
@EnableAutoConfiguration
public class Boot  implements EmbeddedServletContainerCustomizer{

	private static final Logger logger  = LoggerFactory.getLogger(Boot.class);

	@RequestMapping("/hello")
	String home(){
		return "Hello world1111";
	}

	public static void main(String[] args) {
		logger.info("start >>>>>>>>");

		SpringApplication.run(Boot.class,args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);

	}
}
