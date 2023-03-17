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
<c:forEach  var="doctor" items="${list}">

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

<form:form  action="/PatientAppointmentTrackingSystem/forwardappoinment/processform"  modelAttribute="connect">

Doctor Email:<form:input path="doctorEmail"/>
Patient email<input type="text" value="${patient}"name="patientEmail">
token number<form:input path="id"/>
<input type="submit"/>
</form:form>
</div>
</body>
</html>