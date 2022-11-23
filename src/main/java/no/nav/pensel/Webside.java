package no.nav.pensel;

public class Webside {
  
  public String produserSide(Team team) {
    return String.format("""
 <html>
      <body>
        <h1>%s</h1>
        <p>Medlemmer:</p>
        <table>
          <tr><td>%s</td><td>%s</td></tr>
          <tr><td>%s</td><td>%s</td></tr>
        </table>
      </body>
 </html>
      """, team.navn,
                         team.personer.get(0).navn, team.personer.get(0).rolle,
                         team.personer.get(1).navn, team.personer.get(1).rolle);
  }
}
