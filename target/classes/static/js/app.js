/**
 * This app file is to create modules in current application
 */

'use strict';

var app1 = angular.module('myApp', []);

var app2 = angular.module('myApp1',  ['ngRoute']);

app2.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "/menu",
        controller: "myCtrl"
    })
    .when("/client", {
        templateUrl : "client",
        controller: "myCtrl"
    })
    .when("/project", {
        templateUrl : "/project",
        controller: "myCtrl"
    })
    .when("/user", {
        templateUrl : "/user",
        controller: "myCtrl"
    })
    .otherwise( {
    	redirectTo: '/menu'
    })
    ;
});