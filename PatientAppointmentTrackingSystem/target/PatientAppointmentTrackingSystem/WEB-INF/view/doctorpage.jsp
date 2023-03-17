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
<h>Doctor Details</h>
<thead>

<tr><th>Name</th><td>Gender</td> <td>Email</td><td>Specliest</td></tr>

</thead>

<tbody >
<c:forEach  var="doctor" items="${list1}">

<tr>
<td>${doctor.doctorName}</td>
<td>${doctor.doctorGender }</td>
<td>${ doctor.doctorEmail}</td>
<td>${doctor.doctorSpecliest }</td>

</tr>

</c:forEach>

</tbody>

</table>

<br><br><br>
<br>


<table border="2" class="Doctor">
<h>Patient Details</h>
<thead>

<tr><th>Name</th><td>Gender</td> <td>Problem</td><td>Age</td> <td>appointment Date</td><td>Give appoinment</td></tr>

</thead>

<tbody >



<tr>
<td>${patient.patientName}</td>
<td>${patient.patientGender }</td>
<td>${patient.patientProblem }</td>
<td>${patient.age }</td>
<td>${patient.appointmentDate }</td>

<td><a href="" >Give Appoinment</a></tr>


</tbody>

</table>
</div>
</body>
</html>