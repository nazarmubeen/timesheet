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
    .when("/clienthome", {
        templateUrl : "/clienthome",
        controller: "ClientController as ClientCtrl"
    })
    .when("/searchclient", {
        templateUrl : "/searchclient",
        controller: "ClientController as ClientCtrl"
    })
    .when("/getclient:clientId", {
        templateUrl : "/addclient",
        controller: "ClientController as ClientCtrl"
    })
    
    .when("/project", {
        templateUrl : "/project",
        controller: "myCtrl"
    })
    .when("/user", {
        templateUrl : "/user",
        controller: "myCtrl"
    })
    .when("/adduser", {
        templateUrl : "/adduser",
        controller: "myCtrl"
    })
    .when("/addclient", {
        templateUrl : "/addclient",
        controller: "ClientController as ClientCtrl"
    })
    .when("/addproject", {
        templateUrl : "/addproject",
        controller: "myCtrl"
    })
    .otherwise( {
    	redirectTo: '/menu'
    })
    ;
});