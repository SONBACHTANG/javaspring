<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm nhân viên</title>
</head>
<body>
 <form action="./add-employee_ok" method="post">
        <label for="employeeName">Tên Nhân Viên:</label>
        <input type="text" id="name" name="name" required>

        <label for="employeeSalary">Tiền Lương:</label>
        <input type="number" id="wage" name="wage" required>

        <button id="submitButton" type="submit">Thêm Nhân Viên</button>
    </form>
</body>
</html>