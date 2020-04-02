package springtravelwebpage.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {

	@RequestMapping("/")
		public String showPage() {
			return "travelwebpage";
		}
}

