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
    self.user={id:null,name:'',password:'',email_id:'',confirmpassword:''};
    self.users=[];
    self.submit = submit;
    self.reset = reset;
    self.getUser=getUser;
    $scope.registerform = {};
    $scope.loginform={};
    function createUser(user){
        UserService.createUser(user)
    }
    
    function submit() {
        if(self.user.id===null){
            console.log('Saving New User', self.user);
            user=createUser(self.user);
            console.log('Created user Id', self.user.id);
        }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }
        reset();
    }
    
   
    
    function getUser()
    {
    	if(!(self.user.id===null)){
    		 
    	self.user=UserService.getUser(self.user,self.user.password,self.user.id);
    	$window.location.href = '/home.html'
    	}
    	else{
    		console.log("getting user failed");
    	}
    }
    
    function reset(){
        self.user={name:'',password:'',email_id:'',confirmpassword:''};
        $scope.registerform.id=self.user.id;
        $scope.registerform.$setPristine(); //reset Form
        $scope.registerform.id=self.user.id;
    }

}]);