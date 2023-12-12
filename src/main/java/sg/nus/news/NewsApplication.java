package sg.nus.news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.nus.news.model.CountryCode;
import sg.nus.news.service.NewsService;

@SpringBootApplication
public class NewsApplication implements CommandLineRunner {

	@Autowired
	private NewsService newsSvc;

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<CountryCode> codes = newsSvc.getCountryCode();

		System.out.printf("---- country code: %s\n", codes);
	}
}