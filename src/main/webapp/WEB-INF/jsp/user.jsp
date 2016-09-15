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
					<a href="adduser.html">	  <button type="button"  class="btn btn-success active">Add User  </button> 
                            </a>

                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
										<th>User</th>
                                        <th>Active Projects</th>
                                        <th>Hourly Rate</th>
                                        <th>Performane this month</th>
                                        <th>User Role</th>
										<th>status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="odd gradeX">
										<td>ABC</td>
                                        <td>3</td>
                                        <td>25</td>
                                        <td>100%</td>
                                        <td class="center">Admin</td>
										<td class="center">active</td>
                                    </tr>
									  <tr class="odd gradeX">
										<td>XYZ</td>
                                        <td>1</td>
                                        <td>45</td>
                                        <td>100%</td>
                                        <td class="center">Project Manager</td>
										<td class="center">active</td>
                                    </tr>
                                    <tr class="even gradeC">
										<td>klop</td>
                                        <td>6</td>
                                        <td>40</td>
                                        <td>80%</td>
                                        <td class="center">Developer</td>
										<td class="center">active</td>
                                    </tr>
									
				</tbody>
                            </table>
		
        </div>
		<!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="../vendor/raphael/raphael.min.js"></script>
    <script src="../vendor/morrisjs/morris.min.js"></script>
    <script src="../data/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
