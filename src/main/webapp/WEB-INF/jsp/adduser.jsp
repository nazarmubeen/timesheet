
		<div class="panel-heading">
          
			
			<div class="row">
            <div class="col-lg-9 col-md-offset-1 " >
                <div class="panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title col-md-offset-4"><b>Basic Information </b></h3>
                    </div>
					
                    <div class="panel-heading" ng-app="">
                        <form role="form" >
                            
							<div class="form-group row">
									<span></span>
									
                                </div>
							<div class="form-group row">
									<label class="col-xs-2 " for="name">Name</label>
                                   <div class="col-xs-5"> <input  class="form-control" placeholder="Name" type="text" ng-model="name" autofocus><p ng-bind="name"></p></div>
									
                                </div>
								
                                <div class="form-group row">
									<label class="col-xs-2 col-form-label">Week Starts</label>
                                   <div class="col-xs-5">  <select  class="form-control" placeholder="week starts"  type="email" ng-model="week" autofocus>
									<option>monday</option>
									<option>sunday</option>
									<option>sataurday</option>
								   </select>
									</div> 
									 </div>
									 
                                <div class="form-group row">
									<label class="col-xs-2 col-form-label">Workday Length</label>
                                 <div class="col-xs-5">    <select  type="textarea" class="form-control" placeholder="Workday length"  ng-model="workday" value="">
								 <option>8</option>
									<option>10</option>
									<option>12</option>
								   </select>
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Timezone</label>
                                <div class="col-xs-5">     <select   class="form-control" placeholder="timezone" ng-model="timezone" type="text" >
								
								 <option>EST</option>
									<option>IST</option>
									<option>MST</option>
								   </select>
                                </div>
								 </div>
                                
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Hourly Rate</label>
                                <div class="col-xs-5">     <input   class="form-control" placeholder="not set" ng-model="hourly" type="text" >
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">user type</label>
                                   <div class="col-xs-5">  <SELECT   class="form-control" placeholder="user type" ng-model="usertype" type="text" >
								   <option>HR</option>
									<option>Project Manager</option>
									<option>Client</option>
									
								   </select>
                                </div>
								 </div>
							<div class="panel panel-default">
                         <div class="panel-heading">
                        <h3 class="panel-title col-md-offset-4"><b>Assigned Projects </b></h3>
                    </div>
                    </div>
								  <div class="form-group row">
									<label class="col-xs-2 col-form-label">client</label>
                                   <div class="col-xs-5">  <select  class="form-control" value="Microsoft"   ng-model="client" autofocus> 
								   
								    <option>Microsoft</option>
                                                <option>Amazon</option>
                                                <option>Apple</option>
                                                <option>Oracle</option>
                                                <option>Facebook</option>
								   
								   </select>
									</div> 
									 </div>
									 
									 <div class="form-group row">
								 <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">project 1
                                                </label>
												<span></span>
                                            </div>
											<div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">project 2
                                                </label>
												<span></span>
                                            </div>
											<div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">project 3
                                                </label>
												<span></span>
                                            </div>
											</div>
							
							
							<div class="panel panel-default">
                        <span></span>
                    </div>
								<div class="form-group row">
                                <!-- Change this to a button or input when using this as a form -->
								<span class="col-xs-2 "></span>
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
        </div>
		<!-- /#page-wrapper -->

  