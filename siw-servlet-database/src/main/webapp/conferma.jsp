<!DOCTYPE html>
<html>
  <head>
    <title>persona</title>
  </head>
  <body>
    <h1>Vuoi confermare questi dati?</h1>
    <div>Nome: ${persona.nome}</div>
    <div>Cognome: ${persona.cognome}</div>
    <form action="conferma" method="post">
	    <div><input type="submit" name="conferma" value="conferma" /></div>
	    <div><input type="submit" name="torna indietro" value="torna indietro" /></div>
	</form>
  </body>
</html>