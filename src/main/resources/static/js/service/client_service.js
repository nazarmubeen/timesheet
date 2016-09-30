/**
 * 
 */
'use strict';
app2.factory('ClientService', ['$http', '$q', function($http, $q){
	
	 var REST_SERVICE_URI = 'http://localhost:8080/client/registerclient';
	 var REST_SERVICE_URI_Client = 'http://localhost:8080/client/getclients';
	 var REST_SERVICE_URI_UpdateClient = 'http://localhost:8080/client/updateclient';
	 var REST_SERVICE_URI_DeleteClient = 'http://localhost:8080/client/deleteclient';
	 
	 
	 
	 var factory = {      
		       createClient:createClient,
		       getClients:getClients,
		       getClient:getClient,
		       updateClient:updateClient,
		       deleteClient:deleteClient
		    };

		    return factory;
		    
		    function getClient(clientId)
		    {
		    	 var deferred = $q.defer();
		    	
		    	$http.get(REST_SERVICE_URI_Client+"/"+clientId).then(
		    			
		    	function(response)
		    	{
		    		 deferred.resolve(response.data);
		    	},
		    	function(errResponse){
		    		console.error('Error while getting clients');
	                deferred.reject(errResponse);
		    	}
		    	);
		    	
		    	 return deferred.promise;
		    	
		    }
		    function deleteClient(clientId)
		    {
		    	 var deferred = $q.defer();
		    	
		    	$http.get(REST_SERVICE_URI_DeleteClient+"/"+clientId).then(
		    			
		    	function(response)
		    	{
		    		 deferred.resolve(response.data);
		    	},
		    	function(errResponse){
		    		console.error('Error while deleting clients');
	                deferred.reject(errResponse);
		    	}
		    	);
		    	
		    	 return deferred.promise;
		    	
		    }
		    
		    
		    function updateClient(clientId,client)
		    {
		    	 var deferred = $q.defer();
		    	
		    	$http.put(REST_SERVICE_URI_UpdateClient+"/"+clientId,client).then(
		    			
		    	function(response)
		    	{
		    		 deferred.resolve(response.data);
		    	},
		    	function(errResponse){
		    		console.error('Error while updating clients');
	                deferred.reject(errResponse);
		    	}
		    	);
		    	
		    	 return deferred.promise;
		    	
		    }
		    
		    
		    
		    function getClients()
		    {
		    	 var deferred = $q.defer();
		    	
		    	$http.get(REST_SERVICE_URI_Client).then(
		    			
		    	function(response)
		    	{
		    		 deferred.resolve(response.data);
		    	},
		    	function(errResponse){
		    		console.error('Error while getting clients');
	                deferred.reject(errResponse);
		    	}
		    	);
		    	
		    	 return deferred.promise;
		    	
		    }
		    
		    
		    
		    function createClient(client) {
		        var deferred = $q.defer();
		        console.log('saving client in service+'+JSON.stringify(client));
		        console.log('saving client in service+'+client);
		        
		        $http.post(REST_SERVICE_URI, JSON.stringify(client))
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