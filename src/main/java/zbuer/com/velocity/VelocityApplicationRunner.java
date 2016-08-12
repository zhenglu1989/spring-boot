package zbuer.com.velocity;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模板引擎执行器
 *
 * @author buer
 * @since 16/8/12
 */
@Component
public class VelocityApplicationRunner implements CommandLineRunner {

	@Value("${application.message}")
	private String message;

	@Autowired
	private VelocityEngine engine;

	@Override
	public void run(String... strings) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", this.message);
		System.out.println(VelocityEngineUtils.mergeTemplateIntoString(this.engine, "demo.vm", "utf-8", model));

		System.out.println(">>>>>>>>>>>>>hello world>>>>>>>>>>>>");
	}

}
