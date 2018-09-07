package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.web.CountryDto;
import pl.coderslab.web.OnlineBetsDto;
import pl.coderslab.web.TeamDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/home")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher("/META-INF/views/home.jsp").forward(request, response);
    }

    @RequestMapping("/get-countries")
    public String getCountriesAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "https://apifootball.com/api/?action=get_countries&APIkey=ba0685c21685e05aa4db599843010b15fd8488ddba380c529d5ec09a48f4298e";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
            System.out.println(country.getName() + " -> " + country.getApiCountryId());
        }

        request.setAttribute("countries", countries);
        request.getServletContext().getRequestDispatcher("/META-INF/views/leagues.jsp").forward(request, response);
        return "leagues";
    }

    @RequestMapping("/get-teams")
    public String getTeams(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "https://apifootball.com/api/?action=get_standings&league_id=63&APIkey=ba0685c21685e05aa4db599843010b15fd8488ddba380c529d5ec09a48f4298e";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TeamDto[]> responseTeams = restTemplate.getForEntity(
                url, TeamDto[].class);
        TeamDto[] teams = responseTeams.getBody();
        for(TeamDto team : teams){
            logger.info("teams {} ", team);

        }
        request.setAttribute("teams", teams);
        request.getServletContext().getRequestDispatcher("/META-INF/views/teamsDisplay.jsp").forward(request, response);
        return "teamsDisplay";
    }

    @RequestMapping("/get-onlinebets-test")
    public String getOnlineBetsTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "http://localhost:8080/api/fake-today-games";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<OnlineBetsDto[]> responseTeams = restTemplate.getForEntity(
                url, OnlineBetsDto[].class);
        OnlineBetsDto[] betsDtos = responseTeams.getBody();
        for(OnlineBetsDto bet : betsDtos){
            logger.info("betsDtos {} ", bet);
        }

        request.setAttribute("betsDtos", betsDtos);
        request.getServletContext().getRequestDispatcher("/META-INF/views/fakeBetDisplay.jsp").forward(request, response);
        return "fakeBetDisplay";
    }
}