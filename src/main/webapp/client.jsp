
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Clients</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container col-md-8 col-md-offset-2 ">
		<div class="panel panel-primary">
			<div class="panel-heading">Saisir les informations</div>
			<div class="panel-body">
				<form action="saveclient.php" method="post">
					<div class="form-group">
						<label>Nom:</label> 
						<input type="text" name="nom" class="form-control">
					</div>


					<div class="form-group">
						<label>Prenom:</label>
						<input type="text" name="prenom" class="form-control">
					</div>


					<div class="form-group">
						<label>Address:</label>
						<input type="text" name="address" class="form-control">
					</div>


					<div class="form-group">
						<button type="submit"  class="btn btn-primary">Save</button>
					</div>



				</form>
			</div>
		</div>
	</div>
	
	
</body>
</html>