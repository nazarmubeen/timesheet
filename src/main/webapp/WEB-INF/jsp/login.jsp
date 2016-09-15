<!DOCTYPE html>
<html>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	
    <title>Timesheets+</title>

	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body style="background-image:url("../logo/home.png");" ng-app="myApp" ng-submit="ctrl.getUser()">

    <div class="container" ng-controller="UserController as ctrl">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    
					<div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body" >
                        <form role="form" ng-submit="ctrl.getUser()" name=ctrl.loginform>
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" type="text" ng-model="ctrl.user.id" autofocus>
                                </div>{{ctrl.user.id}}
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" ng-model="ctrl.user.password" value="">
                                </div>{{ctrl.user.password}}
                               <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me" ng-model="remember">Remember Me
                                    </label>
									
									<label><a>Forgot your password</a></label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                 <input type="submit"   class="btn btn-lg btn-success btn-block" ng-disabled="ctrl.loginform.$invalid">
                                <a href="/WEB-INF/jsp/index.html" class="btn btn-lg btn-success btn-block">Login</a>
                            </fieldset>
                        </form>
                    </div>
					<div class="panel-heading">
                        <h3 class="panel-title"><label>Don't have an account? <a href="/register"> sign up here</a></label></h3>
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
