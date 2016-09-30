  <!-- /.panel-heading -->			
					
                        <div class="panel-body" ng-init="ClientCtrl.getClients()">
                        
							<div class="form-group row">
					<a href="#addclient">	  <button type="button"  class="btn btn-success active">Add New Client  </button> 
                            </a>
                            <span class="col-xs-2 "></span>	
							<label>Search Name: <input ng-model="client.clientName"></label>
							{{client.clientName}}
                            </div>
                            <span></span>
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Client Id</th>
                                        <th>Client Name</th>
                                        <th>Client Email</th>
                                        <th>Client Website</th>
                                        <th>fiscal information</th>
										<th>status</th>
										<th>Country</th>
										<th>Phone</th>
                                    </tr>
                                </thead>
                                <tbody>
                               
                                  <tr class="odd gradeX" ng-repeat="client in ClientCtrl.clients | filter:client.clientName">
                                     <td>{{client.clientId}}</td>
                                        <td><a href="#getclient{{client.clientId}}">{{client.clientName}}</a></td>
                                        <td>{{client.clientEmail}}</td>
                                        <td class="center">{{client.clientWebsite}}</td>
                                        <td class="center">{{client.fiscalInformation}}</td>
										<td class="center">{{client.status}}</td>
										<td class="center">	{{client.clientCountry	}}</td>
                           				<td class="center">	{{client.clientPhone}}	</td>
                             	
                                    </tr>
                                   
									
				</tbody>
                            </table>
		
        </div>
		<!-- /#page-wrapper -->
