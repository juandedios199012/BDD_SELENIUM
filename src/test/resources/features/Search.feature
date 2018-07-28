Feature: Funcionalidad de búsqueda de productos
  Scenario: Búsqueda  con resultados
    Given Se carga la página de búsqueda
    When Buscamos el término "skirt"
    When Clic en List
    When Clic en el boton agregar
    When Clic en el boton procesar
    Then Mostrar mensaje "1 Product"