<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Etudiants</title>
</head>
<body>

		<form action="/accueil/Matiere/Ajout" method="post">
<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>Introduisez l'Id de la matiere <input type="text"
					name="idEtudiant">
				</td>
				<td>Introduisez le nom de la matiere <input type="text"
					name="nomEtudiant">
				</td>

				<td><input type="submit" value="AjoutEtudiant" name="action"></td>
			</tr>
		</table>

<hr color="blue">  
<!-- hr pour mettre une ligne -->

		<table>
			<tr>
				<th>Id Etudiant</th>
				<th>Nom de l'etudiant</th>
			</tr>

			<c:forEach items="${listeDesEtudiants}" var="mat">
				<tr>
					<td>${mat.idEtudiant}</td>
					<td>${mat.nomEtudiant}</td>
				</tr>
			</c:forEach>

		</table>

	</form>

</body>
</html>