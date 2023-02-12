<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Fetch!!!</title>
<style>
p {margin: 0px;}

</style>
<script>
var current = 0;
var count = -1;
var pageSize = 1;

$(document).ready(function() {
	loadStudents(0);
});

function loadStudents(page) {
	fetch("HWStudents?page="+page, {method: "GET"}).then(
		async function(data) {
			var text = await data.json();
			$("#students").empty();
			$.each(text.data, function(index, item) {
				$("#students").append("<p>" + item + "</p>");
			});
			console.log(text.count);
			count = text.count;
			pageSize = text.pagesize;
		}
	);
}

</script>
</head>
<body>

<div id="students"></div>
<a href="javascript://" onclick="current==0 || loadStudents(--current)">prev</a>
<a href="javascript://" onclick="current < (count-1)/pageSize || loadStudents(++current)">next</a>



</body>
</html>