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
										<th>Edit</th>
										<th>delete</th>
                                    </tr>
                                </thead>
                                <tbody>
                               
                                    <tr class="odd gradeX" ng-repeat="client in ClientCtrl.clients | filter:client.clientName">
                                        <td><a href="#getclient{{client.clientId}}">{{client.clientId}}</a></td>
                                        <td>{{client.clientName}}</td>
                                        <td>{{client.clientEmail}}</td>
                                        <td class="center">{{client.clientWebsite}}</td>
                                        <td class="center">{{client.fiscalInformation}}</td>
										<td class="center">{{client.status}}</td>
										<td class="center">		<button type="button" class="btn btn-success active" ng-click="ClientCtrl.getClients()">Show Clients</button>	
                            </a></td>
                             	<td class="center">	<button type="button" class="btn btn-success active" ng-click="ClientCtrl.getClients()">Show Clients</button>	</td>
                                    </tr>
                                   
									
				</tbody>
                            </table>
		
        </div>
		<!-- /#page-wrapper -->
