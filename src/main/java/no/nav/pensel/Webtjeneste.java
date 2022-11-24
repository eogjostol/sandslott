package no.nav.pensel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tjeneste")
public class Webtjeneste {
  
    @GetMapping("/team")
    public String hentTeam() {
       Team teamet = new Team();
       return new Webside(team);
    }
}
