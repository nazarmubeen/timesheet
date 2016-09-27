/**
 * This js file represents controller for client module */

'use strict';


app2.controller('ClientController',['$scope','$window', 'ClientService', function($scope , $window, ClientService){
	var self=this;
	self.client={client_id:null,name:'',email_id:'',address:'',city:'',state:'',postalcode:'',country:'',phone:'',fax:'',website:'',fiscalinformation:'',message:''};
	self.clients=[];
	$scope.addclientform={};
	self.submit=submit;
	
	 function createClient(client){
	    	
	    	
	        ClientService.createClient(client).then(
	        	function(data){
	        		$scope.client=data;
	        		$scope.self.client=data;
	        		console.log('data'+self.client);
	        		console.log('data'+data);
	        		console.log('client created id'+self.client.client_id);
	        		
	        	}	
	        	, function(errResponse){
	                console.error('Error while creating client in controller');
	                self.client.message='error occured in creating client';
	            }
	        )
	        
	    		
	    }
	    
	    function submit() {
	        if(self.client.client_id===null){
	            console.log('Saving New client', self.client);
	            createClient(self.client);
	            console.log('inside submit client created id'+self.client.client_id);		
	        }else{ 
	            console.log('client id is not null', self.client.client_id);
	        }
	       
	    }
	
}]);