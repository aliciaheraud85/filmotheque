package fr.eni.tp.filmotheque.controller;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bll.mock.FilmServiceBouchon;
import fr.eni.tp.filmotheque.bo.Film;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FilmController {

    private FilmServiceBouchon filmService;



    public FilmController(FilmServiceBouchon filmService) {
       this.filmService = filmService;
    }


    @GetMapping("/films")
    public String afficherFilms(Model model){
        List<Film> films = filmService.consulterFilms();
        model.addAttribute("films",films);
        return "films";
    }

    @GetMapping("/details")
    public String afficherUnFilm(@RequestParam(required = true) long id, Model model){
        Film filmParId =  filmService.consulterFilmParId(id);
        model.addAttribute("filmParId",filmParId);
        System.out.println(filmParId);
        return  "details";
    }

}
