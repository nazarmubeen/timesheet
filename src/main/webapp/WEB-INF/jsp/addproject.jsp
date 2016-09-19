
    
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
									<label class="col-xs-2 col-form-label">Description</label>
                                 <div class="col-xs-5">    <textarea  type="textarea" class="form-control" placeholder="description"  ng-model="description" value="" rows="3"></textarea>
                                </div>
								 </div>
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Billing Method</label>
								<div class="col-xs-5"> 
								<div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>Time and Materials Project
                                                </label>
                                            </div>
                               
								<div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Flat Rate Project
                                                </label>
                                            </div>
											 <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Project Not billable
                                                </label>
                                            </div>
                                           
                                
								 </div>
                             </div>
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Hours Estimate</label>
                                	<div class="col-xs-5" >
									<div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Adjusted automatically based on task budget hours
                                                </label>
                                            </div>
											 <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Budget hours
                                                </label>
                                            </div>
                                           
                                
								 </div>
                             </div>

								
								 
								
								 <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Color</label>
                                   <div class="col-xs-5">  <select   class="form-control" placeholder="color" ng-model="color" value="Green" >
								   <option>Green<option>
								   </select>
                                </div>
								 </div>
								  <div class="form-group row">
								 <label class="col-xs-2 col-form-label">Project Template</label>
                                   <div class="col-xs-5">  <select   class="form-control" value="select template" ng-model="template"  >
								   <option>select template</option>
								   </select>
                                </div>
								 </div>
							<div class="panel panel-default">
                         <div class="panel-heading">
                        <h3 class="panel-title col-md-offset-4"><b>Assigned Users </b></h3>
                    </div>
                    </div>
								 <div class="form-group row">
								 <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">Select All Users
                                                </label>
												<span></span>
                                            </div>
											<div class="panel panel-default">
											<label class="">
                                                <input type="checkbox">Your Name
                                            </label>
                                            <label class="col-md-offset-4">
                                                <input type="checkbox">As Project Manager
                                            </label>
											</div>
								 </div>
							
							
							<div class="panel panel-default">
                        <span></span>
                    </div>
								<div class="form-group row">
                                <!-- Change this to a button or input when using this as a form -->
								<span class="col-xs-2 "></span>
								<button type="button" class="btn btn-success active">Save Project   </button>
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
