
		  <!-- /.panel-heading -->
                   <div class="panel-heading">
         
			
			<div class="row">
            <div class="col-lg-9 col-md-offset-1 " >
                <div class="panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title col-md-offset-4"><b>Basic Information </b></h3>
                    </div>
					
                    <div class="panel-heading" >
                        <form role="addclientform" ng-submit="ClientCtrl.submit()" >
                            
							<div class="form-group row">
									<span></span>
									
                                </div>
							<div class="form-group row">
									<label class="col-xs-2 " for="name">Name</label>
                                   <div class="col-xs-5"> <input  class="form-control" placeholder="Name" type="text" ng-model="ClientCtrl.client.name" autofocus><p ng-bind="name"></p></div>
									{{ClientCtrl.client.name}}
                                </div>
								
                                <div class="form-group row">
									<label class="col-xs-2 col-form-label">Email</label>
                                   <div class="col-xs-5">  <input  class="form-control" placeholder="E-mail"  type="email" ng-model="ClientCtrl.client.email_id" autofocus> 
									</div> 
									{{ClientCtrl.client.email_id}}
									 </div>
									 
                                <div class="form-group row">
									<label class="col-xs-2 col-form-label">Address</label>
                                 <div class="col-xs-5">    <textarea  type="textarea" class="form-control" placeholder="Address"  ng-model="ClientCtrl.client.address" value="" rows=3 ></textarea>
                                </div>
                                {{ClientCtrl.client.address}}
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">City</label>
                                <div class="col-xs-5">     <input   class="form-control" placeholder="City" ng-model="ClientCtrl.client.city" type="text" >
                                </div>
								 </div>
                                
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">State</label>
                                <div class="col-xs-5">     <input   class="form-control" placeholder="state" ng-model="ClientCtrl.client.state" type="text" >
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Postal Code</label>
                                   <div class="col-xs-5">  <input   class="form-control" placeholder="postal code" ng-model="ClientCtrl.client.postalcode" type="text" >
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Country</label>
                             <div class="col-xs-5">   <select  class="form-control"  ng-model="ClientCtrl.client.country" type="text" value="India" >
							 <option>India</option>
                                                <option>USA</option>
                                                <option>SA</option>
                                                <option>ENGLAND</option>
                                                <option>ITALY</option>
												</select>
							 
                                </div>
                                {{ClientCtrl.client.country}}
								 </div>
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Phone</label>
                                  <div class="col-xs-5">   <input   class="form-control" placeholder="phone number" ng-model="ClientCtrl.client.phone" type="text" >
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Fax</label>
                                   <div class="col-xs-5">  <input  class="form-control" placeholder="Fax" ng-model="ClientCtrl.client.fax" type="text" >
                                </div>
								 </div>
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Website</label>
                                 <div class="col-xs-5">    <input  class="form-control" placeholder="website" ng-model="ClientCtrl.client.website" type="text" >
                                </div>
								 </div>
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Fiscal Information</label>
                                   <div class="col-xs-5">  <textarea  class="form-control" placeholder="Fscal information" ng-model="ClientCtrl.client.information" type="textarea" rows=3></textarea>
                                </div>
								 </div>
								
							<div class="panel panel-default">
                        <span></span>
                    </div>
								<div class="form-group row">
                                <!-- Change this to a button or input when using this as a form -->
								<span class="col-xs-2 "></span>
								 <input type="submit"   class="btn btn-lg btn-success btn-block" value="Save Client">
								<button type="button" class="btn btn-success active">Save Client   </button>
								<span class="col-xs-2 "></span>
								 <button type="button" class="btn btn-warning active">Cancel  </button>
								 
								
								</div>
                        </form>
                    </div>
				
                </div>
            </div>
        </div>

        </div>     
		
       
		<!-- /#page-wrapper -->

