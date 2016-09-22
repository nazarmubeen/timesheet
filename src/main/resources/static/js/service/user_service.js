/**
 * 
 */
'use strict';

angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/registeruser';
    var REST_SERVICE_URI_LOGIN = 'http://localhost:8080/login/user/';
    var REST_SERVICE_URI_VALIDATE='http://localhost:8080/login/home/';
    var REST_SERVICE_URI_UPDATE='http://localhost:8080/login/userpassword/';
    
    var factory = {      
        createUser: createUser,
        getUser:getUser,
        validateUser:validateUser,
        UpdateUser:UpdateUser
    };

    return factory;
    
    function UpdateUser(email_id,password)
    { 
    	var deferred = $q.defer();
	 $http.get(REST_SERVICE_URI_UPDATE+email_id+"/"+password)
     .then(
     function (response) {
    	 console.info(' updating password successful');
         deferred.resolve(response.data);
        
     },
     function(errResponse){
         console.error('Error while updating User');
         deferred.reject(errResponse);
     }
 );
	 
 return deferred.promise;
    	
    }
    
    function validateUser(user,id)
    {
   	 var deferred = $q.defer();
	 $http.get(REST_SERVICE_URI_VALIDATE+id)
     .then(
     function (response) {
    	 console.log("user validation successful")
         deferred.resolve(response.data); 
     },
     function(errResponse){
         console.error('Error while updating User');
         deferred.reject(errResponse);
     }
 );
	 
 return deferred.promise;
    
    	
    }
    
    
    function getUser(user,email_id,password)
    {
    	 var deferred = $q.defer();
    	 $http.get(REST_SERVICE_URI_LOGIN+email_id+"/"+password)
         .then(
         function (response) {
             deferred.resolve(response.data);
            
         },
         function(errResponse){
             console.error('Error while updating User');
             deferred.reject(errResponse);
         }
     );
    	 
     return deferred.promise;
    }

    function createUser(user) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, user)
            .then(
            function (response) {
           
                deferred.resolve(response.data);
                
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

}]);
