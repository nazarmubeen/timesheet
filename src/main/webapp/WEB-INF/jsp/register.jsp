<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	
    <title>TimeSheet+</title>
	
	
    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>

<body ng-app="myApp" >

<div  ng-controller="UserController as ctrl">
    <div class="container" >

        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
				 <div class="panel-heading">
					<img src="../logo/logo.png">
					</div>
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Register</h3>
                    </div>
                    <div class="panel-body" >
                        <form role="form" ng-submit="ctrl.submit()" name="registerform">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail"  type="email" ng-model="ctrl.user.email_id" autofocus> 
              
									</div> {{ctrl.user.email_id}}
									 <div class="form-group">
                                    <input class="form-control" placeholder="Name"  type="text" ng-model="ctrl.user.name" autofocus>
									<p ng-bind="ctrl.name"></p>{{ctrl.user.name}}
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" type="password" ng-model="ctrl.user.password" >
                                </div>{{ctrl.user.password}}
								 <div class="form-group">
                                    <input class="form-control" placeholder="Confirm Password" ng-model="ctrl.user.confirmpassword" type="password" value="">
                                </div>{{ctrl.user.confirmpassword}}
								Registration is successful {{ctrl.user.id}}
                                <!-- Change this to a button or input when using this as a form -->
                              
                              <input type="submit"   class="btn btn-lg btn-success btn-block" ng-disabled="registerform.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="registerform.$pristine">Reset Form</button>
                            </fieldset>
                        </form>
                    </div>
					<div class="panel-heading">
                        <h3 class="panel-title"><label>Already Have an account <a href="login.html"> login here</a></label></h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>
<script src="/js/app.js"></script>
<script src="/js/controller/user_controller.js"></script>
<script src="/js/service/user_service.js"></script>
</html>
