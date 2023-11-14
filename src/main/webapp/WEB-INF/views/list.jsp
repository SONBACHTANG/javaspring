<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Nhân Viên</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        #addButton {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Danh Sách Nhân Viên</h2>

  <a href="./add-employee">Thêm Nhân Viên</a> 

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Tiền Lương</th>
               
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${listemployee}" var="o">
         	 <tr >
                <td > ${o.id}</td>
                <td > ${o.name}</td>
                <td > ${o.wage}</td>
                </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>