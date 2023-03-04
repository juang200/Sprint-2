Feature: The user can goes to the recharge module

  Background:
    Given The User enters to the Neat administrative page
    When He puts the adminOperator and the Admin123
    Then He goes to recharge module


    @FiltrarRecarga
    Scenario: The user can filter a recharge
      Given He puts the recharge number xxxx in the filter
      When He select the filter button
      Then He sees the recharge numer xxxx


    @LimpiarFiltros
    Scenario: The user can clean the filters
      Given  He puts the recharge number xxxx in the filter
      When He select the filter button
      And He select the clean filters buttonR
      Then He sees all the filters clean

    @VerMasfiltros
    Scenario: Actor can see all the filter options
      Given He select the more filter button
      Then





   @FiltrarRecargaQueNoExiste




    @VerMasFiltros





    @FiltrarDatosnoexistentes