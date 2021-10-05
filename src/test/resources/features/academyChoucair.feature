@Stories

Feature: Academy Choucair
  as a user, i want to learn how to automate in screamplay at the Choucair Academy with the automatization couse
  @scenario1
  Scenario: Search for automation course
    Given then brandon wants to learn automation at the academy Choucair
    | strUser   | strPassword |
    | TuUsuario | TuClave     |
    When he search for the course Recursos Automatización  bancolombia on the choucair academy plataform
    | strCourse               |
    | Metodologia Bancolombia |
    Then he finds the course called resouces Recursos Automatización  Bancolombia
    | strCourse               |
    | Metodologia Bancolombia |