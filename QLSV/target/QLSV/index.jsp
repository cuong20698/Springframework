<%@ page pageEncoding="utf-8"%>
<html>
<head>
	<style type="text/css">
		.container{
			height: 300px;
			width: 500px;
			text-align: center;
			margin: 50px auto;
		}
		.header h1{
			color: blue;
			font-size: 50px;
		}
		
		.main input {
			height: 50px;
			width: 300px;
			padding: 5px;
			font-size: 20px;
		}
		button {
			height: 50px;
			width: 100px;
			font-size: 20px;
			background-color: #FF8040;
			border: none;
			font-weight: bold;
		}
	</style>
</head>
<body>
	<form action="xemdiem" method="post">
	<div class="container">
		<div class="header"><h1	>TRA CỨU SINH VIÊN</h1></div>
		<div class="main">
			<input type="text" name="txtMaSV" placeholder="Mã sinh viên">
			<button>Tìm kiếm</button><br>
			<label id="thongbao"></label>
		</div>
	</div>
	</form>
</body>
</html>
