<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm nhân viên</title>
</head>
<body>
 <form action="/add-employee" method="post">
        <label for="employeeName">Tên Nhân Viên:</label>
        <input type="text" id="employeeName" name="employeeName" required>

        <label for="employeeSalary">Tiền Lương:</label>
        <input type="number" id="employeeSalary" name="employeeSalary" required>

        <button id="submitButton" type="submit">Thêm Nhân Viên</button>
    </form>
</body>
</html>