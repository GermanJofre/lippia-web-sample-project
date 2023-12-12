@Login
Feature: Login

  Background:
    Given El usuario se encuentra en la pagina principal BioFingertips
    And El usuario se dirige al login

  @Exitoso
  Scenario : El usuario inicia una sesion exitosa
    When Ingresa su e-mail "roxyperez22@gmail.com"
    And Su contraseña "Patitas12345666"
    And Hace click en el boton "Login"
    Then Se vizualiza su cuenta

  @Fallido
  Scenario Outline: El usuario inicia una sesion invalida
    When Ingresa su e-mail <email>
    And Su contraseña <pass>
    And Hace click en el boton "Login"
    Then Visualiza un mensaje de error <mensaje>

    @EMailValidoPasswordInvalido
    Examples:
      | email | password | mensaje                                                                 |
      |       |          | verifique usuario y contraseña, y que su cuenta se encuentre verificada |

    @EMailInvalidoPasswordValido
    Examples:
      | email | password | mensaje                                                                 |
      |       |          | verifique usuario y contraseña, y que su cuenta se encuentre verificada |

    @EMailVacio
    Examples:
      | email | password | mensaje             |
      |       |          | completa este campo |

    @PasswordVacio
    Examples:
      | email | password | mensaje             |
      |       |          | completa este campo |

    @EmailyPasswordVacios
    Examples:
      | email | password | mensaje             |
      |       |          | completa este campo |

    Examples:
      | e-mail                | pass     | mensaje                                                                 | descripcion               |
      | Roxyperez22@gmail.com | 12345689 | verifique usuario y contraseña, y que su cuenta se encuentre verificada | contraseña invalida       |
      | Roxyperez22gmail.com  | 123456   | verifique usuario y contraseña, y que su cuenta se encuentre verificada | e-mail invalido           |
      |                       | 123456   | completa este campo                                                     | e-mail vacio              |
      | Roxyperez22@gmail.com |          | completa este campo                                                     | contraseña vacia          |
      |                       |          | completa este campo                                                     | e-mail y contraseña vacia |