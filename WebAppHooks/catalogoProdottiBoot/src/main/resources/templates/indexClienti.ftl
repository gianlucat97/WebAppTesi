<!DOCTYPE html>
<html>
	<head>
		<title>Catalogo clienti</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
	</head>
	<body>
		<h1>Catalogo clienti</h1>
		
		
		<#if clienteDaModificare??>
		<h2>Modifica del cliente - ${clienteDaModificare.nome}</h2>
			<div style="margin 20px;">
				<form method="POST" action="update" id="datiCliente">
					<input type="hidden" name="id" value="${clienteDaModificare.id}" />
					<div>
						<label for="nome">Nome</label>
						<input type="text" name="nome" id="nome" value="${clienteDaModificare.nome}" />
					</div>
					<div>
						<label for="cognome">Cognome</label>
						<input type="text" name="cognome" id="cognome" value="${clienteDaModificare.cognome}" />
					</div>
					<div>
						<label for="storicospesa">Storico-Spesa</label>
						<input type="number" name="storicospesa" id="storicospesa" value="${clienteDaModificare.storicospesa}" />
					</div>
					<div>
						<input type="submit" name="invia" value="Salva modifiche" />
					</div>
				
				
				</form>
			</div>
		<#else>
		<h2>Nuovo cliente</h2>
			<div style="margin 20px;">
				<form method="POST" action="add" id="datiCliente">
					<div>
						<label for="nome">Nome</label>
						<input type="text" name="nome" id="nome" value="" />
					</div>
					<div>
						<label for="cognome">Cognome</label>
						<input type="text" name="cognome" id="cognome" value="" />
					</div>
					<div>
						<label for="storicospesa">Storico-Spesa</label>
						<input type="number" name="storicospesa" id="storicospesa" value="" />
					</div>
					<div>
						<input type="submit" name="invia" value="Aggiungi" />
					</div>
				
				
				</form>
			</div>

		</#if>
		
		
		<hr>
		
		<h2>Lista clienti</h2>
		<div>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Cognome</th>
						<th>Storico-Spesa</th>
						<th>Azioni</th>
					</tr>
				</thead>
				<tbody>
					<#list listaClienti as cliente>
					<tr>
						<td>${cliente.nome}</td>
						<td>${cliente.cognome}</td>
						<td>${cliente.storicospesa}</td>
						<td>
							<a href="delete?id=${cliente.id}">Cancella</a>
							<a href="main?id=${cliente.id}">Rettifica</a>
						</td>
					</tr>
					</#list>
				</tbody>
			</table>
		</div>
	</body>
</html>
		
