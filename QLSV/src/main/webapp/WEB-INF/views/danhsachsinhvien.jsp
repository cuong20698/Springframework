<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.container{
			height: 300px;
			width: 500px;
			text-align: center;
			margin: 50px auto;
		}
		.header h1{
			font-size: 50px;
		}
		.main {
			
		}
		table{
			width:500px;
			font-size: 20px;
			font-weight: bold;
			text-align: left;
			margin: auto;
			line-height: 30px;
			
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="header"><h1>${ hoten }</h1></div>
		<div class="main">
			<table>
				<tr>
					<td>Mã sinh viên:</td>
					<td>${ maSV }</td>	
				</tr>
				<tr>
					<td>Sở thích:</td>
					<td>${ soThich }</td>	
				</tr>
				<tr>
					<td>Ước mơ:</td>
					<td>${ uocMo }</td>	
				</tr>
				<tr>
					<td>Mục tiêu:</td>
					<td>${ mucTieu }</td>	
				</tr>
			</table>
		</div>
	</div>
</body>
</html>