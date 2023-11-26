package com.cakefactory.catalog;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class CatalogController {

    private final CatalogService catalogService;

    CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/")
    ModelAndView index() {
        System.out.println(this.catalogService.getItems()) ;
        return new ModelAndView("catalog", Map.of("items", this.catalogService.getItems()));
    }

}