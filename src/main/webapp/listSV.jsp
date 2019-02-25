<%@page import="model.ListSinhVien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ListSinhVien lst = (ListSinhVien) request.getAttribute("list");
%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table, tr, th, td {
		border: 1px solid black
	}
</style>
</head>
<body>
	<table>
		<tr>
			<th>Tên sinh viên</th>
			<th>Tuổi</th>
			<th>Lớp</th>
		</tr>
		<% for (int i = 0; i < lst.getLst().size(); i++) { %>
		<tr>
			<td> <%= lst.getLst().get(i).getName() %> </td>
			<td> <%= lst.getLst().get(i).getTuoi() %> </td>
			<td> <%= lst.getLst().get(i).getLop() %> </td>
		</tr>
		<% }%>
	</table>
</body>
</html>