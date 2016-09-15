<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="myApp">
<div  ng-controller="myCtrl as m">

First Name: <input type="text" ng-model="m.firstName"><br>
{{m.firstName}}
Last Name: <input type="text" ng-model="m.lastName"><br>
<br>
{{m.lastName}}
Full Name: {{firstName + " " + lastName}}
</div>

<div  ng-controller="userCtrl as n">
First Name: <input type="text" ng-model="n.name"><br>
{{n.name}}<br>
Last Name: <input type="text" ng-model="n.email"><br>
<br>
{{n.email}}<br>
Full Name: {{n.name + " " + n.email}}
</div>

</body>
<script src="/js/app.js"></script>
<script src="/js/controller/user_controller.js"></script>
</html>

