Feature: The user can goes to the genaral detail player module

  Background:
    Given The User enters to the Neat administrative page
    When He puts the nekoAdmin and the Admin123
    Then He goes to the general player detail module


    @FiltrarJugador
    Scenario: Actor can filter a player
      Given He puts the name user Juan Camilo in the Input
      Then He sees the player information 1005090639


    @LimpiarFiltros
    Scenario: Actor can clean the inputs filter
      Given He puts the name user Juan Camilo in the Input
      When He select the Clean filters button
      Then He sees the principal page ver su información

    @VerMasFiltros
    Scenario: Actor can sees more filters
      Given He select the Button more filters
      Then He sees all the filters options Número de documento


    @VerMasOpciones
    Scenario: Actor can sees more option for player detail
      Given He select the more options button
      Then He sees all the player detail options Recargas



    @FiltrarJugadorNoExistente
    Scenario: Actor search a no register player
      Given He filter a player wiht the emial Emailinvalido@gmail.com
      Then He sees the advertaicing message Error







