package sg.nus.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sg.nus.news.service.NewsService;

@Controller
@RequestMapping(path="/")
public class NewsController {

    @Autowired
    private NewsService newsService;
    
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("categories", newsService.getCategories());
        model.addAttribute("countries", newsService.getCountries());
        return "login";
    }

    @GetMapping("/news")
    public String getNews(@RequestParam String category, @RequestParam String country, Model model) {
        model.addAttribute("news", newsService.getNews(category, country));
        return "news";
    }
}
