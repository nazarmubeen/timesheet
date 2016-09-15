/**
 * 
 */
'use strict';

angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/registeruser';
    var REST_SERVICE_URI_LOGIN = 'http://localhost:8080/login/user/';
    var factory = {      
        createUser: createUser,
        getUser:getUser
    };

    return factory;
    
    function getUser(user,password,id)
    {
    	 var deferred = $q.defer();
    	 $http.get(REST_SERVICE_URI_LOGIN+id)
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
