<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>Prima Webapp</title>
</head>
<body>
	<form action="conferma" method="post">
		<div>Nome: <input type="text" name="nome" value="${persona.nome}"/></div>
		<div>Cognome: <input type="text" name="cognome" value="${persona.cognome}"/></div>
		<div><input type="submit" 
			name="sumbit" value="invia" /></div>
	</form>
	<div>${messaggiErrore["nome"]}</div>
	<div>${messaggiErrore["cognome"]} </div>
</body>
</html>