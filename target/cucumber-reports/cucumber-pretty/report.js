$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Funcionalidad de búsqueda de productos",
  "description": "",
  "id": "funcionalidad-de-búsqueda-de-productos",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3303702329,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Búsqueda  con resultados",
  "description": "",
  "id": "funcionalidad-de-búsqueda-de-productos;búsqueda--con-resultados",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Se carga la página de búsqueda",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Buscamos el término \"skirt\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Clic en List",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clic en el boton agregar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clic en el boton procesar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Mostrar mensaje \"1 Product\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.seCargaLaPáginaDeBúsqueda()"
});
formatter.result({
  "duration": 5918288152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skirt",
      "offset": 21
    }
  ],
  "location": "Search.buscamosElTérmino(String)"
});
formatter.result({
  "duration": 1241629207,
  "status": "passed"
});
formatter.match({
  "location": "Search.clicEnList()"
});
formatter.result({
  "duration": 135408937,
  "status": "passed"
});
formatter.match({
  "location": "Search.clicEnElBotonAgregar()"
});
formatter.result({
  "duration": 124884373,
  "status": "passed"
});
formatter.match({
  "location": "Search.clicEnElBotonProcesar()"
});
formatter.result({
  "duration": 1644911196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Product",
      "offset": 17
    }
  ],
  "location": "Search.mostrarMensaje(String)"
});
formatter.result({
  "duration": 90911967,
  "status": "passed"
});
});