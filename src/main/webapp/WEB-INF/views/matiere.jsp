<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Matieres</title>
</head>
<body>

	<form action="/accueil/Matiere/Ajout" method="post">
<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>Introduisez l'Id de la matiere <input type="text"
					name="idMatiere">
				</td>
				<td>Introduisez le nom de la matiere <input type="text"
					name="nomMatiere">
				</td>

				<td><input type="submit" value="AjoutMatiere" name="action"></td>
			</tr>
		</table>

<hr color="blue">  
<!-- hr pour mettre une ligne -->

		<table>
			<tr>
				<th>Id Matiere</th>
				<th>Nom de la matiere</th>
			</tr>

			<c:forEach items="${listeDesMatieres}" var="mat">
				<tr>
					<td>${mat.idMatiere}</td>
					<td>${mat.nomMatiere}</td>
				</tr>
			</c:forEach>

		</table>

	</form>

</body>
</html>