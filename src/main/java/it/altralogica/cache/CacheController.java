package it.altralogica.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanis on 18/05/17.
 */
@Controller
public class CacheController {
    @Autowired
    FileServerService fileServerService;

    @GetMapping("/")
    public String listCache(Model model) {
        model.addAttribute("files", fileServerService.findAll());
        return "index";
    }
}
