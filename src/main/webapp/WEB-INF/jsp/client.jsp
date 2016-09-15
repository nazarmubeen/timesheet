<!DOCTYPE html>
<html lang="en">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<head>

   
</head>

<body>

  
        <%@include file="menu.jsp" %>
<div id="page-wrapper" style="background-color:  #f5f5f5" >
		  <!-- /.panel-heading -->			
					
                        <div class="panel-body">
					<a href="addclient.html">	  <button type="button"  class="btn btn-success active">Add Client  </button> 
                            </a>
                                        
                                  
										
								
							
					
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Client</th>
                                        <th>Active Projects</th>
                                        <th>Archived Projects</th>
                                        <th>Employees Involved</th>
                                        <th>Hours worked</th>
										<th>status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="odd gradeX">
                                        <td>Trident</td>
                                        <td>40</td>
                                        <td>23</td>
                                        <td class="center">400</td>
                                        <td class="center">12000</td>
										<td class="center">active</td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td>Microsoft</td>
                                        <td>20</td>
                                        <td>32</td>
                                        <td class="center">50</td>
                                        <td class="center">5000</td>
										<td class="center">active</td>
                                    </tr>
									
				</tbody>
                            </table>
		
        </div>
		<!-- /#page-wrapper -->

    </div>

</body>

</html>
