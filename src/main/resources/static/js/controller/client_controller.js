/**
 * This js file represents controller for client module */

'use strict';


app2.controller('ClientController',['$scope','$window', 'ClientService', function($scope , $window, ClientService){
	var self=this;
	self.client={clientId:null,clientName:'',clientEmail:'',clientAddress:'',clientCity:'',clientState:'',clientPostalcode:'',clientCountry:'',clientPhone:'',clientFax:'',clientWebsite:'',fiscalInformation:'',message:''};
	self.clients=[];
	$scope.addclientform={};
	self.submit=submit;
	
	 function createClient(client){
	    	
	    	
	        ClientService.createClient(client).then(
	        	function(data){
	        		$scope.client=data;
	        		self.client=data;
	        		console.log('client created id'+self.client.clientId);
	        		self.client.message='data inserted successfully';
	        		console.log(self.client.message);
	        	}	
	        	, function(errResponse){
	                console.error('Error while creating client in controller');
	                self.client.message='error occured in creating client';
	            }
	        )
	        
	    		
	    }
	    
	    function submit() {
	        if(self.client.clientId===null){
	            console.log('Saving New client', self.client);
	            createClient(self.client);
	            console.log('inside submit client created id'+self.client.clientId);		
	        }else{ 
	            console.log('client id is not null', self.client.clientId);
	        }
	       
	    }
	
}]);