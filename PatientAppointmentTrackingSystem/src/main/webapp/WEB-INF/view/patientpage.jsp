<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>

<style >

div {
  background-color: #f5f5f5;
  padding: 20px;
  border-radius: 5px;
  animation-name: slide-in;
  animation-duration: 1s;
}

@keyframes slide-in {
  0% {
    opacity: 0;
    transform: translateX(-50%);
  }
  100% {
    opacity: 1;
    transform: translateX(0);
  }
}

table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 10px;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

th {
  background-color: #f2f2f2;
}


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome </h1>
<div>
<table border="2" class="Doctor">
<h>Patient Details</h>
<thead>

<tr><th>Name</th><td>Gender</td> <td>Aadar Number</td><td>Problem</td><td>Age</td> </tr>

</thead>

<tbody >
<c:forEach  var="patient" items="${list2}">

<tr>
<td>${patient.patientName}</td>
<td>${patient.patientGender }</td>
<td>${ patient.aadarNumber}</td>
<td>${patient.patientProblem }</td>
<td>${patient.age }</td>
</tr>

</c:forEach>

</tbody>

</table>

<br><br><br>
<br>
<table border="2" class="Recepnoist">
<h>Appointment Status</h>
<thead>

<tr><th>Appointment Date</th><td>Appointment Status</td> <td>Doctor Contact</td><td>Action</td> </tr>

</thead>

<tbody >
<c:forEach  var="rec" items="${list}">

<tr>
<td>${rec.appointmentDate}</td>
<td>${rec.appointmentStatus }</td>
<td>${ rec.doctorEmail}</td>
<td> <a href="">Cancle Appoinment</a> </td>
</tr>

</c:forEach>

</tbody>

</table>

</div>
</body>
</html>