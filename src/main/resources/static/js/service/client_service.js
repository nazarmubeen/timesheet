/**
 * 
 */
'use strict';
app2.factory('ClientService', ['$http', '$q', function($http, $q){
	
	 var REST_SERVICE_URI = 'http://localhost:8080/client/registerclient';
	 
	 var factory = {      
		       createClient:createClient
		    };

		    return factory;
		    
		    
		    function createClient(client) {
		        var deferred = $q.defer();
		        console.log('saving client in service+'+JSON.stringify(client));
		        console.log('saving client in service+'+client);
		        
		        $http.post(REST_SERVICE_URI, client)
		            .then(
		            function (response) {
		            	console.log('response success'+response);
		            	console.log('response success'+response.data);
		            	console.log('response success'+JSON.stringify(response));
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