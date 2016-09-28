/**
 * 
 */
'use strict';

app1.controller('myCtrl', function($scope) {
    $scope.firstName = "John";
    $scope.lastName = "Doe";
});



app1.controller('userCtrl', function($scope) {
	$scope.email="email";
    $scope.name="nazar";
    $scope.password="test";
    $scope.confirmpassword="test";
});

app1.controller('UserController', ['$scope','$window', 'UserService', function($scope , $window, UserService) {
    var self = this;
    self.user={user_id:null,name:'',password:'',email_id:'',confirmpassword:'',message:''};
    self.users=[];
    self.submit = submit;
    self.reset = reset;
    self.getUser=getUser;
    self.recoverPassword=recoverPassword;
    $scope.registerform = {};
    $scope.loginform={};
    function createUser(user){
    	
    	if(user.confirmpassword==user.password)
    		{
        UserService.createUser(user).then(
        	function(data){
        		$scope.user=data;
        		self.user=data;
        		
        		console.log('user created id'+self.user.user_id);
        		
        	}	
        	, function(errResponse){
                console.error('Error while creating Users in controller');
                self.user.message='error occured in creating user';
            }
        )
        
    		}
    	else{
    		self.user.message='password and confirm password don not match';
    	}
    }
    
    function submit() {
        if(self.user.user_id===null){
            console.log('Saving New User', self.user);
            createUser(self.user);
            console.log('inside submit user created id'+self.user.user_id);		
        }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }
       
    }
    
    function recoverPassword()
    {
    	self.user.message='password updated sucessful clicked';
    	UserService.UpdateUser(self.user.email_id,self.user.password).then(
    			
    			function(data)
    	    	{
		            self.user.message='password updated sucessful';
    	    	},
    			function(errResponse)
    	    	{
		            self.user.message='problem occured in updating password please try again';
    	    	}
    	)
    	
    	
    }
    
    function getUser()
    {
    	if(!(self.user.email_id===null)){
    		 
    	self.user=UserService.getUser(self.user,self.user.email_id,self.user.password).then(
    	function(data)
    	{
    		self.user=data;
    		console.log("user"+self.user);
    		console.log("userid"+self.user.user_id);
    		UserService.validateUser(self.user,self.user.user_id).then(
    				function(data)
    				{
    					console.log("redirecting to home page")
    					$window.location.href = '/home.html';
    				},
    				function(errResponse){
    		            console.error('Error while fetching Users in controller');
    		            self.user.message='user is not authorized to view the page';
    		            $window.location.href = '/login.html';
    		        })
    		
    	}, function(errResponse){
            console.error('Error while fetching Users in controller');
            self.user.message='email or password is incorrect';
        }
    	
    	)
    	
    	
    	
    	}
    	else{
    		console.log("getting user failed");
    	}
    }
    
    function reset(){
        self.user={name:'',password:'',email_id:'',confirmpassword:''};
        $scope.registerform.id=self.user.user_id;
       
    }

}]);