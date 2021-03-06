/**
 * This js file represents controller for client module */

'use strict';


app2.controller('ClientController',['$scope','$window','$routeParams', 'ClientService', function($scope , $window,$routeParams, ClientService){
	var self=this;
	self.client={clientId:null,clientName:'',clientEmail:'',clientAddress:'',clientCity:'',clientState:'',clientPostalcode:'',clientCountry:'',clientPhone:'',clientFax:'',clientWebsite:'',fiscalInformation:'',message:null};
	self.clients=[];
	$scope.addclientform={};
	self.submit=submit;
	self.init=init;
	self.getClients=getClients;
	self.getClient=getClient;
	self.updateClient=updateClient;
	self.removeClient=removeClient;
	self.client.clientId=$routeParams.clientId;
	
	
	
	 function init() {
         if (self.client.clientId) {
        	 console.log('self.client.clientId'+self.client.clientId);
        	 self.client.message=null;
        	 console.log('self.client.clientId'+self.client.message);
             getClient(self.client.clientId);
         }
         else{
        	 self.client.clientId=null;
        	 self.client.message=null;
         }
     }
	
	
	 function createClient(client){
	    	
	    	
	        ClientService.createClient(client).then(
	        	function(data){
	        		$scope.client=data;
	        		self.client=data;
	        		console.log('client created id'+self.client.clientId);
	        		self.client.message='data inserted successfully';
	        		console.log(self.client.message);
	        		 alert("data inserted successfully");
	        	}	
	        	, function(errResponse){
	                console.error('Error while creating client in controller');
	                self.client.message='error occured in creating client';
	                alert("error occured in creating client");
	            }
	        )
	        
	    		
	    }
	 
	 function getClients(){
		 
		 ClientService.getClients().then(
				 function(data){
					 $scope.clients=data;
					 self.clients=data;
					 console.log("scope"+$scope.clients);
					 console.log("clients"+self.clients);
				 },
				 function(errResponse){
		                console.error('Error while fetching client in controller');
		                
		            }
				 
	 )}

 function getClient(ClientId){
		 console.log("fetching data for client"+ClientId)
		 ClientService.getClient(ClientId).then(
				 function(data){
					 $scope.client=data;
					 self.client=data;
					 console.log("scope"+$scope.client);
					 console.log("clients"+self.client);
				 },
				 function(errResponse){
		                console.error('Error while fetching client in controller');
		                
		            }
				 
	 )}
 
 
 function removeClient(){

	 deleteClient(self.client.clientId);
 }
 
 
 function deleteClient(ClientId){
	 console.log("deleting data for client"+ClientId)
	 ClientService.deleteClient(ClientId).then(
			 function(data){
				 $scope.client=data;
				 self.client=data;
				 console.log('data deleted sucessful');
				 	alert("delete successful");
				  self.client.message='delete successful';
			 },
			 function(errResponse){
	                console.error('Error while fetching client in controller');
	                
	            }	 
 )}
 
 
 

 function updateClient(ClientId,Client){
	 console.log("updating data for client"+ClientId)
	 ClientService.updateClient(ClientId,Client).then(
			 function(data){
				 $scope.client=data;
				 self.client=data;
				 console.log("scope"+$scope.client);
				 console.log("clients"+self.client);
				 alert("update successful");
				  self.client.message='Update successful';
			 },
			 function(errResponse){
	                console.error('Error while fetching client in controller');
	                alert("update failed");
	                self.client.message='error occured in updating client';
	            }
			 
 )}	    
 
 
 
	    function submit() {
	        if(self.client.clientId===null){
	            console.log('Saving New client',self.client);
	            createClient(self.client);
	            console.log('inside submit client created id'+self.client.clientId);		
	        }else{ 
	            console.log('client id is not null', self.client.clientId);
	            console.log('Updating client', self.client);
	            updateClient(self.client.clientId,self.client);
	            console.log('inside submit client created id'+self.client.clientId);
	            
	        }
	       
	    }
	
}]);